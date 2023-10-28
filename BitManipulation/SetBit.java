//Check if kth bit of a number is set or not

package BitManipulation;

public class SetBit {
    public static void main(String[] args){
        SetBit setBit = new SetBit();
        System.out.println(setBit.isSet(8, 4));
    }
    public boolean isSet(int n, int k){
        if(k==1)
            return (n&1)==1;
        return ((n>>(k-1))&1)==1;  //Or return (n&(1<<(k-1)))!=0; Or return (n&(int)Math.pow(2,k-1))!=0;
    }
}
