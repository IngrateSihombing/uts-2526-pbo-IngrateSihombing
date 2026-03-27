
public class DepositTransaction {
    
}
package fintech.model;

public class DepositTransaction {
    public final int id;
    public final String accountOwner;
    public final double amount;
    public final String timestamp;
    public final String note;

    public DepositTransaction(int _id, String _accountOwner, double _amount, String _timestamp, String _note) {
        this.id = _id;
        this.accountOwner = _accountOwner;
        this.amount = _amount;
        this.timestamp = _timestamp;
        this.note = _note;
    }

    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return String.format("deposit", id, accountOwner, amount, timestamp, note);
    }
}
