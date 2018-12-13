package com.comp586.backend.security.services;

import com.comp586.backend.model.Post;

import java.util.List;
import java.util.Optional;

public interface  PostService {
    public abstract Optional<Post> getPostById(long id);
    public abstract void savePost(Post employee);
    public abstract void updatePost(Post employee);
    public abstract void deletePost(long id);
    public abstract List<Post> getAllPosts();
}
