package com.example.task02.repository;

import com.example.task02.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Commentrepository extends JpaRepository<Comment,String> {
    List<Comment> findByNewsId(String id);
}
