

public class Main {

    public static void main(String[] args) {
        // new instances of methods
        FizzBuzz fizzBuzz = new FizzBuzz();
        Fibonacci fibonacchi = new Fibonacci();
        ReverseString revStr = new ReverseString();
        RemoveVowels removeVowels = new RemoveVowels();
        CountStringLength strLength = new CountStringLength();
        CountVowels countVowels = new CountVowels();
        ArrayStuff arrStuff = new ArrayStuff();




        // execution of new instances
        fizzBuzz.fizzBuzz(25);
        System.out.println(strLength.countStringLength("hello"));
        System.out.println(strLength.simpleCountStringLength("hello again"));

        for(int i = 0; i <= 10; i++) {
            System.out.println(fibonacchi.fibonachi(i));
        }

        revStr.reverseString("hello");
        System.out.println(removeVowels.removeVowels("hello world"));
        System.out.println(countVowels.countVowels("hello world"));
        arrStuff.generateRandomArray();
        arrStuff.printArray();
        System.out.println(arrStuff.getValueAtIndex(3));
        System.out.println(arrStuff.doesArrayContainValue(18));
        arrStuff.deleteIndex(2);
        arrStuff.printArray();


    }
}
