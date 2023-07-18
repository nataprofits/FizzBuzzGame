package PackedgeFizz;

public class FizzBuzzGame implements Game {
    private int upperLimit;
    public FizzBuzzGame(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    @Override
    public void play() {
        for (int n = 0; n <= upperLimit; n++) {
            if (n % 3 == 0 && n % 5 != 0) {
                // print Fizz
                System.out.println("Fizz");
            } else if (n % 3 != 0 && n % 5 == 0) {
                // print Buzz
                System.out.println("Buzz");
            } else if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(n);
            }
        }
    }
}
