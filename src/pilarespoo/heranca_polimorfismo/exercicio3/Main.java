package pilarespoo.heranca_polimorfismo.exercicio3;

import pilarespoo.heranca_polimorfismo.exercicio3.clocks.Clock;
import pilarespoo.heranca_polimorfismo.exercicio3.clocks.BRClock;
import pilarespoo.heranca_polimorfismo.exercicio3.clocks.USClock;

public class Main {
	public static void main(String[] args) {
		Clock brClock = new BRClock();
		brClock.setSecond(0);
		brClock.setMinute(0);
		brClock.setHour(25);
		
		System.out.println(brClock.getTime());
		
		System.out.println(new USClock().convert(brClock).getTime());
	}
}
