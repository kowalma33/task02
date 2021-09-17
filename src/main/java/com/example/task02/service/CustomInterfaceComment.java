package com.example.task02.service;

import com.newssystem.server.NewsSystem.domain.Comment;

import java.util.List;

public interface CustomInterfaceComment {

    List<Comment> findByNewsId(String id);
}

