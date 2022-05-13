package overloadDemo;

public class Person {
    private String name;
    private int alter;

    // Constructor 1
    public Person(String name, int alter){
        this.name = name;
        this.alter = alter;
    }
    // Constructor 2
    public Person (String name){
        this.name = name;
    }
    // Constructor 3
    public Person (int alter, String name){
        this.name = name;
        this.alter = alter;
    }
    // Constructor 4
    public Person (int alter){
        this.alter = alter;
    }

    public String getName(){
        return this.name;
    }

    public int getAlter() {
        return alter;
    }

    public void repr(){
        System.out.println("Name der Person ist " + this.getName() +
                " und die Person ist " + this.getAlter() + " Jahre alt!");
    }
}
