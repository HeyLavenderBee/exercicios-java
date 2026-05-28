package classes_encapsulamento.exercicio3;

import java.util.Scanner;

public class Petshop {
	private final static Scanner scanner = new Scanner(System.in);
	
	private final static PetBathMachine petMachine = new PetBathMachine();
	
	public static void main(String[] args) {
		int option = -1;
		
		do {
			System.out.println("=================");
			System.out.println("1 - Dar banho no pet");
			System.out.println("2 - Abastecer a máquina com água");
			System.out.println("3 - Abastecer a máquina com shampoo");
			System.out.println("4 - Verificar água da máquina");
			System.out.println("5 - Verificar shampoo da máquina");
			System.out.println("6 - Verificar se tem pet no banho");
			System.out.println("7 - Colocar pet na máquina");
			System.out.println("8 - Retirar pet da máquina");
			System.out.println("9 - Limpar máquina");
			System.out.println("0 - Sair");
			System.out.println("=================");
			System.out.println("Escolha uma das opções acima: ");
			option = scanner.nextInt();
			
			switch (option) {
				case 1 -> petMachine.giveShower();
				case 2 -> setWater();
				case 3 -> setShampoo();
				case 4 -> verifyWater();
				case 5 -> verifyShampoo();
				case 6 -> checkIfHasPetInMachine();
				case 7 -> setPetInMachine();
				case 8 -> petMachine.removePet();
				case 9 -> petMachine.wash();
				case 0 -> System.exit(0);
				default -> System.out.println("Opção inválida");
			}
		} while (option != 0);
		
		scanner.close();
	}
	
	private static void setWater() {
		System.out.println("Tentando colocar água na máquina");
		petMachine.addWater();
	}
	
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na máquina");
		petMachine.addWater();
	}

	private static void verifyWater() {
		int amount = petMachine.getWater();
		System.out.println("A máquina está no momento com "+amount+"L de água");
	}

	private static void verifyShampoo() {
		int amount = petMachine.getShampoo();
		System.out.println("A máquina está no momento com "+amount+"L de shampoo");
	}
	
	private static void checkIfHasPetInMachine() {
		boolean hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "Tem um pet na máquina" : "Não há um pet na máquina");
	}
	
	public static void setPetInMachine() {
		String name = "";
		while (name == null || name.isEmpty()) {
			System.out.println("Informe o nome do pet: ");
			name = scanner.next();
		}
		Pet pet = new Pet(name);
		petMachine.setPet(pet);
	}
}
