package com.myblog3.repository;


import com.myblog3.entity.Comment;
import com.myblog3.entity.Post;
import com.myblog3.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
List<Post>findByDescription(String raza);
}
