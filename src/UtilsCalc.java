


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author karol
 */
public class UtilsCalc {

    /**
     *
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a soma do valor1 com valor 2
     */
    public double somar(double valor1, double valor2) {
        double resultado = valor1 + valor2;

        return resultado;
    }

    /**
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a subtração do valor1 com valor 2
     */
    public double subtrair(double valor1, double valor2) {
        double resultado = valor1 - valor2;

        return resultado;
    }

    /**
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a multiplicação do valor1 com valor 2
     */
    public double multiplicar(double valor1, double valor2) {
        double resultado = valor1 * valor2;

        return resultado;
    }

    /**
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a divisão do valor1 com valor 2
     */
    public double dividir(double valor1, double valor2) {
        double resultado = valor1 / valor2;

        return resultado;
    }

    /**
     * @param valor1 primeiro valor double
     * @return retorna a raíz quadrada do valor1 usando metodo Math.sqrt
     */
    public double raiz(double valor1) {
        double resultado = Math.sqrt(valor1);

        return resultado;
    }
    
     /**
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a soma de porcentagem
     */
    public double somarPorcentagem(double valor1, double valor2) {
        double resultado = valor1 + (valor1 * (valor2 / 100));

        return resultado;
    }

    /**
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a subtração de porcentagem
     */
    public double subtrairPorcentagem(double valor1, double valor2) {
        double resultado = valor1 - (valor1 * (valor2 / 100));

        return resultado;
    }

    /**
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a multiplicação de porcentagem
     */
    public double multiplicarPorcentagem(double valor1, double valor2) {
        double resultado = valor1 * (valor2 / 100);

        return resultado;
    }

    /**
     * @param valor1 primeiro valor double
     * @param valor2 segundo valor double
     * @return retorna a divisão de porcentagem
     */
    public double dividirPorcentagem(double valor1, double valor2) {
        double resultado = valor1 / (valor2 / 100);

        return resultado;
    }

    /**
     *
     * @return retorna String vazio para deixar o campo em branco;
     */
    public String limpaTela() {
        return "";
    }
}
