public class part4 {
    public static void main(String[] args) {
        
        //31. Traingle Area using Heron's formula 
        int a=10;
        int b=20;
        int c=30;
        int s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("Area of triangle is : %.2f\n", area);

        //32 . Find the third angle of traingle 
        double angle1=60.0;
        double angle2=70.0;
        double angle3=180-(angle1+angle2);
        System.out.printf("The third angle of triangle is : %.2f\n", angle3);

         // 33. Scalene Triangle Area Calculation
        double sA = 7, sB = 8, sC = 9;
        double sSemi = (sA+sB+sC)/2;
        double scaleneArea = Math.sqrt(sSemi*(sSemi-sA)*(sSemi-sB)*(sSemi-sC));
        System.out.println("Scalene Triangle Area: " + scaleneArea);

        //34.total and average of four numbers 
        
        int sum=0;

        for(int i=1;i<=4;i++)
        {
            sum+=i;
        }
        double average=sum/4.0;
        System.out.println("Sum of first four numbers: "+ sum);
        System.out.printf("Average of first four numbers: %.2f\n", average);

        //35. Area of triangle using base and height
        double base=5.0;
        double height=10.0;
        double triangleArea=0.5*base*height;
        System.out.printf("Area of triangle using base and height: %.2f\n", triangleArea);

        //36. Equilateral Triangle Area Calculation
        double side=6.0;
        double area2=Math.sqrt(3)/4 * Math.pow(side, 2);
        System.out.printf("Equilateral Triangle Area: %.2f\n", area2);

        //37. Centimeters to meter and kilometer 
        // 1km =1000m 
        // 1 km=100cm 
        int cm=10000;
        double meters=cm/100.0;
        double kilometers=cm/100000.0;
        System.out.printf(cm + " cm is %.2f meters\n", meters);
        System.out.printf(cm + " cm is %.2f kilometers\n", kilometers);

        //38. Fahrenheit to Celsius 
        double fahrenheit=98.6;
        double celsius=(fahrenheit-32)*5/9;
        System.out.printf("%.2f Fahrenheit is %.2f Celsius\n", fahrenheit, celsius);
     
        //40. Celsius to Fahrenheit
        double celsius2=37.0;
        double fahrenheit2=(celsius2*9/5)+32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius2, fahrenheit2);
        



    }
}
