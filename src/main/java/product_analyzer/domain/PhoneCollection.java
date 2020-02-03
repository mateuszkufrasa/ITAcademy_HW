package product_analyzer.domain;

public class PhoneCollection {
    private Phone phone1;
    private Phone phone2;
    private Phone phone3;

    public void set(int index, Phone phone) {
        if (index == 1) {
            this.phone1 = phone;
        } else if (index == 2) {
            this.phone2 = phone;
        } else if (index == 3) {
            this.phone3 = phone;
        } else {
            throw new RuntimeException("not supported index [" + index + "]");
        }
    }
    public Phone get(int index) {
        if (index == 1) {
            return this.phone1;
        } else if (index == 2) {
            return this.phone2;
        } else if (index == 3) {
            return this.phone3;
        } else {
            throw new RuntimeException("not supported index [" + index + "]");
        }
    }

    @Override
    public String toString() {
        return "PhoneCollection{" +
                "phone1=" + phone1.name +
                ", phone2=" + phone1.name +
                ", phone3=" + phone1.name +
                '}';
    }
}
