package org.example.spring.domains.customer.service.impl;

import lombok.AllArgsConstructor;
import org.example.spring.domains.customer.service.CustomerInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CustomerInfoServiceImpl implements CustomerInfoService {
}