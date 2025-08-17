package com.MamounLearnsSB.store.service;

import com.MamounLearnsSB.store.model.Salesperson;
import com.MamounLearnsSB.store.repository.SalespersonRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalespersonService {
    private final SalespersonRepository salespersonRepository;

    public SalespersonService(SalespersonRepository salespersonRepository) {
        this.salespersonRepository = salespersonRepository;
    }

    public Salesperson addSalesperson(Salesperson sp) { return salespersonRepository.save(sp); }
    public List<Salesperson> getAllSalespeople() { return salespersonRepository.findAll(); }
}
