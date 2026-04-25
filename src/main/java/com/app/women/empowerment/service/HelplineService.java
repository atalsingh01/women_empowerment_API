package com.app.women.empowerment.service;

import com.app.women.empowerment.models.Helpline;
import com.app.women.empowerment.repository.HelplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HelplineService {

    @Autowired
    private HelplineRepository helplineRepository;

    public List<Helpline> getAllHelplines() {
        return helplineRepository.findAll();
    }
}