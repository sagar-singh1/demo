package com.copilot.demo.service;

import com.copilot.demo.model.Book;
import com.copilot.demo.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    CrudRepository repository;

    @Override
    public List<Book> findAllBooks() {
        return repository.findAll();
//        return BookResponse.builder().book("book1").build();
    }

    @Override
    public Book addBook(Book request) {
        return repository.save(request);
//        return "null";
    }
}
