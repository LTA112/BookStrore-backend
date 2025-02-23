package sp25.swp391.se1809.group4.bookstore.daos;

import sp25.swp391.se1809.group4.bookstore.models.BookDTO;

import java.util.List;

public interface BookDAO {
    void save(BookDTO bookDTO);
    BookDTO find(int bookID);
    void update(BookDTO bookDTO);
    void delete(int bookID);
    List<BookDTO> findAll();
}
