package org.example.spring.applications.web.patient.conntroller;


import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.patient.service.PatientService;
import org.example.spring.models.mysql.patient.entity.query.PatientQuery;
import org.example.spring.models.mysql.patient.entity.result.Patient;
import org.example.spring.models.mysql.patient.entity.result.PatientDetails;
import org.example.spring.models.mysql.patient.entity.vo.PatientFormVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("patient")
@AllArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public Result<List<Patient>> selectPage(PatientQuery query) {
        IPageData<Patient> data = patientService.selectPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<Patient>> selectList(PatientQuery query) {
        List<Patient> list = patientService.selectList(query);
        return R.success((long) list.size(), list);
    }

    @GetMapping("list/{size}")
    public Result<List<Patient>> selectList(PatientQuery query, @PathVariable int size) {
        return selectList((PatientQuery) query.withSize(size));
    }

    @GetMapping("one")
    public Result<Patient> seletOne(PatientQuery query) {
        Patient patient = patientService.selectOne(query);
        return R.success((long) (patient == null ? 0L : 1L), patient);
    }

    @GetMapping("{id}")
    public Result<PatientDetails> get(@PathVariable Long id) {
        PatientDetails details = patientService.get(id);
        return R.success(1L, details);
    }

    @PostMapping
    public Result<?> save(@RequestBody PatientFormVo formVo) {
        patientService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody PatientFormVo formVo) {
        patientService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody PatientFormVo formVo, @PathVariable Long id) {
        patientService.update((PatientFormVo) formVo.withId(id));
        return R.success();
    }

    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        patientService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Result<?> delete1(List<Long> ids) {
        patientService.delete(ids);
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> delete2(@RequestBody List<Long> ids) {
        patientService.delete(ids);
        return R.success();
    }
}