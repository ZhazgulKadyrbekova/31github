package done;

class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int area = 0, max = 0;
        while (start < end) {
            if (height[start] < height[end]) {
                area = getArea(end - start, height[start]);
                start++;
            } else {
                area = getArea(end - start, height[end]);
                end--;
            }
            if (max < area) {
                max = area;
            }
        }
        return max;
    }

    private int getArea(int bottom, int side) {
        return bottom * side;
    }

}