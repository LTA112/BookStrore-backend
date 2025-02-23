package sp25.swp391.se1809.group4.bookstore.controllers;

import sp25.swp391.se1809.group4.bookstore.daos.ImportStockDAO;
import sp25.swp391.se1809.group4.bookstore.models.ImportStockDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/importStock")
public class ImportStockController {
    ImportStockDAO importStockDAO;
    @Autowired
    public ImportStockController(ImportStockDAO categoryDAO) {
        this.importStockDAO = categoryDAO;
    }

    @GetMapping("/")
    public List<ImportStockDTO> getStocksList(){
        return importStockDAO.findAll();
    }
}
