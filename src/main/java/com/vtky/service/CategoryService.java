/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vtky.service;

import com.vtky.pojo.Category;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    List<Category> getCategories();
}