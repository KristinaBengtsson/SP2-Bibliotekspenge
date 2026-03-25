public class PrintedBook extends Title {
    // === Subklasse af Title ===
//Antal sider i den printede bog
    private int pages;
    //Antal eksemplarer der findes af bogen
    private int copies;

    //--- Konstruktør ---
    //Opret en PrintedBook med alle nødvendige oplysninger

    public PrintedBook(String title, String literaturType, int copies, int pages){
        //kald konstruktøren i superklassen Title
        super(title, literaturType);
        //tilføj variablerne der tilhører PrintedBook
        this.pages = pages;
        this.copies = copies;
    }

    //---Metode ---
    @Override
    public double calculatePoints(){
        //Hent talværdien for literaturtype
        double literatureValue = convertLiteratureType();
        //Beregn og returner point
        //Formel: Sider × litteraturtype × eksemplarer
        return pages * literatureValue * copies;
    }

}
