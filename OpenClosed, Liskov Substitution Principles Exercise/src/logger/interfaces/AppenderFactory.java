package logger.interfaces;

public interface AppenderFactory {
	
	Appender createAppender(String[] params) throws ReflectiveOperationException;
}
