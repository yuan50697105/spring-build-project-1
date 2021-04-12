-- auto Generated on 2021-04-12
DROP TABLE IF EXISTS t_patient;
CREATE TABLE t_patient(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	team_id BIGINT (15) DEFAULT -1 COMMENT 'groupId',
	team_code VARCHAR (50) DEFAULT '' COMMENT 'groupCode',
	team_name VARCHAR (50) DEFAULT '' COMMENT 'groupName',
	group_id BIGINT (15) DEFAULT -1 COMMENT 'groupItemId',
	group_code VARCHAR (50) DEFAULT '' COMMENT 'groupItemCode',
	group_name VARCHAR (50) DEFAULT '' COMMENT 'groupItemName',
	`type` VARCHAR (50) DEFAULT '' COMMENT 'type',
	code VARCHAR (50) DEFAULT '' COMMENT 'code',
	customer_id BIGINT (15) DEFAULT -1 COMMENT 'customerId',
	customer_type VARCHAR (50) DEFAULT '' COMMENT 'customerType',
	customer_name VARCHAR (50) DEFAULT '' COMMENT 'customerName',
	age INT (11) DEFAULT -1 COMMENT 'age',
	sex VARCHAR (50) DEFAULT '' COMMENT 'sex',
	marriage VARCHAR (50) DEFAULT '' COMMENT 'marriage',
	bear VARCHAR (50) DEFAULT '' COMMENT 'bear',
	phone VARCHAR (50) DEFAULT '' COMMENT 'phone',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_patient';
