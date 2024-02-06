package com.myblog3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users", uniqueConstraints ={@UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String userName;
    String email;
    String password;

}
