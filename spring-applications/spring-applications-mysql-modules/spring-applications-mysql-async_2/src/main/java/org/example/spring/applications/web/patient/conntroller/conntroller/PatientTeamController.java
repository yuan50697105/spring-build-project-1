package org.example.spring.applications.web.patient.conntroller.conntroller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.mysql.patient.service.PatientTeamService;
import org.example.spring.models.mysql.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.mysql.patient.entity.result.PatientTeam;
import org.example.spring.models.mysql.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("patient/team")
@AllArgsConstructor
public class PatientTeamController {
    private final PatientTeamService patientTeamService;

    @GetMapping
    public WebAsyncTask<Result<List<PatientTeam>>> selectPage(PatientTeamQuery query) {
        return new WebAsyncTask<>(() -> {
            IPageData<PatientTeam> data = patientTeamService.selectPage(query);
            return R.success(data.getTotalRowNum(), data.getData());
        });
    }

    @GetMapping("list")
    public WebAsyncTask<Result<List<PatientTeam>>> selectList(PatientTeamQuery query) {
        return new WebAsyncTask<>(() -> {
            List<PatientTeam> data = patientTeamService.selectList(query);
            return R.success((long) data.size(), data);
        });
    }

    @GetMapping("list/{size}")
    public WebAsyncTask<Result<List<PatientTeam>>> selectList(PatientTeamQuery query, @PathVariable int size) {
        return new WebAsyncTask<>(() -> {
            List<PatientTeam> data = patientTeamService.selectList((PatientTeamQuery) query.withSize(size));
            return R.success((long) data.size(), data);
        });
    }

    @PostMapping
    public WebAsyncTask<Result<?>> save(@RequestBody PatientTeamFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            patientTeamService.save(formVo);
            return R.success();
        });
    }

    @PutMapping
    public WebAsyncTask<Result<?>> update(@RequestBody PatientTeamFormVo formVo) {
        return new WebAsyncTask<>(() -> {
            patientTeamService.update(formVo);
            return R.success();
        });
    }

    @PutMapping("{id}")
    public WebAsyncTask<Result<?>> update(@RequestBody PatientTeamFormVo formVo, @PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            patientTeamService.update(formVo);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public WebAsyncTask<Result<?>> delete1(List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            patientTeamService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebAsyncTask<Result<?>> delete2(@RequestBody List<Long> ids) {
        return new WebAsyncTask<>(() -> {
            patientTeamService.delete(ids);
            return R.success();
        });
    }

    @DeleteMapping("{id}")
    public WebAsyncTask<Result<?>> delete(@PathVariable Long id) {
        return new WebAsyncTask<>(() -> {
            patientTeamService.delete(Collections.singletonList(id));
            return R.success();
        });
    }


}