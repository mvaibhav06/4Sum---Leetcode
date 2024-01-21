import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();
        if (nums[0] > 0 && target<0 ) return out;
        if (nums[nums.length-1] < 0 && target>0 ) return out;


        for (int i=0; i<nums.length-3; i++){
            for (int j=i+1; j<nums.length-2; j++){

                int p = j+1;
                int q = nums.length-1;

                while (p<q){
                    long sum = nums[i]+nums[j]+nums[p]+nums[q];

                    if (sum == target){
                        List<Integer> mylist = new ArrayList<>();
                        mylist.add(nums[i]);
                        mylist.add(nums[j]);
                        mylist.add(nums[p]);
                        mylist.add(nums[q]);

                        if (!out.contains(mylist)){
                            out.add(mylist);
                        }
                        p++;
                        q--;
                    } else if ((sum-target) > 0) {
                        q--;
                    }else {
                        p++;
                    }

                }
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums = {-1000000000,-1000000000,1000000000,-1000000000,-1000000000};
        System.out.println(fourSum(nums,294967296));
    }
}
