package exercicios28012026;

public class Programa {

	public static void main(String[] args) {

		ContaCorrente cliente = new ContaCorrente(12123223L,"Igor"); 
		
		cliente.depositar(100);
		cliente.sacar(39232);
		cliente.getNrConta();
		cliente.getNome();
		cliente.getSaldo();
		
		System.out.println("Olá "+cliente.getNome()+"! "+cliente.getNrConta());
		
		


	}
	
	

}