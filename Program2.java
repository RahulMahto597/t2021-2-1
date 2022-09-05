import java.util.Scanner;  
public class Series  
{  
public static void main(String[] args)   
{  
int a, i;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
a = sc.nextInt();    
i=1;   
System.out.print("Series of numbers: ");  
while(i<=a)  
{  
//prints the odd number  
System.out.print((2 * i - 1) +" ");   
i=i+1;  
}     
}  
}  
