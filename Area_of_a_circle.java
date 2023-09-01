import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double area;
        int r;
        r=sc.nextInt();
        area=3.14*r*r;
        System.out.printf("%.2f",area);
    }
}