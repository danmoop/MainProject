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

    public void deleteBook(Book book)
    {
        for (int i = 0; i < allBooks.size(); i++)
        {
            if(book.getTitle().equals(allBooks.get(i).getTitle()))
                if(book.getAuthor().equals(allBooks.get(i).getAuthor()))
                    if(book.getGenre().equals(allBooks.get(i).getGenre()))
                        allBooks.remove(allBooks.get(i));
        }
    }
}