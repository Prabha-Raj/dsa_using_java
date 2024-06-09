// Functions.

import java.util.Scanner;
public class Functions{

public static void printMyName(String name){
System.out.print(name);
return;
}

public static int sum(int a, int b){
return a+b;
}

public static void factorial(int n){
if (n<0){
System.out.print("Factorial have not of negative Numbers.");
return;
}else{
int fact = 1;
for(int i=n; i>=1; i--){
fact *= i;
}
System.out.print(fact);
return;
}
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

/*
System.out.print("Enter Your Name : ");
String name = sc.nextLine();
printMyName("Your Name is :- "+name);
*/

// For Sum of Two Numbers 
/*
System.out.print("Enter First Number : ");
int a = sc.nextInt();
System.out.print("Enter Second Number : ");
int b = sc.nextInt();
int result = sum(a=a,b=b);
System.out.print("Sum of "+a+" and "+b+" : "+result);
*/

// for calculating Factorial of N.

System.out.print("Enter a Number : ");
int num = sc.nextInt();
System.out.print("Factorial of "+num+" : ");
factorial(num);
}
}