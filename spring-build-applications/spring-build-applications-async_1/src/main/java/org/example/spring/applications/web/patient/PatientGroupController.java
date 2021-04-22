package org.example.spring.applications.web.patient;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.patient.service.PatientGroupService;
import org.example.spring.models.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.patient.entity.result.PatientGroup;
import org.example.spring.models.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("patient/group")
@AllArgsConstructor
public class PatientGroupController {
    private final PatientGroupService patientGroupService;

    @GetMapping
    public WebAsyncTask<Result<List<PatientGroup>>> selectPage(PatientGroupQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<PatientGroup> data = patientGroupService.selectPage(query);
            return R.success(data.getTotalRowNum(), data.getData());
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<PatientGroup>>> selectList(PatientGroupQuery query) {
        return new WebAsyncTask<>(() -> {
            return R.success(patientGroupService.selectList(query));
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<List<PatientGroup>>> selectList(PatientGroupQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            return R.success(patientGroupService.selectList((PatientGroupQuery) query.withSize(size)));
        });
    }

    @GetMapping("one")
    public WebAsyncTask<Result<PatientGroup>> selectOne(PatientGroupQuery query) {
        return new WebAsyncTask<>(() -> {
            return R.success(patientGroupService.selectOne(query));
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody PatientGroupFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            patientGroupService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody PatientGroupFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            patientGroupService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody PatientGroupFormVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            patientGroupService.update((PatientGroupFormVo) formVo.withId(id));
            return R.success();
        });
    }

    @GetMapping("{id}")
    public WebAsyncTask<Result<PatientGroupDetails>> get(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            return R.success(patientGroupService.getById(id));
        });
    }


    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            patientGroupService.delete(Collections.singletonList(id));
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> delete1(List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            patientGroupService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> delete2(@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            patientGroupService.delete(ids);
            return R.success();
        });
    }
}