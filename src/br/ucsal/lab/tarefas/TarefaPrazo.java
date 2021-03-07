package br.ucsal.lab.tarefas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TarefaPrazo extends Tarefa{
	
	public TarefaPrazo(String titulo, String descricao) {
		super(titulo, descricao);
		// TODO Auto-generated constructor stub
	}
	private LocalDate data;
	
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public TarefaPrazo(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}
	
	public TarefaPrazo(String titulo, String descricao, String data) {
		// TODO Auto-generated constructor stub
		this(titulo, descricao, LocalDate.parse(data, formatter));
	}

	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return super.toString() + "TarefaPrazo [" + data +"]";
	}
}
