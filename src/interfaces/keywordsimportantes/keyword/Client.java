package interfaces.keywordsimportantes.keyword;

public class Client {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int Sum(int a, int b) {
		return a+b;
	}
	
	public static int Multiply(int a, int b) {
		return a*b;
	}
}
