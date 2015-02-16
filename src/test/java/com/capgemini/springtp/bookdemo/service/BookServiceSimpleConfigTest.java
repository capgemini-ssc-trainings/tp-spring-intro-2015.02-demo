package com.capgemini.springtp.bookdemo.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.springtp.bookdemo.BookDemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BookDemoApplication.class)
public class BookServiceSimpleConfigTest extends AbstractBookServiceTest {
  @Autowired
  private BookService bookService;

  @Override
  protected BookService getBookService() {

    return this.bookService;
  }
}
