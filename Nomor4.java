
package TugasAyu;

import java.util.ArrayList;

public class Nomor4 {
    public static void main(String[] args) {
         // Membuat ArrayList dengan tipe data Integer (wrapper)
        ArrayList<Integer> numbers = new ArrayList<>();

        // Menambahkan nilai ke dalam ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Mencetak isi ArrayList
        System.out.println("Isi ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
    
}
