package cresla;

import cresla.interfaces.InputReader;
import cresla.interfaces.Manager;
import cresla.interfaces.OutputWriter;
import cresla.io.Reader;
import cresla.io.Writer;
import cresla.manager.MangerImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new MangerImpl();
        OutputWriter writer = new Writer();
        InputReader reader = new Reader();

        whileLoop:
        while (true) {
                List<String> comandTokens = Arrays.asList(reader.readLine().split(" "));

                switch (comandTokens.get(0)) {
                    case "Reactor":
                        writer.writeLine(manager.reactorCommand(comandTokens.subList(1,comandTokens.size())));
                        break;
                    case "Module":
                        writer.writeLine(manager.moduleCommand(comandTokens.subList(1,comandTokens.size())));
                        break;
                    case "Report":
                        writer.writeLine(manager.reportCommand(comandTokens.subList(1,comandTokens.size())));
                        break;
                    default:
                        writer.writeLine(manager.exitCommand(comandTokens));
                        break whileLoop;
                }
        }
    }
}
