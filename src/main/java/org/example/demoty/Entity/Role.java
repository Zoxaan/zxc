package org.example.demoty.Entity;

public enum Role {
    ADMINISTRATOR("АДМИН"),
    USER("ПОЛЬЗОВАТЕЛЬ");

    private String name;

    Role(String name){this.name=name;}
}
