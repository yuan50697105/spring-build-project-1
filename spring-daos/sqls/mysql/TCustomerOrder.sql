-- auto Generated on 2021-05-04
-- DROP TABLE IF EXISTS t_customer_order;
CREATE TABLE t_customer_order(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	order_no VARCHAR (50) DEFAULT '' COMMENT 'orderNo',
	customer_id VARCHAR (50) DEFAULT '' COMMENT 'customerId',
	customer_code VARCHAR (50) DEFAULT '' COMMENT 'customerCode',
	customer_name VARCHAR (50) DEFAULT '' COMMENT 'customerName',
	total_amount DECIMAL (13,4) DEFAULT -1 COMMENT 'totalAmount',
	`status` VARCHAR (50) DEFAULT '' COMMENT 'status',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_customer_order';
