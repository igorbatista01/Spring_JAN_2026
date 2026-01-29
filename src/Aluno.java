// CLASSE: É o molde. Tudo que estiver aqui define o que é um "Aluno".
public class Aluno {
	
	// ATRIBUTOS: São as características.
	// ENCAPSULAMENTO: O "private" esconde esses dados. Ninguém mexe neles diretamente.
	private Long nrMatricula;
	private String nome;
	private String cpf;
	
	public Aluno() {
		System.out.println("Primeiro construtor");
	}
	
	public Aluno(Long nrM, String nome, String cpf) {
		this.nrMatricula = nrM;
		setNome(nome);
		this.cpf = cpf;
		System.out.println("Passei pelo segundo construtor!");
	}
	// GETTERS E SETTERS: Os métodos públicos para acessar os dados privados.
	
	public String getNome() {
		return nome; // Apenas retorna o valor atual.
	}
	
	public void setNome(String n) {
		// Aqui tem uma LÓGICA: O Encapsulamento permite filtrar ou alterar o dado antes de salvar.
		// O dado entra como "n", vira Maiúsculo, e só então é guardado no atributo "nome".
		nome = n.toUpperCase();
	}
	
	
	public Long getNrMatricula() {
		return nrMatricula;
	}

	public void setNrMatricula(Long nrMatricula) {
		// THIS: Aqui é essencial!
		// O 'this.nrMatricula' refere-se ao ATRIBUTO da classe (roxo/azul na IDE).
		// O 'nrMatricula' sozinho refere-se ao PARÂMETRO recebido (marrom/cinza).
		this.nrMatricula = nrMatricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		// Novamente o THIS resolvendo a ambiguidade de nomes iguais.
		this.cpf = cpf;
	}


	// MÉTODOS: O comportamento. O que o aluno "sabe fazer".
	public String falar() {
		// Usa o atributo 'nome' que já está na memória do objeto.
		return "Meu nome é: " + nome;
	}
	
	// Exemplo de sobrecarga (O método com o mesmo nome.)
	public String falar(String msg) {
		return msg + nome;
	}
	
}