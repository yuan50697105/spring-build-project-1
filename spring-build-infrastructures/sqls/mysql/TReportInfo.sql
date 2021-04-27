-- auto Generated on 2021-04-27
-- DROP TABLE IF EXISTS t_report_info;
CREATE TABLE t_report_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	code VARCHAR (50) NOT NULL DEFAULT '' COMMENT '报告编号',
	patient_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '体检ID',
	patient_code VARCHAR (50) NOT NULL DEFAULT '' COMMENT '体检号',
	`name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '人员姓名',
	bucket_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '对象名称',
	file_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '文件名称',
	versions INT (11) NOT NULL DEFAULT -1 COMMENT 'versions',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_report_info';
