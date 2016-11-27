package pl.chgol.library.dao;

import pl.chgol.library.domain.Book;

import java.util.List;

public interface BookDao {

    public void addBook(Book book);

    public void removeBook(Book book);

    public List<Book> getAll();
}
