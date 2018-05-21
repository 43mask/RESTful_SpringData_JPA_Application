package com.restfull.application.rest_full_application.repositories;

import com.restfull.application.rest_full_application.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
