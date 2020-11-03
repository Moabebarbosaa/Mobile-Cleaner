package br.edu.ifpb.models;

import br.edu.ifpb.Database.ConnectionSQLite;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class CleaningPlaceManager extends ConnectionSQLite {

    public List<CleaningPlace> cleaningPlaceList(){
        List<CleaningPlace> cleaningPlaces = new ArrayList<>();
        CleaningPlace cleaningPlace = null;

        connect();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM places";

        try {
            preparedStatement = createPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                cleaningPlace = new CleaningPlace();
                cleaningPlace.setName(resultSet.getString(1));
                cleaningPlace.setSector(resultSet.getString(2));

                cleaningPlaces.add(cleaningPlace);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        disconnect();
        return cleaningPlaces;

    }

}
