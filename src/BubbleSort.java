public class BubbleSort {
    public static void main(String[] args) {
        // Bubble Sort

        // 1. Buat array yang berisi bilangan tidak berurutan
        int numArr[] = { 89, 45, 26, 72 };
        int size = numArr.length;
        int temp = 0;

        System.out.println("Array sebelum diurut: ");
        for (int num : numArr) {
            System.out.println(num + " "); // print array sebelum terurut
        }

        // 2. Buat looping(perulangan untuk mengurutkan bilangan)
        for (int a = 0; a < size; a++) {
            for (int b = 0; b < size - a - 1; b++) {
                if (numArr[b] > numArr[b + 1]) {
                    temp = numArr[b];
                    numArr[b] = numArr[b + 1];
                    numArr[b + 1] = temp; // Tukar elemen
                }
            }
        }
        
        System.out.println("Array setelah diurut: ");
        for (int afterSort : numArr) {
            System.out.print(afterSort + " ");
        }

    }
}
