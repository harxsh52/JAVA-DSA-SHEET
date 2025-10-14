package Patternprinting;
import java.util.*;

public class fiveteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(char q=(char)('A');q<'A'+n-i;q++){
                System.out.print(q+" ");
            }
            System.out.println();
        }
        
    }
}
