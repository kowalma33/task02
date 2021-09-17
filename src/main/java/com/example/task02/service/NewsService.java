package com.example.task02.service;



import com.example.task02.domain.News;
import com.example.task02.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import static java.util.stream.Collectors.toList;

@Service
public class NewsService implements ServiceInterface<News> {

    private NewsRepository newsrepository;

    @Autowired
    public NewsService(NewsRepository newsrepository) {
        this.newsrepository = newsrepository;
    }


    @Override
    public List<News> getObj() {
        List<News> newsList = newsrepository.findAll();
        return convertToDTOs(newsList);
    }

    private List<News> convertToDTOs(List<News> models) {
        return models.stream().map(this::convertToDTO).collect(toList());
    }

    private News convertToDTO(News model) {
        News dto = new News();
        dto.setId(model.getId());
        dto.setData(model.getData());
        dto.setText(model.getText());
        dto.setTitle(model.getTitle());

        return dto;
    }

    @Override
    public News create(News obj) {
        return newsrepository.save(obj);
    }

    @Override
    public News update(News obj) {
        return null;
    }
}
