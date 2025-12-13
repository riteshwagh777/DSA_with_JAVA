// you can call any function base on your need 
public class Arrays{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static int Linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key)
            return i;
        }
        return -1;

    }



public static int check(String str[],String key){
    for(int i=0;i<str.length;i++){
        if(str[i]==key){
            return i;
        }
    }
        return -1;
    

}
public static int getlargest(int numbers[]){

    //int a = Integer.MAX_VALUE;// finding smallest value in that array
    int a= Integer.MIN_VALUE;// finding largest value in given array
    for(int i=0;i<numbers.length;i++){
        if(a<numbers[i])
         a=numbers[i];
    }
    return a;
}
public static int binarysearch(int numbers[],int key){
    int start=0;
    int end= numbers.length-1;
    while(start<=end){

        int mid= (start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]>key){// left check and update end .
            end = mid-1;
        }
        else  {
             start= mid+1; // check right update start.

    }
        
}

            return -1;
}
public static void  reverse(int numbers[]){
    int first=0, last=numbers.length-1;
          while(first<last){
            // swap
        int temp=numbers[last];
       numbers [last]= numbers[first];
       numbers [first]=temp;

        first++;
        last--;
        for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]);
      }
            }
              }
public static void printpairs(int numbers[]){
    int tp=0;// for couting total pairs
    for(int i=0;i<numbers.length;i++){
        int curr=numbers[i];
         for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+ curr+","+numbers[j]+")");
            tp++;// finding  total pairs            
         }
        
         System.out.println();
         
    }
    System.out.println("total pairs:"+tp);
}
public static void arraypairs(int numbers[]){


    for(int i=0;i<numbers.length;i++){ // start

         for(int j=i;j<numbers.length;j++){ // end 
         

            for(int k=i;k<=j;k++){
                 System.out.print(numbers[k]+" ");

                
            }
            
      
          
             System.out.println("");
         }
        
         
        System.out.println("");
    }
    //System.out.println("total subarray :"+ts);
    

}
    
public static void maxsubarray(int numbers[]){
    int maxsum= Integer.MIN_VALUE;
    int currsum=0;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
             currsum=0;
            for(int k=start;k<=end;k++){
                currsum+=numbers[k];
            }
            System.out.println(currsum);
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
    }
    System.out.println("maximux sum is :"+maxsum );
}
public static void kadanes(int numbers[]){
    int ms= Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<numbers.length;i++){
        cs= cs+numbers[i];
        if(cs<0){
            cs=0;
        }
        ms= Math.max(cs,ms);

    }
        if(ms!=0){
     System.out.println("maximu sum of array is:"+ms);
        }

           if(ms==0){
                int nm= Integer.MAX_VALUE;
                int bs=0;
                for(int i=0;i<numbers.length;i++){
                    bs= bs+numbers[i];
                   // if(bs>0){
                   //  bs=0;
                   // }
                    nm= Math.min(bs,nm);
                    
                }
                System.out.println("minimum sum of array is:"+nm);
                                

            }


}    
public static int trappedrainwater(int height[]){
    int n= height.length;
    // calculate left boundary - array
    int leftmax[]= new int[n];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
        leftmax[i]=Math.max(height[i],leftmax[i-1]);
    }
    // calculate right max- array
    int rightmax[]= new int[n];
    rightmax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightmax[i]= Math.max(height[i],rightmax[i+1]);

    }
int trappedwater=0;
//loop
for(int i=0;i<n;i++){
    int waterlevel=Math.min(leftmax[i],rightmax[i]);
    trappedwater += waterlevel-height[i];
}
return trappedwater;



}


    
    public static int buysellstock(int prices[]) {
        int buyprice= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
            int profit= prices[i]-buyprice;
            maxprofit= Math.max(maxprofit,profit);

        }
        else{
            buyprice=prices[i];
        }
        }
        
        return maxprofit;

    }
    
    

       


    public static void main(String[] args) {
      //  Scanner sc= new Scanner(System.in);
    int numbers[]={-5,-1,-3,-2};
    kadanes(numbers);

    

    }
}





