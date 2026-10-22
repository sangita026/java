import java.util.Scanner;

class pro5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Percentage: ");
        float per = sc.nextFloat();

        System.out.println("\nStudent Details");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + per);

        sc.close();
    }
}