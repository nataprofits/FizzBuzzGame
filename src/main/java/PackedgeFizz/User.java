package PackedgeFizz;

import java.util.Scanner;

public class User implements UserInput {
    private String name;
    private int counter;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getNameFromInput() {
        System.out.println("Please, enter your name:");
        return scanner.next();
    }
   @Override
    public int getCounterFromInput(){
       System.out.println("How high shall we go?");
       return scanner.nextInt();
   }
   public String getName() {
        return name;
   }

    public int getCounter() {
        return counter;
    }
}
