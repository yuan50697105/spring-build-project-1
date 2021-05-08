package org.example.spring.applications.web.patient.conntroller.conntroller;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.example.spring.domains.postgresql.patient.service.PatientGroupService;
import org.example.spring.models.postgresql.patient.entity.query.PatientGroupQuery;
import org.example.spring.models.postgresql.patient.entity.result.PatientGroup;
import org.example.spring.models.postgresql.patient.entity.result.PatientGroupDetails;
import org.example.spring.models.postgresql.patient.entity.vo.PatientGroupFormVo;
import org.example.spring.plugins.commons.entity.IPageData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("patient/group")
@AllArgsConstructor
public class PatientGroupController {
    private final PatientGroupService patientGroupService;

    @GetMapping
    public Result<List<PatientGroup>> selectPage(PatientGroupQuery query) {
        IPageData<PatientGroup> data = patientGroupService.selectPage(query);
        return R.success(data.getTotalRowNum(), data.getData());
    }

    @GetMapping("list")
    public Result<List<PatientGroup>> selectList(PatientGroupQuery query) {
        return R.success(patientGroupService.selectList(query));
    }

    @GetMapping("list/{size}")
    public Result<List<PatientGroup>> selectList(PatientGroupQuery query, @PathVariable int size) {
        return R.success(patientGroupService.selectList((PatientGroupQuery) query.withSize(size)));
    }

    @GetMapping("one")
    public Result<PatientGroup> selectOne(PatientGroupQuery query) {
        return R.success(patientGroupService.selectOne(query));
    }

    @PostMapping
    public Result<?> save(@RequestBody PatientGroupFormVo formVo) {
        patientGroupService.save(formVo);
        return R.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody PatientGroupFormVo formVo) {
        patientGroupService.update(formVo);
        return R.success();
    }

    @PutMapping("{id}")
    public Result<?> update(@RequestBody PatientGroupFormVo formVo, @PathVariable Long id) {
        patientGroupService.update((PatientGroupFormVo) formVo.withId(id));
        return R.success();
    }

    @GetMapping("{id}")
    public Result<PatientGroupDetails> get(@PathVariable Long id) {
        return R.success(patientGroupService.getById(id));
    }


    @DeleteMapping("{id}")
    public Result<?> delete(@PathVariable Long id) {
        patientGroupService.delete(Collections.singletonList(id));
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Result<?> delete1(List<Long> ids) {
        patientGroupService.delete(ids);
        return R.success();
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<?> delete2(@RequestBody List<Long> ids) {
        patientGroupService.delete(ids);
        return R.success();
    }
}