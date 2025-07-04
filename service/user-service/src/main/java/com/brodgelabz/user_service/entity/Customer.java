package com.brodgelabz.user_service.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    @OneToOne(cascade = CascadeType.ALL) // Ensures related Address is persisted/updated automatically
    @JoinColumn(name = "address_id", referencedColumnName = "id") // Maps foreign key in Customer table
    private Address address;
}
