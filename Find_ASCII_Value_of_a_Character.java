import java.util.Scanner;
public class AsciiValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int ascii = c;
        System.out.print(ascii);
    }
}