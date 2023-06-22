package com.copilot.demo.controller;

import com.copilot.demo.model.Book;
import com.copilot.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/copilot")
public class Controller {

    @Autowired
    BookService bookService;

    @GetMapping(value = "/findAllBooks")
    public ResponseEntity<List<Book>> getValues(){
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }

    @PostMapping(value = "/addBook")
    public ResponseEntity<Book> postValue(@RequestBody Book request){
        return new ResponseEntity<>(bookService.addBook(request), HttpStatus.OK);
    }


}
