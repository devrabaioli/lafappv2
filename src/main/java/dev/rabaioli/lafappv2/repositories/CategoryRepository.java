package dev.rabaioli.lafappv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rabaioli.lafappv2.domain.Category;



public interface CategoryRepository extends JpaRepository<Category, Integer> {

}