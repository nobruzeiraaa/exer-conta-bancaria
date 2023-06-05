package prjtConta;
import java.util.Scanner;
public class ContaSimplificada {
	Scanner in = new Scanner (System.in);
	
	private String nome;
	private double saldo = 0;
	private double limite = 1000.00;
	private double limiteAprovado = 1000.00;
	private double valor;
	private double restoSaldo;
	private double restoLimite;
	int resposta;
	
	public ContaSimplificada() { 
		System.out.println("Abra sua Conta");
		
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getLimiteAprovado() {
		return limiteAprovado;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	

	public void abreConta (String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;	
	}
	
	public void setDepositarValor(double valor) {
		
		
		
		if (limite < limiteAprovado) {
			this.limite = valor + limite;
		
			if (limite > limiteAprovado) {
				this.saldo = limite - limiteAprovado;
				this.limite = 1000;
			}else {
				this.saldo = valor + saldo;
			}
		}
	}
	
	public void setRetirarValor(double valor) {
		if (saldo >= valor) {
			this.saldo = saldo - valor;
		}else if (saldo <= valor) {
			System.out.print("Saldo insuficiente, deseja retirar o restante do limite? \n1 - SIM \n2 - NÃO \n");
			resposta = in.nextInt();
			switch (resposta) {
			case 1: 
				this.restoSaldo = saldo - valor;
				this.saldo = saldo - saldo;
				this.limite = limite +  restoSaldo;
				this.restoLimite = valor - saldo;
				
				break;
			case 2:
				System.out.print("Operação finalizada.\n");
				break;
			}
		}else if (saldo < valor){
			System.out.println("Saldo Insuficiente");
		}
	}
	public double exibirSaldo() {
		return saldo;
	}

}
