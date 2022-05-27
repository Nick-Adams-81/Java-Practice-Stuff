

public class Main {

    public static void main(String[] args) {
        // new instances of methods
        FizzBuzz fizzBuzz = new FizzBuzz();
        Fibonachi fibonachi = new Fibonachi();


        // execution of new methods
        fizzBuzz.fizzBuzz();

        for(int i = 0; i <= 10; i++) {
            System.out.println(fibonachi.fibonachi(i));
        }


    }
}
