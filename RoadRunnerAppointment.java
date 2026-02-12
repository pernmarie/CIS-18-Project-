import java.util.Scanner;

public class RoadRunnerAppointment implements Appointment {
public String date;  
public int hour;    

public void ScheduleAppointment() {
Scanner sc = new Scanner(System.in);

System.out.print("Enter appointment date: ");
date = sc.nextLine();  

while (true) {
System.out.print("Enter hour (8-8 for 8AM to 8PM): ");
hour = sc.nextInt();  
if (hour >= 8 && hour <= 8) break;
System.out.println("Invalid hour. Must be between 8AM and 8PM.");
}

System.out.println("Appointment scheduled: " + date + " at " + hour + ":00");
}
}