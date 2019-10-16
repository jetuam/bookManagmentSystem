package com.ing.bookManagmentSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.bookManagmentSystem.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	public List<Book> findAllBybookCategory(String category);
}