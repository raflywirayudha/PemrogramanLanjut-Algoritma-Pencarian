public class N_tampilJumlahAngkaArrayDgnAngkaSebelumnya {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jumlah = 0;

        for (int i = 0; i < array.length; i++) {
            jumlah += array[i];
            System.out.println("Jumlah: " + jumlah);
        }
    }
}
