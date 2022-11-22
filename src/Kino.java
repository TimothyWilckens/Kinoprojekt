import java.util.ArrayList;

public class Kino {
    String titel;
    String adresse;
    ArrayList<Saal> kinosaele;

    public Kino(String titel, String adresse, ArrayList<Saal> kinosaele){
        setAdresse(adresse);
        setTitel(titel);
        setKinosaele(new ArrayList<>());
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setKinosaele(ArrayList<Saal> kinosaele) {
        this.kinosaele = kinosaele;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getAdresse() {
        return adresse;
    }
    public ArrayList<Saal> getKinosaele() {
        return kinosaele;
    }
    public String getTitel() {
        return titel;
    }

}
