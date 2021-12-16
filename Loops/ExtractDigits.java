/*
Implement a program to extract digits from the given number

Input Format

a number from the user

Constraints

n>0

Output Format

print digits in line sep by space
*/
import java.util.Scanner;
public class ExtractDigits{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
while(num!=0){

System.out.print(num%10+" ");
num = num/10;
}


}

}