package org.example.spring.repositories.clients.patient.oracle.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealRepository;
import org.example.spring.repositories.clients.patient.oracle.converter.PatientTeamMealRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealVo;
import org.example.spring.repositories.patient.oracle.repository.TPatientTeamMealRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientTeamMealRepositoryImpl implements PatientTeamMealRepository {
    private final PatientTeamMealRepositoryConverter converter;
    private final TPatientTeamMealRepository repository;

    public PatientTeamMealRepositoryImpl(PatientTeamMealRepositoryConverter converter, TPatientTeamMealRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientTeamMealVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientTeamMealVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientTeamMealVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientTeamMealVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealVo vo, PatientTeamMealQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamMealVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientTeamMealVo vo, PatientTeamMealQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamMealVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientTeamMealVo> vo) {
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
    public PatientTeamMealDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientTeamMealDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientTeamMealDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientTeamMealDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientTeamMealDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientTeamMealDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientTeamMealDTO one(PatientTeamMealQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamMealDTO> oneOpt(PatientTeamMealQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientTeamMealDTO first(PatientTeamMealQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamMealDTO> firstOpt(PatientTeamMealQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientTeamMealDTO> list(PatientTeamMealQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamMealDTO> listStream(PatientTeamMealQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientTeamMealDTO> top(PatientTeamMealQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamMealDTO> topStream(PatientTeamMealQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientTeamMealDTO> data(PatientTeamMealQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}