import java.util.Scanner;
public Class ComparisonExample {
public static void main(String[] args) {
int x, y;
Scanner sc= new Scanner(System.in);
//take the value of x as input from user and store it in variable x
System.out.print("Enter the value of x : ");
x = sc.nextInt();
//take the value of y as input from user
System.out.print("Enter the value of y : ");
//store the value in variable y
y = sc.nextInt();
//checks whether x and y are equal; Return true if it is same, else returns false
System.out.println(x == y);
}
}