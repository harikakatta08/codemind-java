import java.util.Scanner;
public class s{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x==w||y==w||z==w||x+y==w||x+z==w||y+z==w||x+y+z==w){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
