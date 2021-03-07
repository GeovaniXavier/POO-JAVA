package br.ucsal.lab.tarefas;

import br.ucsal.lab.tarefas.InterfaceGrafica;

public class Programa {

	
	public static void main(String[] args) {
		
		Lista listaTarefas = new Lista();
		listaTarefas.adicionarTarefa("Estudar OO","Devo estudar OO");
		listaTarefas.adicionarTarefa("Tomar cafe","Tomar cafe",true);
		listaTarefas.adicionarTarefa("Ouvir musica","Ouvir Rock",true);
		
		//listaTarefas.getTarefas().add(new Tarefa("Titulo","Descrição"));
		
		TarefaPrazo tarefaPrazo = new TarefaPrazo("Viagem", "Para arracaju", "10/10/2020");
		listaTarefas.adicionarTarefa(tarefaPrazo);
		TarefaEmail tarefaEmail = new TarefaEmail("Email", "Spam", "meuemail@gmail.com");
		listaTarefas.adicionarTarefa(tarefaEmail);
		
		for (Tarefa tarefa : listaTarefas.getTarefas()) {
			System.out.println(tarefa);
		}
		
		
		new InterfaceGrafica(listaTarefas);

	}
}
