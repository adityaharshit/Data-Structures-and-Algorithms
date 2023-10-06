package Arrays;
import java.util.Scanner;

public class dayAboveAverageTemp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days' temperature?");
        int noOfDays= sc.nextInt();
        float averageTemp=0;
        float[] temp = new float[noOfDays];
        for(int i=0;i<noOfDays;i++){
            System.out.println("Day "+(i+1)+"'s high temp: ");
            temp[i] = sc.nextFloat();
            averageTemp+=temp[i];
        }
        averageTemp = averageTemp/noOfDays;
        int count=0;
        for(int i=0;i<noOfDays;i++){
            if(temp[i]>averageTemp){
                count++;
            }
        }
        System.out.println(count+" days above average");
        sc.close();
    }
}
