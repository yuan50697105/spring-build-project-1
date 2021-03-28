-- auto Generated on 2021-03-28
-- DROP TABLE IF EXISTS t_customer_health_archives;
CREATE TABLE t_customer_health_archives(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	customer_id BIGINT (15) DEFAULT -1 COMMENT 'customerId',
	customer_code VARCHAR (50) DEFAULT '' COMMENT 'customerCode',
	customer_name VARCHAR (50) DEFAULT '' COMMENT 'customerName',
	conclusion VARCHAR (50) DEFAULT '' COMMENT '结论',
	emergency VARCHAR (50) DEFAULT '' COMMENT '紧急异常',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_customer_health_archives';
