package mockpractise;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class String19DifferenceAgeorYears {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter start date (dd/mm/yyyy): ");
	        String startDateInput = scanner.nextLine();

	        System.out.print("Enter end date (dd/mm/yyyy): ");
	        String endDateInput = scanner.nextLine();

	        scanner.close();

	        String[] startDateParts = startDateInput.split("/");
	        int startDay = Integer.parseInt(startDateParts[0]);
	        int startMonth = Integer.parseInt(startDateParts[1]);
	        int startYear = Integer.parseInt(startDateParts[2]);

	        String[] endDateParts = endDateInput.split("/");
	        int endDay = Integer.parseInt(endDateParts[0]);
	        int endMonth = Integer.parseInt(endDateParts[1]);
	        int endYear = Integer.parseInt(endDateParts[2]);

	        LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
	        LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);

	        Period period = Period.between(startDate, endDate);
	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();

	        System.out.printf("Difference is: %d years, %d months, %d days%n", years, months, days);
	    }


}
