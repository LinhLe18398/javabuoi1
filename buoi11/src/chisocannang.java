import java.util.Scanner;

public class chisocannang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chieucao, cannang;
        System.out.println("Nhap chieu cao cua ban: ");
        chieucao = sc.nextFloat();
        System.out.println("Nhap can nang cua ban: ");
        cannang = sc.nextFloat();
        float bmi = cannang/(chieucao * chieucao);
        if(bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
