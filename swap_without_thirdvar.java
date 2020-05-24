import java.util.Scanner;
class swap_without_thirdvar
{
public static void main(String args[])
{
int a  ,b;
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before swaping ");
System.out.printf("a:" +a +" \nb:" +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("\nAfter swaping ");
System.out.printf("a:" +a +" \nb:" +b);
}
}