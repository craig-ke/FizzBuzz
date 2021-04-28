package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args ) {
        /* Use for loops to print numbers 1 >>>100 */
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBUzz");
                /* Check for divisibility by bot 3 and 5*/
            } else if (i % 3 == 0){
                System.out.println("Fizz");
                /*Check for divisibility by 3 */
            } else if (i % 5 == 0){
                System.out.println("Buzz");
                /* Check for divisibility by 5*/
            } else if (i % i == 0 && i % 2 == 1 ){
                System.out.println("Prime");
                /* Check for prime numbers*/
            } else {
                System.out.println(i);
            }
        }
    }
}
