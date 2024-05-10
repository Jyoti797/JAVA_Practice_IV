public class demo3 {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 7, 1, 2, 3, 4, 5, 8, 10 };

        // descending order sorting

        for (int prev = 0; prev < arr.length - 1; prev++) {
            for (int next = prev + 1; next < arr.length; next++) {
                int temp = 0;
                if (arr[prev] < arr[next]) {
                    temp = arr[prev];
                    arr[prev] = arr[next];
                    arr[next] = temp;
                }

            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
