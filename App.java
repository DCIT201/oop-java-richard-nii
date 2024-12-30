public class App {

    public static void main(String[] args) {
        // Create Vehicles
        Car car = new Car("C001", "Benz", 50, 0);
        Motorcycle motorcycle = new Motorcycle("M001", "Jeep", 30, 0);
        Truck truck = new Truck("T001", "Ford", 100, 0);

        // Creating a Customer
        Customer customer = new Customer("Derrick Debrah", "D1234567");

        // Adding Vehicles to the rental agency
        RentalAgency agency = new RentalAgency("Richard Rentals");
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // My agency is displaying the vehicles we have available
        agency.displayAvailableVehicles();

        // Renting a Vehicle
        RentalTransaction transaction = new RentalTransaction(car, customer, 5);
        transaction.printTransactionDetails();

        // Return Vehicle
        car.setAvailable(true);
    }
}
