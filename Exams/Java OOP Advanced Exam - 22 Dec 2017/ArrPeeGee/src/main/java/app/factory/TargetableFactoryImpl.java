package app.factory;

import app.contracts.Targetable;
import app.contracts.TargetableFactory;

import java.lang.reflect.InvocationTargetException;

public final class TargetableFactoryImpl implements TargetableFactory {
	
	private String packageName;
	
	public TargetableFactoryImpl(String path) {
		this.packageName = path;
	}
	
	@Override
	public Targetable create(String name, String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
		
		Targetable result = (Targetable) Class.forName(this.packageName + className).newInstance();
		result.setName(name);
		return result;
	}
}
