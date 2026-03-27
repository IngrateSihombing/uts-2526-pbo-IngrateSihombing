public class account {
    
}
package fintech.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String username;
    private final String name;
    private double balance;
    private final List<Transaction> transactions;

    public Account(String _username, String _name) {
        this.username = _username;
        this.name = _name;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction _transaction) throws InsufficientBalanceException {
        // Cek jika transaksi akan membuat saldo negatif
        if (this.balance + _transaction.getAmount() < 0) {
            throw new InsufficientBalanceException("Insufficient balance for transaction");
        }
        
        // Jika aman, update saldo dan tambahkan ke list
        this.balance += _transaction.getAmount();
        this.transactions.add(_transaction);
    }

    public String getOwner() { return username; }
    public String getName() { return name; }
    public double getBalance() { return balance; }
    public List<Transaction> getTransactions() { return transactions; }

    @Override
    public String toString() {
        return String.format("%s|%s|%.1f", username, name, balance);
    }
}