import java.util.ArrayList;

public class Author {
    //Ved alt om forfatteren som har et navn og en liste af titler (bøger)
    private String name;
    private ArrayList<Title> titles;

    //--- Konstruktør ---
    //Opretter en ny forfatter med et navn. Titler tilføjes med addTitle()-metoden
    public Author(String name){
        this.name = name;
        //opret en tom Arrayliste som kan modtage titler
        this.titles = new ArrayList<>();
    }

    //--- Metoder ---
    //Metode til at tilføje en title til forfatterens liste
    public void addTitle(Title title){
        titles.add(title);
    }
    //Metode der beregner det samlede beløb forfatteren skal have for alle sine titler
    public double calculateRoyalties(){
        //Start med 0kr.
        double total = 0.0;
        //for-each loop der kører gennem alle titler i listen
        for (Title t : titles){
            //kald calculateRoyalty på den enkelte titel
            total = total + t.calculateRoyalty();
        }
        //Afrund til 2 decimaler: Math.round(tal*100.0)/100.0
        total = Math.round(total*100.0)/100.0;
        return total;
    }

    //---Getter---
    //Giv adgang til forfatterens navn udefra
    public String getName(){
        return name;
    }
}