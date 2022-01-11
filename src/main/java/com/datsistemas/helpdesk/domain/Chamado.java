package com.datsistemas.helpdesk.domain;

import com.datsistemas.helpdesk.domain.enums.Prioridade;
import com.datsistemas.helpdesk.domain.enums.Status;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Objects;

public class Chamado {
    private Integer id;
    private LocalDate dataAbertuda = LocalDate.now();
    private  LocalDate dataFechamento;
    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String observacoes;

    private Tecnico tecnico;
    private Cliente cliente;

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
