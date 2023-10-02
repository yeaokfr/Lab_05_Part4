import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;

        System.out.println("Please enter your age.");
        if(scan.hasNextInt());{
            age = scan.nextInt();
        }
        if (age >= 21){
            System.out.println("You get a wristband.");
        }
    }
}