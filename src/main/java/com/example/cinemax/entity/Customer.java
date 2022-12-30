package com.example.cinemax.entity;

import lombok.*;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "customer")

public class Customer {

    @Id
    @Column(name = "customerId",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;

    private String customerName;

    private String email;

    private String password;

    private int mobileNumber;

    private boolean activeStatus;


    public Customer(String customerName, String email, String password, int mobileNumber, boolean activeStatus) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.activeStatus = activeStatus;
    }
}
