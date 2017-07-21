package space;

import java.util.ArrayList;


public class Mission implements Comparable<Mission>
{
	private String			destination;
	private float			cost;
	
	
	public Mission(String destination, Float cost)
	{
		this.destination = destination;
		this.cost = cost;
	}
	
	
	public String getDestination()
	{
		return destination;
	}
	
	
	public float getCost()
	{
		return cost;
	}


	// Compare by cost, then by destination.
	public int compareTo(Mission that) 
	{ 		
		if(this.cost > that.cost) {
			return 1;
		}
		else if(this.cost < that.cost) {
			return -1; 
		}
		else if(this.destination.compareTo(that.destination) > 0) {
			return 1;
		}
		else if(this.destination.compareTo(that.destination) < 0) {
			return -1; 
		}
		return 0; 
	}
	
	
	// Let compareTo() do the work. This method should just be 1 line.
	public boolean equals(Object x)
	{
		Mission that = (Mission) x;
		return this.compareTo(that) == 0;
	}
	
	
	// As you saw in lecture, create an ArrayList<Object>. Add destination and
	// cost to the list. Return the list's hash code.
	public int hashCode()
	{
		ArrayList<Object> list = new ArrayList<>();
		list.add(cost);
		list.add(destination);
		return list.hashCode();
	}
	
	
	public String toString()
	{
		return "Mission to " + destination + " will cost " + cost;
	}
	
	/*public static void main(String[] args) {
		Mission m1 = new Mission("Mars", 200.90f);
		Mission m2 = new Mission("Love", 25.70f);
		Mission m3 = new Mission("Love", 25.70f);
		Mission m4 = new Mission("Love", 2.70f);
		Mission m5 = new Mission("Celtics", 200.90f);
		System.out.println("Expected: false " + m1.equals(m2));
		System.out.println("Expected: true" + m2.equals(m3));
		System.out.println("Expected: false" + m3.equals(m4));
		System.out.println("Expected: false" + m1.equals(m5));
	}*/
}
