package org.example.spring.repositories.clients.patient.oracle.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientRepository;
import org.example.spring.repositories.clients.patient.oracle.converter.PatientRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;
import org.example.spring.repositories.oracle.patient.repository.TPatientRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientRepositoryImpl implements PatientRepository {
    private final PatientRepositoryConverter converter;
    private final TPatientRepository repository;

    public PatientRepositoryImpl(PatientRepositoryConverter converter, TPatientRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientVo vo, PatientQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientVo vo, PatientQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientVo> vo) {
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
    public PatientDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientDTO one(PatientQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientDTO> oneOpt(PatientQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientDTO first(PatientQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientDTO> firstOpt(PatientQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientDTO> list(PatientQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientDTO> listStream(PatientQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientDTO> top(PatientQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientDTO> topStream(PatientQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientDTO> data(PatientQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}