package services;

import java.util.ArrayList;

import com.google.inject.Inject;
import play.db.*;

/**
 * Created by Julian on 8/3/2016.
 */
public class Company {

    private String name = "";

    public Company() {}

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Company> getCompanies() {

        ArrayList list = new ArrayList();
        list.add(new Company("Microsoft"));
        list.add(new Company("Google"));

        return list;

    }

    @Inject
    public static ArrayList<Company> loadCompanies(Database db) {

        return null;

    }

}
