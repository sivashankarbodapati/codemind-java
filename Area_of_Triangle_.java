import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double ar;
        double s;
        s = (a+b+c)/2.0;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}