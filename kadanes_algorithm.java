public class kadanes_algorithm {

// this algorithm is used to find the maximum subarray sum with best possible time complexity of O(n)
public static void kadanesAlgo(int[] arr){

    int cs = 0; // current sum
    int ms = Integer.MIN_VALUE; // max sum

    for(int i=0; i< arr.length ; i++){
        cs = cs + arr[i];
  
        // condition of kadanes algorithm
        if(cs < 0){

            cs =0;
        }

        if(cs > ms){

            ms = cs ;
        }
        

    }

    System.out.println("The maximum Subarray sum is : " + ms);


}




public static void main(String[] args){

    int[] array = { -2, 4, -6, 8, 10};

    // calling kadanes algorithm 

    kadanesAlgo(array);


}
    
}
