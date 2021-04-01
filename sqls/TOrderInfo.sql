-- auto Generated on 2021-04-01
-- DROP TABLE IF EXISTS t_order_info;
CREATE TABLE t_order_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	order_no VARCHAR (50) DEFAULT '' COMMENT 'orderNo',
	customer_id VARCHAR (50) DEFAULT '' COMMENT 'customerId',
	customer_name VARCHAR (50) DEFAULT '' COMMENT 'customerName',
	total_price DECIMAL (13,4) DEFAULT -1 COMMENT 'totalPrice',
	`type` INT (11) DEFAULT -1 COMMENT 'type',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_order_info';
