package com.hcl.training.service;

import java.util.List;

import com.hcl.training.model.Book;

public interface BookServiceInterface {
	List<Book> fetchData(String categoryName);

}
