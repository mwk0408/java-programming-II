
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    @Override
    public boolean equals(Object compare) {
        if (this==compare) {
            return true;
        }
        if (!(compare instanceof LicensePlate)) {
            return false;
        }
        LicensePlate temp= (LicensePlate) compare;
        if (this.liNumber.equals(temp.liNumber) && this.country.equals(temp.country)) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    @Override
    public int hashCode() {
        return this.country.hashCode() + this.liNumber.hashCode();
    }
}
