package fr.lernejo.umlgrapher;

public class UmlType {
    private final Class Cl;
    private final String clName;
    private final String packName;

    public UmlType(Class Cl) {
        this.Cl = Cl;
        this.clName = Cl.getSimpleName();
        this.packName = Cl.getPackageName();
    }

    public Class getaClasse() { return this.Cl; }

    public String getClassName(){return this.clName;}

    public String getPackageName(){return this.packName;}
}

