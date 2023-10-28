//You are given a decimal number, the task is to calculate the number of set bits in that number
package BitManipulation;

public class CountBits {
    public static void main(String args[]){
        CountBits countBits = new CountBits();
        System.out.println(countBits.count(15));
    }
    public int count(int n){
        int count=0;
        for(int i=0;Math.pow(2,i)<=n;i++){
            if((n&(1<<i))!=0)
                count++;
        }
        return count;

        /*
        * int count = 0;
        * while(n>0){
            * if(n%2==1)
            *  count++;
            * n = n/2;
        *}
        *  return res
            Brian Kunningham algorithm
        // int count = 0;
        // while(n>0){
        //     count++;
        //     n = n&(n-1);
        // }
        // return count;
        */
    }
}
/*
 * Loopkup table method
 * int[] table = new int[256];
 * table[0] = 0;
 * for(int i=1;i<256;i++)
 * table[i] = table[i&(i-1)]+1;
 * int countSetBit(int n){
 *  return table[n&0xff]+table[(n>>8)&0xff]+table[(n>>16)&0xff]+table[(n>>24)&0xff];
 * }
 */