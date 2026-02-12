import java.util.Scanner;

public class ServiceSelection implements ServiceType {
public String serviceType;
public double price;   

public void selectService() {
Scanner sc = new Scanner(System.in);
System.out.println("Please select service type:");
System.out.println("1. Hourly ($150 per hour)");
System.out.println("2. All Day ($1000)");

int choice = sc.nextInt();
sc.nextLine();

if (choice == 1) {
serviceType = "Hourly";
price = 150;
} else {
serviceType = "All Day";
price = 1000;
}

System.out.println("You selected: " + serviceType);
    }
}