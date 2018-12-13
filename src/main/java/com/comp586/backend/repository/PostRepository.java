package com.comp586.backend.repository;

import com.comp586.backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
//    Optional<Post> findById(Long aLong);
//    boolean existsById(Long aLong);
}
