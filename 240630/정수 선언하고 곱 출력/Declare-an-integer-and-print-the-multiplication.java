public class Main {
    public static void main(String[] args) {
        int a = 26;
        int b = 5;
        int c = a*b;
        System.out.println(a + " * " + b + " = " + c); // a*b는 자동으로 int 형으로 변환이 되지만 a+b는 String으로 인식된다.
    }
}