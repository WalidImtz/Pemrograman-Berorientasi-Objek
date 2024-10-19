public class Commission extends Hourly
{
    private double totalSales;
    private double commissionRate;

    //----------------------------------------------------------
    //  Constructor: Sets up this commission employee with the
    //  specified information.
    //----------------------------------------------------------
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }

    //----------------------------------------------------------
    //  Adds the specified sales amount to the total sales.
    //----------------------------------------------------------
    public void addSales(double sales)
    {
        totalSales += sales;
    }

    //----------------------------------------------------------
    //  Computes and returns the pay for this commission employee.
    //----------------------------------------------------------
    @Override
    public double pay()
    {
        double payment = super.pay();

        payment += totalSales * commissionRate;

        totalSales = 0;

        return payment;
    }

    //----------------------------------------------------------
    //  Returns information about this commission employee as a
    //  string.
    //----------------------------------------------------------
    @Override
    public String toString()
    {
        String result = super.toString();


        result += "\nTotal Sales: " + totalSales;
        result += "\nCommission Rate: " + (commissionRate * 100) + "%";

        return result;
    }
}
