/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vtky.repository.impl;
import com.vtky.repository.CategoryRepository;
/**
 *
 * @author ASUS
 */
import java.util.List;
import com.vtky.pojo.Category;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
@Repository
public class CategoryReponsitoryImpl implements CategoryRepository{

    /**
     *
     * @return
     */
    @Override
    public List<Category> getCategories() {
        List<Category> cates = new ArrayList<>();
        Category c1 = new Category();
        c1.setId(1);
        c1.setName("Mobile");
        Category c2 = new Category();
        c2.setId(2);
        c2.setName("Tablet");
        
        cates.add(c1);
        cates.add(c2);
        
        return cates;
    }

}
