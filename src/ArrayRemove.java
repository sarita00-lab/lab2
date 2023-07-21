import java.util.Arrays;

public class ArrayRemove {

    public static int removeDuplicates(int[] nums) {
        int k = 0;

        
        for (int i = 0; i < nums.length; i++) {
            
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++; 
            }
        }

       
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0; 
        }

        
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println("EX1");
        System.out.println("อาเรย์เดิม: " + Arrays.toString(nums));
        int k1 = removeDuplicates(nums);
        System.out.println("อาเรย์ที่ถูกอัปเดต (สมาชิกที่ไม่ซ้ำกัน): " + Arrays.toString(Arrays.copyOf(nums, k1)));
        System.out.println("จำนวนสมาชิกที่ไม่ซ้ำกัน: " + k1);

        System.err.println("Ex2");
        System.out.println("อาเรย์เดิม: " + Arrays.toString(arr2));
        int k2 = removeDuplicates(arr2);
        System.out.println("อาเรย์ที่ถูกอัปเดต (สมาชิกที่ไม่ซ้ำกัน): " + Arrays.toString(Arrays.copyOf(arr2, k2)));
        System.out.println("จำนวนสมาชิกที่ไม่ซ้ำกัน: " + k2);
    }
}
