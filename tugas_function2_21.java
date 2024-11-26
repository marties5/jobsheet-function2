import java.util.Scanner;

public class tugas_function2_21 {

    public static int hitungTotalRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0;
        } else {
            return angka[n - 1] + hitungTotalRekursif(angka, n - 1);
        }
    }

    public static int hitungTotalIteratif(int[] angka) {
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = input.nextInt();
        int[] angka = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int totalRekursif = hitungTotalRekursif(angka, n);
        System.out.println("Total dari " + n + " angka yang dimasukkan (Rekursif) adalah: " + totalRekursif);

        int totalIteratif = hitungTotalIteratif(angka);
        System.out.println("Total dari " + n + " angka yang dimasukkan (Iteratif) adalah: " + totalIteratif);

        input.close();
    }
}
