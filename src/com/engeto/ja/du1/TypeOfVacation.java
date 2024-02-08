package com.engeto.ja.du1;

public class TypeOfVacation {
    private String typeOfVacation;

    @Override
    public String toString() {
        return "TypeOfVacation{" +
                "typeOfVacation='" + typeOfVacation + '\'' +
                '}';
    }

    public TypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
}
