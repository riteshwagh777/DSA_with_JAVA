
import java.util.*;
public class EvenOddArray {
  // function for odd numbers print
    public static void OddArray(int arr[],int n){
         for (int i=0; i<n ; i++){
            if(arr[i]% 2 !=0){
              System.out.print( arr[i]+" ");
      }
    }

    System.out.println();

     }
  // function for even numbers print 
     public static void EvenArray(int arr[],int n){
       for(int i = 0 ; i<n; i++){
         if (arr[i] % 2 ==0){
           System.out.print( arr[i]+" ");
      }
    }
    System.out.println();

     }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a length of Array");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the Elements in Array:");
    for(int i =0 ; i<n; i++){
      arr[i]=sc.nextInt();
    }
    // calling both functiond even or odd arrays
    EvenArray(arr,n);
    OddArray(arr,n);
    }
}
