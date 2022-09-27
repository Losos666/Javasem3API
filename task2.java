public class task2 {
    //Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray("Массив:", array);

        array = deleteEvenElement(array);
        printArray("Результат:", array);

    }

    public static void printArray(String text, int[] array) {
        System.out.print(text + " [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static int[] deleteEvenElement(int[] array) {
        int[] result = new int[array.length / 2];
        int i, j;
        for (i = 0, j = 1; j < array.length; i++, j += 2) {
            result[i] = array[j];
        }
        return result;
    }
}

