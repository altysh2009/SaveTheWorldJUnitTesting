/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.savetheworled;

/**
 *
 * @author Altysh
 */
public class Obj {
    private int shiled;
    private String cas;
    private int casnum;

    public Obj(int shiled, String cas, int casnum) {
        this.shiled = shiled;
        this.cas = cas;
        this.casnum = casnum;
    }

    public int getCasnum() {
        return casnum;
    }

    public void setCasnum(int casnum) {
        this.casnum = casnum;
    }

    public int getShiled() {
        return shiled;
    }

    public void setShiled(int shiled) {
        this.shiled = shiled;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }
}
