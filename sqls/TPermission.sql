-- auto Generated on 2021-04-09
DROP TABLE IF EXISTS t_permission;
CREATE TABLE t_permission(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	`name` VARCHAR (50) DEFAULT '' COMMENT 'name',
	`type` VARCHAR (50) DEFAULT '' COMMENT 'type',
	url VARCHAR (50) DEFAULT '' COMMENT 'url',
	pid BIGINT (15) DEFAULT -1 COMMENT 'pid',
	weight INT (11) DEFAULT -1 COMMENT 'weight',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_permission';
