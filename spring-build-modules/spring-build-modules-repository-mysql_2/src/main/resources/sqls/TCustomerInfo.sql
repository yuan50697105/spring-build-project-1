-- auto Generated on 2021-03-24
-- DROP TABLE IF EXISTS t_customer_info;
CREATE TABLE t_customer_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	version INT (11) DEFAULT -1 COMMENT 'version',
	is_delete INT (11) DEFAULT -1 COMMENT 'isDelete',
	code VARCHAR (50) DEFAULT '' COMMENT '客户编号',
	`type` VARCHAR (50) DEFAULT '' COMMENT '客户类型',
	`name` VARCHAR (50) DEFAULT '' COMMENT '客户名称',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_customer_info';
