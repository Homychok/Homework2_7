package homeworks.homework2_8.transport;


import homeworks.homework2_8.drivers.CategoryD;

public class Bus extends Transport<CategoryD> {
    protected CategoryD driver;
    protected String type;
    Integer busCapacity;
    ClassificationBusCapacity capacity;
    ClassificationBusCapacity minCapacity;
    ClassificationBusCapacity maxCapacity;

    public Bus(String brand, String model, Double engineVolume, int busCapacity, String type) {
        super(brand, model, engineVolume, type);
        this.busCapacity = busCapacity;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printType() {
        if (this.type != null) {
            System.out.println("Автобус" + this.brand + " " + this.model + " с типом " + this.type);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }

    }

    public void printBusCapacity() {
        System.out.println("Автобус " + this.brand + " " + this.model + " при вместимости в " + this.busCapacity + " мест автобусы классифицируются, как " + this.capacity + " при диапазоне значений: от" + this.minCapacity + " до " + this.maxCapacity);
    }

    public CategoryD getDriver() {
        return this.driver;
    }

    public void setDriver(CategoryD driver) {
        this.driver = driver;
    }

    public void printInfo() {
        System.out.println("Водитель " + this.driver + " управляет автомобилем " + this.brand + " " + this.model + " будет участвовать в заезде!");
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
        return "Автобусмарка " + this.brand + "', модель " + this.model + "', объем двигателя " + this.engineVolume + ", водитель " + this.driver;
    }

    public static enum ClassificationBusCapacity {
        ESPECIALLYSMALLCAPACITY(0, 10),
        SMALLCAPACITY(10, 20),
        MEDIUMCAPACITY(40, 50),
        LARGECAPACITY(60, 80),
        PARTICULARLYLARGECAPACITY(100, 200);

        private Integer minCapacity;
        private Integer maxCapacity;
        private String capacity;
        Integer busCapacity;

        ClassificationBusCapacity(Integer minCapacity, Integer maxCapacity) {
            this.setCapacity(minCapacity, maxCapacity);
        }

        public String getCapacity() {
            return this.capacity;
        }

        public void setCapacity(Integer minCapacity, Integer maxCapacity) {
            if (this.busCapacity <= 10 && this.busCapacity >= 0) {
                this.minCapacity = ESPECIALLYSMALLCAPACITY.minCapacity;
                this.maxCapacity = ESPECIALLYSMALLCAPACITY.maxCapacity;
                this.capacity = "Особо малая";
            } else if (this.busCapacity > 10 && this.busCapacity <= 25) {
                this.minCapacity = SMALLCAPACITY.minCapacity;
                this.maxCapacity = SMALLCAPACITY.maxCapacity;
                this.capacity = "Малая";
            } else if (this.busCapacity > 40 && this.busCapacity <= 50) {
                this.minCapacity = MEDIUMCAPACITY.minCapacity;
                this.maxCapacity = MEDIUMCAPACITY.maxCapacity;
                this.capacity = "Средняя";
            } else if (this.busCapacity > 60 && this.busCapacity <= 80) {
                this.minCapacity = LARGECAPACITY.minCapacity;
                this.maxCapacity = LARGECAPACITY.maxCapacity;
                this.capacity = "Большая";
            } else {
                this.minCapacity = PARTICULARLYLARGECAPACITY.minCapacity;
                this.maxCapacity = PARTICULARLYLARGECAPACITY.maxCapacity;
                this.capacity = "Особо большая";
            }

        }

        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public String toString() {
            Integer var10000 = this.busCapacity;
            return "Автобус bv" + var10000 + " мест автобусы классифицируются, как " + this.getCapacity() + " при диапазоне значений: от" + this.minCapacity + " до " + this.maxCapacity;
        }
    }

    public static enum BusCapacity {
        TENSEATS(10),
        TWENTYFIVESEATS(20),
        FORTYSEATS(40),
        FIFTYSEATS(50),
        SIXTYSEATS(60),
        EIGHTYSEATS(80),
        ONEHUNDREDSEATS(100),
        TWOHUNDREDSEATS(200);

        public Integer busCapacity;

        private BusCapacity(Integer busCapacity) {
            this.busCapacity = busCapacity;
        }

        public Integer getBusCapacity() {
            return this.busCapacity;
        }

        public void setBusCapacity(Integer busCapacity) {
            this.busCapacity = busCapacity;
        }

        public String toString() {
            return "Вместимость составляет " + this.busCapacity;
        }
    }
}

