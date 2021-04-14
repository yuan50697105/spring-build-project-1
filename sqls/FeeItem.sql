-- auto Generated on 2021-04-14
DROP TABLE IF EXISTS fee_item;
CREATE TABLE fee_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_id BIGINT (15) DEFAULT -1 COMMENT 'createId',
	update_id BIGINT (15) DEFAULT -1 COMMENT 'updateId',
	create_user VARCHAR (50) DEFAULT '' COMMENT 'createUser',
	update_user VARCHAR (50) DEFAULT '' COMMENT 'updateUser',
	create_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
	update_date DATETIME DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
	code VARCHAR (50) DEFAULT '' COMMENT '项目编号',
	`name` VARCHAR (50) DEFAULT '' COMMENT '项目名称',
	price DECIMAL (13,4) DEFAULT -1 COMMENT '价格',
	dis_price DECIMAL (13,4) DEFAULT -1 COMMENT '优惠价',
	market_price DECIMAL (13,4) DEFAULT -1 COMMENT '市价',
	`type` VARCHAR (50) DEFAULT '' COMMENT '类型',
	sex VARCHAR (50) DEFAULT '' COMMENT '性别',
	age_start INT (11) DEFAULT -1 COMMENT '年龄',
	age_end INT (11) DEFAULT -1 COMMENT '年龄',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'fee_item';
