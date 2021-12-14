/*
For each of the 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. Implement a program that takes n cups bought and print as an integer the total number of cups I would get.

Input Format

n number of cups from user

Constraints

n>0

Output Format

number of cups present have
*/

import java.util.Scanner;

public class CoffeeCupProblem{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int noOfCups = sc.nextInt();
int totalCups = noOfCups + (noOfCups/6);
System.out.println(totalCups);


}


}