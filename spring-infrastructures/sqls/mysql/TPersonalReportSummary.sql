-- auto Generated on 2021-04-29
-- DROP TABLE IF EXISTS t_personal_report_summary;
CREATE TABLE t_personal_report_summary(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	patient_id BIGINT (15) DEFAULT -1 COMMENT 'patientId',
	conclusion VARCHAR (50) DEFAULT '' COMMENT 'conclusion',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_personal_report_summary';
