package app.core;

import app.contracts.Battlefield;
import app.contracts.Engine;
import app.contracts.Reader;
import app.contracts.Writer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class EngineImpl implements Engine {
	
	private Reader reader;
	private Writer writer;
	private Battlefield battlefield;
	
	public EngineImpl(Reader reader, Writer writer, Battlefield battlefield) {
		this.reader = reader;
		this.writer = writer;
		this.battlefield = battlefield;
	}
	
	@Override
	public void run() throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
		
		String line = this.reader.readLine();
		
		while (!line.equals("Peace")) {
			String[] lineTokens = line.split("\\s+");
			
			switch (lineTokens[0].toLowerCase()) {
				case "createparticipant":
					battlefield.createParticipant(lineTokens[1], lineTokens[2]);
					break;
				case "createaction":
					battlefield.createAction(lineTokens[1],
							Arrays.copyOf(Arrays.stream(lineTokens).skip(2).toArray(),
									Arrays.stream(lineTokens).skip(2).toArray().length,
									String[].class));
					break;
				case "statactions":
					battlefield.reportActions();
					break;
				case "statparticipants":
					battlefield.reportParticipants();
					break;
				default:
					System.out.println("Invalid command");
					break;
			}
			line = reader.readLine();
		}
	}
}
