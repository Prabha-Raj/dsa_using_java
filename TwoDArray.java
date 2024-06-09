import java.util.Scanner;
public class TwoDArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter No. of Rows and Column : ");
int rows = sc.nextInt();
int columns = sc.nextInt();
int matrix[][] = new int[rows][columns];
System.out.println("Enter the elements of matrix : ");
for(int i=0; i<rows; i++){
for(int j=0; j<columns; j++){
matrix[i][j] = sc.nextInt();
}
}

System.out.println("your Matrix is : ");
for(int i=0; i<rows; i++){
for(int j=0; j<columns; j++){
System.out.print(matrix[i][j]+" ");
}
System.out.println();
} 
}
}