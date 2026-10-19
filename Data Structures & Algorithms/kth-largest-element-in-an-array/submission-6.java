 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> Integer.compare(b, a));

        return arr[k - 1];
    }
}