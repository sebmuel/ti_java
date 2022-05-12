package uebung3;

public class Count {
    public static void countUp(int n, int steps){
        for (int i = 1; i <= n; i = i + steps){
            if (i % 2 == 0){
                System.out.println("Gerade: " + i);
            }else{
                System.out.println("Ungerade: " + i);
            }
        }
    }
}
