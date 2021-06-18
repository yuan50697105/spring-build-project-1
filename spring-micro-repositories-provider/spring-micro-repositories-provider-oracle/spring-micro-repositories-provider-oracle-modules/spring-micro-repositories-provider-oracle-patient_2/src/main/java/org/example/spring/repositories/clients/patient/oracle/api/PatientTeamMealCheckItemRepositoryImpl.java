package org.example.spring.repositories.clients.patient.oracle.api;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientTeamMealCheckItemRepository;
import org.example.spring.repositories.clients.patient.oracle.converter.PatientTeamMealCheckItemRepositoryConverter;
import org.example.spring.repositories.commons.entity.patient.dto.PatientTeamMealCheckItemDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientTeamMealCheckItemQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientTeamMealCheckItemVo;
import org.example.spring.repositories.oracle.patient.repository.TPatientTeamMealCheckItemRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientTeamMealCheckItemRepositoryImpl implements PatientTeamMealCheckItemRepository {
    private final PatientTeamMealCheckItemRepositoryConverter converter;
    private final TPatientTeamMealCheckItemRepository repository;

    public PatientTeamMealCheckItemRepositoryImpl(PatientTeamMealCheckItemRepositoryConverter converter, TPatientTeamMealCheckItemRepository repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public void save(PatientTeamMealCheckItemVo vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(PatientTeamMealCheckItemVo... vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void save(List<PatientTeamMealCheckItemVo> vo) {
        repository.save(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealCheckItemVo vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealCheckItemVo... vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(List<PatientTeamMealCheckItemVo> vo) {
        repository.update(converter.build(vo));
    }

    @Override
    public void update(PatientTeamMealCheckItemVo vo, PatientTeamMealCheckItemQuery patientQuery) {
        repository.update(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamMealCheckItemVo vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(PatientTeamMealCheckItemVo vo, PatientTeamMealCheckItemQuery patientQuery) {
        repository.updateNull(converter.build(vo), converter.build(patientQuery));
    }

    @Override
    public void updateNull(PatientTeamMealCheckItemVo... vo) {
        repository.updateNull(converter.build(vo));
    }

    @Override
    public void updateNull(List<PatientTeamMealCheckItemVo> vo) {
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
    public PatientTeamMealCheckItemDTO get(Long id) {
        return converter.buildDTO(repository.get(id));
    }

    @Override
    public Optional<PatientTeamMealCheckItemDTO> getOpt(Long id) {
        return Optional.ofNullable(get(id));
    }

    @Override
    public List<PatientTeamMealCheckItemDTO> listByIds(Long... ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public List<PatientTeamMealCheckItemDTO> listByIds(List<Long> ids) {
        return converter.buildDTO(repository.listByIds(ids));
    }

    @Override
    public Stream<PatientTeamMealCheckItemDTO> streamByIds(Long... ids) {
        return listByIds(ids).stream();
    }

    @Override
    public Stream<PatientTeamMealCheckItemDTO> streamByIds(List<Long> ids) {
        return listByIds(ids).stream();
    }

    @Override
    public PatientTeamMealCheckItemDTO one(PatientTeamMealCheckItemQuery query) {
        return converter.buildDTO(repository.queryOne(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamMealCheckItemDTO> oneOpt(PatientTeamMealCheckItemQuery query) {
        return Optional.ofNullable(one(query));
    }

    @Override
    public PatientTeamMealCheckItemDTO first(PatientTeamMealCheckItemQuery query) {
        return converter.buildDTO(repository.queryFirst(converter.build(query)));
    }

    @Override
    public Optional<PatientTeamMealCheckItemDTO> firstOpt(PatientTeamMealCheckItemQuery query) {
        return Optional.ofNullable(first(query));
    }

    @Override
    public List<PatientTeamMealCheckItemDTO> list(PatientTeamMealCheckItemQuery query) {
        return converter.buildDTO(repository.queryList(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamMealCheckItemDTO> listStream(PatientTeamMealCheckItemQuery query) {
        return list(query).stream();
    }

    @Override
    public List<PatientTeamMealCheckItemDTO> top(PatientTeamMealCheckItemQuery query) {
        return converter.buildDTO(repository.queryTop(converter.build(query)));
    }

    @Override
    public Stream<PatientTeamMealCheckItemDTO> topStream(PatientTeamMealCheckItemQuery query) {
        return top(query).stream();
    }

    @Override
    public IPageData<PatientTeamMealCheckItemDTO> data(PatientTeamMealCheckItemQuery query) {
        return converter.buildDTO(repository.queryPage(converter.build(query)));
    }
}