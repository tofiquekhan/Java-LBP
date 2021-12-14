/*
implement a program that takes a number as an argument, increments the number by +1 and returns the result

Input Format

a number from the user

Constraints

no constraints

Output Format

an incremented value

*/

import java.util.Scanner;
public class IncrementValue{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println(++num);

}


}