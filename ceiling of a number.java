public class Pikai {
    public static void main(String args[]) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 15;
        int ans = bnSearch(arr, target);
        System.out.println(ans);
    }

    static int bnSearch(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        // If the target is not found, you can return -1 or any value to indicate that it's not present.
        return arr[s];
    }
}
