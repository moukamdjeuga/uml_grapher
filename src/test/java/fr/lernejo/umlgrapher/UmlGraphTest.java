package fr.lernejo.umlgrapher;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UmlGraphTest {
    @Test
    void empty_interface_with_no_relation() {
        UmlGraph graph = new UmlGraph(Machin.class);

        String output = graph.as(GraphType.Mermaid);

        Assertions.assertThat(output).isEqualTo("""
            classDiagram
            class Machin {
                <<interface>>
            }
            """);
    }
    @Test void empty_class_with_no_relation(){
        UmlGraph graph = new UmlGraph(Gph.class);
        String output = graph.as(GraphType.Mermaid);
        Assertions.assertThat(output).isEqualTo("""
            classDiagram
            class Gph {
                <<class>>
            }
            """);
    }
    interface Machin {
    }
    public class Gph{

    }
}

