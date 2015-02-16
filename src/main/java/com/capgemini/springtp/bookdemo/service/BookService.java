package com.capgemini.springtp.bookdemo.service;

import java.util.List;

import com.capgemini.springtp.bookdemo.model.Book;

public interface BookService {

  void saveOrUpdate(Book book);

  Book read(Long id);

  void delete(Long id);

  List<Book> find(BookSearchCriteria bookSearchCriteria);
}
