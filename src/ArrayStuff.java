// array methods
public class ArrayStuff {

    // initializing an array for testing
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

    public void deleteIndex(int index) {
       if(index < arraySize) {
           for(int i = index; i < (arraySize -1); i++) {
               array[i] = array[i + 1];
           }

           arraySize--;
       }
    }

    public void insertValue(int value) {
       if(arraySize < 50) {
           array[arraySize] = value;
           arraySize++;
       }

    }

    public String linearSearch(int value) {
       boolean valueInArray = false;
       String indexWithValue = "";
        System.out.println("The value was found in the following: ");
        for(int i = 0; i < arraySize; i++) {
            if(array[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexWithValue += i + " ";
            }

        }
        if(!valueInArray) {
            indexWithValue = "none";

            System.out.print(indexWithValue);
        }

        System.out.println();

        return indexWithValue;
    }


}
