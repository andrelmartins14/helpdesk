package com.datsistemas.helpdesk.services;

import com.datsistemas.helpdesk.domain.Tecnico;
import com.datsistemas.helpdesk.repositories.TecnicoRepository;
import com.datsistemas.helpdesk.services.exception.ObjectnotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnicoService {
    @Autowired
    private TecnicoRepository repository;

    public Tecnico findByid(Integer id) {
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectnotFoundExceptions("Ojeto não encontrato! Id: "+ id));
    }

}
