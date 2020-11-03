package lab4;

import lab4.exceptions.NotEnoughMoneyException;
import lab4.exceptions.UnknownAccountException;

import java.math.BigDecimal;

public class AccountService implements IAccountService{

    private Account[] accounts;
    private DataContext dataContext;

    public AccountService(DataContext dataContext){
        this.dataContext = dataContext;
        accounts = dataContext.getAccounts();
    }

    @Override
    public void withdraw(int accountId, BigDecimal amount) throws NotEnoughMoneyException, UnknownAccountException {
        for (Account account: accounts) {
            if (account.getId() == accountId){
                BigDecimal currentAmount = account.getAmount();
                if (amount.compareTo(currentAmount) < 0) {
                    account.setAmount(currentAmount.subtract(amount));
                    dataContext.saveChanges(accounts);
                    return;
                }
                else throw new NotEnoughMoneyException("На счете недостаточно средств.");
            }
        }
        throw new UnknownAccountException("Аккаунт с таким id не найден.");
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        for (Account account: accounts) {
            if (account.getId() == accountId) {
                System.out.println(account.getAmount());
                return;
            }
        }
        throw new UnknownAccountException("Аккаунт с таким id не найден.");
    }

    @Override
    public void deposit(int accountId, BigDecimal amount) throws UnknownAccountException {
        for (Account account: accounts) {
            if (account.getId() == accountId){
                BigDecimal currentAmount = account.getAmount();
                account.setAmount(currentAmount.add(amount));
                dataContext.saveChanges(accounts);
                return;
            }
        }
        throw new UnknownAccountException("Аккаунт с таким id не найден.");
    }

    @Override
    public void transfer(int from, int to, BigDecimal amount) throws UnknownAccountException, NotEnoughMoneyException {
        if (accountExists(from)){
            if (accountExists(to)){
                withdraw(from, amount);
                deposit(to, amount);
            }
        }
    }

    private boolean accountExists(int accountId){
        for (Account account: accounts) {
            if (account.getId() == accountId) {
                return true;
            }
        }
        return false;
    }
}
