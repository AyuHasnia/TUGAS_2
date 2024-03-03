
package TugasAyu;

import java.util.ArrayList;

public class Nomor5 {
    public static void main(String[] args) {
        // Membuat ArrayList dengan tipe data Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // Menambahkan nilai ke dalam ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Mengakses nilai pada index tertentu
        int nilaiPertama = numbers.get(0);
        System.out.println("Nilai pada index 0: " + nilaiPertama);

        // Mengganti nilai pada index tertentu
        numbers.set(1, 50);
        System.out.println("ArrayList setelah mengganti nilai pada index 1: " + numbers);

        // Menghapus nilai pada index tertentu
        numbers.remove(0);
        System.out.println("ArrayList setelah menghapus nilai pada index 0: " + numbers);

        // Membaca ukuran ArrayList
        int size = numbers.size();
        System.out.println("Ukuran ArrayList: " + size);
    }
}
