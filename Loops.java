import java.util.Scanner;
public class Loops{
public static void main(String args[]){
// for Loop.
/*
for(int counter = 1; counter<=10; counter++){
System.out.print(counter+" ");
}

// While Loop
int num = 1;
while(num<=10){
System.out.print(num+" ");
num++;
}

// do while loop.
int i = 0;
do{
i++;
System.out.print(i);
}while(i>=10);
*/

/*
// print sum of N natural Numbers.
System.out.print("Enter a Number : ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int sum = 0;
for(int i=1; i<=num; i++){
sum += i;
}
System.out.print("Sum of N Natural Numbers : "+sum); 
}
*/

// Printing table 
System.out.print("Enter A number : ");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
for(int i = 1; i<=10; i++){
System.out.println(a+" X "+i+" = "+a*i);
}
}
}