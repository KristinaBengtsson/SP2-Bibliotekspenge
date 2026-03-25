public abstract class Title {
    // === Super klassen ===
    //--- Variabler ---
    private String title; //Titlen på bogen
    private String literatureType;
   // int points;
    //RATE er static fordi den deles af alle Title-objekter og final fordi den ikke kan ændres
    static final double RATE = 0.067574;

    //--- Constructor ---
    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    //--- Metoder / subklasserne implementerer selv ---
    //Beregn bibliotekspenge for EN titel.
    //Beregnes her fordi formlen er den samme for alle typer af bøger.
    public double calculateRoyalty(){
        double points = calculatePoints(); // kalder calculatePoints fordi denne er forskellig
        //Formel: point * rate
        return points * RATE;
    }
    //PrintedBook og AudioBook skal lave sin egen version af metoden da de beregnes forskelligt.
    public abstract double calculatePoints();

    //Oversæt litteraturtypen til en talværdi som kan bruges i pointberegneren.
    public double convertLiteratureType(){
        //Brug en switch til at tjekke type og retunerer den tilhørende talværdi
        switch (literatureType){
            case "BI": //Billedbøger (for børn)
                return 3.0;
            case "TE": //Tegneserier
                return 3.0;
            case "LYRIK": //Lyriksamlinger
                return 6.0;
            case "SKØN": //Skønlitterære bøger
                return 1.7;
            case "FAG": //Fagbøger
                return 1.0;
            default: //Hvis typen ikke genkendes retuneres 0
                System.out.println("Ukendt litteraturtype: " + literatureType);
                return 0.0;
        }
    }
    //--- Getter ---
    //Lav getters der giver adgang til de private felter
    public String getTitle(){
        return title;
    }
    public String getLiteratureType(){
        return literatureType;
    }
}
