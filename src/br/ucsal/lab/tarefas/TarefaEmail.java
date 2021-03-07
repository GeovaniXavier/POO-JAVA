package br.ucsal.lab.tarefas;

public class TarefaEmail extends Tarefa{

	private String email;
	
	public TarefaEmail(String titulo, String descricao, String email) {
		super(titulo, descricao);
		this.email = email;
	}
	
	@Override
	public String toString() {
		return email;
	}
	

}
