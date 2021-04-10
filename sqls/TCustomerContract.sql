-- auto Generated on 2021-04-10
DROP TABLE IF EXISTS t_customer_contract;
CREATE TABLE t_customer_contract(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	code VARCHAR (50) DEFAULT '' COMMENT '合同编号',
	`name` VARCHAR (50) DEFAULT '' COMMENT '客户名称',
	customer_id BIGINT (15) DEFAULT -1 COMMENT '客户ID',
	signing_time DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT '签约时间',
	`status` VARCHAR (50) DEFAULT '' COMMENT '合同状态',
	file_name VARCHAR (50) DEFAULT '' COMMENT 'fileName',
	bukect_name VARCHAR (50) DEFAULT '' COMMENT 'bukectName',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_customer_contract';
