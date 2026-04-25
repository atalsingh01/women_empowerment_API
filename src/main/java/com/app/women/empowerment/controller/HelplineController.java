package com.app.women.empowerment.controller;

import com.app.women.empowerment.models.Helpline;
import com.app.women.empowerment.service.HelplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController
@RequestMapping("/api/helplines")
@CrossOrigin(origins = "*")
public class HelplineController {

    @Autowired
    private HelplineService helplineService;

    @GetMapping
    public List<Helpline> getAllHelplines() {
        return helplineService.getAllHelplines();
    }
}