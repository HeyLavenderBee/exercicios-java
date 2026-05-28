package classes_encapsulamento.exercicio1;

import java.util.Scanner;

public class Usuario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem-vindo ao banco!");
		System.out.println("Para criar uma conta, deposite um valor inicial: ");
		double valorInicial = scanner.nextDouble();
		ContaBancaria conta = new ContaBancaria(valorInicial);
		
		System.out.println("==============");
		int acao = 0;
		
		while(acao != 7) {
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Consultar cheque especial");
			System.out.println("3 - Depositar dinheiro");
			System.out.println("4 - Sacar dinheiro");
			System.out.println("5 - Pagar boleto");
			System.out.println("6 - Verificar se está usando cheque especial");
			
			System.out.println("Escolha uma ação entre as acima para realizar: ");
			acao = scanner.nextInt();
			
			switch (acao) {
				case 1:
					System.out.println("O saldo atual é de: R$"+conta.consultarSaldo());
					break;
				case 2:
					System.out.println("O saldo do cheque especial é de: R$"+conta.consultarChequeEspecial());
					break;
				case 3:
					conta.depositarDinheiro(50);
					break;
				case 4:
					conta.sacarDinheiro(100);
					break;
				case 5:
					conta.pagarBoleto(50);
					break;
				case 6:
					conta.verificarChequeEspecial();
				System.out.println("===============");
			}
		}
		
		scanner.close();
	}
}
