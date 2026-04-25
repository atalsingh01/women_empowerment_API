package com.app.women.empowerment.service;

import com.app.women.empowerment.models.Rights;
import com.app.women.empowerment.repository.RightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RightsService {

    @Autowired
    private RightsRepository rightsRepository;

    public List<Rights> getAllRights() {
        return rightsRepository.findAll();
    }

    public Rights getRightsById(Long id) {
        return rightsRepository.findById(id).orElse(null);
    }
}