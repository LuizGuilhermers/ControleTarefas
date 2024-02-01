package com.ControleTarefas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "Tarefa")
@Data
public class Tarefa {
		
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column (name ="Nome")
	//@NotNull
	//@NotBlank
	private String nome;
		
	@Column (name ="Data Final")
	//NotNull
	//@NotBlank
	//////////////@Size (min = 14, message= "Minimo de 14 caracteres")//NÃO SE APLICA
	private String dataFinalExecucao;
	
	@Column (name ="Descrição da Tarefa")
	//@NotNull
	//@NotBlank
	private String descricaoTarefa;
	
	@Column (name ="Status da Tarefa")
	//@NotNull
	//@NotBlank
	private String statusTarefa;
	
}
