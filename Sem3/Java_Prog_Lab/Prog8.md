##Aim##
Write a JAVA Program a. Create an enumeration Day of Week with seven values SUNDAY through SATURDAY. Add a method is Workday( ) to the DayofWeek class that returns true if the value on which it is called is MONDAY through FRIDAY. For example, the call DayOfWeek.SUNDAY.isWorkDay ( ) returns false.
##Theory##
An enum type is a special data type that enables for a variable to be a set of predefined constants.
In this program, the enum class comprises of the days of the week. To the enum class, we add a method isWorkday. The function of the isWorkday method is to return a boolean *true* if the day called by the method is Monday to Friday and returns a boolean *false* if the day called is either Saturday or Sunday.

##Code##
<pre><code>
public enum DaysOfWeek
{ 
	// Enumeration of days of week
	
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	// isWorkday method : returns false if Saturday or Sunday else returns false
	public boolean isWorkday()
	{
		// switch case
		switch (this)
		{
		case SUNDAY :
			return false;
		case SATURDAY :
			return false;
		default :
			return true;
		}
	}
     
}
// test class
class test
{
     public static void main(String[] args)
     {
	System.out.println("Sunday : " + DaysOfWeek.SUNDAY.isWorking());
	System.out.println("Monday : " + DaysOfWeek.MONDAY.isWorking());
	System.out.println("Tuesday : " + DaysOfWeek.TUESDAY.isWorking());
	System.out.println("Wednesday : " + DaysOfWeek.WEDNESDAY.isWorking());
	System.out.println("Thursday : " + DaysOfWeek.THURSDAY.isWorking());
	System.out.println("Friday : " + DaysOfWeek.FRIDAY.isWorking());
	System.out.println("Saturday : " + DaysOfWeek.SATURDAY.isWorking());
      }
}

</code></pre>



##Output##

<pre><code>
Sunday : false
Monday : true
Tuesday : true
Wednesday : true
Thursday : true
Friday : true
Saturday : false
</code> </pre>


