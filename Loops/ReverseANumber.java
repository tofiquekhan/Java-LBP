/*
Given an integer x, return x with its digits reversed.

Input Format

a number from user

Constraints

n>=0

Output Format

reverse of the given number

*/

import java.util.Scanner;

public class ReverseANumber{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt(),rev=0;
while(num!=0){
rev = rev*10+num%10;
num = num/10;
}
System.out.println(rev);

}


}