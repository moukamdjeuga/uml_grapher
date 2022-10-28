package fr.lernejo.umlgrapher;

import java.util.Set;

public class UmlRelation {
    private final Set<UmlType> root;

    public UmlRelation(Set<UmlType> theTree) {
        this.root = theTree;
    }

    public Set<MermaidLink> theRelation(Set<MermaidLink> linkers){
        String rel ="";
        for(UmlType i : root){
            Class[] j = i.getaClasse().getInterfaces();
            for(Class k : j){
                if(i.getaClasse().getSuperclass()==null){
                    rel = k.getSimpleName()+" <|-- " + i.getaClasse().getSimpleName() + " : extends";
                }
                else{
                    rel = k.getSimpleName()+" <|.. " + i.getaClasse().getSimpleName() + " : implements";
                }
                rel +="\n";
                linkers.add(new MermaidLink(k,i.getaClasse(),rel));
            }
        }
        return linkers;
    }

    public String allRelation(Set<MermaidLink> linkers, Set<UmlType> types){
        String relaString="";
        linkers = new UmlRelation(types).theRelation(linkers);
        for (MermaidLink i : linkers) {
            relaString += i.getLink();
        }
        return relaString;
    }
}

