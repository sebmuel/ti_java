package uebung3;

public class Count {
    public static void countUp(int n, int steps){
        for (int i = 1; i <= n; i = i + steps){
            String msg = "";
            if (i % 2 == 0){
                msg = "Zahl:" + i + " durch 2 teilbar";
            }
            if(i % 3 == 0 && i % 2 == 0){
                msg = msg + " und durch 3";
            }
            else if(i % 3 == 0) {
                msg = "Zahl:" + i + " durch 3 teilbar";
            }
            else{
                msg = "Zahl:" + i + " stupid number";
            }
            System.out.println(msg);
        }
    }
}
