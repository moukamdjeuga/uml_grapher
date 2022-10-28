package fr.lernejo.umlgrapher;

public class MermaidLink {
    private final String enfClass ;
    private final String PartClass;
    private final String my_noeud;

    public MermaidLink(Class PartClass,Class enfClass,String my_noeud){
        this.enfClass = enfClass.getSimpleName();
        this.PartClass = PartClass.getSimpleName();
        this.my_noeud = my_noeud;
    }

    public String getChildClass(){
        return this.enfClass;
    }

    public String getParentClass(){
        return this.PartClass;
    }
    public String getLink(){
        return this.my_noeud;
    }
}



