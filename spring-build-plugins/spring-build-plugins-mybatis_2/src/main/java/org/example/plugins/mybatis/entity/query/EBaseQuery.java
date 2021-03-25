package org.example.plugins.mybatis.entity.query;

import cn.hutool.core.util.ObjectUtil;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.commons.entity.BaseEntity;
import org.example.plugins.mybatis.entity.OrderTypeEnum;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class EBaseQuery<E> extends IBaseQuery implements MybatisExample<E>{
}