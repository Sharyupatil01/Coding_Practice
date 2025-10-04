
import java.util.Scanner;
public class part3 {
    public static void main(String args[])
    {
        //21. String Manipulation Examples 
        String str1="Hello";
        String str2="World";
        System.out.println("Concatenation: "+ str1 + " " + str2);
        System.out.println("Length of str1: "+ str1.length());
        System.out.println("Uppercase str2: "+ str2.toUpperCase());
        System.out.println("Substring of str1: "+ str1.substring(1,4)); //ell
        System.out.println("Index of 'o' in str1: "+ str1.indexOf('o')); //4
        System.out.println("Replace 'l' with 'p' in str1: "+ str1.replace('l','p')); //Heppo
        System.out.println("Trimmed string: "+ "  Hello  ".trim()); //Hello

        //22. ASCII /UNICODE of characters 
        char ch='A';
        int ascii=(int)ch;
        System.out.println("ASCII value of "+ ch + " is: "+ ascii); //65
        char ch2= (char) (ascii + 1);
        System.out.println("Character for ASCII "+ (ascii + 1) + " is: "+ ch2);

        //23. Sum of even and odd nuubers 
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {
                evenSum+=i;
            }
            else
            {
                oddSum+=i;
            }
        }
        System.out.println("Sum of even numbers (0-9): "+ evenSum); //20
        System.out.println("Sum of odd numbers (0-9): "+ oddSum); //25

        //24.Reverse the first and last name 
        String firstName="Sharyu";
        String lastName="Patil";
        String reversedName=lastName + " " + firstName;
        System.out.println("Reversed Name: "+ reversedName); //Patil Sharyu

        //25.Multiplication table for input number 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for multiplication table:");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i +" * " + num +" = "+(i*num));

        }

        //26. Type casting examples 
        int intval=10;
        double doubleVal=(double)intval;
        System.out.println("Integer value: "+ intval);
        System.out.println("Converted to double: "+ doubleVal);

        //28. Current Date and Time display 
        java.time.LocalDateTime current=java.time.LocalDateTime.now();
        System.out.println("Current Date and Time: "+ current);

        // 29 . Divide two numbers and print the quotient and remainder 
        int dividend=29;
        int divisor=5;
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println("Dividend: "+ dividend +", Divisor: "+ divisor);
        System.out.println("Quotient: "+ quotient +", Remainder: "+ remainder);

        //30. check number sign (positive, negative, zero)
        int number=-10;
        if(number>0)
        {
            System.out.println("Positive");
        }
        else if (number<0)
        {
             System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        





    }
}
