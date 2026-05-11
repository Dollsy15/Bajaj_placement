public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        searchInRotatedSortedArray solve = new searchInRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = solve.search(nums, target);
        System.out.println("Target found at index: " + result);
    }

    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2; 
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[s] <= nums[mid]) {
                if (target >= nums[s] && target < nums[mid]) {
                    e = mid - 1;
                } 
                else {
                    s = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[e]) {
                    s = mid + 1;
                } 
                else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
