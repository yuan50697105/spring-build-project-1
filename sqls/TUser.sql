-- auto Generated on 2021-04-06
DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	username VARCHAR (50) DEFAULT '' COMMENT '用户名',
	`name` VARCHAR (50) DEFAULT '' COMMENT '姓名',
	`password` VARCHAR (50) DEFAULT '' COMMENT '密码',
	`status` VARCHAR (50) DEFAULT '' COMMENT '状态',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_user';
