-- auto Generated on 2021-05-04
-- DROP TABLE IF EXISTS t_potential_customers;
CREATE TABLE t_potential_customers(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	code VARCHAR (50) DEFAULT '' COMMENT 'code',
	`name` VARCHAR (50) DEFAULT '' COMMENT 'name',
	phone VARCHAR (50) DEFAULT '' COMMENT 'phone',
	`level` VARCHAR (50) DEFAULT '' COMMENT 'level',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_potential_customers';