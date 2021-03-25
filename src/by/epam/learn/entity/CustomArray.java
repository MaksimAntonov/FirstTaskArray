package by.epam.learn.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
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
        StringBuilder string = new StringBuilder("\n- Array, length: " + this.array.length + ", Array data: [");
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
