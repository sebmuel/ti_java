package overloadDemo;

public class Main {

    public static void main(String[] args){
        Person person1 = new Person("Sebastian", 33);
        Person person2 = new Person("Peter");
        Person person3 = new Person(54, "Franz");
        Person person4 = new Person(25);
        person1.repr();
        person2.repr();
        person3.repr();
        person4.repr();
    }

}
