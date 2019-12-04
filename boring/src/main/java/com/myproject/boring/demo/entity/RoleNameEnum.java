package com.myproject.boring.demo.entity;

public enum RoleNameEnum {

    USER("ROLE_USER"),
    USER_ORGANIZER("ROLE_USER_ORGANIZER"),
    ORGANIZER_PRO("ROLE_ORGANIZER_PRO");


    private String value;

    RoleNameEnum(String value){

        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
