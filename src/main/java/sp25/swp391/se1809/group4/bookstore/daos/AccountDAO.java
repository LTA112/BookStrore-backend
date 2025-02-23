package sp25.swp391.se1809.group4.bookstore.daos;

import sp25.swp391.se1809.group4.bookstore.models.AccountDTO;

import java.util.List;

public interface AccountDAO {
    AccountDTO save(AccountDTO accountDTO);
    AccountDTO find(String username);
    void delete(String username);
    List<AccountDTO> findAll();
}
