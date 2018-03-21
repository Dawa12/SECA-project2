package com.example.springbootmonolith.models;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "SHIRT_SIZE")
    private String shirt_size;

    @Column(name = "COLOR")
    private String color;

    public User(String firstName, String lastName, String gender, String shirt_size, String color) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.shirt_size = shirt_size;
        this.color = color;
    }

}