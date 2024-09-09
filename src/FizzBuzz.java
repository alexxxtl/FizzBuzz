/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 0;

        while (i < 100){
            i = doFizzBuzz(i);
        }

    }

    private static int doFizzBuzz(int i) {
        boolean divisibilityBy3 = i % 3 == 0;
        boolean divisibilityBy5 = i % 5 == 0;

        if (divisibilityBy3 && divisibilityBy5){
            System.out.println("FizzBuzz");
        }

        else if (divisibilityBy3){
            System.out.println("Fizz");
        }

        else if (divisibilityBy5){
            System.out.println("Buzz");
        }
        else {
            System.out.println(i);
        }

        i += 1;
        return i;
    }
}
