package com.meupet.model;

public class Cachorro extends Animal {
    private String data_last_banho;
    private String data_last_tosa;
    private String data_ultimo_passeio;

//construtor
public Cachorro(int id, String nome, int idade, Sexo sexo, float peso, String raca, boolean sujo, boolean castrado,
                    String data_last_banho, String data_last_tosa, String data_ultimo_passeio) {
    super(id, nome, idade, sexo, peso, raca, sujo, castrado);
    this.data_last_banho = data_last_banho;
    this.data_last_tosa = data_last_tosa;
    this.data_ultimo_passeio = data_ultimo_passeio;
}
//getters
public String getData_last_banho() {
    return data_last_banho;
} 
public String getData_last_tosa() {
    return data_last_tosa;
} 
public String getData_ultimo_passeio() {
    return data_ultimo_passeio;
} 

//setters
public void setData_last_banho(String data_last_banho) {
    this.data_last_banho = data_last_banho;
}
public void setData_last_tosa(String data_last_tosa) {
    this.data_last_tosa = data_last_tosa;
}   
public void setData_ultimo_passeio(String data_ultimo_passeio) {
    this.data_ultimo_passeio = data_ultimo_passeio;
}

}