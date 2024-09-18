package com.v11.cibertec.capitulo2;

/**
 * Clase que permite realizar las 4 operaciones basicas
 * @author djara
 */
public class CalculadoraWrapper {
    /**
     * Permite sumar dos numeros enteros
     * @param value1 - 1er valor a sumar
     * @param value2 - 2do valor a sumar
     * @return - Muestra el resultado de sumar dos numeros enteros
     */
    public Integer sumar(Integer value1, Integer value2) {
        return value1 + value2;
    }

    /**
     * Permite restar dos numeros Long
     * @param value1 - 1er valor a restar
     * @param value2 - 2do valor a restar
     * @return - Muestra el resultado de restar dos numeros Long
     */
    public Long restar(Long value1, Long value2) {
        return value1 - value2;
    }

    /**
     * Permite multiplicar dos numeros float
     * @param value1 - 1er valor a multiplicar
     * @param value2 - 2do valor a multiplicar
     * @return - Muestra el resultado de sumar dos numeros float
     */
    public Float multiplicar(Float value1, Float value2) {
        return value1 * value2;
    }

    /**
     * Permite dividor dos numeros Doubles
     * @param value1 - 1er valor a dividir
     * @param value2 - 2do valor a dividir
     * @return - Muestra el resultado de dividor dos numeros doubles
     */
    public Double dividir(Double value1, Double value2) {
        return value1 / value2;
    }

}
