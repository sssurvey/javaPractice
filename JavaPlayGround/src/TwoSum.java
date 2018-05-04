public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int q = target;
        int [] newArray = new int [2]; // 0, 1


        for(int i = 0; i<nums.length; i++){
            for(int f = 0; f<nums.length; f++){
                if(f == i){
                    if(f < nums.length-1){
                        f++;
                    }
                    else{
                        return newArray;
                    }
                }
                if(nums[i]+nums[f]==q){
                    newArray[0] = f;
                    newArray[1] = i;
                }
            }
        }
        return newArray;
    }


    public static void main(String [] args){
        int [] array = new int[]{2,7,11,15};
        int target = 9;
        twoSum(array,9).toString();
    }

}
