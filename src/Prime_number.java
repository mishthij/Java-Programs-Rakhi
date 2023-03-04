import java.util.Scanner;

public class Prime_number {
    public static void main (String args[]) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        if (a < 2)
            System.out.println("Not a prime number");
        else {
            for (int i = 2; i < a / 2; i++) {
                if ((a % i) == 0){
                   flag = true;
                   break;
            }

        }
    }
    if (flag)
        System.out.println(a + " is not a prime number");
    else
        System.out.println(a + " is a prime number");

    }

    }



