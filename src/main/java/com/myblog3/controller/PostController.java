package com.myblog3.controller;
import com.myblog3.payload.PostDto;
import com.myblog3.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/post")
public class PostController{

    private  PostService postService;

    public PostController(PostService postService) {

        this.postService = postService;
    }

//http://localhost:8080/api/post
    @PostMapping
public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
    PostDto postD = postService.createPost(postDto);
    postD.setMessage("Record is saved successfully");
    return new ResponseEntity<>(postD, HttpStatus.CREATED);

}
    //http://localhost:8080/api/post?id=1

    @GetMapping("/particular")
    public ResponseEntity<PostDto>getPostByIdd(@RequestParam long id){
        PostDto postById = postService.getPostById(id);
        postById.setMessage("Record found by id:-"+id);
            return new ResponseEntity<>(postById,HttpStatus.OK);
    }
    //http://localhost:8080/api/post?pageNo=0&pageSize=3
    @GetMapping
    public List<PostDto> getAllposts(
            @RequestParam(name="pageNo",required = false,defaultValue = "0")int pageNo,
            @RequestParam(name="pageSize",required = false,defaultValue = "3")int pageSize

    ){
        List<PostDto> dtos = postService.getAllPosts(pageNo,pageSize);
        System.out.println(dtos);
        return dtos;
    }
    //http://localhost:8080/api/post/5
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deletePost(@PathVariable long id){
        postService.deletePost(id);
        return new ResponseEntity<>("Post is deleted",HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PostDto>updatePost(@PathVariable long id,@RequestBody PostDto postDto){

    PostDto dto=postService.updatePost(id,postDto);
   return new ResponseEntity<>(dto,HttpStatus.OK);


    }
}
