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
public class userlog {
    private String name; 
    private int number;
    private int accnum;
    private int pass;

    public userlog(String name, int number, int accnum, int pass) {
        this.name = name;
        this.number = number;
        this.accnum = accnum;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getAccnum() {
        return accnum;
    }

    public int getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    
}
