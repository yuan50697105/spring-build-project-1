package org.example.spring.repositories.clients.patient.postgres.api;


import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientCheckItemRepository;
import org.example.spring.repositories.clients.patient.postgres.converter.PatientCheckItemRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientCheckItemVo;
import org.example.spring.repositories.patient.postgres.repository.TPatientCheckItemRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientCheckItemRepositoryImpl implements PatientCheckItemRepository {
    private final PatientCheckItemRepositoryConverter converter;
    private final TPatientCheckItemRepository repository;

    public PatientCheckItemRepositoryImpl(PatientCheckItemRepositoryConverter converter, TPatientCheckItemRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientCheckItemVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientCheckItemVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientCheckItemVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientCheckItemVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientCheckItemVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientCheckItemVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientCheckItemVo vo, PatientCheckItemQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientCheckItemVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientCheckItemVo vo, PatientCheckItemQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientCheckItemVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientCheckItemVo> vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public void delete(Long... ids) {
        repository.delete(ids);
    }

    @Override
    public void delete(List<Long> ids) {
        repository.delete(ids);
    }

    @Override
    public PatientCheckItemDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientCheckItemDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientCheckItemDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientCheckItemDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientCheckItemDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientCheckItemDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientCheckItemDTO one(PatientCheckItemQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientCheckItemDTO> oneOpt(PatientCheckItemQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientCheckItemDTO first(PatientCheckItemQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientCheckItemDTO> firstOpt(PatientCheckItemQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientCheckItemDTO> list(PatientCheckItemQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientCheckItemDTO> listStream(PatientCheckItemQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientCheckItemDTO> top(PatientCheckItemQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientCheckItemDTO> topStream(PatientCheckItemQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientCheckItemDTO> data(PatientCheckItemQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}