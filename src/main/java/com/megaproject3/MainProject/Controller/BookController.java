package com.megaproject3.MainProject.Controller;

import com.megaproject3.MainProject.Model.Book;
import com.megaproject3.MainProject.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController
{
    @Autowired
    private BookService bookService;

    @GetMapping("/books/admin")
    public String adminPanel(Model model)
    {
        return "admin";
    }

    @GetMapping("/books")
    public String allBooks(Model model)
    {
        model.addAttribute("Books", bookService.getAllBooks());
        return "allTheBooks";
    }

    @GetMapping("/books/add")
    public String addBook(Model model)
    {
        model.addAttribute("BookObject", new Book());
        return "addBookForm";
    }

    @PostMapping("/books/add")
    public String addedBook(@ModelAttribute Book book, Model model)
    {
        model.addAttribute("BookObject", book);
        bookService.addBook(book.getTitle(), book.getAuthor(), book.getGenre());
        return "result";
    }
}
