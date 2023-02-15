package com.example.cinemax.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Admin_id;

    String Admin_name;

    String Admin_mail;

    public Admin(int admin_id, String admin_name, String admin_mail) {
        Admin_id = admin_id;
        Admin_name = admin_name;
        Admin_mail = admin_mail;
    }

    public Admin(String admin_name, String admin_mail) {
        this.Admin_name = admin_name;
        this.Admin_mail = admin_mail;
    }
}
