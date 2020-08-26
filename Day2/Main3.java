3. Create a class named Delivery with the following public member variables / attributes 

Data Type

Variable Name

Long

over

Long

ball

Long

runs

String

batsman

String

bowler

String

nonStriker


  
Include a method in the class named displayDeliveryDetails(). In this method, display the details of the delivery in the format shown in the sample output. This method does not accept any arguments and its return type is void. 

Create another class called Main  and write a main method to test the above class. 

  Input and Output Format: 
 Refer sample input and output for formatting specifications. 
All text in bold corresponds to input and the rest corresponds to output. 

 Sample Input and Output : 
Enter the over 
1 
Enter the ball 
1 
Enter the runs 
4 
Enter the batsman name 
MS Dhoni 
Enter the bowler name 
Dale steyn 
Enter the nonStriker name 
Suresh Raina 
Delivery Details : 
Over : 1 
Ball : 1 
Runs : 4 
Batsman : MS Dhoni 
Bowler : Dale steyn 
NonStriker : Suresh Raina 


saved as Main3.java

class Delivery
{
	Long over=1L;
	Long ball=1L;
	Long runs=4L;
	String batsman="MS Dhoni";
	String bowler="Dale steyn";
	String nonstriker="Suresh Raina";
	void displayDeliveryDetails()
	{
		System.out.println("Over:"+this.over);
		System.out.println("Ball:"+this.ball);
		System.out.println("Runs:"+this.runs);
		System.out.println("Batsman:"+this.batsman);
		System.out.println("Bowler:"+this.bowler);
		System.out.println("NonStriker:"+this.nonstriker);
	}
	
}
class Main3
{
	public static void main(String args[])
	{
		Delivery d=new Delivery();
		d.displayDeliveryDetails();
	}
}