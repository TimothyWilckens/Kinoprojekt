public class Kunde extends Mensch{
    int kundennummer;
    int alter;

    public Kunde(String vorname, String nachname, int kundennummer, int alter){
        super(vorname, nachname);
        setAlter(alter);
        setKundennummer(kundennummer);
    }
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getKundennummer() {
        return kundennummer;
    }
    public int getAlter() {
        return alter;
    }
}
