import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius:");
        float r=sc.nextFloat();
        double area=3.14*(r*r);
        System.out.print(area);
    }
}
