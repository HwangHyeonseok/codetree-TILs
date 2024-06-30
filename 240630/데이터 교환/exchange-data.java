public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6; // 5
        int c = 7; // 6
        int temp = 0;  // 6

        temp = b;
        b = a;
        a = c;
        c = temp;



        

        System.out.printf("%d\n", a);
        System.out.printf("%d\n", b);
        System.out.printf("%d\n", c);
    }
}