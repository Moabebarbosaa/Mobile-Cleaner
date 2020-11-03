package br.edu.ifpb.controller.dashboard;

import br.edu.ifpb.models.CleaningPlace;
import br.edu.ifpb.models.CleaningPlaceManager;
import br.edu.ifpb.models.User;

import java.util.List;

public class DashboardUser {

    public String titulo;

    CleaningPlaceManager cleaningPlaceManager = new CleaningPlaceManager();

    public DashboardUser() {
        this.titulo = "Dashboard User";
    }

    public String getTitulo() {
        return titulo;
    }

    public void performCleaning(String option){
        // usar id
        // identificar usuario que está logado -> referencia

    }

    public void listPlaces(){
        List<CleaningPlace> cleaningPlaces = cleaningPlaceManager.cleaningPlaceList();
        Integer cont = 0;
        for (CleaningPlace cleaningPlace: cleaningPlaces) {
            cont+=1;
            System.out.println(cont + " - " + cleaningPlace.toString());
        }
    }


}
