package learn;

abstract class InnerContest {
    public int age = 5;
    final String name = "Bill";
    public abstract void HTTP();
}

public class Contest {
    public static void main(String[] args) {
        
        person person = new person();
        System.out.println(person.name);
    }
}
class person extends InnerContest{
    int age = 6;
    String name = "sss";
    public void HTTP(){
        System.out.println("HTTP");
    }
}