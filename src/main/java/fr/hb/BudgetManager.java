package fr.hb;


import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BudgetManager {
    List<Expense> expenseList = new ArrayList<>();


    public void addExpense(String nom, Float montant){

        Date date = new Date();
        Expense expense = new Expense(montant, date, nom);
        expenseList.add(expense);
        System.out.println("Dépense ajoutée: " + expense);
    }


    public void calculateTotal() {
        Float total = 0.0f;
        for (Expense expense : expenseList) {
            System.out.println(expense);
            total += expense.montant;

        }
        System.out.println(total);    }


}
