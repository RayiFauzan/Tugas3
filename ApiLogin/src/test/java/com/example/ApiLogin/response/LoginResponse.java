package com.example.ApiLogin.response;

public class LoginResponse {
    String messege;
    Boolean status;

    public LoginResponse(String messege, Boolean status) {
        this.messege = messege;
        this.status = status;
    }


    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "messege='" + messege + '\'' +
                ", status=" + status +
                '}';
    }
}
