import java.util.*;
class fees_management
{
String name;
int rollno;
double amount=150000;
fees_management(String n,int r)
{
name=n;
rollno=r;
}
void display(int x)
{
if(rollno==x)
{
System.out.println("Name : "+name);
System.out.println("Roll no : "+rollno);
System.out.println("Balance amount : "+ amount);
}
}
void paid(int x, double y)
{
if(rollno==x)
{
amount=amount-y;
System.out.println("Balance amount : "+amount);
System.out.println("\n");
}
}
}
class main_class
{
public static void main(String args[])
{
fees_management f1= new fees_management("Kaarunya",123);
fees_management f2= new fees_management("Satya",124);
fees_management f3= new fees_management("Krishna",125);
fees_management f4= new fees_management("Mukund",126);
boolean bool=true;
while(bool)
{
System.out.println("MENU");
System.out.println("1.DETAILS\n2.PAY FEE\n");
Scanner s=new Scanner(System.in);
int no=s.nextInt();
switch(no)
{
case 1: System.out.println("Enter rollno");
	int rno= s.nextInt();
	f1.display(rno);
	f2.display(rno);
	f3.display(rno);
	f4.display(rno);
	break;
case 2: System.out.println("Enter rollno and amount");
	int rlno= s.nextInt();
	double amo=s.nextDouble();
	f1.paid(rlno,amo);
	f2.paid(rlno,amo);
	f3.paid(rlno,amo);
	f4.paid(rlno,amo);
	break;
default: System.out.println("You have entered wrong choice");
}
System.out.println("Do you want to exit,if yes type 1\t");
int test=s.nextInt();
if(test==1)
{
bool=false;
}
}
}
}