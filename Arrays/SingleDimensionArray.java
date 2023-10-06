package Arrays;

public class SingleDimensionArray {
    int arr[] = null;
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted " + valueToBeInserted + " at location " + location);
            } else {
                System.out.println("This cell is already occupied by another value.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value found!");
                System.out.println("Index of " + valueToSearch + " is: " + i);
                return;
            }
        }
        System.out.println("Value not found!");
    }

    public void deleteValueFromArray(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;    
            System.out.println("Successfully deleted");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array.");
        }
    }

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.insert(0, 0);
        sda.insert(1, 1);
        sda.insert(2, 2);
        
        // var firstElement = sda.arr[0];
        // System.out.println(firstElement);
        // var secondElement = sda.arr[1];
        // System.out.println(secondElement);
        // sda.searchInArray(1); 
        sda.deleteValueFromArray(1);
        sda.traverseArray();  
    }
    
}
