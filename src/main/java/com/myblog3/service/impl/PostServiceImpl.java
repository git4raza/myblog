    package com.myblog3.service.impl;
    import com.myblog3.repository.PostRepository;
    import com.myblog3.entity.Post;
    import com.myblog3.exception.ResourceNotFoundException;
    import com.myblog3.payload.PostDto;
    import com.myblog3.service.PostService;
    import org.modelmapper.ModelMapper;
    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.PageRequest;
    import org.springframework.data.domain.Pageable;
    import org.springframework.stereotype.Service;
    import java.util.List;
    import java.util.stream.Collectors;

    @Service

    public class PostServiceImpl implements PostService {

        private PostRepository postRepository;
        private ModelMapper mapper;

        public PostServiceImpl(PostRepository postRepository, ModelMapper mapper) {
            this.postRepository = postRepository;
            this.mapper = mapper;
        }

        @Override
        public PostDto createPost(PostDto postDto) {
//            Post post1 = mapToEntity(postDto);

//            Post post = new Post();
//            post.setTitle(postDto.getTitle());
 //            post.setDescription(postDto.getDescription());
//            post.setContent(postDto.getContent());
//            Post savedPost = postRepository.save(post);
            Post post = mapper.map(postDto, Post.class);
            Post savedPost = postRepository.save(post);
            PostDto ddto = mapper.map(post, PostDto.class);
//            PostDto ddto = new PostDto();
//            ddto.setTitle(savedPost.getTitle());
//            ddto.setDescription(savedPost.getDescription());
//            ddto.setContent(savedPost.getContent());
//            PostDto postDto1 = mapToDto(savedPost);
            return ddto;

        }

        @Override
        public PostDto getPostById(long id) {
            Post post = postRepository.findById(id).orElseThrow(() ->
                    new ResourceNotFoundException("Record not found by id " + id)
            );
            PostDto dto = mapper.map(post, PostDto.class);
//            PostDto okg = new PostDto();
//            okg.setId(post.getId());
//            okg.setTitle(post.getTitle());
//            okg.setDescription(post.getDescription());
//            okg.setContent(post.getContent());
            return dto;


        }


        @Override
        public List<PostDto> getAllPosts(int pageNo, int pageSize) {
                Pageable pageAble = PageRequest.of(pageNo, pageSize);
            Page<Post> pagePost = postRepository.findAll(pageAble);
            List<Post> postss = pagePost.getContent();
            List<PostDto> dtos = postss.stream().map(post -> mapToDto(post)).collect(Collectors.toList());
            return dtos;
        }

        @Override
        public void deletePost(long id) {
            postRepository.deleteById(id);
        }

        @Override
        public PostDto updatePost(long id, PostDto postDto) {

            Post post = postRepository.findById(id).orElseThrow(
                    () -> new ResourceNotFoundException("Post not found with id:" + id)
            );
            Post posts = mapToEntity(postDto);

            posts.setId(post.getId());
            Post post1 = postRepository.save(posts);
            PostDto postDto1 = mapToDto(post1);
            System.out.println(postDto1);
            return postDto1;


        }


        PostDto mapToDto(Post post) {
            PostDto dto = mapper.map(post, PostDto.class);
//            PostDto okg = new PostDto();
//            okg.setTitle(post.getTitle());
//            okg.setDescription(post.getDescription());
//            okg.setContent(post.getContent());
//            return okg;
            return dto;

        }
        Post mapToEntity(PostDto postDto) {
            Post post = mapper.map(postDto, Post.class);
            return post;
        }
//
//        Post mapToEntity(PostDto postDto) {
//
//            Post post = new Post();
//            post.setTitle(postDto.getTitle());
//            post.setDescription(postDto.getDescription());
//            post.setContent(postDto.getContent());
//
//            return post;
//
//
//        }
    }    