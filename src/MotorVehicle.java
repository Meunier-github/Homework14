public abstract class MotorVehicle extends Vehicle {

    public MotorVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTransport() {
        super.checkTransport();
        checkEngine();
    }
}
