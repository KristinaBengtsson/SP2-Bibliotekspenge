public class LibraryRoyaltyCalculator {
    public static void main(String[] args){
        // === TEST AF SYSTEMET ===

        //Oprette mindst 1 forfatter
        Author author1 = new Author("Pernille Høegh");

        //Tilføjer mindst 3 bøger af forskellige slags til forfatteren(1 lydbog)
        //Bog 1:
        PrintedBook paaVisseBetingelser = new PrintedBook("På visse betingelser", "SKØN", 10, 140);
        author1.addTitle(paaVisseBetingelser);
        //Bog 2:
        PrintedBook minFarOgKvinden = new PrintedBook("Min far og kvinden", "SKØN", 8, 211);
        author1.addTitle(minFarOgKvinden);
        //Bog 3 (Lydbog):
        AudioBook paaVisseBetingelserAudio = new AudioBook("På visse betingelser", "SKØN", 10, 214);
        author1.addTitle(paaVisseBetingelserAudio);

        double sametBeloeb = author1.calculateRoyalties();

        //Forfatter nr 2
        Author author2 = new Author("Hans Hansen");
        //Bog 1:
        PrintedBook fagbogen = new PrintedBook("Fagbogen", "FAG", 25, 440);
        author2.addTitle(fagbogen);
        //Bog 2:
        PrintedBook fuglebogen = new PrintedBook("Fuglefagbogen", "FAG", 22, 321);
        author2.addTitle(fuglebogen);
        //Bog 3 (Lydbog):
        AudioBook snakOmFugle = new AudioBook("Snak om fugle", "FAG", 5, 327);
        author2.addTitle(paaVisseBetingelserAudio);

       double sametBeloeb2 = author2.calculateRoyalties();

        //Skriver resultatet pænt ud med forfatterens navn og det fulde beløb der skal udbetales
        System.out.println("===== Bibliotekspenge beregning =====");
        System.out.println("***************************************");
        System.out.println("Forfatter : " + author1.getName());
        //Bruger String.format() til at formatere beløbet med præcis 2 decimaleer
        // "%.2f" betyder Udskriv et decimaltal (f) med 2 decimaler (.2)
        System.out.println("Udbetaling : " + String.format("%.2f", sametBeloeb) + " kr.");

        System.out.println("***************************************");
        System.out.println("Forfatter : " + author2.getName());
        System.out.println("Udbetaling : " + String.format("%.2f", sametBeloeb2) + " kr.");
        System.out.println("***************************************");



    }
}
