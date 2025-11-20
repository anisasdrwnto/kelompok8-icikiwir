import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Insertion Sort

        // 1. Buat array yang berisi bilangan tidak berurutan
        int arr[] = {15, 6, 24, 96};

        // 2. Buat looping(perulangan) untuk mengambil elemen array dari index ke-1 sampai akhir
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
       
        //Buat looping untuk menampilkan elemen array yang sudah diurut
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}
