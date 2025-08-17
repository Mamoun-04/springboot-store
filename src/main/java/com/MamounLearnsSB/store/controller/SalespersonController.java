package com.MamounLearnsSB.store.controller;

import com.MamounLearnsSB.store.model.Salesperson;
import com.MamounLearnsSB.store.service.SalespersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salespeople")
public class SalespersonController {
    private final SalespersonService salespersonService;

    public SalespersonController(SalespersonService salespersonService) {
        this.salespersonService = salespersonService;
    }

    @PostMapping
    public Salesperson addSalesperson(@RequestBody Salesperson sp) { return salespersonService.addSalesperson(sp); }

    @GetMapping
    public List<Salesperson> getAllSalespeople() { return salespersonService.getAllSalespeople(); }
}
