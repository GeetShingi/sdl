import pp.Person;
import java.util.*;
class data
{
	LinkedList<Person> ll=new LinkedList<Person>();
	ArrayList<Person> al=new ArrayList<Person>();
	PriorityQueue<Person> pq=new PriorityQueue<Person>();
	//HashMap<String,char> hm=new HashMap<String,char>();
	HashSet<String> hsm=new HashSet<String>();
	HashSet<String> hsf=new HashSet<String>();
	//Scanner o=new Scanner(System.in);
	void ip(Person p)
	{	
			ll.add(p);
			al.add(p);
			pq.add(p);
			System.out.println("Enter Gender :-");
			//char c=o.next().charAt(0);
			//hm.add(ll.fname,c);
			String s="";
			if(c=='m' || c=='M')
			{
				s=ll.fname;
				hsm.add(s);
			}
			else if(c=='f' || c=='F')
			{
				s=ll.fname;
				hsf.add(s);
			}
	}
	void display()
	{
		System.out.println("First Name"+"\t"+"LastName"+"\t"+"City"+"\t"+"ID"+"\t"+"DOB"+"\t"+"Roll");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.fname + "\t" + ll.lname + "\t" + ll.addr + "\t" + ll.id + "\t" + ll.dob + "\t" + ll.roll);
		}
	}
	void search(String f)
	{
		System.out.println("First Name"+"\t"+"LastName"+"\t"+"City"+"\t"+"ID"+"\t"+"DOB"+"\t"+"Roll");
		for(int i=0;i<ll.size();i++)
		{
			if(ll.fname==f)
			{
				System.out.println(ll.fname+"\t"+ll.lname+"\t"+ll.addr+"\t"+ll.id+"\t"+ll.dob+"\t"+ll.roll);
			}
		}
	}
	void clear()
	{
		ll.clear();
	}
	void mod(String f,String l,String a,String b,String i,String d,int r)
	{
		for(int i=0;i<ll.size();i++)
		{
			if(ll.fname==f)
			{
				ll.fname=f;
				ll.lname=l;
				ll.addr=a;
				ll.branch=b;
				ll.id=i;
				ll.dob=d;
				ll.roll=r;
				System.out.println("Data of Student is modified.\n");
			}
		}
	}
	void del(String f)
	{
	  int x=-1;
	  for(int i=0;i<ll.size();i++)
		{
			if(ll.fname==f)
			{
				x=i;
			}
		}
		if(x==-1)
		{
		  System.out.println("Entered Student doesnot exist.");
		}
		else
		{
		  ll.remove(x);
		}
	}
	void male()
	{
		Iterator<String> i = hsm.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
	}
	void fmale()
	{
		Iterator<String> i = hsf.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
	}
}
 class A1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Person p=new Person();
		data obj=new data();
		l.ip(p);
		int op=0;
		
		while(op!=-1)
		{
			System.out.println("1. Add Student Data.");
			System.out.println("2. Search Student Data");
			System.out.println("3. Clear Data");
			System.out.println("4. Display Students list");
			System.out.println("5. Modify Students Data");
			System.out.println("6. Delete Students Data");
			System.out.println("Enter option");
			op=sc.nextInt();
			String f,l,a,b,i,d;
			int r;
			switch(op)
			{
				case 1:
					System.out.println("Enter First Name :-");
					f=sc.nextLine();
					System.out.println("Enter Last Name :-");
					l=sc.nextLine();
					System.out.println("Enter Roll no :-");
					r=sc.nextInt();
					System.out.println("Enter Branch :-");
					b=sc.nextLine();
					System.out.println("Enter Address of Student :-");
					a=sc.nextLine();
					System.out.println("Enter ID of Student :-");
					i=sc.nextLine();
					System.out.println("Enter DOB of Student :-");
					d=sc.nextLine();
					p.set(f,l,a,b,i,d,r);
					obj.ip(p);
					break;
			
				case 2:
					System.out.println("Enter Name of the Student :-");
					f=sc.nextLine();
					obj.search(f);
					break;
			
				case 3:
					obj.clear();
					break;
			
				case 4:
					obj.display();
					break;
					
				case 5:
				  System.out.println("Enter First Name :-");
					f=sc.nextLine();
					System.out.println("Enter Last Name :-");
					l=sc.nextLine();
					System.out.println("Enter Roll no :-");
					r=sc.nextInt();
					System.out.println("Enter Branch :-");
					b=sc.nextLine();
					System.out.println("Enter Address of Student :-");
					a=sc.nextLine();
					System.out.println("Enter ID of Student :-");
					i=sc.nextLine();
					System.out.println("Enter DOB of Student :-");
					d=sc.nextLine();
					obj.mod(f,l,a,b,i,d,r);
					break;
					
					case 6:
					  System.out.println("Enter First Name :-");
					  f=sc.nextLine();
					  obj.del(f);
			}
		}
	}
}
