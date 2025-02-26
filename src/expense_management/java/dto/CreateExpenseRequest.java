/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expense_management.java.dto;

import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public class CreateExpenseRequest {

    private LocalDateTime date;
    private String description;
    private Double amount;
    private byte[] picture;
    
    public CreateExpenseRequest(){
        
    }

    public CreateExpenseRequest(
            LocalDateTime date, String description, Double amount, byte[] picture
    ) {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.picture = picture;

    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public byte[] getPicture() {
        return picture;
    }

}
