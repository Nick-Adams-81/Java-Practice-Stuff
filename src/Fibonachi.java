

public class Fibonachi {

    public int fibonachi(int z) {
        int a = 0;
        int b = 1;

        for(int i = 0; i < z; i++) {
            int x = a;
            a = b;
            b = b + x;
        }
         return a;
    }
}
