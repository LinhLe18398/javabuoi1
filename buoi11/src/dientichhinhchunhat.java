import java.util.Scanner;

public class dientichhinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;

        System.out.println("nhap chieu dai: ");
        a = sc.nextFloat();
        System.out.println("nhap chieu rong: ");
        b = sc.nextFloat();
        float c = a * b;
        System.out.println("Dien tich hinh chu nhat la " + c);
    }
}
