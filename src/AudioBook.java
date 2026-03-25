public class AudioBook extends Title {
    // === Subklasse ===
    //--- Variabler unikke for AudioBook ---
    private int durationInMinutes;
    private int copies;

    //--- Konstruktør ---
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType);
        //AudioBooks egne variabler
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }
    //--- Metode ---
    @Override
    public double calculatePoints(){
        //Hent talværdi for literaturtypen
        double literatureValue = convertLiteratureType();
        //Beregn point for lysbøger
        //Formel: (varighed i minutter × 0.5) × litteraturtype × eksemplarer
        return (durationInMinutes * 0.5) * literatureValue * copies;
    }
}
