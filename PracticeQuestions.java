// 10 Practice Questions.

import java.util.Scanner;
public class PracticeQuestions{

public static int average(int a, int b, int c){
return (a+b+c)/3;
}

public static int sumOfOddNumbers(int n){
int sum = 0;
for(int i=1; i<=n; i++){
if(i%2==1){
sum += i;
}
}
return sum;
}

public static int gratestNumber(int a, int b, int c){
if(a>b && a>c){
return a;
}else if(b>c && b>a){
return b;
}else{
return c;
}
}

public static double circumferenceOfCircle(double r){
if(r>0){
return 2*3.14*r;
}else{
return 0;
}
}

public static void checkEligiblity(int age){
if(age>=18){
System.out.println("You are eligible for Vote.");
}else{
System.out.println("You are NOT eligible for Vote.");
}
}

public static void count(int num){
int zero = 0;
int positive = 0;
int negative = 0;
for(int i=0; i<num; i++){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a==0){
zero += 1;
}else if(a>0){
positive += 1;
}else{
negative += 1;
}
}
System.out.println("You Entered Zreros: "+zero+", Positive Numbers: "+positive+" and Negative Number: "+negative+" times.");
return;
}

public static long power(int x, int n){
long result = 1;
for(int i=1; i<=n; i++){
result *= x;
}
return result;
}

public static void fibonacciSeries(int n){
int term1 = 0;
int term2 = 1;
int nextTerm;
System.out.print(term1+", "+term2+", ");
for(int i=3; i<=n; i++){
nextTerm = term1+term2;
System.out.print(nextTerm+", ");
term1=term2;
term2=nextTerm;
}
}


public static int gratestCommonDivisor(int a, int b){
int num = 0;
if(a>=b){
for(int i=1; i<=a; i++){
if(a%i==0 && b%i==0){
num = i;
}
}
return num;
}else{
for(int i=1; i<=b; i++){
if(a%i==0 && b%i==0){
num = i;
}
}
return num;
}
}


public static void main(String args[]){
Scanner sc = new Scanner(System.in);

//Question 1.
/*
System.out.print("Enter Three Numbers : ");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3 = sc.nextInt();
int result = average(n1,n2,n3);
System.out.println("Avarage of "+n1+", "+n2+" & "+n3+" : "+result); 
*/

//Question 2.
/*
System.out.print("Enter a Numbers : ");
int num = sc.nextInt();
int result = sumOfOddNumbers(num);
System.out.println("Sum of 1 "+num+" odd Numbers : "+result); 
*/

//Question 3.
/*
System.out.print("Enter Three Numbers : ");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3 = sc.nextInt();
int result = gratestNumber(n1,n2,n3);
System.out.println("Gratest Number in ( "+n1+", "+n2+" & "+n3+" ) : "+result); 
*/

//Question 4.
/*
System.out.print("Enter Radius of a Circle : ");
double radius = sc.nextFloat();
double result = circumferenceOfCircle(radius);
System.out.println("Circumference of a Circle  : "+result); 
*/

//Question 5.
/*
System.out.print("Enter Your age : ");
int age = sc.nextInt(); 
checkEligiblity(age);
*/


//Question 6.
/*
System.out.print("How many Number are you wants to enter : ");
int num = sc.nextInt(); 
System.out.print("Enter all Numbers one by one : ");
count(num);
*/


//Question 7.
/*
System.out.print("Enter x and n for finding value of (x^n) : ");
int a = sc.nextInt();
int b = sc.nextInt();
long result = power(a,b);
System.out.println("The Value of ( "+a+"^"+b+" ) is : "+result); 
*/


//Question 8.
/*
System.out.print("How many Terms are you wants of Fibonacci Series to enter : ");
int num = sc.nextInt(); 
System.out.print("Your Fibonacci Serieas : ");
fibonacciSeries(num);
*/

//Question 7.

System.out.print("Enter two Number for Finding Gratest common Divisor  : ");
int a = sc.nextInt();
int b = sc.nextInt();
long result = gratestCommonDivisor(a,b);
System.out.println("Gratest Common Divisor of ( "+a+" and "+b+" ) is : "+result); 




}
}