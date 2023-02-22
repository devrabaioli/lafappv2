package dev.rabaioli.lafappv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rabaioli.lafappv2.domain.Pedido;



public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}