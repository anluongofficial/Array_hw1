public class Main {
    public static void main(String[] args) {
        int [] a = {2,5,-3,11,193,-2};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum = sum + a[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}