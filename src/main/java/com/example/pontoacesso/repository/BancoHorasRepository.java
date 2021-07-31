package com.example.pontoacesso.repository;

import com.example.pontoacesso.model.BancoDeHoras;
import com.example.pontoacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoDeHoras, Long> {
}
