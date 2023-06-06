import java.util.Scanner;
public class B_mencariAngkaDalamArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();
        boolean ditemukan = false;

        for (int nilai : array) {
            if (nilai == angka) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka ditemukan di dalam array");
        } else {
            System.out.println("Angka tidak ditemukan di dalam array");
        }
    }
}
