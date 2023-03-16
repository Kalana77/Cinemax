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
    int Adminid;

    String Adminname;

    String Adminmail;

    public Admin(String adminname, String adminmail) {

        this.Adminname = adminname;
        this.Adminmail = adminmail;
    }
}
