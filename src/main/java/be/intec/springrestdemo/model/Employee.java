package be.intec.springrestdemo.model;

import java.util.Arrays;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer taxNumber;
    private String[] favoriteMovies;
    private Employee boss;

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

    public String[] getFavoriteMovies() {
        return favoriteMovies;
    }

    public void setFavoriteMovies(String[] favoriteMovies) {
        this.favoriteMovies = favoriteMovies;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", taxNumber=" + taxNumber +
                ", favoriteMovies=" + Arrays.toString(favoriteMovies) +
                ", boss=" + boss +
                '}';
    }
}
