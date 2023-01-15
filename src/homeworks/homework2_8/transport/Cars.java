package homeworks.homework2_8.transport;

import homeworks.homework2_8.drivers.CategoryB;
import java.util.Arrays;

public class Cars extends Transport<CategoryB> {
    protected CategoryB driver;
    protected String type;
    BodyType bodyType;

    public Cars(String brand, String model, Double engineVolume, BodyType bodyType, String type, String mechanic) {
        super(brand, model, engineVolume, type, mechanic);
        this.bodyType = bodyType;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Автомобильмарка" + this.brand + "', модель" + this.model + "', объем двигателя" + this.engineVolume + ", водитель" + this.driver;
    }

    public void getCheckedOutDiagnostic() {
        System.out.println("Необходимо пройти диагностику транспортного средства");
        System.out.println("Автомобиль прошел диагностику");
    }

    public void printType() {
        if (this.type == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String var10001 = this.brand;
            System.out.println("Машина" + var10001 + " " + this.model + " с типом " + this.getType());
        }

    }

    public void printInfo() {
        System.out.println("Водитель " + this.driver + " управляет автомобилем " + this.brand + " " + this.model + " будет участвовать в заезде!");
    }

    public void setDriver(CategoryB driver) {
        this.driver = driver;
    }

    public CategoryB getDriver() {
        return this.driver;
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

    public static enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        public String carBodyType;

        private BodyType(String carBodyType) {
            this.carBodyType = carBodyType;
        }

        public String toString() {
            return "Тип кузова - " + this.carBodyType;
        }

        public String getCarBodyType() {
            return this.carBodyType;
        }

        public void printBodyType() {
            BodyType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                BodyType var10000 = var1[var3];
                System.out.println(Arrays.toString(values()));
            }

        }
    }
}