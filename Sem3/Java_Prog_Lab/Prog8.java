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
	System.out.println("Sunday : " + DaysOfWeek.SUNDAY.isWorkday());
	System.out.println("Monday : " + DaysOfWeek.MONDAY.isWorkday());
	System.out.println("Tuesday : " + DaysOfWeek.TUESDAY.isWorkday());
	System.out.println("Wednesday : " + DaysOfWeek.WEDNESDAY.isWorkday());
	System.out.println("Thursday : " + DaysOfWeek.THURSDAY.isWorkday());
	System.out.println("Friday : " + DaysOfWeek.FRIDAY.isWorkday());
	System.out.println("Saturday : " + DaysOfWeek.SATURDAY.isWorkday());
      }
}
