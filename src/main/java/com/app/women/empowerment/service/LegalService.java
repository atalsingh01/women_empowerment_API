package com.app.women.empowerment.service;


import com.app.women.empowerment.models.LegalInfo;
import com.app.women.empowerment.repository.LegalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LegalService {

    @Autowired
    private LegalInfoRepository legalInfoRepository;

    public List<LegalInfo> getAllLegalInfo() {
        return legalInfoRepository.findAll();
    }

    public LegalInfo getLegalInfoById(Long id) {
        return legalInfoRepository.findById(id).orElse(null);
    }
}