import java.util.Scanner;

public class part2 {
    public static void main(String args[])
    {
        //11. Results of specific operations 
        System.out.println("5/2="+(5/2)); // int/int =int 
        System.out.println("5.0/2="+(5.0/2));// double/int =double
        System.out.println("5/2.0="+(5/2.0));// int/double =double
        System.out.println("5.0/2.0="+(5.0/2.0));// double/double =double
        System.out.println("5 / 3 = " + (5 / 3.0));// int/double =double

        //12.Add two Numbers from keywords 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of two number is :" + sum);
        sc.close();

        //13.swap two numbers (with third element)
        int s1=10;
        int s2=20;
        System.out.println("Before swapping: s1="+s1+" s2="+s2);
        int temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("After swapping: s1="+s1+" s2="+s2);

        //14.swap two numbers (without third element)
        int x=10;
        int y=20;
        System.out.println("Before swapping: x="+x+" y="+y);
        x=x+y; //x=30
        y=x-y; //y=10
        x=x-y; //x=20
        System.out.println("After swapping: x="+x+" y="+y);

        //15.Volume of sphere 
        double radius =2.3;
        double volume=(4.0/3)*Math.PI*Math.pow(radius, 3);
        System.out.printf("The volume of sphere is : %.2f\n", volume);

        //16. volume of a cube 
        double side=3.5;
        System.out.println("The volume of cube is :"+ Math.pow(side, 3));

        //17.Volume of cylinder 
        double height=5.0;
        double radius_cyl=2.5;
        double volume_cyl=Math.PI*Math.pow(radius_cyl,2)*height;
        System.out.printf("The volume of cylinder is : %.2f\n", volume_cyl);

        //18. Area and perimeter of Rectangle 

        double length=5.0;
        double breadth=3.0;
        double area=length*breadth;
        double perimeter=2*(length+breadth);
        System.out.println("The area of rectangle is :"+ area);
        System.out.println("The perimeter of rectangle is :"+ perimeter);

        //20. Area and circumference of circle
        double radius_cir=4.5;
        double area_cir=Math.PI*Math.pow(radius_cir,2);
        double circumference=2*Math.PI*radius_cir;
        System.out.printf("The area of circle is : %.2f\n", area_cir);
        System.out.printf("The circumference of circle is : %.2f\n", circumference);

        





    }
}
