
public class Aluno {
	// Atributos
	private Long nrMatricula;
	private String nome;
	private String cpf;
	
	
	// getters e setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		nome = n.toUpperCase();
	}
	
	
	public Long getNrMatricula() {
		return nrMatricula;
	}



	public void setNrMatricula(Long nrMatricula) {
		this.nrMatricula = nrMatricula;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	//Metodos
	public String falar() {
		return "Meu nome é: "+nome;
		
	}
	
	
	
}
