package interfaces.ex_interfacefuncional;

public record Rectangle(double height, double base) implements GeometryForm{

	@Override
	public double getArea() {
		return height * base;
	}

}
