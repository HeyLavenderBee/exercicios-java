package designpatterns.subsystem1;

public class CrmService {
	private CrmService() {}
	
	public static void saveClient(String name, String cep, String state, String city) {
		System.out.println("Client saved in CRM system.");
		System.out.println(name);
		System.out.println(cep);
		System.out.println(state);
		System.out.println(city);
	}
}
