public enum DayOfWeek
{ 
	// Enumeration of days of week
	
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	// isWorkday method : returns false if Saturday or Sunday else returns false
	public boolean isWorkDay()
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
	System.out.println("Sunday : " + DayOfWeek.SUNDAY.isWorkDay());
	System.out.println("Monday : " + DayOfWeek.MONDAY.isWorkDay());
	System.out.println("Tuesday : " + DayOfWeek.TUESDAY.isWorkDay());
	System.out.println("Wednesday : " + DayOfWeek.WEDNESDAY.isWorkDay());
	System.out.println("Thursday : " + DayOfWeek.THURSDAY.isWorkDay());
	System.out.println("Friday : " + DayOfWeek.FRIDAY.isWorkDay());
	System.out.println("Saturday : " + DayOfWeek.SATURDAY.isWorkDay());
      }
}
