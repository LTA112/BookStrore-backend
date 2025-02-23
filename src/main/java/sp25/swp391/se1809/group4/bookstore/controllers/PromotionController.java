package sp25.swp391.se1809.group4.bookstore.controllers;

import sp25.swp391.se1809.group4.bookstore.daos.PromotionDAO;
import sp25.swp391.se1809.group4.bookstore.models.PromotionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/promotions")
public class PromotionController {
    PromotionDAO promotionDAO;

    @Autowired
    public PromotionController(PromotionDAO promotionDAO) {
        this.promotionDAO = promotionDAO;
    }

    @GetMapping("/")
    public List<PromotionDTO> getPromotionList(){
        return promotionDAO.findAll();
    }
}
