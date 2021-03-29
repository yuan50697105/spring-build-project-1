-- auto Generated on 2021-03-26
-- DROP TABLE IF EXISTS t_customer_contract;
CREATE TABLE t_customer_contract
(
    id            BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    create_id     BIGINT(15)  DEFAULT -1 COMMENT 'createId',
    update_id     BIGINT(15)  DEFAULT -1 COMMENT 'updateId',
    create_user   VARCHAR(50) DEFAULT '' COMMENT 'createUser',
    update_user   VARCHAR(50) DEFAULT '' COMMENT 'updateUser',
    create_date   DATETIME    DEFAULT '1000-01-01 00:00:00' COMMENT 'createDate',
    update_date   DATETIME    DEFAULT '1000-01-01 00:00:00' COMMENT 'updateDate',
    version       INT(11)     DEFAULT -1 COMMENT 'version',
    is_delete     INT(11)     DEFAULT -1 COMMENT 'isDelete',
    customer_id   BIGINT(15)  DEFAULT -1 COMMENT 'customerId',
    customer_code VARCHAR(50) DEFAULT '' COMMENT 'customerCode',
    contract_name VARCHAR(50) DEFAULT '' COMMENT 'contractName',
    contract_path VARCHAR(50) DEFAULT '' COMMENT 'contractPath',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 't_customer_contract';
