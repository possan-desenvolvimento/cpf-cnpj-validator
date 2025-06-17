package com.leonardo.validator;

public class ValidatorApp {
    public static void main(String[] args) {
        String cpf = "12345678909";
        String cnpj = "11222333000181";

        System.out.println("CPF " + cpf + " é válido? " + CpfValidator.isValid(cpf));
        System.out.println("CNPJ " + cnpj + " é válido? " + CnpjValidator.isValid(cnpj));
    }
}
