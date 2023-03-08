//Basic structure object-oriented programming

public class RunApplication {
    
    //Main method to run the code
    public static void main(String[] args) {
        
        //New object
        Car car1 = new Car();

        //Calls setters through new object(car1) and defines the parameters
        car1.setColor("yellow");
        car1.setModel("Brasilia");
        car1.setTankCapacity(41);

        //Print the values using getters through the new object (car1)
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getTankCapacity());
        System.out.println(car1.fullTankValue(4.57)); //Sends a message(fuelValue) through the new object(car1) to the method(fullTankValue) and prints its result

        //New object with defined parameters
        Car car2 = new Car("red", "Ferrari F1-75", 1600);

        //Print the values using getters through the new object (car2)
        System.out.println();
        System.out.println(car2.getColor());
        System.out.println(car2.getModel());
        System.out.println(car2.getTankCapacity());
        System.out.println(car2.fullTankValue(4.54)); //Sends a message(fuelValue) through the new object(car2) to the method(fullTankValue) and prints its result

    }
}