package com.Lauretta.Libraryexample.repository;
import com.Lauretta.Libraryexample.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface BookRepository extends JpaRepository<BookModel, Long> {

    }


