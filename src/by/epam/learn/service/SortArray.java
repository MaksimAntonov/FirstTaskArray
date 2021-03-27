package by.epam.learn.service;

import by.epam.learn.entity.CustomArray;

public class SortArray {
    public CustomArray bubbleSort(CustomArray ca) {
        int[] intArray = ca.getArray();
        int length = intArray.length;
        boolean swaped = false;
        for (int i = 0; i < length; i++) {
            swaped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                    swaped = true;
                }
            }

            if (!swaped) {
                break;
            }
        }

        ca.setArray(intArray);
        return ca;
    }

    public CustomArray quickSort(CustomArray ca) {
        int[] arr = ca.getArray();
        this.quickSortIntArray(arr, 0, arr.length - 1);
        ca.setArray(arr);
        return ca;
    }

    public int[] quickSortIntArray(int[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            int baseElement = array[middle];

            int i = low, j = high;
            while (i <= j) {
                while (array[i] < baseElement) {
                    i++;
                }

                while (array[j] > baseElement) {
                    j--;
                }

                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j) {
                this.quickSortIntArray(array, low, j);
            }

            if (high > i) {
                this.quickSortIntArray(array, i, high);
            }
        }

        return array;
    }

    public void combSort(CustomArray ca) {
        int[] intArray = ca.getArray();
        double factor = 1.2473309;
        int step = intArray.length - 1;

        while (step >= 1) {
            for (int i = 0; i + step < intArray.length; i++) {
                if (intArray[i] > intArray[i + step]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + step];
                    intArray[i + step] = temp;
                }
            }

            step /= factor;
        }

        ca.setArray(intArray);
    }
}
