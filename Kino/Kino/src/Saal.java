public class Saal {
    int nummer;
    int maxPlaetze;
    

    public Saal(int nummer, int maxPlaetze){
        setMaxPlaetze(maxPlaetze);
        setNummer(nummer);
    }
    public void setMaxPlaetze(int maxPlaetze) {
        this.maxPlaetze = maxPlaetze;
    }
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
    public int getMaxPlaetze() {
        return maxPlaetze;
    }
    public int getNummer() {
        return nummer;
    }
}
