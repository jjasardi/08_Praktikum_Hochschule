public class Student extends Schulperson {
    private int credits;

    public Student(String name, String id){
        super(name, id);
        credits = 0;
    }

    public int gibCredits(){
        return credits;
    }

    public void erhoeheCredits(int plusCredits){
        this.credits += plusCredits;
    }
}
