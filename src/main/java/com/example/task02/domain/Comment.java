package com.example.task02.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    public String id;
    @Column(name="NewsId")
    public String NewsId;
    @Column(name="comment")
    public String comment;
    @Column(name="author")
    public String author;
    @Column(name="data")
    public String data;


}

