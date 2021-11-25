public class Schulperson {
    private String name;
    private String id;

    public Schulperson (String name, String id){
        this.name = name;
        this.id = id;
    }

    protected String gibInfo(){
        String info = this.name + " " + this.id;
        return info;
    }
}
