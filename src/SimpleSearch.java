public class SimpleSearch {

    // Returns index of the first instance of the element. If there is
    // no element in the array, the function returns -1.
    int simpleSearch(int[] array, int element) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == element)
                return i;
        }

        return -1;
    }

    // Driver method
    public static void main(String[] args) {
        SimpleSearch simpleSearch = new SimpleSearch();
        int[] array = {4, 3, 6, 33, 76, 34, 72, 123, 7654, 2, 5, 3};

        int element = 33;
        int index = simpleSearch.simpleSearch(array, element);
        if (index != -1) {
            System.out.println("Index of " + element + ": " + index + ".");
        } else {
            System.out.println("There is no " + element + " in the array.");
        }
    }
}
