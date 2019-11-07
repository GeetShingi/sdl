package ass1;
import java.util.*;
//import java.util.Scanner;

class Gen<T>{  
T ele,e1,e2;  
ArrayList<T> al= new ArrayList<T>(); 
ArrayList<T> al1= new ArrayList<T>(); 
ArrayList<T> al2= new ArrayList<T>(); 
void add(T ele,T e1,T e2)
{
	al.add(ele);
	al1.add(e1);
	al2.add(e2);
}  
void show(int index)
{
	int i=index;
	System.out.println("Name"+"\t"+"Roll No"+"\t"+"Branch");
	//System.out.println(al.get(i)+"\t"+al1.get(i)+"\t"+al2.get(i)); gives error as roll no is not the index;
}
void clear()
{
	al.clear();
	al1.clear();
	al2.clear();
}

void display()
{
	int i;
	System.out.println("Name"+"\t"+"Roll No"+"\t"+"Branch");
	for(i=0;i<al.size();i++)
	{
		System.out.println(al.get(i)+"\t"+al1.get(i)+"\t"+al2.get(i));
	}
}
}  
public class Ass1 {

	public static void main(String[] args) {
		Gen<String> A=new Gen<String>();
		Scanner sc = new Scanner(System.in);
		int op=0;
		while(op!=-1)
		{
		System.out.println("1. Add Student");
		System.out.println("2. Display Student Data");
		System.out.println("3. Clear Data");
		System.out.println("4. Display Students list");
		System.out.println("Enter option");
		op=sc.nextInt();
		int i;String st,st1,st2;
		
		switch(op)
		{
		case 1:
			System.out.println("Enter name :-");
			st=sc.next();
			System.out.println("Enter Roll no :-");
			st1=sc.next();
			System.out.println("Enter Branch :-");
			st2=sc.next();
			A.add(st,st1,st2);
			break;
			
		case 2:
			System.out.println("Enter roll whose data is to be fetched");
			i=sc.nextInt();
			A.show(i);
			//st=A.get(i);
			//System.out.println(st);
			break;
			
		case 3:
			A.clear();
			break;
			
		case 4:
			A.display();
			break;
		}
		}
		
	}

}
