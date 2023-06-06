public class C_tampilAngkaGanjil {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int nilai : array) {
            if (nilai % 2 != 0) {
                System.out.println(nilai);
            }
        }

    }
}
