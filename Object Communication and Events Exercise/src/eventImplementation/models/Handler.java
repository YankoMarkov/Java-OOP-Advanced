package eventImplementation.models;

import eventImplementation.events.NameChangeEvent;
import eventImplementation.models.contracts.NameChangeListener;

public class Handler implements NameChangeListener {
	@Override
	public void handleNameChange(NameChangeEvent event) {
		System.out.println(String.format("Dispatcher's name changed to %s.",event.getNewName()));
	}
}
