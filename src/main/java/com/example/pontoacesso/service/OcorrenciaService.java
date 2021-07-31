package com.example.pontoacesso.service;

import com.example.pontoacesso.model.Ocorrencia;
import com.example.pontoacesso.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia save(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> findById(long id) {
        return ocorrenciaRepository.findById(id);
    }

    public void delete(Ocorrencia ocorrencia) {
        ocorrenciaRepository.delete(ocorrencia);
    }

    public void deleteById(long id) {
        ocorrenciaRepository.deleteById(id);
    }
}
