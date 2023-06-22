package com.copilot.demo.service;

import com.copilot.demo.model.Book;

import java.util.List;

public interface BookService {


    List<Book> findAllBooks();

    Book addBook(Book request);


}
