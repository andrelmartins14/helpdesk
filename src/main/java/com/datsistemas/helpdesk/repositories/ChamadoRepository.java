package com.datsistemas.helpdesk.repositories;

import com.datsistemas.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado,Integer>{
    

}
