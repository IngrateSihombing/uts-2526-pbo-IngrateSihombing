
public class TransferTrasnsaction {
    
}
package fintech.model;

public class TransferTransaction {
    private final int id;
    private final String accountOwner;
    private final double amount;
    private final String timestamp;
    private final String note;

    public TransferTransaction(int _id, String _accountOwner, double _amount, String _timestamp, String _note) {
        this.id = _id;
        this.accountOwner = _accountOwner;
        this.amount = _amount;
        this.timestamp = _timestamp;
        this.note = _note;
    }

    @Override
    public String getReceiver() {
        return String.format("receiver", id, accountOwner, amount, timestamp, note);
    }
}
