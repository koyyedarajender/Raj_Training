import java.util.Scanner;

class Prime
{
    public static void main(String arg[])
    {
        System.out.println("Enter a number:\n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeCal(n);
    }
    static void primeCal(int num) {
        int num1 = num;
        int remainder=0;
        for (int i = 1; i <= num1; i++) {
            remainder=num1%i;
            if( remainder==0) {
                System.out.println("num is:"+num1+"\ti is:" + i + "\t Remainder is:" + remainder + " number is prime number");
            }
                else {
                System.out.println("num is:"+num1+"\ti is:" + i + "\t Remainder is:" + remainder + " number is not a prime number");
            }
        }

        }

    }


