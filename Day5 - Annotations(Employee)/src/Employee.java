import org.junit.Test;

public class Employee {

	@Test
	@Timestamp(day = Day.MON, month = Month.JAN, year = Year.YEAR2015)
	public void getDetails() {
		@Company(name = "cdk", location = "Pune")
		int empId;
	}
	
}