package com.project.entity;


public class Client {
    private int id;
    private String name;
    private String surname;
    private int bankAccount;
    private String typeOfCard;

    public Client() {
    }
    public Client(String name, String surname, int bankAccount, String typeOfCard) {
        this.name = name;
        this.surname = surname;
        this.bankAccount = bankAccount;
        this.typeOfCard = typeOfCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bankAccount=" + bankAccount +
                ", typeOfCard='" + typeOfCard + '\'' +
                '}';
    }
}
