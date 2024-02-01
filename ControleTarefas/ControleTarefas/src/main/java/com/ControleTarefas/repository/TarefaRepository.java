package com.ControleTarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ControleTarefas.entities.Tarefa;

public interface TarefaRepository extends JpaRepository <Tarefa, Long> {

}
