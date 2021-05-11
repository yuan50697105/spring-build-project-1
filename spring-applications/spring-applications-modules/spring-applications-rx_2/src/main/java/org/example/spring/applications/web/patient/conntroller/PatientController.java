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
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("patient")
@AllArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public WebAsyncTask<Result<List<Patient>>> selectPage(PatientQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<Patient> data = patientService.selectPage(query);
            return R.success(data.getTotalRowNum(), data.getData());
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<Patient>>> selectList(PatientQuery query) {
        return new WebAsyncTask<>(() -> {
            List<Patient> list = patientService.selectList(query);
            return R.success((long) list.size(), list);
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<WebAsyncTask<Result<List<Patient>>>>> selectList(PatientQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            return R.success(selectList((PatientQuery) query.withSize(size)));
        });
    }

    @GetMapping("one")
    public WebAsyncTask<Result<Patient>> selectOne(PatientQuery query) {
        return new WebAsyncTask<>(() -> {
            Patient patient = patientService.selectOne(query);
            return R.success(patient == null ? 0L : 1L, patient);
        });
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<PatientDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            PatientDetails details = patientService.get(id);
            return R.success(1L, details);
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody PatientFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            patientService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody PatientFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            patientService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody PatientFormVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            patientService.update((PatientFormVo) formVo.withId(id));
            return R.success();
        });
    }

    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            patientService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> delete1(List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            patientService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> delete2(@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            patientService.delete(ids);
            return R.success();
        });
    }
}