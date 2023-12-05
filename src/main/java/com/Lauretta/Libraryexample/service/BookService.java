package com.Lauretta.Libraryexample.service;

import com.Lauretta.Libraryexample.dto.BookDTO;
import com.Lauretta.Libraryexample.model.BookModel;
import com.Lauretta.Libraryexample.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    public Object addBook(BookDTO bookDTO) {
        BookModel bookModel= new BookModel();

        bookModel.setTitle(bookDTO.getTitle());
        bookModel.setAuthor(bookDTO.getAuthor());

       return bookRepository.save(bookModel);

    }

    public Object getAllBooks() {
        return bookRepository.findAll();
    }

    public Object getBook(Long bookId) {
        BookModel bookModel = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book with id " + bookId + " not found")); ;
        return bookModel;
        
    }

    public Object updateBook(Long bookId, BookDTO bookDTO) {
        BookModel bookModel = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book with id " + bookId + " not found"));

        bookModel.setTitle(bookDTO.getTitle());
        bookModel.setAuthor(bookDTO.getAuthor());

        return bookRepository.save(bookModel);
    }

    public Object deleteBook(Long bookId) {
        BookModel bookModel = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book with id " + bookId + " not found"));
        bookRepository.delete(bookModel);
        return "Book deleted successfully";
    }
}
