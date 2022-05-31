public class CountStringLength {

    public int countStringLength(String str) {
        int count = 0;
        while (count < str.length()) {
            count++;
        }
        return count;
    }

    public int simpleCountStringLength(String str) {
        return str.length();
    }
}
