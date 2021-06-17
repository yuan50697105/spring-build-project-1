package org.example.spring.repositories.clients.patient.mysql;

import org.example.spring.plugins.commons.entity.IPageData;
import org.example.spring.repositories.clients.patient.api.PatientRepository;
import org.example.spring.repositories.commons.entity.patient.dto.PatientDTO;
import org.example.spring.repositories.commons.entity.patient.query.PatientQuery;
import org.example.spring.repositories.commons.entity.patient.vo.PatientVo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class PatientRepositoryImpl implements PatientRepository {
    @Override
    public void save(PatientVo vo) {

    }

    @Override
    public void save(PatientVo... vo) {

    }

    @Override
    public void save(List<PatientVo> vo) {

    }

    @Override
    public void update(PatientVo vo) {

    }

    @Override
    public void update(PatientVo... vo) {

    }

    @Override
    public void update(List<PatientVo> vo) {

    }

    @Override
    public void update(PatientVo vo, PatientQuery patientQuery) {

    }

    @Override
    public void updateNull(PatientVo vo) {

    }

    @Override
    public void updateNull(PatientVo vo, PatientQuery patientQuery) {

    }

    @Override
    public void updateNull(PatientVo... vo) {

    }

    @Override
    public void updateNull(List<PatientVo> vo) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(Long... ids) {

    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public PatientDTO get(Long id) {
        return null;
    }

    @Override
    public Optional<PatientDTO> getOpt(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PatientDTO> listByIds(Long... ids) {
        return null;
    }

    @Override
    public List<PatientDTO> listByIds(List<Long> ids) {
        return null;
    }

    @Override
    public Stream<PatientDTO> streamByIds(Long... ids) {
        return null;
    }

    @Override
    public Stream<PatientDTO> streamByIds(List<Long> ids) {
        return null;
    }

    @Override
    public PatientDTO one(PatientQuery query) {
        return null;
    }

    @Override
    public Optional<PatientDTO> oneOpt(PatientQuery query) {
        return Optional.empty();
    }

    @Override
    public PatientDTO first(PatientQuery query) {
        return null;
    }

    @Override
    public Optional<PatientDTO> firstOpt(PatientQuery query) {
        return Optional.empty();
    }

    @Override
    public List<PatientDTO> list(PatientQuery query) {
        return null;
    }

    @Override
    public Stream<PatientDTO> listStream(PatientQuery query) {
        return null;
    }

    @Override
    public List<PatientDTO> top(PatientQuery query) {
        return null;
    }

    @Override
    public Stream<PatientDTO> topStream(PatientQuery query) {
        return null;
    }

    @Override
    public IPageData<PatientDTO> data(PatientQuery query) {
        return null;
    }
}