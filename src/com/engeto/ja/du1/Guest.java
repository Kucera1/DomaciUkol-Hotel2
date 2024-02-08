package com.engeto.ja.du1;

import java.time.LocalDate;

public class Guest {
    private String nameAndSurname;
    private LocalDate birthDate;

    @Override
    public String toString() {
        return "Guest{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public Guest(String nameAndSurname, LocalDate birthDate) {
        this.nameAndSurname = nameAndSurname;
        this.birthDate = birthDate;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
