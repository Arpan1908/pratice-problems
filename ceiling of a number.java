public class Pikai {
    public static void main(String args[]) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 5;
        int ans = bnSearch(arr, target);
        System.out.println(ans);
    }

    static int bnSearch(int[] arr, int target) {
        if(target > arr[arr.length - 1]){
            return -1;
        }
        
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        // If the target is not found, you can return -1 or any value to indicate that it's not present.
        return arr[s];
    }
}
