package com.example.pontoacesso.service;

import com.example.pontoacesso.model.JornadaTrabalho;
import com.example.pontoacesso.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {
    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(long id) {
        return jornadaTrabalhoRepository.findById(id);
    }

    public void delete(JornadaTrabalho jornadaTrabalho) {
        jornadaTrabalhoRepository.delete(jornadaTrabalho);
    }

    public void deleteById(long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }
}
