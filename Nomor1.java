
package TugasAyu;

public class Nomor1 {
    public static void main(String[] args) {
        boolean[] booleanArray = {true, false, true, false};
        byte[] byteArray = {10, 20, 30, 40};
        short[] shortArray = {100, 200, 300, 400};
        int[] intArray = {1000, 2000, 3000, 4000};
        long[] longArray = {10000L, 20000L, 30000L, 40000L};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f};
        double[] doubleArray = {1.11, 2.22, 3.33, 4.44};
        char[] charArray = {'A', 'B', 'C', 'D'};

        // Menampilkan nilai dari setiap array
        System.out.println("Array boolean:");
        for (boolean b : booleanArray) {
            System.out.println(b);
        }

        System.out.println("\nArray byte:");
        for (byte b : byteArray) {
            System.out.println(b);
        }

        System.out.println("\nArray short:");
        for (short s : shortArray) {
            System.out.println(s);
        }

        System.out.println("\nArray int:");
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("\nArray long:");
        for (long l : longArray) {
            System.out.println(l);
        }

        System.out.println("\nArray float:");
        for (float f : floatArray) {
            System.out.println(f);
        }

        System.out.println("\nArray double:");
        for (double d : doubleArray) {
            System.out.println(d);
        }

        System.out.println("\nArray char:");
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
 
