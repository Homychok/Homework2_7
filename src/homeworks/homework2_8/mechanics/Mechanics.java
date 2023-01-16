package homeworks.homework2_8.mechanics;

import homeworks.homework2_8.transport.Transport;

import java.util.Objects;

public class Mechanics {
public String fullName;
public String companyName;


    public Mechanics(String fullName, String companyName) {
        super();
        this.companyName = companyName;
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void doMaintenance () {

    }
    public void fixTheCar () {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanics)) return false;
        Mechanics mechanics = (Mechanics) o;
        return Objects.equals(getFullName(), mechanics.getFullName()) && Objects.equals(getCompanyName(), mechanics.getCompanyName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getCompanyName());
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "fullName='" + fullName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }


    public void printType() {

    }
//    @Override
//    public void printType() {
//
//    }
}
