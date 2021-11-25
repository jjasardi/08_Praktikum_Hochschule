public class Dozent extends Schulperson{
    private String bueroNummer;
    private String telefonNummer;

    public Dozent(String name, String id, String bueroNummer, String telefonNummer){
        super(name, id);
        this.bueroNummer = bueroNummer;
        this.telefonNummer = telefonNummer;
    }

    public String gibBuero(){
        return bueroNummer;
    }

    public String gibTelefonnummer(){
        return telefonNummer;
    }
}
