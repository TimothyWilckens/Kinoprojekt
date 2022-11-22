public class Mitarbeiter extends Mensch{
    int gehalt;
    int mitarbeiternummer;

    public Mitarbeiter(String vorname, String nachname, int gehalt, int mitarbeiternummer){
        super(vorname, nachname);
        setGehalt(gehalt);
        setMitarbeiternummer(mitarbeiternummer);
    }
    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
    public void setMitarbeiternummer(int mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public int getGehalt() {
        return gehalt;
    }
    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }
}
