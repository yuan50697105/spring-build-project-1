-- auto Generated on 2021-04-14
DROP TABLE IF EXISTS t_patient_meal;
CREATE TABLE t_patient_meal(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	team_id BIGINT (15) DEFAULT -1 COMMENT 'teamId',
	group_id BIGINT (15) DEFAULT -1 COMMENT 'groupId',
	meal_type VARCHAR (50) DEFAULT '' COMMENT 'mealType',
	meal_source VARCHAR (50) DEFAULT '' COMMENT 'mealSource',
	meal_id BIGINT (15) DEFAULT -1 COMMENT 'mealId',
	team_meal_id BIGINT (15) DEFAULT -1 COMMENT 'teamMealId',
	meal_code VARCHAR (50) DEFAULT '' COMMENT 'mealCode',
	meal_name VARCHAR (50) DEFAULT '' COMMENT 'mealName',
	price DECIMAL (13,4) DEFAULT -1 COMMENT 'price',
	dis_price DECIMAL (13,4) DEFAULT -1 COMMENT 'disPrice',
	market_price DECIMAL (13,4) DEFAULT -1 COMMENT 'marketPrice',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_patient_meal';
