import java.util.Scanner;

public class CbsePercentage {
    public static void main(String...s){
        Scanner sc = new Scanner(System.in);
        System.out.println("PERCENTAGE MAKER");
        System.out.println("Enter your marks in Hindi");
        int h = sc.nextInt();
        System.out.println("Enter your marks in English");
        int e = sc.nextInt();
        System.out.println("Enter your marks in Math");
        int m = sc.nextInt();
        System.out.println("Enter your marks in Science");
        int snc = sc.nextInt();
        System.out.println("Enter your marks in Social Science");
        int ss = sc.nextInt();
        float sum = h+e+m+snc+ss;
        System.out.println("Your Total Marks Is : " + sum);
        float per = sum*100/500;
        System.out.println("Percentage = " + per + "%");

    }
}
