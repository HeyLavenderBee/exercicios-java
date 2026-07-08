package interfaces.ex_interfacefuncional;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int option = -1;
		GeometryForm geometryForm = null;
		while(option != 4) {
			System.out.println("Escolha a forma geométrica para calcular a área: ");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retângulo");
			System.out.println("3 - Círculo");
			System.out.println("4 - Sair do programa");
			option = scanner.nextInt();
			switch (option) {
				case 1: {
					geometryForm = createSquare();
					break;
				}
				case 2: {
					geometryForm = createRectangle();
					break;
				}
				case 3: {
					geometryForm = createCircle();
					break;
				}
				case 4: {
					option = 4;
					continue;
				}
				default: {
					System.out.println("Valor inesperado.");
					continue;
				}
				
			}
			
			System.out.println("O resultado do cálculo da área foi de: "+geometryForm.getArea());
			System.out.println("======");
		}
	}

	private static GeometryForm createSquare() {
		System.out.println("Informe o tamanho dos lados: ");
		var side = scanner.nextDouble();
		return new Square(side);
	}
	
	private static GeometryForm createRectangle() {
		System.out.println("Informe a base: ");
		var base = scanner.nextDouble();
		System.out.println("Informe a altura: ");
		var height = scanner.nextDouble();
		return new Rectangle(height, base);
	}
	
	private static GeometryForm createCircle() {
		System.out.println("Informe o raio: ");
		var radius = scanner.nextDouble();
		return new Circle(radius);
	}
}
