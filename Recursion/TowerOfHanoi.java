package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        tower(3, 'a', 'b', 'c');
    }
    static void tower(int n, char from_rod, char aux_rod, char to_rod){
        if(n==1){
            System.out.println("Move 1 from "+from_rod+ " to "+ to_rod);
            return;
        }
        tower(n-1, from_rod, to_rod, aux_rod);
        System.out.println("Move " + n + " from "+from_rod+" to "+to_rod);
        tower(n-1, aux_rod, from_rod, to_rod);
    }
}
