

public class Main {

    public static void main(String[] args) {
        // new instances of methods
        FizzBuzz fizzBuzz = new FizzBuzz();
        Fibonachi fibonachi = new Fibonachi();
        ReverseString revStr = new ReverseString();
        RemoveVowels removeVowels = new RemoveVowels();


        // execution of new instances
        fizzBuzz.fizzBuzz();

        for(int i = 0; i <= 10; i++) {
            System.out.println(fibonachi.fibonachi(i));
        }

        revStr.reverseString("hello");
        System.out.println(removeVowels.removeVowels("hello world"));


    }
}
