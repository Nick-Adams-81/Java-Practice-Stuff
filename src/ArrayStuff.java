
public class ArrayStuff {
    public int array[] = new int[50];

    private int arraySize = 10;

   public void generateRandomArray() {
       for(int i = 0; i < arraySize; i++) {
           array[i] = (int)(Math.random()*10) +10;
       }

    }

    public void printArray() {
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(array[i] + " |");

            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) {
       if(index < arraySize) return array[index];
       return 0;
    }

    public boolean doesArrayContainValue(int searchValue) {
       boolean valueInArray = false;

       for(int i = 0; i < arraySize; i++) {
           if(array[i] == searchValue) {
               valueInArray = true;
           }
       }

       return valueInArray;
    }

}
