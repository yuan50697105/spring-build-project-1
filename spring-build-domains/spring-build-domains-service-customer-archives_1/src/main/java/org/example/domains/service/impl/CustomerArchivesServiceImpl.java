package org.example.domains.service.impl;

import lombok.AllArgsConstructor;
import org.example.domains.service.CustomerArchivesService;
import org.example.modules.repository.mysql.repository.CustomerHealthArchivesRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CustomerArchivesServiceImpl implements CustomerArchivesService {
    private final CustomerHealthArchivesRepository healthArchivesRepository;
}