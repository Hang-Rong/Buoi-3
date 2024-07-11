//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};

        // Thêm phần tử
        array = addElement(array, "date");
        System.out.println("After adding: " + Arrays.toString(array));

        array = addElement(array, "Maye");
        System.out.println("After adding: " + Arrays.toString(array));
        // Sửa phần tử
        array = editElement(array, 1, "blueberry");
        System.out.println("After editing: " + Arrays.toString(array));

        // Xóa phần tử
        array = deleteElement(array, 2);
        System.out.println("After deleting: " + Arrays.toString(array));
        // Thêm phần tử
        array = insertElement(array, 1, "date");
        System.out.println("After inserting: " + Arrays.toString(array));

    }

    public static String[] addElement(String[] original, String element) {
        String[] newArray = new String[original.length + 1];
        System.arraycopy(original, 0, newArray, 0, original.length);
        newArray[original.length] = element;
        return newArray;
    }

    public static String[] editElement(String[] original, int index, String element) {
        if (index < 0 || index >= original.length) {
            System.out.println("Index out of bounds");
            return original;
        }
        original[index] = element;
        return original;
    }

    public static String[] deleteElement(String[] original, int index) {
        if (index < 0 || index >= original.length) {
            System.out.println("Index out of bounds");
            return original;
        }
        String[] newArray = new String[original.length - 1];
        System.arraycopy(original, 0, newArray, 0, index);
        System.arraycopy(original, index + 1, newArray, index, original.length - index - 1);
        return newArray;
    }
    public static String[] insertElement(String[] original, int index, String element) {
        if (index < 0 || index > original.length) {
            System.out.println("Index out of bounds");
            return original;
        }
        String[] newArray = new String[original.length + 1];
        System.arraycopy(original, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(original, index, newArray, index + 1, original.length - index);
        return newArray;
    }
}