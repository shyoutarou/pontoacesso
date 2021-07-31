package com.example.pontoacesso.service;

import com.example.pontoacesso.model.Calendario;
import com.example.pontoacesso.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    @Autowired
    CalendarioRepository calendarioRepository;

    public Calendario save(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public Calendario update(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> findById(long id) {
        return calendarioRepository.findById(id);
    }

    public void delete(Calendario calendario) {
        calendarioRepository.delete(calendario);
    }

    public void deleteById(long id) {
        calendarioRepository.deleteById(id);
    }
}
