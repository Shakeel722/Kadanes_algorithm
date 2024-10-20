public class kadanes_algorithm2 {

    // this is for the edge case if all the numbers in the array are -ve

    // condition to check the all negative array

    public static boolean isNegative(int[] arr){

        for(int i : arr){

            if(i > 0){
                return false;
            }

        

            
        }

  return true;
    }

    public static void kadanesAlgo(int[] arr){

        int cs = 0;
        int ms = Integer.MIN_VALUE;
       int smallest = Integer.MIN_VALUE; //if all negative array passed

       

            // check our edge case if all elements are -ve then the smallest -ve is the max subarray sum
           if(isNegative(arr) == true){
            
            for(int i =0 ; i< arr.length; i++){

                if(arr[i] > smallest){
                    smallest = arr[i];
                }


            }
            System.out.println("max sub array sum of all negative array is: " + smallest);
        
        }  
            
            else{  

                for(int i=0 ; i< arr.length; i++){  
            cs = cs + arr[i];

            // kadanes logic 
            if (cs < 0){
                cs = 0;
            }

            // find max sum 
            if (cs > ms){
                ms = cs;
            }
        }
    }
    
}


public static void main(String[] args){
    int[] num = { -2, -4 , -6, -8, -10};

    // calling kadanes algorithm method

    kadanesAlgo(num);
}
}
