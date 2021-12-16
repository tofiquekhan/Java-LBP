/*

Implement a program to calculate sum of even digits present in the given number

Input Format

a number from the user

Constraints

n>0

Output Format

print sum of even digits

*/
import java.util.Scanner;
public class SumOfEvenDigits{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt(),sum = 0,digit;
while(num!=0){
digit = num%10;
if(digit%2==0)
sum = sum+digit;
num = num/10;
}
System.out.println(sum);
}

}