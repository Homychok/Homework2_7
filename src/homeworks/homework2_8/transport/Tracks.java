package homeworks.homework2_8.transport;


import homeworks.homework2_8.drivers.CategoryC;

public class Tracks extends Transport<CategoryC> {
    protected CategoryC driver;
    LoadCapacity trackLoadCapacity;
    private String type;

    public Tracks(String brand, String model, Double engineVolume, LoadCapacity trackLoadCapacity, String type, String mechanic) {
        super(brand, model, engineVolume, type, mechanic);
        this.trackLoadCapacity = trackLoadCapacity;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printType() {
        if (this.type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузовик" + this.brand + " " + this.model + " с типом " + this.type);
        }

    }

    public void printLoadCapacity() {
        System.out.println("Грузовик " + this.brand + " " + this.model + " имеет " + this.trackLoadCapacity);
    }

    public void setDriver(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getDriver() {
        return this.driver;
    }

    public void setmaxVelocity(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getmaxVelocity() {
        return this.driver;
    }

    public void printInfo() {
        System.out.println("Водитель " + this.driver + " управляет автомобилем " + this.brand + " " + this.model + " будет участвовать в заезде!");
    }

    public void getCheckedOutDiagnostic() {
        System.out.println("Необходимо пройти диагностику транспортного средства");
        System.out.println("Грузовик прошел диагностику");
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

    public String toString() {
        return "Грузовикмарка" + this.brand + "', модель" + this.model + "', объем двигателя" + this.engineVolume + ", водитель" + this.driver;
    }

    public static enum LoadCapacity {
        N1("С полной массой до 3.5 тонн."),
        N2("С полной массой свыше 3,5 до 12 тонн."),
        N3("С полной массой свыше 12 тонн.");

        private String tracksLoadCapacity;
        private final float minLoadCapacity = 3.5F;
        private final float maxLoadCapacity = 12.0F;

        private LoadCapacity(String tracksLoadCapacity) {
            this.tracksLoadCapacity = tracksLoadCapacity;
        }

        public String getTracksLoadCapacity() {
            return this.tracksLoadCapacity;
        }

        public String toString() {
            if (this.tracksLoadCapacity == N1.getTracksLoadCapacity()) {
                return "Грузоподъемность: от 0 тонн до 3.5 тонн.";
            } else {
                return this.tracksLoadCapacity == N3.getTracksLoadCapacity() ? "Грузоподъемность: от 12.0 тонн до Infinity тонн." : "Грузоподъемность: от 3.5 тонн до 12.0 тонн.";
            }
        }
    }
}
