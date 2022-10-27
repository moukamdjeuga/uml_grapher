package fr.lernejo.umlgrapher;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

@Command
class Launcher implements Runnable {

    @Option(names = {"-c", "--classes"}, required = true ,description = "Analyse de Graphe")
    private final Class<?>[] umlcls = null;

    @Option(names = {"-g", "--graph-type"} , defaultValue = "Mermaid", description = "type de graphe")
    private final GraphType graphType = GraphType.Mermaid;

    @Override
    public void run() {
        UmlGraph graph = new UmlGraph(umlcls);
        String output = graph.as(graphType);
        System.out.println(output);
    }


    public static void main(String... args) {
        int exitCode = new CommandLine(new Launcher()).execute(args);
        System.exit(exitCode);
    }
}
