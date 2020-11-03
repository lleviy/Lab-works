package lab4;

import java.math.BigDecimal;

public class Account {
    private int id;
    private String holder;
    private BigDecimal amount;

    public Account(int id, String holder, BigDecimal amount){
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public int getId() {return id;}
    public void setId(int id){this.id = id;}

    public String getHolder() {return holder;}
    public void setHolder(String holder){this.holder = holder;}

    public BigDecimal getAmount() {return amount;}
    public void setAmount(BigDecimal amount){this.amount = amount.setScale(2, BigDecimal.ROUND_HALF_DOWN);}
}
