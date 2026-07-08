package pilarespoo.classes_encapsulamento.exercicio2;

public class Carro {
	private double velocidade = 0.0;
	
	public Carro() {
		
	}
	
	public void ligar() {
	}
	
	public void desligar() {
	}
	
	public void acelerar() {
		if(this.velocidade < 120)
			this.velocidade += 1;
		else
			System.out.println("Carro atingiu o limite de velocidade de 120km/h, não é mais possível acelerar.");
	}
	
	public void diminuirVelocidade() {
		
	}
	
	public void virarEsquerdaDireita() {
		if (this.velocidade >= 1 && this.velocidade <= 40)
			System.out.println("O carro virou");
	}
	
	public void verificarVelocidade() {
		
	}
	
	public void trocarMarcha() {
		
	}
}
