package com.kuppiya.app.repository;

import com.kuppiya.app.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
    List<CategoryEntity> findAll();
    CategoryEntity findOneById(@Param("id") int id);
}