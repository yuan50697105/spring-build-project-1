package org.example.spring.repositories.clients.patient.postgres.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientFeeItemRepository;
import org.example.spring.repositories.clients.patient.postgres.converter.PatientFeeItemRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientFeeItemVo;
import org.example.spring.repositories.postgres.patient.repository.TPatientFeeItemRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientFeeItemRepositoryImpl implements PatientFeeItemRepository {
    private final PatientFeeItemRepositoryConverter converter;
    private final TPatientFeeItemRepository repository;

    public PatientFeeItemRepositoryImpl(PatientFeeItemRepositoryConverter converter, TPatientFeeItemRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientFeeItemVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientFeeItemVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientFeeItemVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientFeeItemVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientFeeItemVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientFeeItemVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientFeeItemVo vo, PatientFeeItemQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientFeeItemVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientFeeItemVo vo, PatientFeeItemQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientFeeItemVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientFeeItemVo> vo) {
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
    public PatientFeeItemDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientFeeItemDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientFeeItemDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientFeeItemDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientFeeItemDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientFeeItemDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientFeeItemDTO one(PatientFeeItemQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientFeeItemDTO> oneOpt(PatientFeeItemQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientFeeItemDTO first(PatientFeeItemQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientFeeItemDTO> firstOpt(PatientFeeItemQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientFeeItemDTO> list(PatientFeeItemQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientFeeItemDTO> listStream(PatientFeeItemQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientFeeItemDTO> top(PatientFeeItemQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientFeeItemDTO> topStream(PatientFeeItemQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientFeeItemDTO> data(PatientFeeItemQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}