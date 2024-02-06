package com.studies.springbootmongodb.services;

import com.studies.springbootmongodb.domain.Post;
import com.studies.springbootmongodb.domain.User;
import com.studies.springbootmongodb.repositories.PostRepository;
import com.studies.springbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Post not found"));
    }
}
