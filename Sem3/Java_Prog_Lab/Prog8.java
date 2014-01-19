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
