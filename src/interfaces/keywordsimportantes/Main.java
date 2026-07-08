package interfaces.keywordsimportantes;

import interfaces.keywordsimportantes.keyword.Client;
import static interfaces.keywordsimportantes.keyword.Client.Multiply;

public class Main {
	public static void main() {
		System.out.println(Client.Sum(2, 3));
		System.out.println(Multiply(2, 6));
	}
}
