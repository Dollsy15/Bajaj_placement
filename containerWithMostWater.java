public class containerWithMostWater { 
    public static void main(String[] args) {
        containerWithMostWater solver = new containerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solver.maxArea(height);
        System.out.println("Maximum water: " + result);
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            if (area > maxWater) {
                maxWater = area;
            }
            
            if (height[left] < height[right]) {
                left++;
            } 
            else {
                right--;
            }
        }
        return maxWater;
    }
}
