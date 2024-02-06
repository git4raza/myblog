package com.myblog3.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name="comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;
    private String email;
    private String text;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
