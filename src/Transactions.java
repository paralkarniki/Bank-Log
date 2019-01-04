/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpan.pkg255.exercise.pkg2;

/**
 *
 * @author Nikita
 */
public class Transactions {
   
 public String name;
 public int num;

    public Transactions(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
 
 public static double deposit(double x, double y)
    {
        double depositAmt = y, currentBal = x;
        double newBalance = depositAmt + currentBal;

        System.out.printf("Your New Balance is $%.2f\n",  newBalance);

        return newBalance;
    }
  public static double withdraw(double x, double y)
    {
        double withdrawAmt = y, currentBal = x, newBalance;

        newBalance = currentBal - withdrawAmt;
        System.out.printf("Your New Balance is %.2f\n",newBalance);

        return newBalance;  
    }
    }

