public class BubbleSort<T extends Comparable<T>> {
    public void sort(T[] array) {
        int n = array.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] array = {5, 2, 9, 1, 5, 6};
        bubbleSort.sort(array);
        for (Integer value : array) {
            System.out.print(value + " ");
        }
    }
}