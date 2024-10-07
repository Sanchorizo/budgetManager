package fr.hb;

public class Main {

    public static void main(String[] args) {
        BudgetManager budgetManager = new BudgetManager();

        System.out.println("Bienvenue dans le gestionnaire de budget!!");
        budgetManager.addExpense("Courses", 50.0f);
        budgetManager.addExpense("Tranport", 15.0f);

        budgetManager.calculateTotal();

    }





}