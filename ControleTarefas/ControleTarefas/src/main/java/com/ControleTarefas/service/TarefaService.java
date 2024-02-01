package com.ControleTarefas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleTarefas.entities.Tarefa;
import com.ControleTarefas.repository.TarefaRepository;

@Service
public class TarefaService {
	
private final TarefaRepository tarefaRepository;
	
	@Autowired
	public TarefaService (TarefaRepository tarefaRepository) {
		this.tarefaRepository = tarefaRepository;
	}
	
	public Tarefa saveTarefa (Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}

	public Tarefa getTarefaById (Long id) {
		Optional<Tarefa> Tarefa = tarefaRepository.findById(id);
		return Tarefa.orElse(null);
	}

	public List<Tarefa> getAllTarefa(){
		return tarefaRepository.findAll();
	}
	public Tarefa updateTarefa(Long id, Tarefa updatedTarefa) {
		Optional<Tarefa> existingTarefa = tarefaRepository.findById(id);

		if (existingTarefa.isPresent()) {
			updatedTarefa.setId(id);
			return tarefaRepository.save(updatedTarefa);
		}
		return null;
	}

		public boolean deleteTarefa(Long id) {
			Optional <Tarefa> existingTarefa = tarefaRepository.findById(id);
			if (existingTarefa.isPresent()) {
				tarefaRepository.deleteById(id);
				return true;
			}
			return false;

		}

	


}
