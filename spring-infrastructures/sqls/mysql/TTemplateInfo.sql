-- auto Generated on 2021-04-29
-- DROP TABLE IF EXISTS t_template_info;
CREATE TABLE t_template_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	`type` VARCHAR (50) DEFAULT '' COMMENT 'type',
	code BIGINT (15) DEFAULT -1 COMMENT 'code',
	`name` VARCHAR (50) DEFAULT '' COMMENT 'name',
	bucket_name VARCHAR (50) DEFAULT '' COMMENT 'bucketName',
	file_name VARCHAR (50) DEFAULT '' COMMENT 'fileName',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_template_info';
