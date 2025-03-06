package com.scuola.strutturedati;
import java.util.HashMap;

public class MainHashMap {
    
    public static void main(String[] args) {
        HashMap<String, Integer> numeriPreferiti = new HashMap<>();

        numeriPreferiti.put("Mario", 22);
        numeriPreferiti.put("Genny", 99);

        System.out.println(numeriPreferiti.get("Mario"));
    }
}
