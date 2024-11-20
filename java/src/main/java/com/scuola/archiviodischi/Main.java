package com.scuola.archiviodischi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArchivioDischi a = costruisciArchivio();
        System.out.println("Archivio contiene " + a.lunghezza() + " dischi");
        System.out.println(a);
    }

    public static ArchivioDischi costruisciArchivio() {
        Autore autore;
        ArrayList<Canzone> canzoni;
        Disco disco;
        ArchivioDischi archivio = new ArchivioDischi();

        autore = new Autore("Tony Boy");
        canzoni = new ArrayList<Canzone>();
        canzoni.add(new Canzone("Segreti", "rap"));
        canzoni.add(new Canzone("Sincero", "rap"));
        canzoni.add(new Canzone("Ossigeno", "rap"));
        disco = new Disco("Non c'e' futuro", canzoni, autore);
        archivio.aggiungi(disco);
        

         

        



            

    autore = new Autore("Travis Scott"); 

     canzoni.add(new Canzone("MY EYES", "Rap"));

     canzoni.add(new Canzone("FE!N", "Rap"));

     canzoni.add(new Canzone("I KNOW?", "Rap"));

     canzoni.add(new Canzone("TELEKINESIS", "Rap"));

     canzoni.add(new Canzone("MELTDOWN", "Rap"));

        disco = new Disco("UTOPIA", canzoni, autore);

         archivio.aggiungi(disco);
         
         
         
        
         
        autore = new Autore("Kid Yugi");

            canzoni = new ArrayList<Canzone>();

            canzoni.add(new Canzone("6SEI6", "rap"));

            canzoni.add(new Canzone("Donna", "rap"));

            canzoni.add(new Canzone("S.X.S.I.C", "rap"));

            canzoni.add(new Canzone("Modalità demonio", "rap"));

            canzoni.add(new Canzone("Diablo", "rap"));

            canzoni.add(new Canzone("Loki", "rap"));

            canzoni.add(new Canzone("Ex Angelo - Original Version", "rap"));

            canzoni.add(new Canzone("64 BARRE DA CENSURA", "rap"));

            canzoni.add(new Canzone("L'Anticristo", "rap"));

            canzoni.add(new Canzone("Capra a tre Teste", "rap"));

            canzoni.add(new Canzone("Eva", "rap"));

            canzoni.add(new Canzone("Servizio", "rap"));

            canzoni.add(new Canzone("Il Signore delle Mosche", "rap"));

            canzoni.add(new Canzone("Lilith", "rap"));       

            canzoni.add(new Canzone("Nemico", "rap"));

            canzoni.add(new Canzone("Denaro", "rap"));

            canzoni.add(new Canzone("Yung 3p 4", "rap"));

            canzoni.add(new Canzone("Terr1", "rap"));

            canzoni.add(new Canzone("Ilva", "rap"));

            canzoni.add(new Canzone("Paganini", "rap"));

            canzoni.add(new Canzone("Ex Angelo", "rap"));

            canzoni.add(new Canzone("Lucifero", "rap"));

        disco = new Disco("Tutti i Nomi del Diavolo", canzoni, autore);

        archivio.aggiungi(disco);
         

        

         

            autore = new Autore("Capo plaza");

            canzoni = new ArrayList<Canzone>();

            canzoni.add(new Canzone("Vabbene", "trap"));

            canzoni.add(new Canzone("20", "trap"));

            canzoni.add(new Canzone("interlude", "trap"));

            canzoni.add(new Canzone("Uno squillo", "trap"));

            canzoni.add(new Canzone("Coupe", "trap"));

            canzoni.add(new Canzone("Forte e Chiaro", "trap"));

            canzoni.add(new Canzone("Come me", "trap"));

    disco = new Disco("20", canzoni, autore);





            autore = new Autore ("The Night Skinny");

            canzoni = new ArrayList<Canzone>();

            canzoni.add(new Canzone ("Entro nel posto", "rap"));

            canzoni.add(new Canzone ("Trema", "rap"));

            canzoni.add(new Canzone ("Divido cose", "rap"));

            canzoni.add(new Canzone ("Solo Dio sa", "rap"));

            canzoni.add(new Canzone ("Numero 5", "rap"));

            canzoni.add(new Canzone ("era sanitaria", "rap"));

            canzoni.add(new Canzone ("DM", "rap"));

            canzoni.add(new Canzone ("Good girl", "rap"));

            canzoni.add(new Canzone ("Nella trap", "rap"));

            canzoni.add(new Canzone ("Rito breve", "rap"));

            canzoni.add(new Canzone ("Fuck Tommorow 2", "rap"));

            canzoni.add(new Canzone ("Walzer", "rap"));

            canzoni.add(new Canzone ("Mio padre", "rap"));

            canzoni.add(new Canzone ("Amore cieco", "rap"));

            canzoni.add(new Canzone ("True story", "rap"));

            canzoni.add(new Canzone ("Solo", "rap"));

            canzoni.add(new Canzone ("T.O.N.Y.", "rap"));

            canzoni.add(new Canzone ("CNTNRS", "rap"));

            disco = new Disco("Contairenes", canzoni , autore);




        autore = new Autore ("Artie 5ive");

        canzoni = new ArrayList<Canzone>();

        canzoni.add(new Canzone("Ready 4 war", "Trap"));

        canzoni.add(new Canzone("Souljas", "Melodico"));

        canzoni.add(new Canzone("Mustang", "Trap"));

        canzoni.add(new Canzone("Aghi acuminati", "Melodico"));

         canzoni.add(new Canzone("Intro", "Melodico"));
         canzoni.add(new Canzone("Sacrificio", "Trap"));
         canzoni.add(new Canzone("Nike", "Rap"));

        disco = new Disco("Aspettando la bella vita", canzoni, autore);

        archivio.aggiungi(disco);


        autore = new Autore("skillet");

        canzoni = new ArrayList<Canzone>();

        canzoni.add(new Canzone("dominion", "metal"));

        canzoni.add(new Canzone("refuge", "rock"));

        canzoni.add(new Canzone("valley of death", "rock"));

        disco = new Disco ("dominion", canzoni, autore);

     


       autore = new Autore("Kid Yugi");
        canzoni = new ArrayList<Canzone>();  
        canzoni.add(new Canzone("Capra a tre teste", "rap"));
        canzoni.add(new Canzone("Servizio", "rap"));
        disco = new Disco("I nomi diavolo", canzoni, autore); 
        archivio.aggiungi(disco);

      


         autore = new Autore ("Yuno Miles");

        canzoni = new ArrayList<Canzone>();

        canzoni.add(new Canzone("Neighboor", "Rap"));

        canzoni.add(new Canzone("Duck Duck goose", "Rap"));

        canzoni.add(new Canzone("First Thing I Do", "Rap"));

        canzoni.add(new Canzone("She On A Plane", "Rap"));

        canzoni.add(new Canzone("Benjamin Button", "Rap"));

        canzoni.add(new Canzone("Hold The Garbage", "Rap"));

        canzoni.add(new Canzone("Musty Crusty Dusty", "Rap"));

        canzoni.add(new Canzone("Tic Tac Toe", "Rap"));

        canzoni.add(new Canzone("Hinga Dinga Durgen", "Rap"));

        disco = new Disco("Yuno Certified Trash", canzoni, autore);

        archivio.aggiungi(disco);




    autore = new Autore ("Kanye West");

    canzoni = new ArrayList<Canzone>();

    canzoni.add(new Canzone("Good Moring","Rap"));

    canzoni.add(new Canzone("Champion", "Rap"));

    canzoni.add(new Canzone("Stronger","Rap"));

    canzoni.add(new Canzone("I Wonder","Rap"));

    canzoni.add(new Canzone("Good Life","Rap"));

    canzoni.add(new Canzone("Can't Tell Me Nothing","Rap"));

    canzoni.add(new Canzone("Barry Bonds","Rap"));

    canzoni.add(new Canzone("Drunk an hot Girls","Rap"));

    canzoni.add(new Canzone("Flashing Lights","Rap"));

    canzoni.add(new Canzone("Everything I Am","Rap"));

    canzoni.add(new Canzone("The Glory","Rap"));

    canzoni.add(new Canzone("Homecoming","Rap"));

    canzoni.add(new Canzone("Big Brother","Rap"));

    disco = new Disco("Graduation", canzoni, autore);

    archivio.aggiungi(disco);

       

      


         

    autore = new Autore("Capo Plaza");

            canzoni = new ArrayList<>();

            canzoni.add(new Canzone("20" , "rap"));

            canzoni.add(new Canzone("Giù da me" , "rap"));

            canzoni.add(new Canzone("Tesla" , "rap"));

            canzoni.add(new Canzone("Nike boy" , "rap"));

            canzoni.add(new Canzone("Come me" , "rap"));

            canzoni.add(new Canzone("J$ JP" , "rap"));

            canzoni.add(new Canzone("Interlude" , "rap"));

            canzoni.add(new Canzone("Ne è valsa la pena" , "rap"));      canzoni.add(new Canzone("Non cambierò mai" , "rap"));

            canzoni.add(new Canzone("Taxi" , "rap"));

            canzoni.add(new Canzone("Uno squillo" , "rap"));

            canzoni.add(new Canzone("Vabbene" , "rap"));

            canzoni.add(new Canzone("Forte e chiaro" , "rap"));

            canzoni.add(new Canzone("Giovane fuoriclasse" , "rap"));

            disco = new Disco("20" , canzoni , autore);

            archivio.aggiungi(disco);


       

    autore = new Autore("AC/DC");

            canzoni = new ArrayList<Canzone>();

            

            

            canzoni.add(new Canzone("Rock 'N Roll Train", "rock"));

            canzoni.add(new Canzone("Skies on Fire", "rock"));

            canzoni.add(new Canzone("Big Jack", "rock"));

            canzoni.add(new Canzone("Anything Goes", "rock"));

            canzoni.add(new Canzone("War Machine", "rock"));

            canzoni.add(new Canzone("Smash 'n' Grab", "rock"));

            canzoni.add(new Canzone("Spoilin' for a Fight", "rock"));

            canzoni.add(new Canzone("Wheels", "rock"));

            canzoni.add(new Canzone("Decibel", "rock"));

            canzoni.add(new Canzone("Stormy May Day", "rock"));

            canzoni.add(new Canzone("She Likes Rock 'n' Roll", "rock"));

            canzoni.add(new Canzone("Money Made", "rock"));

            canzoni.add(new Canzone("Rock 'n' Roll Dream", "rock"));

            canzoni.add(new Canzone("Rocking All the Way", "rock"));

            canzoni.add(new Canzone("Black Ice", "rock"));

            

            disco = new Disco("back in black", canzoni, autore);



           Autore TheWeeknd = new Autore("The Weeknd");

            

            canzoni = new ArrayList<Canzone>();

            canzoni.add(new Canzone("Dawn FM", "Pop"));

            canzoni.add(new Canzone("Less", "Pop"));

            canzoni.add(new Canzone("Sacrife", "Rap"));

            canzoni.add(new Canzone("Takh", "Rap"));

            canzoni.add(new Canzone("Out of Time", "Rap"));

            

            disco = new Disco("Dawn FM", canzoni, autore);

            archivio.aggiungi(disco);





            autore = new Autore("Shiva");

            

            canzoni.add(new Canzone("Milano Angels", "trap"));

            canzoni.add(new Canzone("Pluh", "trap"));

            canzoni.add(new Canzone("First Day Out", "trap"));

            canzoni.add(new Canzone("Take 5", "trap"));

            canzoni.add(new Canzone("Milano Shotta Freestyle", "trap"));

            canzoni.add(new Canzone("Gotham (feat. Kid Yugi)", "trap"));

            canzoni.add(new Canzone("Polvere (feat. Tony Boy)", "trap"));

            disco = new Disco("Milano Angels", canzoni, autore);

            archivio.aggiungi(disco);

   


    autore = new Autore("KSI");

    canzoni = new ArrayList<Canzone>();

    canzoni.add(new Canzone("Thick of it", "Hip hop"));

    canzoni.add(new Canzone("You are my sunshine", "Rap"));

    disco = new Disco("My only sunshine", canzoni, autore);

    archivio.aggiungi(disco);


    autore = new Autore ("Kid yugi");

            canzoni = new ArrayList<Canzone>();

            canzoni.add(new Canzone("6SEI6", "Rap"));

            canzoni.add(new Canzone("Donna", "Rap"));

            canzoni.add(new Canzone("Modalità Demonio", "Rap"));

            disco = new Disco("Tutti i nomi del diavolo" , canzoni, autore);

            archivio.aggiungi(disco);



        return archivio;

    }
}
