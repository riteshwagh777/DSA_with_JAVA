
import java.util.Scanner;

public class Prime_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int n= sc.nextInt();
        int sum=0;
        
        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count ++;
                }
            }
            if(count==1){
                sum = sum+i;
            }
        }
        System.out.println(sum);
        
    }
}
