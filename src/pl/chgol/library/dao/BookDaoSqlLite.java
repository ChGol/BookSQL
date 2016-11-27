package pl.chgol.library.dao;

import pl.chgol.library.domain.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class BookDaoSqlLite implements BookDao {

    public Connection connection;

    public BookDaoSqlLite() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:library.db");
        } catch (Exception e) {
            e.printStackTrace();
        }
        createTable();
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Books(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " title TEXT NOT NULL," +
                " author TEXT NOT NULL," +
                " pages INTEGER DEFAULT 0" +
                ")";                                            //next one semicolon;

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }


    @Override
    public void addBook(Book book) {

    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
