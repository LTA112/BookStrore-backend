package sp25.swp391.se1809.group4.bookstore.daos;

import sp25.swp391.se1809.group4.bookstore.models.StaffDTO;

import java.util.List;

public interface StaffDAO {
    void save(StaffDTO staffDTO);
    StaffDTO find(int staffID);
    void update(StaffDTO staffDTO);
    void delete(int staffID);
    List<StaffDTO> findAll();
}
