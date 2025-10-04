public class part5 {
    public static void main(String args[])
    {
        
        // 41. Simple Interest Calculation
        double principal = 1000, rate = 5, time = 2;
        double si = (principal*rate*time)/100;
        System.out.println("Simple Interest: " + si);

        // 42. Compound Interest Calculation
        double ci = principal * Math.pow((1 + rate/100), time) - principal;
        System.out.println("Compound Interest: " + ci);
         
        //43. Print Amerrican Flag pattern 
          for(int iF=1;iF<=6;iF++){
            for(int jF=1;jF<=6;jF++){
                System.out.print("*");
            }
            for(int kF=1;kF<=20;kF++){
                System.out.print("-");
            }
            System.out.println();
        }
         // 44. Print Custom ASCII Pattern
        for(int p=5;p>=1;p--){
            for(int q=1;q<=p;q++){
                System.out.print("*");
            }
            System.out.println();
        }
        //45. Recangular pattern of single digit 
         int rows = 4;
        for(int r=1;r<=rows;r++){
            for(int cP=1;cP<=rows;cP++){
                System.out.print(r);
            }
            System.out.println();
        }

        //46. Print Floyd's Triangle
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
      
       

    }
}