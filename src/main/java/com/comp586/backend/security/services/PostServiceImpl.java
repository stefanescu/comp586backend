package com.comp586.backend.security.services;

import java.util.List;
import java.util.Optional;

import com.comp586.backend.model.Post;
import com.comp586.backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostServiceImpl implements PostService
{
    @Autowired
    PostRepository postRepository;

    @Transactional
    public Optional<Post> getPostById(long id)
    {
        return postRepository.findById(id);
    }
    @Transactional
    public void savePost(Post employee)
    {
        postRepository.save(employee);
    }
    @Transactional
    public void updatePost(Post employee)
    {
        postRepository.save(employee);
    }
    @Transactional
    public void deletePost(long id)
    {
        postRepository.deleteById(id);
    }
    @Transactional
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }
}