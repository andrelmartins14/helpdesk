package com.datsistemas.helpdesk.domain;

import com.datsistemas.helpdesk.domain.enums.Prioridade;
import com.datsistemas.helpdesk.domain.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class Chamado implements Serializable {
    private static  final long serialVersionUIL = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "dd/MM/yy")
    private LocalDate dataAbertuda = LocalDate.now();
    @JsonFormat(pattern = "dd/MM/yy")
    private  LocalDate dataFechamento;
    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Chamado() {
        super();
    }


    public Chamado(Integer id, Prioridade prioridade, Status status, String titulo, String observacoes, Tecnico tecnico, Cliente cliente) {
        super();
        this.id = id;
        this.prioridade = prioridade;
        this.status = status;
        this.titulo = titulo;
        this.observacoes = observacoes;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chamado chamado = (Chamado) o;
        return Objects.equals(id, chamado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
