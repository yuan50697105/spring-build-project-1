package org.example.spring.repositories.clients.patient.postgres.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientMealRepository;
import org.example.spring.repositories.clients.patient.postgres.converter.PatientMealRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientMealDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientMealVo;
import org.example.spring.repositories.postgres.patient.repository.TPatientMealRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientMealRepositoryImpl implements PatientMealRepository {
    private final PatientMealRepositoryConverter converter;
    private final TPatientMealRepository repository;

    public PatientMealRepositoryImpl(PatientMealRepositoryConverter converter, TPatientMealRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientMealVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientMealVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientMealVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientMealVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientMealVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientMealVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientMealVo vo, PatientMealQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientMealVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientMealVo vo, PatientMealQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientMealVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientMealVo> vo) {
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
    public PatientMealDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientMealDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientMealDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientMealDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientMealDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientMealDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientMealDTO one(PatientMealQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientMealDTO> oneOpt(PatientMealQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientMealDTO first(PatientMealQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientMealDTO> firstOpt(PatientMealQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientMealDTO> list(PatientMealQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientMealDTO> listStream(PatientMealQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientMealDTO> top(PatientMealQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientMealDTO> topStream(PatientMealQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientMealDTO> data(PatientMealQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}