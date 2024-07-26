package model.dao;

import model.entities.Department;
import model.entities.Seller;
import java.util.List;

public interface SellerDao {
    void insert(Seller seller);
    void update(Seller seller, int id);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
