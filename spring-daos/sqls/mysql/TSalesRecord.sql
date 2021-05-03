-- auto Generated on 2021-05-03
-- DROP TABLE IF EXISTS t_sales_record;
CREATE TABLE t_sales_record(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	seller_id BIGINT (15) DEFAULT -1 COMMENT '销售员Id',
	seller_code VARCHAR (50) DEFAULT '' COMMENT '销售员编号',
	customer_id BIGINT (15) DEFAULT -1 COMMENT '客户ID',
	customer_code VARCHAR (50) DEFAULT '' COMMENT '客户编号',
	customer_name VARCHAR (50) DEFAULT '' COMMENT '客户姓名',
	amount DECIMAL (13,4) DEFAULT -1 COMMENT '金额',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '销售记录';
