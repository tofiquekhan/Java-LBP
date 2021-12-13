/*
Given an integer n, perform the following conditional actions,

if n is odd, print Weird,
if n is even and in the inclusive range of 2 to 5, print Not Weird.
if n is even and in the inclusive range of 6 to 20, print Weird.
if n is even and greater than 20, print Not Weird.

Input Format

a number from the user

Constraints

1<=n<=100

Output Format

Weird or Not Weird

*/

import java.util.Scanner;

public class WeirdNotWeird{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if(num>0 && num<100){
	if(num%2!=0)
		System.out.println("Weird");
	else{
		 if(num>=2 && num<=5){
                System.out.println("Not Weird");
            }else if(num>=6 && num <=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
	}

}

}

}