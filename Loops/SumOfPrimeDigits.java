/*
Implement a program to calculate sum of prime digits present in the given number

Input Format

a number from the user

Constraints

n>0

Output Format

print sum of prime digits

*/

import java.util.Scanner;

public class SumOfPrimeDigits{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt(),sum=0,digit;
while(num!=0){
digit = num%10;
if(digit ==2 || digit==3 || digit==5||digit==7)
sum = sum+digit;
num = num/10;
}
System.out.println(sum);
}

}