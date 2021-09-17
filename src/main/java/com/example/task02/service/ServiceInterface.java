package com.example.task02.service;

import java.util.List;

public interface ServiceInterface <T>{

    List<T> getObj();
    T create(T obj);
    T update(T obj);
}
