-- auto Generated on 2021-04-14
-- DROP TABLE IF EXISTS t_patient_team_meal_check_item;
CREATE TABLE t_patient_team_meal_check_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	team_id BIGINT (15) DEFAULT -1 COMMENT 'patientId',
	fee_item_id BIGINT (15) DEFAULT -1 COMMENT 'feeItemId',
	check_item_id VARCHAR (50) DEFAULT '' COMMENT 'checkItemId',
	check_item_code VARCHAR (50) DEFAULT '' COMMENT 'checkItemCode',
	check_item_name VARCHAR (50) DEFAULT '' COMMENT 'checkItemName',
	meal_id BIGINT (15) DEFAULT -1 COMMENT 'mealId',
	`source` VARCHAR (50) DEFAULT '' COMMENT 'source',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_patient_team_meal_check_item';
