package pl.sdacademy;

public class Account {
    private String firstName;
    private String lastName;
    private long account;

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAccount() {
        return account;
    }

    public Account(String firstName, String lastName, long account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }
}
