public class E_tampilAngkaYgMemilikiAngkaDua {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int nilai : array) {
            String nilaiStr = String.valueOf(nilai);
            if (nilaiStr.contains("2")) {
                System.out.println(nilai);
            }
        }
    }
}
