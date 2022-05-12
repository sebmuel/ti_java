package inheritance.Lebewesen;

public class Hund extends Lebewesen{
    public Hund(){
        this.beine = 4;
    }

    public void essen(){
        System.out.println("Der Hund isst.");
    }

    public void atmen(){
        System.out.println("Der Hund atmet.");
    }
}
