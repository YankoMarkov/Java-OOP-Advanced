package eventImplementation.models.contracts;

import eventImplementation.events.NameChangeEvent;

public interface NameChangeListener {
	void handleNameChange(NameChangeEvent event);
}
