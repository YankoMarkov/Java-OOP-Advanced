package app.factory;

import app.contracts.Action;
import app.contracts.ActionFactory;

import java.lang.reflect.InvocationTargetException;

public final class ActionFactoryImpl implements ActionFactory {
	
	private String packageName;
	
	public ActionFactoryImpl(String type) {
		this.packageName = type;
	}
	
	@Override
	public Action create(String actionName, String... participantNames) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
		
		return (Action) Class.forName(this.packageName + actionName).newInstance();
	}
}
