package stacks;
import java.util.*;
public class nextGreaterElement2 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            Stack<Integer> st = new Stack<>();
            for (int j = nums2.length - 1; j >= 0; j--) st.push(nums2[j]);
            while (!st.isEmpty() && st.peek() != nums1[i]) st.pop();
            if (!st.isEmpty()) st.pop();
            int found = -1;
            while (!st.isEmpty()) {
                if (st.peek() > nums1[i]) {
                    found = st.peek();
                    break;
                }
                st.pop();
            }
            res[i] = found;
        }
        return res;
    }
    public static void main(String[] args) {
            int[] nums1 = {2, 4};
            int[] nums2 = {1, 2, 3, 4};
            int[] res = nextGreaterElement(nums1, nums2);
            System.out.println(Arrays.toString(res));
        }
}