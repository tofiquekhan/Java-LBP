/*
Program to check whether the given number is even or odd

Input Format

number n

Constraints

n value must be >=0

Output Format

even or odd or invalid
*/
import java.util.Scanner;
public class EvenOdd{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if(num>0){
System.out.println(num%2==0 ? "even":"odd");
}else
System.out.println("invalid");

}

}