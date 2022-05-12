package inheritance;

import inheritance.Lebewesen.Hund;
import inheritance.Lebewesen.Mensch;

public class Main {
    public static void main(String[] args){
        Hund rex = new Hund();
        Mensch sebastian = new Mensch();
        sebastian.setName("Sebastian");
        rex.setName("Rex");
        System.out.println(rex.getName());
    }
}
