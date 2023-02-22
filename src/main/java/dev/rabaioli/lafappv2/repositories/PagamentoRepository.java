package dev.rabaioli.lafappv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rabaioli.lafappv2.domain.Pagamento;



public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}