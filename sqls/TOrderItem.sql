-- auto Generated on 2021-04-02
-- DROP TABLE IF EXISTS t_order_item;
CREATE TABLE t_order_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	order_id BIGINT (15) DEFAULT -1 COMMENT '订单ID',
	order_no VARCHAR (50) DEFAULT '' COMMENT '订单号',
	customer_id BIGINT (15) DEFAULT -1 COMMENT '客户ID',
	order_type INT (11) DEFAULT -1 COMMENT '订单类型',
	fee_item_id BIGINT (15) DEFAULT -1 COMMENT '收费项目ID',
	num INT (11) DEFAULT -1 COMMENT '都买数量
     * 默认为1',
	price DECIMAL (13,4) DEFAULT -1 COMMENT '原价',
	dis_price DECIMAL (13,4) DEFAULT -1 COMMENT '优惠价',
	total_price DECIMAL (13,4) DEFAULT -1 COMMENT '总价',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_order_item';
