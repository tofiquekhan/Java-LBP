/*

Implement a program to calculate sum of digits present in the given number

Input Format

a number from the user

Constraints

n>0

Output Format

print sum of digits

*/
import java.util.Scanner;
public class SumOfDigits{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int num = sc.nextInt(), sum =0;
while(num!=0){
sum = sum + num%10;
num = num/10;
}
System.out.println(sum);
}


}