public class Mountain {
    /**
     * @param array an array of positive integer values
     * @param stop the last index to check
     * Precondition: 0 <= stop < array.length
     * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
     * false otherwise
     */
    public static boolean isIncreasing(int[] array, int stop) {
        for (int i = 0; i < stop ; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array an array of positive integer values

     * @param start the first index to check
     * Precondition: 0 <= start < array.length - 1
     * @return true if for each j such that start <= j < array.length - 1,
     * array[j] > array[j + 1];
     * false otherwise
     */
    public static boolean isDecreasing(int[] array, int start) {
        for (int i = start; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Write the Mountain method getPeakIndex. Method getPeakIndex returns the index
     * of the first peak found in the parameter array, if one exists. A peak is defined
     * as an element whose value is greater than the value of the element immediately
     * before it and is also greater than the value of the element immediately after it.
     * Method getPeakIndex starts at the beginning of the array and returns the index of
     * the first peak that is found or -1 if no peak is found.
     *
     * @param array
     * @return
     */
    public static int getPeakIndex(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Write the Mountain method isMountain. Method isMountain returns true if the values
     * in the parameter array are ordered as a mountain; otherwise, it returns false. The
     * values in array are ordered as a mountain if all three of the following conditions
     * hold.
     *
     * There must be a peak. The array elements with an index smaller than the peak’s index
     * must appear in increasing order. The array elements with an index larger than the peak’s
     * index must appear in decreasing order.
     *
     * @param array
     * @return
     */
    public static boolean isMountain(int[] array) {
        int peak = getPeakIndex(array);
        return peak != -1 && isIncreasing(array, peak) && isDecreasing(array, peak);
    }

}
