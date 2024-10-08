package org.ctc.dao;

import org.ctc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository <Category,Integer>{
    Category findByCategoryId(Integer id);
    Category findByCategoryName(String name);
}
