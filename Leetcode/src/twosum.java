//for this there is an array and also a target, you gotta see if the array has two numbers that reach the target or na and then print out the array indexes
public class twosum {
    
 public static void twoSum(int[] nums, int target) {
        
        
        for(int i=0; i<nums.length; i++) //goes from 0 till the end of the array
        {
            for(int j=i+1; j<nums.length; j++) //goes from 0+1 up until the array [this solution checks every single combination]
            {
                int sum = nums[i] + nums[j];
                    
                    if(sum==target)
                    {
                        System.out.print(i+" "+j);
                    }
            }
        }
     
            System.out.print("");
            
    }
 
     public static void main(String args[])
     {
         int nums[] = {2,7,11,15};
         
         twoSum(nums,9);

     }

}
