public class M_hitungJUmlahSelisihPoinI {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int selisih = array[i + 1] - array[i];
            jumlah += selisih;
        }
        System.out.println("Jumlah: " + jumlah);
    }
}
