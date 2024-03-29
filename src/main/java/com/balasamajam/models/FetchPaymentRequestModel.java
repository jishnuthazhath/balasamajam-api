package com.balasamajam.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class FetchPaymentRequestModel
{
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate date;

    private String memberId;

    private String collectedById;

    private String adminId;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getCollectedById() {
        return collectedById;
    }

    public void setCollectedById(String collectedById) {
        this.collectedById = collectedById;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
}
