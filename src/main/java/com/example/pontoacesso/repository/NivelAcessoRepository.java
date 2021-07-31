package com.example.pontoacesso.repository;

import com.example.pontoacesso.model.NivelDeAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelDeAcesso, Long> {
}
