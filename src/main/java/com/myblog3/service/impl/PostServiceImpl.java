package com.myblog3.service.impl;

import com.myblog3.PostRepository;
import com.myblog3.entity.Post;
import com.myblog3.payload.PostDto;
import com.myblog3.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost = postRepository.save(post);
        PostDto ddto = new PostDto();
        ddto.setTitle(savedPost.getTitle());
        ddto.setDescription(savedPost.getDescription());
        ddto.setContent(savedPost.getContent());
     return ddto;



    }
}
