import java.util.HashMap;
import java.util.HashSet;

public class One {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 21;
        Double c = a.doubleValue();
        System.out.println(a+c);

    }
}


//class Solution {  //两数之和
//    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length; i++) {
//            int tmp = target - nums[i];
//            if(map.containsKey(tmp)) {
//                res[0] = i;
//                res[1] = map.get(tmp);
//                break;
//            }
//            map.put(nums[i],i);
//        }
//
//        return res;
//    }
//}


