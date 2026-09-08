class EvenSum {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int sum = 0;

        while (i <= 20) {
            sum = sum + i;
            i = i + 2;
        }

        System.out.println(sum);
    }
}