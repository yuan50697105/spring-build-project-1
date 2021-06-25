package org.example.spring.repositories.clients.patient.mysql.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealFeeItemRepository;
import org.example.spring.repositories.clients.patient.mysql.converter.PatientTeamMealFeeItemRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealFeeItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealFeeItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealFeeItemVo;
import org.example.spring.repositories.patient.mysql.repository.TPatientTeamMealFeeItemRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientTeamMealFeeItemRepositoryImpl implements PatientTeamMealFeeItemRepository {
    private final PatientTeamMealFeeItemRepositoryConverter converter;
    private final TPatientTeamMealFeeItemRepository repository;

    public PatientTeamMealFeeItemRepositoryImpl(PatientTeamMealFeeItemRepositoryConverter converter, TPatientTeamMealFeeItemRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientTeamMealFeeItemVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientTeamMealFeeItemVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientTeamMealFeeItemVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealFeeItemVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealFeeItemVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientTeamMealFeeItemVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealFeeItemVo vo, PatientTeamMealFeeItemQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamMealFeeItemVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientTeamMealFeeItemVo vo, PatientTeamMealFeeItemQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamMealFeeItemVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientTeamMealFeeItemVo> vo) {
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
    public PatientTeamMealFeeItemDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientTeamMealFeeItemDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientTeamMealFeeItemDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientTeamMealFeeItemDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientTeamMealFeeItemDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientTeamMealFeeItemDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientTeamMealFeeItemDTO one(PatientTeamMealFeeItemQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamMealFeeItemDTO> oneOpt(PatientTeamMealFeeItemQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientTeamMealFeeItemDTO first(PatientTeamMealFeeItemQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamMealFeeItemDTO> firstOpt(PatientTeamMealFeeItemQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientTeamMealFeeItemDTO> list(PatientTeamMealFeeItemQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamMealFeeItemDTO> listStream(PatientTeamMealFeeItemQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientTeamMealFeeItemDTO> top(PatientTeamMealFeeItemQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamMealFeeItemDTO> topStream(PatientTeamMealFeeItemQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientTeamMealFeeItemDTO> data(PatientTeamMealFeeItemQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}