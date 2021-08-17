package com.github.travelervihaan.hogwarts.users.domain;

public enum UserStatus {
    UNCONFIRMED("Unconfirmed"), ACTIVE("Active"), MUTED("Muted"), BANNED("Banned");

    private String status;

    UserStatus(String status){
        this.status = status;
    }

    String getStatus(){
        return status;
    }
}
