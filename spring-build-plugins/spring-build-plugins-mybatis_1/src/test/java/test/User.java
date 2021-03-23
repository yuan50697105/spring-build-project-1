package test;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.plugins.mybatis.entity.po.IBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class User extends IBaseEntity {
}