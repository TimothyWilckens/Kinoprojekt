public class Sitzplatz {
    Kunde kunde;
    int nummer;
    boolean istFrei;

    public Sitzplatz(boolean istFrei){
        setIstFrei(istFrei);
    }
    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
    public void setIstFrei(boolean istFrei) {
        this.istFrei = istFrei;
    }
    public Kunde getKunde() {
        return kunde;
    }
    public int getNummer() {
        return nummer;
    }
    public boolean getIstFrei() {
        return istFrei;
    }
}
