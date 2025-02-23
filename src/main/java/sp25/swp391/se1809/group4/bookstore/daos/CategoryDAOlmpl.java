package sp25.swp391.se1809.group4.bookstore.daos;


import sp25.swp391.se1809.group4.bookstore.exceptions.CategoryExceptionNotFound;
import sp25.swp391.se1809.group4.bookstore.models.CategoryDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CategoryDAOlmpl implements CategoryDAO {
    EntityManager entityManager;

    @Autowired
    public CategoryDAOlmpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public CategoryDTO save(CategoryDTO categoryDTO){
        return entityManager.merge(categoryDTO);
    }
    @Override
    public CategoryDTO find(int catID){
        CategoryDTO object = entityManager.find(CategoryDTO.class,catID);
        if (object!= null){
            return object;
        } else {
            throw new CategoryExceptionNotFound();
        }
    }
    @Override
    @Transactional
    public void delete(int catID){
        entityManager.remove(this.find(catID));
    }
    public List<CategoryDTO> findAll(){
        TypedQuery<CategoryDTO> query = entityManager.createQuery("From CategoryDTO",CategoryDTO.class);
        return query.getResultList();
    }
}
