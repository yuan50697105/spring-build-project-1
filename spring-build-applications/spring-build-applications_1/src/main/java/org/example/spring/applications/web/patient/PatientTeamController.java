package org.example.spring.applications.web.patient;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.patient.service.PatientTeamService;
import org.example.spring.models.patient.entity.query.PatientTeamQuery;
import org.example.spring.models.patient.entity.result.PatientTeam;
import org.example.spring.models.patient.entity.vo.PatientTeamFormVo;
import org.example.spring.plugins.mybatis.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("patient/team")
@AllArgsConstructor
public class PatientTeamController {
    private final PatientTeamService patientTeamService;

    @GetMapping
    public Result<List<PatientTeam>> selectPage(PatientTeamQuery query) {
        IPageData<PatientTeam> data = patientTeamService.selectPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<PatientTeam>> selectList(PatientTeamQuery query) {
        List<PatientTeam> data = patientTeamService.selectList(query);
        return R.success((long) data.size(), data);
    }

    @GetMapping("list/{size}")
    public Result<List<PatientTeam>> selectList(PatientTeamQuery query, @PathVariable int size) {
        List<PatientTeam> data = patientTeamService.selectList((PatientTeamQuery) query.withSize(size));
        return R.success((long) data.size(), data);
    }

    @PostMapping
    public Result<?> save(@RequestBody PatientTeamFormVo formVo) {
        patientTeamService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody PatientTeamFormVo formVo) {
        patientTeamService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody PatientTeamFormVo formVo, @PathVariable Long id) {
        patientTeamService.update(formVo);
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Result<?> delete1(List<Long> ids) {
        patientTeamService.delete(ids);
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> delete2(@RequestBody List<Long> ids) {
        patientTeamService.delete(ids);
        return R.success();
    }

    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        patientTeamService.delete(Collections.singletonList(id));
        return R.success();
    }


}