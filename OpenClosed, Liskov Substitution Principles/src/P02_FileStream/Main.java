package P02_FileStream;

import P02_FileStream.interfaces.Streamable;

public class Main {
	
	public static void main(String[] args) {
		
		Streamable file = new File(5, 10, "dani");
		StreamProgressInfo streamProgressInfo = new StreamProgressInfo(file);
		System.out.println(streamProgressInfo.calculateCurrentPercent());
		
		Streamable music = new Music(15, 45, "boni", "djidji");
		streamProgressInfo = new StreamProgressInfo(music);
		System.out.println(streamProgressInfo.calculateCurrentPercent());
	}
}
