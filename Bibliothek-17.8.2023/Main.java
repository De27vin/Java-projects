import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Buch buch1 = new Buch("To Kill a Mockingbird", "Harper Lee", -299034000, 321, 24.99);
        Buch buch2 = new Buch("1984", "George Orwell", -649040400, 328, 49.99);
        Buch buch3 = new Buch("The Great Gatsby", "F. Scott Fitzgerald", -1411520400, 180, 119.99);

        ArrayList<Buch> list0 = new ArrayList<Buch>();
        list0.add(new Buch("Pride and Prejudice", "Jane Austen", 0, 279, 50));
        list0.add(new Buch("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 415404480L, 309, 16.25));
        list0.add(new Buch("The Hobbit", "J.R.R. Tolkien", 557715840L, 320, 13.50));
        list0.add(new Buch("The Alchemist", "Paulo Coelho", 786710400L, 197, 9.99));
        list0.add(new Buch("Brave New World", "Aldous Huxley", 926351040L, 288, 12.50));

        System.out.println("\n" + "Das Buch: " + buch1.getTitel() + " kam " + buch1.getVeröffentlichungsdatumPP() + " raus. Es hat " + buch1.getAnzahlSeiten() + " Seiten.");
        System.out.println(buch2.getTitel() + " ist " + buch2.getVeröffentlichungsdatumPP() + " veröffentlicht worden.");
        System.out.println(buch3.getAutor() + " hat " + buch3.getVeröffentlichungsdatumPP() + " " + buch3.getTitel() + " mit " + buch3.getAnzahlSeiten() + " Seiten veröffentlicht.");
        System.out.println("Alle Bücher zusammen kosten: " + (buch1.getPreis() + buch2.getPreis() + buch3.getPreis()) + " CHF.");
        buch1.setAnzahlSeiten(281);
        System.out.println("Das Buch " + buch1.getTitel() + " hat nicht 321 Seiten, sondern " + buch1.getAnzahlSeiten() + ".");

        for (Buch currentBuch0 : list0) {
            System.out.println(currentBuch0);
        }
        
        
    }
    
}
