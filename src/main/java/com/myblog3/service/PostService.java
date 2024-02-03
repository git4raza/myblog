package com.myblog3.service;

import com.myblog3.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);


    List<PostDto> getAllPosts(int pageNo, int pageSize);

    void deletePost(long id);

    PostDto updatePost(long raza, PostDto postDto);
}
