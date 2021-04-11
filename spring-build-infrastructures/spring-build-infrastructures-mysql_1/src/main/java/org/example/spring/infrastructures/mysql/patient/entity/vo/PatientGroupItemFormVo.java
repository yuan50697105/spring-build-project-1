package org.example.spring.infrastructures.mysql.patient.entity.vo;

import cn.hutool.core.util.EnumUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.example.spring.plugins.commons.entity.vo.IBaseVo;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PatientGroupItemFormVo extends IBaseVo {
    private Operating operating;
    private PatientGroupItemVo item;
    private List<PatientVo> patients;

    public PatientGroupItemFormVo withOperating(String name) {
        this.setOperating(Operating.get(name));
        return this;
    }

    @Getter
    @AllArgsConstructor
    public enum Operating {
        ADD("", "0"),
        ADD_ITEM("item", "1"),
        ADD_PATIENT("patient", "2"),
        ;
        private String name;
        private String value;

        public static Operating get(String value) {
            return EnumUtil.likeValueOf(Operating.class, value);
        }
    }
}