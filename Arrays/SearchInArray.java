//check if an element is present in an array or not
package Arrays;

public class SearchInArray {
    public static void main(String[] args){
        SearchInArray sia = new SearchInArray();
        int[] arr = {1,2,3,4,6,7,8,9,10};
        int searchElement = 5;
        sia.searchElement(arr, searchElement);
    }
    public void searchElement(int[] arr, int searchElement){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchElement){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
