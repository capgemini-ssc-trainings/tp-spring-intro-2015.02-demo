package com.capgemini.springtp.bookdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.springtp.bookdemo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>, BookSearchRepository {
}
