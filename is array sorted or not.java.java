public class Main {
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i]<a[i + 1]) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 6, 7};
        System.out.println(isSorted(a));
    }
}