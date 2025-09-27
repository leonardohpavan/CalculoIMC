/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculoimc;

/**
 *
 * @author leonardo.hpavan
 */
public final class CalculoIMC {

    private double p;
    private double a;
    private double imc;
    private String situacao;

    public CalculoIMC(double p, double a) {
        setP(p);
        setA(a);
        CalculaIMC();
    }

    private void CalculaIMC() {
        imc = this.p / (this.a * this.a);
        defineSituacao();
    }

    private void defineSituacao() {
        if (imc < 17) {
            situacao = ("Muito abaixo do peso");
        } else if (imc > 17 && imc <= 18.49) {
            situacao = ("Abaixo do peso");
        } else if (imc > 18.49 && imc <= 24.99) {
            situacao = ("Peso Normal");
        } else if (imc >= 25 && imc <= 29.99) {
            situacao = ("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            situacao = ("Obesidade I");
        } else if (imc >= 25 && imc <= 29.99) {
            situacao = ("Obesidade II (Severa)");
        } else if (imc >= 30 && imc <= 34.99) {
            situacao = ("Obesidade III (Mórbida)");
        }
    }
            /**
             * @return the p
             */
       public double getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(double p) {
        this.p = p;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
