package Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};

        int[] b = a;

        int[] c = new int [a.length];

        System.arraycopy(a, 0, c, 0, a.length);

        a[0] = 99;

        System.out.println(b[0]);
        System.out.println(c[0]);
    }
}
