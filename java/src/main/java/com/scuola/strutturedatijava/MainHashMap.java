package com.scuola.strutturedatijava;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainHashMap {
    
    public static void main(String[] args) {
        // > Map e' un'interfaccia
        // > HashMap e' una classe che implementa l'interfaccia Map
        Map<String, Integer> numeriPreferiti = new HashMap<>();

        // aggiungi coppie chiave/valore alla HashMap
        numeriPreferiti.put("Mario", 22);
        numeriPreferiti.put("Genny", 99);
        numeriPreferiti.put("Gianni", 37);
        // il valore 22 viene sovrascritto da 75
        numeriPreferiti.put("Mario", 75);

        System.out.println("numero prefe di Mario: " + numeriPreferiti.get("Mario"));
        
        // rimuovi una chiave (insieme al valore associato)
        numeriPreferiti.remove("Mario");
        
        // il metodo get restituisce null, se la chiave non esiste
        System.out.println("numero prefe di Mario: " + numeriPreferiti.get("Mario"));

        // ciclo su tutte le chiavi
        for (String nome : numeriPreferiti.keySet()) {
            Integer numero = numeriPreferiti.get(nome);
            System.out.println("numero prefe di " + nome + ": " + numero);
        }

        // ciclo su tutte le coppie chiave/valore
        for (Entry<String, Integer> e : numeriPreferiti.entrySet()) {
            System.out.println("numero prefe di " + e.getKey() + ": " + e.getValue());
        }
    }
}
