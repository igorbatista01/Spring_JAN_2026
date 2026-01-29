public class Programa {

	public static void main(String[] args) {
		// OBJETOS: Aqui o "molde" vira realidade na memória.
		// "new Aluno()" é o comando que instancia (cria) o objeto.
		Aluno a1 = new Aluno(); 
		Aluno a2 = new Aluno(123L, "Lanchelote", "999.999.999-9"); // a2 é um objeto totalmente independente de a1.
		Aluno a3 = new Aluno(123L, "Todos", "21");
		
		// Usando o SET: Não acessamos "a1.nome =" diretamente. Pedimos ao método.
		// Note que você passou minúsculo/misturado, mas o setNome vai converter.
		a1.setNome("Vanderlei Luxemburgo");
		
		// Usando o MÉTODO falar:
		System.out.println(a1.falar());
		System.out.println(a2.falar()); 
		System.out.println(a3.falar("Qual animal que come com o rabo? "));
		// Saída esperada: "Meu nome é: VANDERLEI LUXEMBURGO" (por causa do toUpperCase)

	}
	
	
	

}