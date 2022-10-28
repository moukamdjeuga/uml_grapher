package fr.lernejo.umlgrapher;

import java.lang.reflect.Modifier;
import java.util.Set;

public class MermaidFormater {
    private final Set<UmlType> types;

    public MermaidFormater(Set<UmlType> types) { this.types = types; }

    public String words(){
        String chr = "classDiagram\n";
        for(UmlType atype: types){
            chr +="class " + atype.getClassName();
            if(Modifier.isInterface(atype.getaClasse().getModifiers())){
                chr += " {\n    <<interface>>\n}";
            }
            chr += "\n";
        }
        return chr;
    }
}
