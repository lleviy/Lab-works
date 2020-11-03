package lab4;

import lab4.exceptions.NotEnoughMoneyException;
import lab4.exceptions.UnknownAccountException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws UnknownAccountException, NotEnoughMoneyException {
        DataContext dataContext = new DataContext();
        dataContext.Initialize();
        AccountService accountService = new AccountService(dataContext);

        try {
            accountService.balance(1);
            accountService.withdraw(1, new BigDecimal(5435.44));
            accountService.balance(1);
            accountService.deposit(1, new BigDecimal(20000));
            accountService.balance(1);
            accountService.transfer(1, 2, new BigDecimal(19000));
            accountService.balance(2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
