package pilarespoo.heranca_polimorfismo.exercicio3.clocks;

public non-sealed class BRClock extends Clock{

	@Override
	public Clock convert(Clock clock) {
		super.convert(clock);
		if(clock instanceof USClock usClock) {
			this.hour = (usClock.getPeriodIndicator().equals("PM") ? usClock.getHour() + 12 : usClock.getHour());
		}
		return this;
	}

}
