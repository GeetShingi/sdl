package pp;
public class Person
{
	String fname,lname,addr,branch,id,dob;
	int roll;
	Person(String f,String l,String a,String b,String i,String d,int r)
	{
		this.fname=f;
		this.lname=l;
		this.addr=a;
		this.branch=b;
		this.roll=r;
		this.id=i;
		this.dob=d;
	}
	void set(String f,String l,String a,String b,String i,String d,int r)
	{
		this.fname=f;
		this.lname=l;
		this.addr=a;
		this.branch=b;
		this.roll=r;
		this.id=i;
		this.dob=d;
	}
}

