package homeworks.homework2_8.mechanics;

import homeworks.homework2_8.transport.Transport;

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
