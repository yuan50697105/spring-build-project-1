-- auto Generated on 2021-03-23
-- DROP TABLE IF EXISTS t_user_role;
CREATE TABLE t_user_role(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	version INT (11) DEFAULT -1 COMMENT 'version',
	is_delete INT (11) DEFAULT -1 COMMENT 'isDelete',
	user_id BIGINT (15) DEFAULT -1 COMMENT 'userId',
	role_id BIGINT (15) DEFAULT -1 COMMENT 'roleId',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_user_role';
