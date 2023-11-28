package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        System.out.println(slElement(arr));
    }
    static int slElement(int[] arr){
        int res=Integer.MIN_VALUE, max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num==max){
                continue;
            }
            else if(num>max){
                res=max;
                max=num;
            }else if(num>res){
                res=num;
            }
        }
        return res;
    }
}
