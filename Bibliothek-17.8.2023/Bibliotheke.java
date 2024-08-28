import java.util.ArrayList;

public class Bibliotheke {
    private ArrayList<Buch> bücher;
    public Bibliotheke() {
        bücher = new ArrayList<Buch>();
    }
    public void addBuch(Buch buch) {
        bücher.add(buch);
    }
    public Buch findBuch(String autor) {
        for (Buch currentBuch1 : bücher) {
            if (autor.equals(currentBuch1.getAutor()) ) {
                return currentBuch1;
            }

        }
        return null;

    }

    public Buch findBuchByTitel(String titel)   {
        for (Buch currentBuch1 : bücher) {
            if (titel.equals(currentBuch1.getTitel())) {
                return currentBuch1;
            }

        }
        return null;
    }
    

    @Override
    public String toString () {
        String result = "";
        for (Buch currentBuch1 : bücher) {
            result += currentBuch1.toString() + "\n";

        }
        return result;
    }
}
