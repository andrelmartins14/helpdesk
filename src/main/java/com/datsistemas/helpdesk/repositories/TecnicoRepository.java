package com.datsistemas.helpdesk.repositories;

import com.datsistemas.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico,Integer>{
    

}
