package com.kuppiya.app.controller.rest;

import com.kuppiya.app.entity.CategoryEntity;
import com.kuppiya.app.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<CategoryEntity> getAllCategories() {
        return repository.findAll();
    }
}
