7. Delivery Details

[Note :
Strictly adhere to the object oriented specifications given as a part of the problem statement.
Use the same class names and member variable names.
Follow the naming conventions mentioned for getters / setters.
Create 2 separate classes in 2 separate files.]



Create a class named Delivery with the following private member variables / attributes

·          

Long over;

·          

·          

Long ball;

·          

·          

Long runs;

·          

·          

String batsman

·          

·          

String bowler

·          

·          

String nonStriker

·          

 

 

Include a 6-argument constructor in this class. The arguments passed to the constructor are in this order --- over, ball, runs,batsman,bowler,nonStriker.
Include an empty default constructor.
 

 


 

Include appropriate getters and setters.

[Naming Convention:

getters : getOver getBall...

setters : setOver, setBall...]

 



Create another class named Main and include a main method to test the above class(Print the output in Main Class).

 

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
Ms Dhoni             
Enter the bowler name
Dale steyn
Enter the nonStriker name
Suresh Raina
Over : 1
Ball : 1
Runs : 4
Batsman : Ms Dhoni
Bowler : Dale steyn
NonStriker : Suresh Raina

 

 Delivery.java
package exercise;

class Delivery
{
	private Long over;
	private Long ball;
	private Long runs;
	private String batsman;
	private String bowler;
	private String nonstriker;
	public Long getOver()
	{
		return over;
	}
	public void setOver(Long over)
	{
		this.over=over;
	}
	public Long getBall()
	{
		return ball;
	}
	public void setBall(Long ball)
	{
		this.ball=ball;
	}
		Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonstriker)
	{

		System.out.println("Over:"+over);
		System.out.println("Ball:"+ball);
		System.out.println("Runs:"+runs);
		System.out.println("Batsman:"+batsman);
		System.out.println("Bowler:"+bowler);
		System.out.println("NonStriker:"+nonstriker);
	}
	Delivery()
	{
		
	}
	
	
}





Main2.java

package exercise;

public class Main2 {

	public static void main(String[] args) {
		Delivery d1=new Delivery();
		
		d1.setOver(1L);
		d1.setBall(1L);
		Long over=d1.getOver();
		Long ball=d1.getBall();
		Delivery d2=new Delivery(over,ball,1L,"Ms Dhoni","Dale steyn","Suresh Raina");

	}

}
