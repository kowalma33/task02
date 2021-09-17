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
@Table(name="News")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    public String id;
    @Column(name="title")
    public String title;
    @Column(name="text")
    public String text;
    @Column(name="data")
    public String data;

}
