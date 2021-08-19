package com.github.travelervihaan.hogwarts.users.domain;

public enum UserStatus {
    UNCONFIRMED("Unconfirmed"), ACTIVE("Active"), WARNED("Warned"), MUTED("Muted"), TEMP_BANNED("Temporary banned"), PERM_BANNED("Permamently banned"), REJECTED("Rejected");

    private String status;

    UserStatus(String status){
        this.status = status;
    }

    String getStatus(){
        return status;
    }
}
