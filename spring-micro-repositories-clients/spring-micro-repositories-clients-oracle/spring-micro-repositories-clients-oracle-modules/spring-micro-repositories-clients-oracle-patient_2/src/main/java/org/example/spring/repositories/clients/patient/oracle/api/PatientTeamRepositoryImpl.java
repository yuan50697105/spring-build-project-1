package org.example.spring.repositories.clients.patient.oracle.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientTeamRepository;
import org.example.spring.repositories.clients.patient.oracle.converter.PatientTeamRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamVo;
import org.example.spring.repositories.oracle.patient.repository.TPatientTeamRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientTeamRepositoryImpl implements PatientTeamRepository {
    private final PatientTeamRepositoryConverter converter;
    private final TPatientTeamRepository repository;

    public PatientTeamRepositoryImpl(PatientTeamRepositoryConverter converter, TPatientTeamRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientTeamVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientTeamVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientTeamVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientTeamVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientTeamVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamVo vo, PatientTeamQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientTeamVo vo, PatientTeamQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientTeamVo> vo) {
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
    public PatientTeamDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientTeamDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientTeamDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientTeamDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientTeamDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientTeamDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientTeamDTO one(PatientTeamQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamDTO> oneOpt(PatientTeamQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientTeamDTO first(PatientTeamQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamDTO> firstOpt(PatientTeamQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientTeamDTO> list(PatientTeamQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamDTO> listStream(PatientTeamQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientTeamDTO> top(PatientTeamQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamDTO> topStream(PatientTeamQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientTeamDTO> data(PatientTeamQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}