package com.myblog3.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="posts")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;

}
