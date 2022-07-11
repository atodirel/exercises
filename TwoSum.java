package interviewEx;

//Write a method that checks if there is at least on pair of numbers which sum equals target.
//arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five.

public class TwoSum {
    public Boolean sumsToTarget(Integer[] arr, Integer target) {
        boolean result = false;
        for (Integer i : arr){
            Integer x = target - i;
            for (Integer j : arr){
                if (j == x){
                    result = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,3,4};
        System.out.println(new TwoSum().sumsToTarget(arr, 5));
    }
}
