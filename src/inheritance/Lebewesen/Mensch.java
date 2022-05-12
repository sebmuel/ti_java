package inheritance.Lebewesen;

public class Mensch extends Lebewesen{
    public Mensch(){
        this.beine = 2;
    }

    public void atmen() {
        System.out.println("Der Mensch atmet.");
    }

    public void essen(){
        System.out.println("Der Mensch " + this.getName() + " isst.");
    }
}
