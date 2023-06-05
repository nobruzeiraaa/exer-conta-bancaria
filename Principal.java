package prjtConta;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		ContaSimplificada cont = new ContaSimplificada ();
		
		int operacao;
		int resp = 0;
		
		System.out.print("Informe seu nome: ");
		cont.setNome(in.next());
		System.out.print("Digite seu saldo: R$");
		cont.setSaldo(in.nextDouble());
		System.out.print("Seu limite é: R$" + cont.getLimite()+"\n");
		
		
		
		do {
		System.out.println("Bem vindo "+cont.getNome()+"!! \nComo podemos ajudar? \n1 - Depósito \n2 - Saque \n3 - Saldo");
		operacao = in.nextInt();
		
		
			switch (operacao) {
			case 1:
				System.out.print("Informe o valor para depósito: ");
				cont.setDepositarValor(in.nextDouble());
				
				System.out.print("Deseja continuar? \n1 - SIM \n2 - NÃO");
				resp = in.nextInt();
				break;
				
			case 2:
				System.out.print("Informe o valor para saque: ");
				cont.setRetirarValor(in.nextDouble());
				
				System.out.print("Deseja continuar? \n1 - SIM \n2 - NÃO");
				resp = in.nextInt();
				break;
				
			case 3:
				System.out.print("Seu saldo é: R$"+cont.exibirSaldo()+ "\nSeu limite é: R$" +cont.getLimite()+"\n");
				System.out.print("Deseja continuar? \n1 - SIM \n2 - NÃO");
				resp = in.nextInt();
				break;
			}
			
		}while (resp == 1); 
	}

}
