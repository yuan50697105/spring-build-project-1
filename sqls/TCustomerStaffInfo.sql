-- auto Generated on 2021-03-28
-- DROP TABLE IF EXISTS t_customer_staff_info;
CREATE TABLE t_customer_staff_info
(
    id            BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    create_id     BIGINT(15)  NOT NULL DEFAULT -1 COMMENT 'createId',
    update_id     BIGINT(15)  NOT NULL DEFAULT -1 COMMENT 'updateId',
    create_user   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'createUser',
    update_user   VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'updateUser',
    create_date   DATETIME    NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
    update_date   DATETIME    NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
    customer_id   BIGINT(15)  NOT NULL DEFAULT -1 COMMENT '客户信息Id',
    customer_code VARCHAR(50) NOT NULL DEFAULT '' COMMENT '客户信息Code',
    staff_name    VARCHAR(50) NOT NULL DEFAULT '' COMMENT '人员姓名',
    id_card_no    VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'idCardNo',
    phone         VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'phone',
    age           INT(11)     NOT NULL DEFAULT -1 COMMENT 'age',
    sex           INT(11)     NOT NULL DEFAULT -1 COMMENT 'sex',
    marriage      INT(11)     NOT NULL DEFAULT -1 COMMENT 'marriage',
    bear          INT(11)     NOT NULL DEFAULT -1 COMMENT '生育',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 't_customer_staff_info';
