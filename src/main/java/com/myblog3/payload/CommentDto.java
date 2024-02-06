package com.myblog3.payload;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String text;


}
