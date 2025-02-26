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
public class UpdateExpenseRequest {
    
    private int id;
    private LocalDateTime date;
    private String description;
    private Double amount;
    private byte[] picture;
    
    public UpdateExpenseRequest(){
        
    }

    public UpdateExpenseRequest(
            int id,
            LocalDateTime date, 
            String description, 
            Double amount, 
            byte[] picture
    ) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.picture = picture;

    }
    
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
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
