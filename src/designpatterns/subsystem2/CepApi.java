package designpatterns.subsystem2;

import designpatterns.singleton.SingletonEager;

public class CepApi {
	private static CepApi instance = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstance() {
		return instance;
	}
	
	public String getCity(String cep) {
		return "São Paulo";
	}
	
	public String getState(String cep) {
		return "SP";
	}
}
