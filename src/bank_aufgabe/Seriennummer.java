package bank_aufgabe;

public class Seriennummer {
    private String seriennummer;
    private int pruefZiffer;

    public Seriennummer(String seriennummer){
        this.seriennummer = seriennummer;
        this.pruefZiffer = Integer.parseInt(seriennummer.substring(seriennummer.length() - 1));
    }
    public void init(){
        pruefe();
    }
    private int getPruefZiffer(){
        int summe = seriennummer.charAt(0) - 'A' + 1;
        for (int i = 1; i < seriennummer.length() - 1; i++){
            char summand = seriennummer.charAt(i);
            summe += Integer.parseInt(String.valueOf(summand));
        }
        int rest = summe % 9;
        rest = (8 -rest);
        if (rest == 0){
            return 9;
        }
        return rest;
    }
    private void pruefe(){
        if (getPruefZiffer() != pruefZiffer){
            System.out.println("Keine Gültige Serinnummer");
        }else{
            System.out.println("Gülitge Seriennumemr");
        }
    }

}
