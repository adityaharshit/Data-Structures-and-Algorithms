package Arrays;

// import java.util.Arrays;

public class TwoDimensionArray {
    int arr[][]=null;

    //constructor
    public TwoDimensionArray(int row, int col) {
        arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length;j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //insert value to array
    public void insertValue(int row, int col, int valueToBeInserted) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToBeInserted;
                System.out.println("Successfully inserted " + valueToBeInserted + " at location " + row + "," + col);
            } else {
                System.out.println("This cell is already occupied by another value.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    //Accesing cell value of the array
    public void accessCell(int row, int col) {
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    //traverse array
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length;j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    //search in array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length;j++) {
                if (arr[i][j] == valueToSearch) {
                    System.out.println("Value found!");
                    System.out.println("Index of " + valueToSearch + " is: " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("Value not found!");
    }

    //delete value from array
    public void deleteFromArray(int row, int col){
        try {
            arr[row][col] = Integer.MIN_VALUE;    
            System.out.println("Successfully deleted");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array.");
        }
    }

    //Main method
    public static void main(String[] args) {
        TwoDimensionArray tda = new TwoDimensionArray(2, 2);
        tda.insertValue(0, 0, 0);
        tda.insertValue(0, 1, 1);
        tda.insertValue(1, 0, 3);
        tda.insertValue(1, 1, 4);
        // System.out.println(Arrays.deepToString(tda.arr));
        tda.accessCell(1, 1);
        tda.deleteFromArray(1, 1);
        tda.traverseArray();
        tda.searchInArray(3);
    }

}
