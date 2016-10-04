package com.latihan3.dewi.moviecategory;

/**
 * Created by alif on 04/10/16.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataProvider {
    public static HashMap<String, List<String>> getInfo() {
        HashMap<String, List<String>> MoviesDetails =
                new HashMap<String, List<String>>();
        List<String> Action_Movies = new ArrayList<>();
        Action_Movies.add("AA");
        Action_Movies.add("BB");
        Action_Movies.add("CC");
        Action_Movies.add("DD");
        Action_Movies.add("EE");
        List<String> Romantic_Movies = new ArrayList<>();
        Romantic_Movies.add("FF");
        Romantic_Movies.add("GG");
        Romantic_Movies.add("HH");
        Romantic_Movies.add("II");
        Romantic_Movies.add("JJ");
        List<String> Horror_Movies = new ArrayList<>();
        Horror_Movies.add("KK");
        Horror_Movies.add("LL");
        Horror_Movies.add("MM");
        Horror_Movies.add("NN");
        Horror_Movies.add("OO");
        List<String> Comedy_Movies = new ArrayList<>();
        Comedy_Movies.add("PP");
        Comedy_Movies.add("QQ");
        Comedy_Movies.add("RR");
        Comedy_Movies.add("SS");
        Comedy_Movies.add("TT");
        MoviesDetails.put("Action Movies", Action_Movies);
        MoviesDetails.put("Romantics Movies", Romantic_Movies);
        MoviesDetails.put("Horror Movies", Horror_Movies);
        MoviesDetails.put("Comedy Movies", Comedy_Movies);
        return MoviesDetails;
    }
}