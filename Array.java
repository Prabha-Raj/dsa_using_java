// Understanding array concept.

import java.util.Scanner;

public class Array{
public static void main(String []arge){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number of Subject : ");
int size = sc.nextInt();
int marks[] = new int[size];
System.out.println("Enter Marks(OM) of all Subject one by one (MM is 100) : ");
for(int i=0; i<size; i++){
marks[i] = sc.nextInt();
}
int sum = 0;
System.out.print("\nyour all marks : ");
for(int i=0; i<marks.length; i++){
System.out.print(marks[i]+" ");
sum += marks[i];
}
System.out.println("\nYour Total Marks : "+sum);
System.out.print("Your Percentage : "+(sum/size)); 
System.out.println("\nSearch using marks of subject (Enter): ");
int search = sc.nextInt();
for(int i=0; i<marks.length; i++){
if(marks[i]==search){
System.out.println("This search Element present at the index Number : "+i);
}
}
}
}