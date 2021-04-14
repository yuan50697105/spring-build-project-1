-- auto Generated on 2021-04-14
DROP TABLE IF EXISTS t_check_item;
CREATE TABLE t_check_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	fee_item_id BIGINT (15) DEFAULT -1 COMMENT 'feeItemId',
	code VARCHAR (50) DEFAULT '' COMMENT 'code',
	`name` VARCHAR (50) DEFAULT '' COMMENT 'name',
	lowest_value DECIMAL (13,4) DEFAULT -1 COMMENT 'lowestValue',
	highest_value DECIMAL (13,4) DEFAULT -1 COMMENT 'highestValue',
	yin_yang VARCHAR (50) DEFAULT '' COMMENT 'yinYang',
	lis_code VARCHAR (50) DEFAULT '' COMMENT 'lisCode',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_check_item';
