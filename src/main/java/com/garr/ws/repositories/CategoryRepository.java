package com.garr.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garr.ws.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
