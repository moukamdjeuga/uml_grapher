package fr.lernejo.umlgrapher;

import java.util.ArrayList;
import java.util.List;

public class InternalGraphRepresentation {
    private final Class dgr;

    public InternalGraphRepresentation(Class aClass) {this.dgr = aClass;}

    public List<Class> recursiveRelation(List<Class> recursiveList, Class... tableClasses){
        for(Class umlcls : tableClasses){
            if(!recursiveList.contains(umlcls)){
                recursiveList.add(umlcls);
                recursiveList = recursiveRelation(recursiveList, umlcls.getInterfaces());
            }
        }
        return recursiveList;
    }

    public List<Class> whatIsYourRelation(){
        List<Class> theList = new ArrayList<>();
        theList = recursiveRelation(theList, this.dgr);
        return theList;
    }
}
