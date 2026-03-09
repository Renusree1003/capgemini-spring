
package com.example.vehiclerental.service.impl;

import com.example.vehiclerental.model.RentalPlan;
import com.example.vehiclerental.service.IRentalPlanService;
import java.util.List;
import java.util.Map;

public class RentalPlanServiceImpl implements IRentalPlanService {

    @Override
    public RentalPlan addRentalPlan(RentalPlan plan) {
        return null;
    }

    @Override
    public RentalPlan viewRentalPlanById(String planId) {
        return null;
    }

    @Override
    public List<RentalPlan> viewPlansByVehicleType(String vehicleType) {
        return null;
    }

    @Override
    public List<RentalPlan> viewPlansByMileageAndDuration(int minMileage, int durationDays) {
        return null;
    }

    @Override
    public Map<String, Long> getPlanCountByCategory() {
        return null;
    }
}
