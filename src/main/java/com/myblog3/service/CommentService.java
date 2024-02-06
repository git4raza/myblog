package com.myblog3.service;

import com.myblog3.entity.Comment;
import com.myblog3.payload.CommentDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public interface CommentService{
    CommentDto createComment(CommentDto commentDto, long postId);

    void deleteComment(Long id);

    CommentDto updateComment(long id, CommentDto commentDto,long postId);

   List <CommentDto> getAllcmt(int pageNo,int pageSize);

    List<CommentDto> getAllCommentforPost(long id);

    List<CommentDto> getAllCmtByEmail(String email);
}
