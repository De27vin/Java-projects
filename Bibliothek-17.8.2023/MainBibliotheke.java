

public class MainBibliotheke {
    public static void main(String[] args) {

        Bibliotheke stadtbibliotheke = new Bibliotheke();
        stadtbibliotheke.addBuch(new Buch("Pride and Prejudice", "Jane Austen", 0, 279, 50));
        stadtbibliotheke.addBuch(new Buch("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 415404480L, 309, 16.25));
        stadtbibliotheke.addBuch(new Buch("The Hobbit", "J.R.R. Tolkien", 557715840L, 320, 13.50));
        stadtbibliotheke.addBuch(new Buch("The Alchemist", "Paulo Coelho", 786710400L, 197, 9.99));
        stadtbibliotheke.addBuch(new Buch("Brave New World", "Aldous Huxley", 926351040L, 288, 12.50));

        System.out.println(stadtbibliotheke);

        System.out.println(stadtbibliotheke.findBuch("J.K. Rowling"));
        System.out.println(stadtbibliotheke.findBuchByTitel("The Alchemist"));
    }   
}
