package com.example.cinemax.dto.requestDTO;


import lombok.*;

//@AllArgsConstructor
//@NoArgsConstructor
@Setter
@Getter
@ToString
public class CustomerSaveRequestDTO {
   // private long customerId;

    private String customerName;

    private String email;

    private String password;

    private int mobileNumber;

  //  private boolean activeStatus;


    public CustomerSaveRequestDTO() {
    }

    public CustomerSaveRequestDTO(String customerName, String email, String password, int mobileNumber) {
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
