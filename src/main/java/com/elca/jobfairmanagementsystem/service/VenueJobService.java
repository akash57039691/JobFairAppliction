package com.elca.jobfairmanagementsystem.service;

import com.elca.jobfairmanagementsystem.dto.VenueJobDto;
import com.elca.jobfairmanagementsystem.entity.VenueJob;
import com.elca.jobfairmanagementsystem.exception.VenueJobNotFoundException;

import java.util.List;

public interface VenueJobService {
    void saveVenueJob(VenueJobDto venueDto);

    VenueJobDto findVenueJobById(Long venueJobId) throws VenueJobNotFoundException;

    List<VenueJobDto> findAllVenueJobs() throws VenueJobNotFoundException;

    void updateVenueJob(VenueJobDto venueJobDto) throws VenueJobNotFoundException;

    void deleteVenueJob(Long venueJobId) throws VenueJobNotFoundException;

    List<VenueJobDto> findByVenueId(long venueId) throws VenueJobNotFoundException;
}