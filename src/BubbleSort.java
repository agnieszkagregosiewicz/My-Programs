public class BubbleSort {
    void bubblesort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    int a = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = a;
                }

                /*for (int e : array) {
                    System.out.print(e + " "); */

            }
            //System.out.println();//
        }
    }

    public static void main(String[] args) {
        BubbleSort bubblesort = new BubbleSort();
        int[] array = {4, 3, 6, 33, 76, 34, 72, 123, 7654, 2, 5, 3};

        bubblesort.bubblesort(array);
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }
}