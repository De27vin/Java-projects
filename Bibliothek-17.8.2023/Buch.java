import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Buch {
    private String titel;
    private String autor;
    private long veröffentlichungsdatum;
    private int anzahlSeiten;
    private double preis;

    public Buch (String titel, String autor, long veröffentlichungsdatum, int anzahlSeiten, double preis) {
        this.titel = titel;
        this.autor = autor;
        this.veröffentlichungsdatum = veröffentlichungsdatum;
        this.anzahlSeiten = anzahlSeiten;
        this.preis = preis;
    }

    public String getTitel () {
        return titel;
    }
    public String getAutor () {
        return autor;
    }
    public long getVeröffentlichungsdatum () {
        return veröffentlichungsdatum;
    }
    public String getVeröffentlichungsdatumPP () {
        Instant instant = Instant.ofEpochSecond(veröffentlichungsdatum);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return localDateTime.format(formatter);
    }
    public int getAnzahlSeiten () {
        return anzahlSeiten;
    }
    public double getPreis () {
        return preis;
    }

    public void setTitel (String titel) {
        this.titel = titel;
    }
    public void setAutor (String autor) {
        this.autor = autor;
    }
    public void setVeröffentlichungsdatum (long veröffentlichungsdatum) {
        this.veröffentlichungsdatum = veröffentlichungsdatum;
    }
    public void setAnzahlSeiten (int anzahlSeiten) {
        this.anzahlSeiten = anzahlSeiten;
    }
    public void setPreis (double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Buch [titel=" + titel + ", autor=" + autor + ", veröffentlichungsdatum=" + veröffentlichungsdatum
                + ", anzahlSeiten=" + anzahlSeiten + ", preis=" + preis + "]";
    }

    







}
