package kollatz;

public class Kollatz {
    private int current;
    private int steps;
    public Kollatz(int n){
        current = n;
        steps = 1;
    }
    /**
     * Checks if a given number is even or odd
     * @param number the current collatz number
     * @return true if number is even otherwise false
     */
    private boolean eval(int number){
        return number % 2 == 0;
    }
    /**
     * resolves the kollatz number with the given algo
     */
    public void resolve(){
        // trigger view at start to print the entered number -> Step: 1
        view();
        while(current != 1){
            if (eval(current)){
                current = current / 2;
            }else{
                current = current * 3 + 1;
            }
            steps += 1;
            view();
        }
        // seperator for multiple kollatz prints
        System.out.println("---------------------------");
    }
    /**
     * Handles the console output
     */
    private void view(){
        System.out.format("Step: %1d -> %1d \n", steps, current);
    }
}
