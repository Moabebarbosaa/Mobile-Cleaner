package br.edu.ifpb.models;

public class CleaningPlace {
    private String name;
    private String sector;

    public CleaningPlace(String name, String sector) {
        this.name = name;
        this.sector = sector;
    }

    public CleaningPlace(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Local de Limpeza: " + name +
                "\nSetor: " + sector +
                "\n                          "
                ;
    }
}
