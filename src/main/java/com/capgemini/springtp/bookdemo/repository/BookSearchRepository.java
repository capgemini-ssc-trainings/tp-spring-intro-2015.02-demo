package com.capgemini.springtp.bookdemo.repository;

import java.util.List;

import com.capgemini.springtp.bookdemo.model.Book;
import com.capgemini.springtp.bookdemo.service.BookSearchCriteria;

public interface BookSearchRepository {
  List<Book> find(BookSearchCriteria bookSearchCriteria);
}
