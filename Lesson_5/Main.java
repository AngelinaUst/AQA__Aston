package Lesson_5;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = "5";
            }
        }
//        arr[1][1] = "error";
        try {
            checkArray(arr);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размерности массива");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            arr[5][4] = "2";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }

    public static void checkArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + " " + j);
                }
            }
        }
        System.out.println(sum);
    }
}