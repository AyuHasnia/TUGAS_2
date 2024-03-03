
package TugasAyu;

public class Nomor2 {
    public static void main(String[] args) {
         // Membuat array 1 dimensi dengan tipe data int
        int[] numbers = {10, 20, 30, 40, 50};

        // Metode 1: Menggunakan loop for
        System.out.println("Metode 1: Menggunakan loop for");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Metode 2: Menggunakan loop for-each
        System.out.println("\nMetode 2: Menggunakan loop for-each");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Metode 3: Menggunakan Stream API
        System.out.println("\nMetode 3: Menggunakan Stream API");
        java.util.Arrays.stream(numbers).forEach(System.out::println);

        // Metode 4: Menggunakan Arrays.toString()
        System.out.println("\nMetode 4: Menggunakan Arrays.toString()");
        System.out.println(java.util.Arrays.toString(numbers));

        // Metode 5: Menggunakan StringJoiner
        System.out.println("\nMetode 5: Menggunakan StringJoiner");
        java.util.StringJoiner joiner = new java.util.StringJoiner(", ", "[", "]");
        for (int number : numbers) {
            joiner.add(Integer.toString(number));
        }
        System.out.println(joiner.toString());
    }
}
    
    

