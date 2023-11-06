public class Sorts
{

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static void sortBubble(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }



    public static void sortSelection(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void sortInsertion(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static boolean contains(int[] arr, int element) {
        long start = System.currentTimeMillis();
        for (int i : arr) {
            if (i == element) {
                System.out.println(System.currentTimeMillis() - start);
                return true;
            }
        }
        return false;
    }

    public static boolean containsBinary(int[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;
        long start = System.currentTimeMillis();
        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                System.out.println(System.currentTimeMillis() - start);
                return true;
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
}
