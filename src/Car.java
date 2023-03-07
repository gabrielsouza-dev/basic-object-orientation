//Class
class Car {

    //Attributes
    String color = "yellow";
    String model = "Brasilia";
    int tankCapacity = 41;

    //Simple constructor
    Car() {

    }

    //Constructor overload
    Car(String color, String model, int tankCapacity) {

        this.color = color;
        this.model = model;
        this.tankCapacity = tankCapacity;
        
    }

    //Setters and getters
    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    int getTankCapacity() {
        return tankCapacity;
    }

    //Method with operations
    double fullTankValue(double fuelValue) {
        return fuelValue * tankCapacity;
    }
}
