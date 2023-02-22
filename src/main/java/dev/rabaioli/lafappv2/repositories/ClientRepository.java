package dev.rabaioli.lafappv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rabaioli.lafappv2.domain.Client;



public interface ClientRepository extends JpaRepository<Client, Integer> {

}