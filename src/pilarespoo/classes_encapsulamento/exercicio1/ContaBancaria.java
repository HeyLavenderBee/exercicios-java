package pilarespoo.classes_encapsulamento.exercicio1;

public class ContaBancaria {
	private double saldo;
	private double valorCheque;
	private boolean usandoCheque = true;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
		if (this.saldo <= 500.0) {
			this.valorCheque = 50.0;
		}
		else {
			this.valorCheque = this.saldo / 2;
		}
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
	public double consultarChequeEspecial() {
		return valorCheque;
	}
	
	public void depositarDinheiro(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void sacarDinheiro(double valorSacado) {
		saldo -= valorSacado;
	}
	
	public void pagarBoleto(double valorUtilizado) {
		saldo -= valorUtilizado;
	}
	
	public void verificarChequeEspecial() {
		if (this.usandoCheque) {
			System.out.println("A conta está usando cheque especial");
		}
		else {
			System.out.println("A conta não está usando cheque especial");
		}
	}
}
