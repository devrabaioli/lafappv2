package dev.rabaioli.lafappv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rabaioli.lafappv2.domain.Lost;



public interface LostRepository extends JpaRepository<Lost, Integer> {

}