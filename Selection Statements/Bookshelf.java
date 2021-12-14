/*
The e-commerce company Bookshelf wishes to analyse its monthly sales data between minimum range 30 to max range 100. The company has categorized these book sales into four groups depending on the number of sales with the help of these groups the company will know which stock they should increase or decrease in their inventory for the next month. the groups are as follows
sales range groups
30-50 ------------------> D
51-60 ------------------> C
61-80 ------------------> B
81-100 -----------------> A

write an alg to find the group for the given book sale count.

Input Format

an integer salesCount represent total sales of a book

Constraints

30<=saleCount<=100

Output Format

a character representing the group of given sale count or invalid
*/


import java.util.Scanner;

public class Bookshelf{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int saleCount = sc.nextInt();

if(saleCount >=30 && saleCount <=100){
if(saleCount>=30 && saleCount <=50)
System.out.println('D');
if(saleCount >=51 && saleCount <=60)
System.out.println('C');
if(saleCount >=61 && saleCount <=80)
System.out.println('B');
if(saleCount >=81 && saleCount <=100)
System.out.println('A');
}
else
System.out.println("invalid");


}


}