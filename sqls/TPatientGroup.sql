-- auto Generated on 2021-04-11
DROP TABLE IF EXISTS t_patient_group;
CREATE TABLE t_patient_group(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	customer_id BIGINT (15) DEFAULT -1 COMMENT 'customerId',
	code VARCHAR (50) DEFAULT '' COMMENT 'code',
	`name` VARCHAR (50) DEFAULT '' COMMENT 'name',
	age_start INT (11) DEFAULT -1 COMMENT 'ageStart',
	age_end INT (11) DEFAULT -1 COMMENT 'ageEnd',
	sex VARCHAR (50) DEFAULT '' COMMENT 'sex',
	marriage VARCHAR (50) DEFAULT '' COMMENT 'marriage',
	bear VARCHAR (50) DEFAULT '' COMMENT 'bear',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_patient_group';
