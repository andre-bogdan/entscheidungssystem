package entscheidungssystem.Model;

public class Kriterien {
    String kriterium;
    int wert;

    public Kriterien(String kriterium) {
        this.kriterium = kriterium;
    }

    public String getKriterium() {
        return kriterium;
    }

    public void setKriterium(String kriterium) {
        this.kriterium = kriterium;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
}
