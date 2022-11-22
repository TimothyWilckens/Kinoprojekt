public class Film {
    String titel;
    int FSK;

    public Film(String titel, int FSK){
        setFSK(FSK);
        setTitel(titel);
    }
    public void setFSK(int fSK) {
        FSK = fSK;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public int getFSK() {
        return FSK;
    }
    public String getTitel() {
        return titel;
    }

}
