package designpatterns.facade;

import designpatterns.subsystem1.CrmService;
import designpatterns.subsystem2.CepApi;

public class Facade {
	public void migrateClient(String name, String cep) {
		String state = CepApi.getInstance().getState(cep);
		String city = CepApi.getInstance().getCity(cep);
		
		CrmService.saveClient(name, cep, state, city);
	}
}
