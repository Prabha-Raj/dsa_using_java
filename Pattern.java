// Patterns .

public class Pattern{
public static void main(String args[]){
int rows = 10;
int cols = 11;

// 1). Solid Rectangle.
/*
System.out.println("\nHollow Rectangle");
for(int row=0; row<=rows; row++){
for(int col=0; col<=cols; col++){
System.out.print(" X");
}
System.out.println();
}
*/


// 2).Hollow Rectangle.
/*
System.out.println("\nHollow Rectangle");
for(int row=0; row<=rows; row++){
for(int col=0; col<=cols; col++){
if(row==0 || row==rows || col==0 || col==cols){
System.out.print(" X");
}else{
System.out.print("  ");
}
}
System.out.println();
}
*/

// 3).solid Half Pyramid
/*
System.out.println("\nSolid Half Pyramid");
for(int row=0; row<=rows; row++){
for(int col=0; col<=row; col++){
System.out.print(" X");
}
System.out.println();
}
*/


// 4).Hollow Half Pyramid
/*
System.out.println("\nHollow Half Pyramid");
for(int row=0; row<=rows; row++){
for(int col=0; col<=row; col++){
if(row==0 || row==rows || col==0 || col==row){
System.out.print(" X");
}else{
System.out.print("  ");
}
}
System.out.println();
}
*/


// 5).solid reverse Half Pyramid
/*
System.out.println("\nSolid reverse Half Pyramid");
for(int row=rows; row>=0; row--){
for(int col=0; col<=row; col++){
System.out.print(" X");
}
System.out.println();
}



// 6). Hollow reverse Half Pyramid
System.out.println("\nHollow reverse Half Pyramid");
for(int row=rows; row>=0; row--){
for(int col=0; col<=row; col++){
if(row==0 || row==rows || col==0 || col==row){
System.out.print(" X");
}else{
System.out.print("  ");
}
}
System.out.println();
}
*/

// 7). solid Inverted Half Pyramid
/*
System.out.println("\nSolid Inverted Half Pyramid");
for(int i=1; i<=rows; i++){
	for(int j=1; j<=rows-i; j++){
		System.out.print("  ");
	}
	for(int j=1; j<=i; j++){
		System.out.print(" X");
	}
	System.out.println();
}

*/


// 8).Hollow Inverted Half Pyramid
/*
System.out.println("\nHollow Inverted Half Pyramid");
for(int i=1; i<=rows; i++){
	for(int j=1; j<=rows-i; j++){
		System.out.print("  ");
	}
	for(int j=1; j<=i; j++){
		if(i==rows || j==1 || j==i ){
			System.out.print(" X");
		}else{
			System.out.print("  ");
		}
	}
	System.out.println();
}
*/


// 9). solid Half Pyramid of Numbers
/*
System.out.println("\nSolid Half Pyramid of Numbers ");
for(int row=1; row<=rows; row++){
for(int col=1; col<=row; col++){
System.out.print(" "+col);
}
System.out.println();
}
*/

// 10). reverse solid Half Pyramid of Numbers
/*
System.out.println("\nReverse Solid Half Pyramid of Numbers ");
for(int row=rows; row>=1; row--){
for(int col=1; col<=row; col++){
System.out.print(" "+col);
}
System.out.println();
}
*/

// 11). solid Half Pyramid of Numbers 1 to n
/*
int num = 0;
System.out.println("\nSolid Half Pyramid of Numbers 1 to n");
for(int row=1; row<=rows; row++){
for(int col=1; col<=row; col++){
num += 1;
System.out.print(" "+num);
}
System.out.println();
}
*/

// 12). solid Half Pyramid of Numbers
/*
System.out.println("\nSolid Half Pyramid of Numbers ");
for(int row=1; row<=rows; row++){
for(int col=1; col<=row; col++){
int sum = col+row;
if(sum%2==0){
System.out.print(" "+1);
}else{
System.out.print(" "+0);
}
}
System.out.println();
}
*/

// 13). ButterFly Pattern
/*
int n = 42;
System.out.println("\nButterFly Pattern ");
for(int row=1; row<=n; row++){
for(int col=1; col<=row; col++){
System.out.print(" X");
}
for(int i=1; i<=(2*(n-row)); i++){
System.out.print("  ");
}
for(int col=1; col<=row; col++){
System.out.print(" X");
}
System.out.println();
}
// FOR COMPLETING
for(int row=n; row>=1; row--){
for(int col=1; col<=row; col++){
System.out.print(" X");
}
for(int i=1; i<=(2*(n-row)); i++){
System.out.print("  ");
}
for(int col=1; col<=row; col++){
System.out.print(" X");
}
System.out.println();
}
*/

// 14). Solid Rhombus
/*
System.out.println("\nSolid Rhombus: ");
for(int row=1; row<=rows; row++){
for(int col=1; col<=rows-row; col++){
System.out.print("  ");
}
for(int col=1; col<=rows; col++){
System.out.print(" *");
}
System.out.println();
}
*/

// 15). Hollow Rhombus
/*
System.out.println("\nHollow Rhombus: ");
for(int row=1; row<=rows; row++){
for(int col=1; col<=rows-row; col++){
System.out.print("  ");
}
for(int col=1; col<=rows; col++){
if(row==1 || row==rows || col==1 || col==rows){
System.out.print(" *");
}else{
System.out.print("  ");
}
}
System.out.println();
}
*/

// 16). Solid Equilateral Tringle.
/*
int num = 1;
System.out.println("\nSolid Equilateral Tringle: ");
for(int row=1; row<rows; row++){
for(int col=1; col<=rows-row; col++){
System.out.print(" ");
}
for(int col=1; col<=num; col++){
System.out.print(num+" ");
}
System.out.println();
num++;
}
*/


// 17). Solid Palindromic Tringle Pattern.
/*
int num = 1;
System.out.println("\nSolid palindromic Tringle Pattern : ");
for(int row=1; row<rows; row++){
for(int col=1; col<=rows-row; col++){
System.out.print("  ");
}
for(int col=num; col>=1; col--){
System.out.print(col+" ");
}
for(int col=2; col<=row; col++){
System.out.print(col+" ");
}
System.out.println();
num++;
}
*/


// 18).Solid diamond Pattern.
/*
System.out.println("\nSolid diamond Pattern : ");
for(int row=1; row<=rows; row++){
for(int col=1; col<=rows-row; col++){
System.out.print("  ");
}
for(int col=row; col>=1; col--){
System.out.print("X ");
}
for(int col=2; col<=row; col++){
System.out.print("X ");
}
System.out.println();
}
for(int row=rows; row>=1; row--){
for(int col=1; col<=rows-row; col++){
System.out.print("  ");
}
for(int col=row; col>=1; col--){
System.out.print("X ");
}
for(int col=2; col<=row; col++){
System.out.print("X ");
}
System.out.println();
}
*/



}
}
