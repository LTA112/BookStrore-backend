package sp25.swp391.se1809.group4.bookstore.daos;

import sp25.swp391.se1809.group4.bookstore.models.ImportStockDTO;

import java.util.List;

public interface ImportStockDAO {
    void save(ImportStockDTO importStockDTO);
    ImportStockDTO find(int ISID);
    void update(ImportStockDTO importStockDTO);
    void delete(int ISID);
    List<ImportStockDTO> findAll();
}
