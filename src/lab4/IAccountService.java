package lab4;

import lab4.exceptions.NotEnoughMoneyException;
import lab4.exceptions.UnknownAccountException;

import java.math.BigDecimal;

public interface IAccountService {
    void withdraw(int accountId, BigDecimal amount) throws NotEnoughMoneyException, UnknownAccountException;
    void balance(int accountId) throws UnknownAccountException;
    void deposit(int accountId, BigDecimal amount) throws UnknownAccountException;
    void transfer(int from, int to, BigDecimal amount) throws UnknownAccountException, NotEnoughMoneyException;
}
