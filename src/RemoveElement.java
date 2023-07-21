import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // กำหนดค่าเริ่มต้นของจำนวนสมาชิกที่ไม่เท่ากับ val

        // วนลูปตามอาเรย์
        for (int i = 0; i < nums.length; i++) {
            // หากสมาชิกปัจจุบันไม่เท่ากับ val
            if (nums[i] != val) {
                // ย้ายสมาชิกไปยังตำแหน่ง k (หากจำเป็นให้ทับที่เดิม)
                nums[k] = nums[i];
                k++; // เพิ่มจำนวนสมาชิกที่ไม่เท่ากับ val
            }
        }

        return k; // คืนค่าจำนวนสมาชิกที่ไม่เท่ากับ val
    }

    public static void main(String[] args) {
        System.out.println("Ex1");
        int[] nums = {3,2,2,3};
        int val = 3;
        
        int[] arr1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;

        
        System.out.println("Original Array = " + Arrays.toString(nums) + ", val = " + val);
        int k = removeElement(nums, val);
        
        System.out.print("Output: " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

        System.out.println("\nEx2");

        System.out.println("Original Array = " + Arrays.toString(arr1) + ", val = " + val1);
        int m = removeElement(arr1, val1);

        System.out.print("Output: " + m + ", nums = [");
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i]);
            if (i < m - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

   
}

