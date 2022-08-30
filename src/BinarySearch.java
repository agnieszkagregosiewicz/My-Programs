public class BinarySearch {
    // Returns index of the first instance of the element. If there is
    // no element in the array, the function returns -1.
    int BinarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Driver method
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 3, 7, 11, 13, 33, 39, 43};

        int element = 33;
        int index = binarySearch.BinarySearch(array, element);
        if (index != -1) {
            System.out.println("Index of " + element + ": " + index + ".");
        } else {
            System.out.println("There is no " + element + " in the array.");
        }
    }
}