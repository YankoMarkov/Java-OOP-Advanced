package trafficLights;

public class TrafficLight {
	
	private Signals signals;
	
	public TrafficLight(Signals signals) {
		this.signals = signals;
	}
	
	public Signals getSignals() {
		return signals;
	}
	
	private void setSignals(Signals signals) {
		this.signals = signals;
	}
	
	public void update() {
		switch (getSignals()) {
			case RED:
				setSignals(Signals.GREEN);
				break;
			case YELLOW:
				setSignals(Signals.RED);
				break;
			case GREEN:
				setSignals(Signals.YELLOW);
				break;
		}
	}
	
	@Override
	public String toString() {
		return getSignals().name();
	}
}
