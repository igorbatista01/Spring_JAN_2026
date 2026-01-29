package exercicios28012026;


public class ContaCorrente {
	private Long nrConta;
	private String nome;
	private double saldo = 0;
	
	
	
	public Long getNrConta() {
		return nrConta;
	}
	public void setNrConta(Long nrConta) {
		this.nrConta = nrConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public void depositar(double saldoDepositado) {
		if (saldoDepositado < 0) {
			System.out.println("Depósito de R$"+saldoDepositado+ " NÃO realizado.");
		}
		
		this.saldo += saldoDepositado;
		System.out.println("Depósito de R$"+saldoDepositado+ " relizado com sucesso!");
		
	}
	
	public void sacar (double saldoSacado) {
		if (saldoSacado > saldo) {
			System.out.println("Ops! Saldo de R$"+saldoSacado+ " insuficiente.");
		}
		this.saldo -= saldoSacado;
		System.out.println("Saque de R$ "+saldoSacado+" realizado com sucesso.");
	}
	
	public void verExtrato () {
		System.out.println("R$ "+saldo);
	}	
	
	
	public ContaCorrente (Long nrConta, String nome) {
		this.nrConta = nrConta; 
	    this.nome = nome;
		System.out.println("Banco TehFoideh - Criando conta corrente...");
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		ContaCorrente outra = (ContaCorrente) obj;
		return this.nrConta.equals(outra.nrConta);
	}
	
}
