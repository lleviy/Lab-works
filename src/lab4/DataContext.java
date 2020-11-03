package lab4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.math.BigDecimal;

public class DataContext {
    private String filePath = System.getProperty("user.dir") + "\\src\\lab4\\storage.json";

    public void Initialize(){
        String[] holders = new String[]{"Иван Иванов", "Петр Петров", "Василий Пупкин"};
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        Gson gson = builder.create();
        File f = new File(filePath);
        if (!f.isFile()){
            try {
                Account[] accounts = new Account[3];
                for (int i = 1; i <= 3; i++){
                    Account account = new Account(i, holders[i-1], new BigDecimal(Math.random() * 100000).setScale(2, BigDecimal.ROUND_HALF_DOWN));
                    accounts[i-1] = account;
                }
                try(FileWriter writer = new FileWriter(f)) {
                    gson.toJson(accounts, writer);
                    writer.flush();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Account[] getAccounts(){
        Gson gson = new Gson();
        Account[] accounts = new Account[]{};
        try {
            FileReader reader = new FileReader(filePath);
            accounts = gson.fromJson(reader, Account[].class);
            return accounts;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void saveChanges(Account[] accounts){
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        Gson gson = builder.create();
        File f = new File(filePath);
        try(FileWriter writer = new FileWriter(f)) {
             gson.toJson(accounts, writer);
             writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
