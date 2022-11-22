public class App {
    public static void main(String[] args) throws Exception {
        Kino kino1 = new Kino("UCI", " Friedrich-Ebert-Damm 134", null);

        Saal saal1 = new Saal(1, 55);
        kino1.getKinosaele().add(saal1);

        Kunde kunde1 = new Kunde(null, null, 0, 0);

        Film film1 = new Film(null, 0);
        
        Veranstaltung veranstaltung1 = new Veranstaltung(kino1, kino1.getKinosaele().get(0), film1, null);
        
        int k = 1;
        for(Sitzplatz sitzplaetze : veranstaltung1.getReserviertePlaetze()){
            if(sitzplaetze.getIstFrei() == true){
                System.out.println("Platz " + k + ". ist noch nicht gebucht.");
            }
            else{
                System.out.println("Platz " + k + ". ist gebucht.");
            }
            k++;
        }
        

        System.out.println(veranstaltung1.getReserviertePlaetze());
    }
}
