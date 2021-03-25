package by.epam.learn.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return Arrays.copyOf(this.array, this.array.length);
    }

    public int getElement(int index) {
        return this.array[index];
    }

    public void setElement(int index, int value) {
        this.array[index] = value;
    }

    public int getLength() {
        return this.array.length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        
        CustomArray input = (CustomArray) obj;
        return Arrays.equals(array, input.array);
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int element : array) {
            result = 31 * result + element;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\n(" + this.array.length + ")[");
        for (int i = 0; i < this.array.length; i++) {
            if (i == 0) {
                string.append(this.array[i]);
            } else {
                string.append(", " + this.array[i]);
            }
        }
        string.append("]");
        return string.toString();
    }
}
