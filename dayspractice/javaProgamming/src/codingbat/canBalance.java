package codingbat;

public class canBalance {
    public static boolean canBalance(int[] nums) {
        int sum1 =0;
        for(int i =0; i<nums.length; i++){
            int sum2 =0;

            sum1+=nums[i];
            for(int j = i+1; j<nums.length;j++){

                sum2 += nums[j];
            }

            if(sum1==sum2){
                return true;

            }
        }

        return false;

    }

    public static void main(String[] args) {
          int []  nums = {1,1,1,2,1};
          boolean is = canBalance(nums);
         System.out.println(is);
    }


}
