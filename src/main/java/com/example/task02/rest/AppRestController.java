package com.example.task02.rest;

import com.example.task02.domain.Comment;
import com.example.task02.domain.News;
import com.example.task02.service.CommentService;
import com.example.task02.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class AppRestController {

    private final CommentService commentService;
    private final NewsService newsService;

    @Autowired
    public AppRestController(CommentService commentService, NewsService newsService) {
        this.commentService = commentService;
        this.newsService = newsService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getNews")
    public @ResponseBody
    List<News> findAllNews(){
        return newsService.getObj();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getComments")
    public @ResponseBody
    List<Comment> findAllComment(){
        return commentService.getObj();
    }

    @RequestMapping(method = RequestMethod.POST, value="/saveNews")
    public @ResponseBody
    News create(@RequestBody News newsEntity){
        return newsService.create(newsEntity);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveComment")
    public @ResponseBody
    Comment create(@RequestBody Comment commentEntity){
        return commentService.create((commentEntity));
    }
}
