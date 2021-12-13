/*
To check whether the given number is leap year or not.

Input Format

year from the user

Constraints

no constraint

Output Format

True or False

*/

import java.util.Scanner;
public class LeapYear{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int year = sc.nextInt();

if((year%4==0 && year%100!=0) || year%400==0)
System.out.println("True");
else
System.out.println("False");


}
}