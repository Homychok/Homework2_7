package homeworks.homework2_8.drivers;

public class Driver {
    protected Integer experience;
    protected String fullName;
    protected Boolean drivingLicence;

    public Driver(Integer experience, String fullName, Boolean drivingLicence) {
        this.experience = experience;
        this.fullName = fullName;
        this.drivingLicence = drivingLicence;
    }

    public Integer getExperience() {
        return this.experience;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Boolean getDrivingLicence() {
        return this.drivingLicence;
    }

    public void startMovingDriver() {
    }

    private void stopMovingDriver() {
    }

    public String toString() {
        return this.fullName;
    }
}

