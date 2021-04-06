-- auto Generated on 2021-04-04
-- DROP TABLE IF EXISTS t_meal_item;
CREATE TABLE t_meal_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	meal_id BIGINT (15) DEFAULT -1 COMMENT 'mealId',
	meal_code VARCHAR (50) DEFAULT '' COMMENT 'mealCode',
	meal_name VARCHAR (50) DEFAULT '' COMMENT 'mealName',
	item_id VARCHAR (50) DEFAULT '' COMMENT 'itemId',
	item_code VARCHAR (50) DEFAULT '' COMMENT 'itemCode',
	item_name VARCHAR (50) DEFAULT '' COMMENT 'itemName',
	item_desc VARCHAR (50) DEFAULT '' COMMENT 'itemDesc',
	price DECIMAL (13,4) DEFAULT -1 COMMENT 'price',
	dis_price DECIMAL (13,4) DEFAULT -1 COMMENT 'disPrice',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_meal_item';
