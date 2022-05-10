package be.intec.springrestdemo.model;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer taxNumber;

    public Employee(String firstName, String lastName, Integer taxNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taxNumber = taxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Integer taxNumber) {
        this.taxNumber = taxNumber;
    }
}
