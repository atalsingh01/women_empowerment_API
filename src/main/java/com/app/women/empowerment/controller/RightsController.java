package com.app.women.empowerment.controller;

import com.app.women.empowerment.models.Rights;
import com.app.women.empowerment.service.RightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController
@RequestMapping("/api/rights")
@CrossOrigin(origins = "*")
public class RightsController {

    @Autowired
    private RightsService rightsService;

    // GET all constitutional rights
    @GetMapping
    public List<Rights> getAllRights() {
        return rightsService.getAllRights();
    }

    // GET single right by ID
    @GetMapping("/{id}")
    public Rights getRightsById(@PathVariable Long id) {
        return rightsService.getRightsById(id);
    }
}