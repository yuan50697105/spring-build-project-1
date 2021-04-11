-- auto Generated on 2021-04-11
-- DROP TABLE IF EXISTS t_patient_group_item;
CREATE TABLE t_patient_group_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	group_id BIGINT (15) DEFAULT -1 COMMENT 'groupId',
	person_num INT (11) DEFAULT -1 COMMENT 'personNum',
	meal_id BIGINT (15) DEFAULT -1 COMMENT 'mealId',
	meal_name VARCHAR (50) DEFAULT '' COMMENT 'mealName',
	meal_price DECIMAL (13,4) DEFAULT -1 COMMENT 'mealPrice',
	meal_dis_price DECIMAL (13,4) DEFAULT -1 COMMENT 'mealDisPrice',
	max_dis_price DECIMAL (13,4) DEFAULT -1 COMMENT 'maxDisPrice',
	max_discount DECIMAL (13,4) DEFAULT -1 COMMENT 'maxDiscount',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_patient_group_item';
