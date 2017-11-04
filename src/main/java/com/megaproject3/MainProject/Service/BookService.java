package com.megaproject3.MainProject.Service;

import com.megaproject3.MainProject.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService
{
    private List<Book> allBooks = new ArrayList<>();

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void addBook(String title, String author, String genre)
    {
        allBooks.add(new Book(title, author, genre));
    }
}