package org.example.spring.daos.mysql.patient.builder;

import org.example.spring.daos.mysql.patient.entity.Patient;
import org.example.spring.daos.mysql.patient.entity.PatientQuery;
import org.example.spring.daos.mysql.patient.table.po.TPatient;
import org.example.spring.daos.mysql.patient.table.query.TPatientQuery;
import org.example.spring.plugins.commons.builder.BaseBuilder;
import org.example.spring.plugins.commons.entity.IPageData;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.stream.Stream;

@Mapper(config = BaseBuilder.class)
public interface PatientClientBuilder {
    TPatient build(Patient patient);

    void copy(Patient patient, @MappingTarget TPatient tPatient);

    Patient build(TPatient patient);


    TPatientQuery build(PatientQuery query);

    List<Patient> buildList(List<TPatient> patient);

    Stream<Patient> build(Stream<TPatient> queryListStream);

    IPageData<Patient> buildPage(IPageData<TPatient> stream);
}
