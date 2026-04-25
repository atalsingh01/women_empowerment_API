package com.app.women.empowerment.controller;

import com.app.women.empowerment.models.LegalInfo;
import com.app.women.empowerment.service.LegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController
@RequestMapping("/api/legal")
@CrossOrigin(origins = "*")
public class LegalController {

    @Autowired
    private LegalService legalService;

    @GetMapping
    public List<LegalInfo> getAllLegalInfo() {
        return legalService.getAllLegalInfo();
    }

    @GetMapping("/{id}")
    public LegalInfo getLegalInfoById(@PathVariable Long id) {
        return legalService.getLegalInfoById(id);
    }
}