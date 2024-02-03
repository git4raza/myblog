package com.myblog3.service.impl;

import com.myblog3.entity.Comment;
import com.myblog3.entity.Post;
import com.myblog3.exception.ResourceNotFoundException;
import com.myblog3.payload.CommentDto;
import com.myblog3.payload.PostDto;
import com.myblog3.repository.PostRepository;
import com.myblog3.repository.CommentRepository;
import com.myblog3.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class CommentServiceImpl implements CommentService {
    private PostRepository postRepository;

    private ModelMapper mapper;



    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository,ModelMapper mapper) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.mapper=mapper;
    }

    private CommentRepository commentRepository;

    @Override
    public CommentDto createComment(CommentDto commentDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post Not found with id:" + postId)
        );

//        comment.setEmail(commentDto.getEmail());
//        comment.setText(commentDto.getText());
        Comment comment = maptoEntity(commentDto);
        comment.setPost(post);
        Comment savedComment = commentRepository.save(comment);
        CommentDto dto = mapToDto(savedComment);
        return dto;

//        commentDto.setId(savedComment.getId());
//        commentDto.setEmail(savedComment.getEmail());
//        commentDto.setText(savedComment.getText());
            
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);

    }

    @Override
    public CommentDto updateComment(long id, CommentDto commentDto,long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException(
                "Post not found with id:" + postId)
        );
        Comment comment=commentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Comment not found with id:" + id)
        );

        Comment cmt = maptoEntity(commentDto);
        cmt.setId(comment.getId());
        cmt.setPost(post);
        Comment saveC = commentRepository.save(cmt);
        CommentDto dto = mapToDto(saveC);
        return dto;

    }

    @Override
    public List<CommentDto> getAllcmt() {
        List<Comment> comments = commentRepository.findAll();
        List<CommentDto> dtos = comments.stream().map(comment -> mapToDto(comment)).collect(Collectors.toList());
        return dtos;
    }

    Comment maptoEntity(CommentDto dto){
         Comment comment = mapper.map(dto, Comment.class);
        return comment;
//        Comment comment=new Comment();
//        comment.setEmail(comment.getEmail());
//comment.setText(comment.getText());

    }
    CommentDto mapToDto(Comment comment){   
        CommentDto commentDto = mapper.map(comment, CommentDto.class);
return commentDto;
    }
}
