package Fintech.driver;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver3 {

    public static void main(String[] _args) {

        // codes
        
public class Transaction {
    private final int id;
    private final String accountOwner;
    private final double amount;
    private final String timestamp;
    private final String note;

    public Transaction(int _id, String _accountOwner, double _amount, String _timestamp, String _note) {
        this.id = _id;
        this.accountOwner = _accountOwner;
        this.amount = _amount;
        this.timestamp = _timestamp;
        this.note = _note;
    }

    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return String.format("%d|%s|%.1f|%s|%s", id, accountOwner, amount, timestamp, note);
    }
}


    }

}
