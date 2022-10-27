package fr.lernejo.umlgrapher;
public class UmlGraph {
    private final Class<?> [] umlcls;
    public UmlGraph(Class<?> ...machinClass) {
        this.umlcls = machinClass;
    }
    public String as (GraphType graphType){

        String sentcs = "classDiagram\n";;
        for(Class myClass : umlcls) {
            if(graphType==GraphType.Mermaid) {
                sentcs = sentcs + "class " + myClass.getSimpleName();
                if (myClass.isInterface()) {
                    sentcs = sentcs + " {\n" + "    <<interface>>\n" + "}\n";
                }
                else {
                    sentcs = sentcs + " {\n" + "    <<class>>\n" + "}\n";
                }
            }
        }
        return sentcs;
    }


}
