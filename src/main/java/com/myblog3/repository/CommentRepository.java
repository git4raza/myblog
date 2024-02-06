package com.myblog3.repository;

import com.myblog3.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment,Long> {


    Optional<List<Comment>> findByPostId(long id);
List<Comment>findByEmail(String raza);

}
