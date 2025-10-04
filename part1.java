public class part1 {
    public static void main(String args[])
    {
        //1.welcome text on separate lines
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        //2.sum of two numbers 
        int a=10;
        int b=20;
        System.out.println("The sum of two number is :" + (a+b));

        //3.size of fundmental data types 
        System.out.println("size of int:"+ Integer.BYTES +"bytes");
        System.out.println("size of double:"+ Double.BYTES +"bytes");
        System.out.println("size of char:"+ Character.BYTES +"bytes");

        // 4.Sum using variables 
        int num1=2;
        int num2=10;
        int sum=num1+num2;
        System.out.println("The sum of two number is :" + sum);

        //5. Limits of integer data types 
        System.out.println(Integer.MIN_VALUE+" MIN "+ Integer.MAX_VALUE+" MAX ");
 
        // 6. Output Formatting Example
        System.out.printf("Formatted number: %.2f\n", 123.456);


        //7.Check primitative value limits
        System.out.println("byte min:"+ Byte.MIN_VALUE+"max:"+ Byte.MAX_VALUE);
        System.out.println("short min:"+ Short.MIN_VALUE+"max:"+ Short.MAX_VALUE);
        System.out.println("long min:"+ Long.MIN_VALUE+"max:"+ Long.MAX_VALUE);
        System.out.println("float min:"+ Float.MIN_VALUE+"max:"+ Float.MAX_VALUE);

        // 8. mixed data types and arithmetic operations 
        int i=10;
        double d=3.2;
        System.out.println("The sum is :" +(i+d));
        //the answer is double because double has higher precedence than int

        //9. overflow and underflow in arithmetic operations
        int maxInt=Integer.MAX_VALUE;
        int overflow=maxInt+1;
        int minInt=Integer.MIN_VALUE;
        int underflow=minInt-1;
        System.out.println("Overflow value is :"+ overflow);
        System.out.println("Underflow value is :"+ underflow);

        //10.pre and post increment / decrement 
        int pre=10;
        System.out.println("PRE-INCREMENT"+(++pre));
        int post=10;
        System.out.println("POST-INCREMENT"+(post++));
        System.out.println(post);



        

        





    }
}
