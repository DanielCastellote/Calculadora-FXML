package com.example.calculadorafxml;

public class Modelo {
    private double operador1;
    private double operador2;
    private String tipoOperator;

    public double getOperador1() {
        return operador1;
    }

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public double getOperador2() {
        return operador2;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }

    public double getResultado() {
        return calcular();
    }

    public String getTipoOperator() {
        return tipoOperator;
    }

    public void setTipoOperator(String tipoOperator) {
        this.tipoOperator = tipoOperator;
    }

    public double calcular() {

        switch (tipoOperator) {
            case "+":
                return operador1 + operador2;
            case "-":
                return operador1 - operador2;
            case "x":
                return operador1 * operador2;
            case "/":
                if (operador2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                    return 0;
                }
                return (operador1 / operador2);
        }
        System.out.println("Operacion no reconocida");
        return 0;
    }
}
