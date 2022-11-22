public class Veranstaltung {
    Kino kino;
    Saal saal;
    Film film;

    Sitzplatz[] reserviertePlaetze;

    public Veranstaltung(Kino kino, Saal saal, Film film, Sitzplatz[] reserviertePlaetze){
        setKino(kino);
        setSaal(saal);
        setFilm(film);
        setReserviertePlaetze(new Sitzplatz[getSaal().getMaxPlaetze()]);
        for(int i = 0; i < getSaal().getMaxPlaetze(); i++){
            getReserviertePlaetze()[i] = new Sitzplatz(true);
        }
    }
    public void setKino(Kino kino) {
        this.kino = kino;
    }
    public void setReserviertePlaetze(Sitzplatz[] reserviertePlaetze) {
        this.reserviertePlaetze = reserviertePlaetze;
    }
    public void setSaal(Saal saal) {
        this.saal = saal;
    }
    public void setFilm(Film film) {
        this.film = film;
    }
    public Kino getKino() {
        return kino;
    }
    public Sitzplatz[] getReserviertePlaetze() {
        return reserviertePlaetze;
    }
    public Saal getSaal() {
        return saal;
    }
    public Film getFilm() {
        return film;
    }
}
