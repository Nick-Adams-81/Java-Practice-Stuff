

public class Main {

    public static void main(String[] args) {
        // new instances of methods
        FizzBuzz fizzBuzz = new FizzBuzz();
        Fibonacci fibonacchi = new Fibonacci();
        ReverseString revStr = new ReverseString();
        RemoveVowels removeVowels = new RemoveVowels();
        CountStringLength strLength = new CountStringLength();
        CountVowels countVowels = new CountVowels();



        // execution of new instances
        //fizzBuzz.fizzBuzz();
        System.out.println(strLength.countStringLength("hello"));
        System.out.println(strLength.simpleCountStringLength("hello again"));

        for(int i = 0; i <= 10; i++) {
            System.out.println(fibonacchi.fibonachi(i));
        }

        revStr.reverseString("hello");
        System.out.println(removeVowels.removeVowels("hello world"));
        System.out.println(countVowels.countVowels("hello world"));


    }
}
