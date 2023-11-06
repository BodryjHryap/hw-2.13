public class Main {
    public static void main(String[] args) {
        Sorts.sortBubble(generateRandomArray());
        Sorts.sortInsertion(generateRandomArray());
        Sorts.sortSelection(generateRandomArray());
        Sorts.contains(generateRandomArray(), 200000);
        Sorts.containsBinary(generateRandomArray(), 200000);
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}