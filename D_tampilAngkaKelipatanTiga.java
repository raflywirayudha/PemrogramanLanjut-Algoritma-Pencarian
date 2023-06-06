public class D_tampilAngkaKelipatanTiga {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int nilai : array) {
            if (nilai % 3 == 0) {
                System.out.println(nilai);
            }
        }
    }
}
