package com.datsistemas.helpdesk;

import com.datsistemas.helpdesk.domain.Chamado;
import com.datsistemas.helpdesk.domain.Cliente;
import com.datsistemas.helpdesk.domain.Tecnico;
import com.datsistemas.helpdesk.domain.enums.Perfil;
import com.datsistemas.helpdesk.domain.enums.Prioridade;
import com.datsistemas.helpdesk.domain.enums.Status;
import com.datsistemas.helpdesk.repositories.ChamadoRepository;
import com.datsistemas.helpdesk.repositories.ClienteRepository;
import com.datsistemas.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {

    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private     ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;


    public static void main(String[] args) {
        SpringApplication.run(HelpdeskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Tecnico tec1=new Tecnico(null,"Valdir Cezar","111.111.111-11","valdir@email.com","123");
        tec1.addPerfil(Perfil.ADMIN);
        Cliente cli1= new Cliente(null,"Linus","222.222.222-22","linus@email.com","123");
        Chamado c1= new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO,"Chamado 01","primeirochamado",tec1,cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));


    }
}
