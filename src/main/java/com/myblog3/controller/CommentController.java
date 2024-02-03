
package com.myblog3.controller;

import com.myblog3.entity.Comment;
import com.myblog3.payload.CommentDto;
import com.myblog3.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    //http://localhost:8080/api/comments?postId=189
    @PostMapping
    public ResponseEntity<CommentDto>createComment(@RequestBody CommentDto commentDto, @RequestParam long postId){
        CommentDto commentRDto = commentService.createComment(commentDto, postId);
        return new ResponseEntity<>(commentRDto, HttpStatus.CREATED);
    }

    //http://localhost:8080/api/comments/1/post/14
    @PutMapping("/{id}/post/{postId}")
    public ResponseEntity<CommentDto> updateComment(@PathVariable long id,
                                                    @RequestBody CommentDto commentDto,
                                                    @PathVariable long postId){
        CommentDto dto= commentService.updateComment(id, commentDto,postId);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    //http://localhost:8080/api/comments/2
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteComment(@PathVariable Long id){
commentService.deleteComment(id);

return new ResponseEntity<>("Comment is deleted",HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity <List<CommentDto>>getALltheCMT(){
        List<CommentDto> dtoos = commentService.getAllcmt();
        return new ResponseEntity<>(dtoos,HttpStatus.OK);
    }


}



