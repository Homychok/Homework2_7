package homeworks.homework2_8.transport;

import homeworks.homework2_8.transport.interfaces.Competing;
import homeworks.homework2_8.drivers.Driver;

import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private String type;
    protected String brand;
    protected String model;
    protected Double engineVolume;
    protected T driver;
    public String mechanic;

    public Transport(String brand, String model, Double engineVolume, String type, String mechanic) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        }

        if (model != null && !model.isBlank()) {
            this.model = model;
        }

        this.setEngineVolume(this.engineVolume);
        this.type = type;
    }


    public void startMoving() {
        System.out.println("Транспорт начинает движение!");
    }

    public void stopMoving() {
        System.out.println("Транспорт останавливается!");
    }

    public Driver getDriver() {
        return this.driver;
    }

    public void setDriver() {
        this.driver = this.driver;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume != null && engineVolume <= 0.0) {
            this.engineVolume = engineVolume;
        }

    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public Double getEngineVolume() {
        return this.engineVolume;
    }

    public void roundTime() {
        System.out.println("roundTime");
    }

    public void pitStopTime() {
        System.out.println("PitStopTime");
    }

    public void maxVelocity() {
        System.out.println("maxVelocity");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void printInfo() {
    }

    public abstract void printType();

    public void getCheckedOutDiagnostic() {
    }
    public String getMechanic(){
        return mechanic;
    }

    public Boolean getCheckedOut() throws MyException {
        Boolean s = this.driver.getDrivingLicence();
        if (s.equals(false)) {
            throw new MyException("String can not be empty!");
        } else {
            System.out.println("Необходимо указать тип прав! ");
            return s;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport<?> transport = (Transport<?>) o;
        return Objects.equals(type, transport.type) && Objects.equals(getBrand(), transport.getBrand()) && Objects.equals(getModel(), transport.getModel()) && Objects.equals(getEngineVolume(), transport.getEngineVolume()) && Objects.equals(getDriver(), transport.getDriver()) && Objects.equals(getMechanic(), transport.getMechanic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, getBrand(), getModel(), getEngineVolume(), getDriver(), getMechanic());
    }
}
