package com.datsistemas.helpdesk.repositories;

import com.datsistemas.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
    

}
