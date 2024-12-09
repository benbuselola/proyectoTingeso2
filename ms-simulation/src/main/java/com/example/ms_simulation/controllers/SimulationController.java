package com.example.ms_simulation.controllers;

import com.example.ms_simulation.services.SimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/v1/credit")
public class SimulationController {
    @Autowired SimulationService SimulationService;

    @GetMapping("/simulate")
    public ResponseEntity<?> simulateCredit(@RequestParam double amount,
                                            @RequestParam int years,
                                            @RequestParam double interestRate,
                                            @RequestParam String type) {
        try {
            double monthlyPayment = SimulationService.calculateCredit(amount, years, interestRate, type);
            return ResponseEntity.ok(monthlyPayment);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno del servidor");
        }
    }
}

