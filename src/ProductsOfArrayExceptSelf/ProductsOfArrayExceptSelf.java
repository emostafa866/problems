package ProductsOfArrayExceptSelf;

import java.util.Arrays;

public class ProductsOfArrayExceptSelf {
    public static void main(String[] args) {
        int []nums = {1,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
           int y = getProductsExcept(nums,i);
            result[i] = y;
        }
    return result;
    }

    private static int getProductsExcept(int[] nums,int x){
        int res=1;
        for (int i = 0; i < nums.length; i++) {
            if (i == x) {
                continue;
            }
            res = res * nums[i];
        }
        return res;
    }
}
