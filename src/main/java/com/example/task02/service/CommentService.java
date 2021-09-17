package com.example.task02.service;


import com.example.task02.domain.Comment;
import com.example.task02.repository.Commentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class CommentService implements ServiceInterface<Comment>, CustomInterfaceComment {

    public Commentrepository commentrepository;

    @Autowired
    public CommentService(Commentrepository commentrepository){
        this.commentrepository = commentrepository;
    }


    @Override
    public List<Comment> getObj() {
        List<Comment> commnetList = commentrepository.findAll();
        return convertToDTOs(commnetList);
    }

    private List<Comment> convertToDTOs(List<Comment> models){
        return models.stream().map(this::convertToDTO).collect(toList());
    }

    private Comment convertToDTO(Comment commnet){
        Comment dto = new Comment();
        dto.setId(commnet.getId());
        dto.setData(commnet.getData());
        dto.setComment(commnet.getComment());
        dto.setAuthor(commnet.getAuthor());
        dto.setNewsId(commnet.getNewsId());

        return dto;
    }

    @Override
    public Comment create(Comment obj) {
        return commentrepository.save(obj);
    }

    @Override
    public Comment update(Comment obj) {
        return null;
    }


    @Override
    public List<Comment> findByNewsId(String id) {
        return null;
    }
}
