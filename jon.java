
public class jon {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int pivot = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                System.out.println(pivot);
                break;
            }
        }
        if (pivot == -1) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            return;
        }
        // int min = Integer.MAX_VALUE;
        // for (int i = pivot; i < arr.length; i++) {
        //     min = Math.min(min, arr[i]);
        // }
        System.out.println(pivot);
    }
}
