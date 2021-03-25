package by.epam.learn.entity;

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
