public class Reverse {

    static void reverse(float[] arr) {
        float temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        float[] a = {5.8f, 2.6f, 9.0f, 3.4f, 7.1f};

        reverse(a);

        for (float x : a) {
            System.out.print(x + " ");
        }
    }
}
