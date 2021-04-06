-- auto Generated on 2021-04-04
-- DROP TABLE IF EXISTS t_customer_group_item;
CREATE TABLE t_customer_group_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	meal_id BIGINT (15) DEFAULT -1 COMMENT 'mealId',
	num INT (11) DEFAULT -1 COMMENT 'num',
	meal_code VARCHAR (50) DEFAULT '' COMMENT '套餐编号',
	meal_name VARCHAR (50) DEFAULT '' COMMENT '套餐名称',
	applicability_sex VARCHAR (50) DEFAULT '' COMMENT '适用性 性别',
	applicable_marriage VARCHAR (50) DEFAULT '' COMMENT '适用性 婚否',
	applicable_fertility VARCHAR (50) DEFAULT '' COMMENT '适用性 生育',
	applicable_age_start INT (11) DEFAULT -1 COMMENT '适用性 年龄 开始',
	applicable_age_end INT (11) DEFAULT -1 COMMENT '适用性 年龄 结束',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_customer_group_item';
