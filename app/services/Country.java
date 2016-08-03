package services;

import com.google.inject.Inject;
import play.db.Database;
import play.db.jpa.JPAApi;

import java.util.ArrayList;

/**
 * Created by Julian on 8/3/2016.
 */
public class Country {


    private String name = "";

    public Country() {}

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Country> loadCountries(JPAApi api, Database db) {

        return null;

    }

}
