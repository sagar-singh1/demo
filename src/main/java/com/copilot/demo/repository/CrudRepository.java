package com.copilot.demo.repository;

import com.copilot.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends MongoRepository<Book, String> {



}
