import java.util.Scanner;

class Chandne05
{
       public static void main(String[] args) {

             int n1,n2,n3,largest;
             Scanner input = new Scanner(System.in);

             System.out.println("Enter the number 1");
             n1 = input.nextInt();
             System.out.println("Enter the number 2");
             n2 = input.nextInt();
             System.out.println("Enter the number 3");
             n3 = input.nextInt();
             input.close();

             if(n1 > n2 && n1 > n3)
                largest = n1;
             else if(n2 > n1 && n2 > n3)
                  largest = n2;
             else
                  largest = n3;
             
             System.out.printf("Largest among %d %d and %d is %d",n1,n2,n3,largest);

       }

}