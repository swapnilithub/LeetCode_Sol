import java.util.Arrays;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int newNum[] = new int[nums1.length];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    newNum[index++] = nums1[i];
                    break; 
                }
            }
        }

        if (index == 0) {
            return -1;
        }

        Arrays.sort(newNum, 0, index);

        return newNum[0];
    }
}
