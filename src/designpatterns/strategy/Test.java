package designpatterns.strategy;

public class Test {
	public static void main(String[] args) {
		NormalBehavior normalBehavior = new NormalBehavior();
		DefensiveBehavior defensiveBehavior = new DefensiveBehavior();
		Robot robot = new Robot();
		robot.setStrategy(normalBehavior);
		robot.move();
		robot.setStrategy(defensiveBehavior);
		robot.move();
	}
}
