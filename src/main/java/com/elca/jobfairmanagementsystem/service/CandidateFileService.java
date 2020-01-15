package com.elca.jobfairmanagementsystem.service;

import com.elca.jobfairmanagementsystem.dto.CandidateFileDto;
import com.elca.jobfairmanagementsystem.exception.CandidateNotFoundException;
import com.elca.jobfairmanagementsystem.exception.FileNotFoundException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CandidateFileService {
    void saveCandidateCv(MultipartFile file,Long candidateId) throws IOException;
    CandidateFileDto getCandidateFileById(Long candidateId) throws CandidateNotFoundException;
}
