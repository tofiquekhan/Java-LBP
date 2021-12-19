/*
Implement a program to calculate number of digits in the given number

Input Format

a number from the user

Constraints

n>0

Output Format

print number of digits in the number

*/

import java.util.Scanner;

public class CountDigits{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt(),count=0;
while(num!=0){
count++;
num = num/10;

}
System.out.println(count);

}}