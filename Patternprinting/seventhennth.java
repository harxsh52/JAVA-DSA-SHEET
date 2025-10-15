package Patternprinting;
import java.util.*;
class seventhennth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(char q='A';q<='A'+i;q++){
                System.out.print(q);
            }
            for(char q=(char)('A'+i-1);q>='A';q--){
                System.out.print(q);
            }
            System.out.println();

        }
    }
}