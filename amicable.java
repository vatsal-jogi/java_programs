import java.util.Scanner;  
class amicable  
{  
public static void main (String args[])  
{  
int Sum1 = 0, Sum2 = 0, no1, no2;   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
no1 = sc.nextInt();  
System.out.print("Enter the second number: ");  
no2 = sc.nextInt();  
for(int i=1;i<no1;i++)  
{  
if(no1 % i == 0)  
{  
Sum1 = Sum1 + i;  
}  
}  
for(int i=1;i<no2;i++)  
{  
if(no2 % i == 0)  
{  
Sum2 = Sum2 + i;  
}  
}  
if((no1 == Sum2) && (no2 == Sum1))  
{  
System.out.println(no1+", "+ no2 +" are amicable numbers.");  
}  
else  
{  
System.out.println(no1+", "+ no2 +" are not amicable numbers.");  
}  
}  
}  