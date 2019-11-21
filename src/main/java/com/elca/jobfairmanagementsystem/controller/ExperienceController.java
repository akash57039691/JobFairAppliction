package com.elca.jobfairmanagementsystem.controller;

import com.elca.jobfairmanagementsystem.dto.ExperienceDto;
import com.elca.jobfairmanagementsystem.exception.ExperienceNotFoundException;
import com.elca.jobfairmanagementsystem.service.ExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 10000)
@RequestMapping("/experiences")
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ExperienceDto>> getAllExperiences() throws ExperienceNotFoundException {
        return new ResponseEntity<>(experienceService.searchAllExperience(), HttpStatus.FOUND);
    }

    @GetMapping("/{experienceId}")
    public ResponseEntity<ExperienceDto> searchExperienceById(@PathVariable Long experienceId) throws ExperienceNotFoundException{
        return new ResponseEntity<>(experienceService.findByExperienceId(experienceId),HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<Void> saveExperience(@RequestBody ExperienceDto experienceDto){
        experienceService.saveExperience(experienceDto);
        return new ResponseEntity<>(null , HttpStatus.CREATED);
    }

    @PutMapping("/{experienceId}")
    public ResponseEntity<Void> updateExperience(@RequestBody ExperienceDto experienceDto) throws ExperienceNotFoundException {
        experienceService.updateExperience(experienceDto);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @DeleteMapping("/{experienceId}")
    public ResponseEntity<Void> deleteExperience(@PathVariable Long experienceId){
        experienceService.deleteExperience(experienceId);
        return new ResponseEntity<>(null,HttpStatus.ACCEPTED);
    }
}
