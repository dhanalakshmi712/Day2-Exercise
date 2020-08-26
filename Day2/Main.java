1. Create a class named Venue with the following member variables / attributes (Default access) 

Data Type

Variable Name

String

name

String

city


Create another class called Main and write a main method to test the above class. 

 Input and Output Format: 
 Refer sample input and output for formatting specifications. 
All text in bold corresponds to input and the rest corresponds to output. 

 Sample Input and Output : 
Enter the venue name 
M. A. Chidambaram Stadium 
Enter the city name 
Chennai 
Venue Details : 
Venue Name : M. A. Chidambaram Stadium 
City Name : Chennai 
 

 Saved as Main.java

 class Venue
{
	String name="M.A Chidambaram Stadium";
	String city="Chennai";
	}
class Main
{
	public static void main(String args[])
	{
		Venue v=new Venue();
		System.out.println("Venue Details");
		System.out.println("Venue Name:"+v.name+"\n"+"City Name:"+v.city);
	
	}
}