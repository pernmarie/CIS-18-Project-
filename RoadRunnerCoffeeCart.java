import java.util.Scanner;

public class RoadRunnerCoffeeCart {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

//Welcome Message

System.out.println("Hello! Thank You for Choosing RoadRunner Coffee Cart for your special event.");

// Use ServiceType interface
ServiceSelection service = new ServiceSelection();
service.selectService();

//Appointment interface
RoadRunnerAppointment appointment = new RoadRunnerAppointment();
appointment.ScheduleAppointment();

//Coffee Menus
String[] coffeeMenu = {"Cappuccino", "Latte", "Espresso", "Americano"};
String[] specialtyMenu = {"Vanilla Latte", "Mocha Latte", "Matcha Latte", "RoadRunner Latte"};

String[] selectedDrinks = new String[3];

System.out.println("Coffee Menu:");
for (int i = 0; i < coffeeMenu.length; i++) {
System.out.println("- " + coffeeMenu[i]);
}

System.out.println("Specialty Menu:");
for (int i = 0; i < specialtyMenu.length; i++) {
System.out.println("- " + specialtyMenu[i]);
}

System.out.println("You may select up to 3 beverages.");

int count = 0;

while (count < 3) {

System.out.print("Enter beverage " + (count + 1) + ": ");
String drink = sc.nextLine();

boolean valid = false;

for (int i = 0; i < coffeeMenu.length; i++) {
if (drink.equals(coffeeMenu[i])) {
valid = true;
}
}

for (int i = 0; i < specialtyMenu.length; i++) {
if (drink.equals(specialtyMenu[i])) {
valid = true;
}
}

if (valid) {
selectedDrinks[count] = drink;
count++;
}
else {
System.out.println("Invalid drink. Please type it exactly as shown.");
}

}

// Summary
System.out.println("---- ORDER SUMMARY ----");
System.out.println("Service Type: " + service.serviceType);
System.out.println("Service Price: $" + service.price);
System.out.println("Event Date: " + appointment.date);
System.out.println("Event Time: " + appointment.hour + ":00 ");
System.out.println("Selected Beverages:");
for (int i = 0; i < selectedDrinks.length; i++) {
    System.out.println("- " + selectedDrinks[i]);
}
System.out.println("Thank you for booking RoadRunner Coffee Cart!");

}

}