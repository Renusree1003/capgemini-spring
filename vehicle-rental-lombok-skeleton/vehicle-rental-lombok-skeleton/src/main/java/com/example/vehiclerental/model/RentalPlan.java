
package com.example.vehiclerental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalPlan {
    private String planId;
    private String planName;
    private String vehicleType;
    private int minMileage;
    private int rentalDurationDays;
    private double dailyRate;
    private String rentalCategory;
    private boolean insuranceIncluded;
}
