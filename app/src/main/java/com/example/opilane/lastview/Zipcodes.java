package com.example.opilane.lastview;

import java.util.ArrayList;
import java.util.List;

public class Zipcodes {
        //loon uue listi
        private final List<Zipcode> list = new ArrayList<>();

    public Zipcodes(){
        for (String[] code : codes) list.add(new Zipcode(code[0],
                code[1]));
    }

    private static final String[][] codes = {
            {"10115", "Berlin-Mitte"},
            {"10243", "Friedrichshain"},
            {"10318", "Lichtenberg"},
            {"10405", "Prenzlauer Berg"},
            {"10551", "Tiergarten"},
            {"10585", "Charlottenburg"},
            {"10707", "Wilmersdorf"},
            {"10823", "Tempelhof"},
            {"10823", "Schöneberg"},
            {"10961", "Kreuzberg"},
            {"12043", "Neukölln"},
            {"12157", "Steglitz"},
            {"12203", "Lichterfelde"}
    };

    public List<Zipcode> search(String code, String city) {
        city = city.toLowerCase();
        List<Zipcode> lines = new ArrayList();
        for (Zipcode z : list)
            if (z.getCode().startsWith(code) && z.getCity().toLowerCase().
                    contains(city))lines.add(z);
        return lines;
    }
}

