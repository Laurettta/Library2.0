package com.Lauretta.Libraryexample.controller;

import com.Lauretta.Libraryexample.dto.BookDTO;
import com.Lauretta.Libraryexample.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/Books")
@AllArgsConstructor

public class BookController{

    private final BookService bookService;

    @GetMapping ("/add")
    public Object addBook(@RequestBody BookDTO bookDTO) {
        return bookService.addBook(bookDTO);
    }

    @GetMapping("")
    public Object getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public Object getBook(@PathVariable Long bookId) {
        return bookService.getBook(bookId);
    }

    @PutMapping("/update/{bookId}")
    public Object updateBlogPost(@PathVariable Long bookId, @RequestBody BookDTO bookDTO) {
        return bookService.updateBook(bookId, bookDTO);
    }

    @DeleteMapping("/delete/{bookId}")
    public Object deleteBook(@PathVariable Long bookId) {
        return bookService.deleteBook(bookId);
    }


}
