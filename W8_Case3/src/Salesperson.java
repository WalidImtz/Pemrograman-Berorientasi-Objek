public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getTotalSales() { return totalSales; }


    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales;
        }

        return other.lastName.compareTo(this.lastName);
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}
