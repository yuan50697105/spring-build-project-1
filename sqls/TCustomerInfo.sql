-- auto Generated on 2021-04-07
DROP TABLE IF EXISTS t_customer_info;
CREATE TABLE t_customer_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	code VARCHAR (50) DEFAULT '' COMMENT '编号',
	`name` VARCHAR (50) DEFAULT '' COMMENT '名称',
	`type` VARCHAR (50) DEFAULT '' COMMENT '类型',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_customer_info';
