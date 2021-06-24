/*
 Navicat Premium Data Transfer

 Source Server         : 8.140.177.12
 Source Server Type    : PostgreSQL
 Source Server Version : 130002
 Source Host           : 8.140.177.12:5432
 Source Catalog        : spring_demo
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 130002
 File Encoding         : 65001

 Date: 24/05/2021 11:19:54
*/


-- ----------------------------
-- Table structure for t_bill_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_bill_info";
CREATE TABLE "public"."t_bill_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"        varchar(50) COLLATE "pg_catalog"."default",
    "update_user"        varchar(50) COLLATE "pg_catalog"."default",
    "create_date"        timestamp(6),
    "update_date"        timestamp(6),
    "order_no"           varchar(50) COLLATE "pg_catalog"."default",
    "patient_code"       varchar(50) COLLATE "pg_catalog"."default",
    "patient_id"         varchar(50) COLLATE "pg_catalog"."default",
    "patient_name"       varchar(50) COLLATE "pg_catalog"."default",
    "patient_id_card_no" varchar(50) COLLATE "pg_catalog"."default",
    "total_price"        numeric(13, 4)
)
;
COMMENT ON COLUMN "public"."t_bill_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_bill_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_bill_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_bill_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_bill_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_bill_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_bill_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_bill_info"."order_no" IS '订单号';
COMMENT ON COLUMN "public"."t_bill_info"."patient_code" IS '体检号';
COMMENT ON COLUMN "public"."t_bill_info"."patient_id" IS '体检人ID';
COMMENT ON COLUMN "public"."t_bill_info"."patient_name" IS '体检人姓名';
COMMENT ON COLUMN "public"."t_bill_info"."patient_id_card_no" IS '体检人身份证号';
COMMENT ON COLUMN "public"."t_bill_info"."total_price" IS '总价';
COMMENT ON TABLE "public"."t_bill_info" IS 't_bill_info';

-- ----------------------------
-- Table structure for t_bill_items_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_bill_items_info";
CREATE TABLE "public"."t_bill_items_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "bill_id"      varchar(50) COLLATE "pg_catalog"."default",
    "order_no"     varchar(50) COLLATE "pg_catalog"."default",
    "sub_bill_id" int8,
    "sub_order_no" varchar(50) COLLATE "pg_catalog"."default",
    "item_id" int8,
    "item_name"    varchar(50) COLLATE "pg_catalog"."default",
    "item_price"   numeric(13, 4),
    "num"          numeric(13, 4),
    "total_price"  numeric(13, 4)
)
;
COMMENT ON COLUMN "public"."t_bill_items_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_bill_items_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_bill_items_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_bill_items_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_bill_items_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_bill_items_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_bill_items_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_bill_items_info"."bill_id" IS 'billId';
COMMENT ON COLUMN "public"."t_bill_items_info"."order_no" IS 'orderNo';
COMMENT ON COLUMN "public"."t_bill_items_info"."sub_bill_id" IS 'subBillId';
COMMENT ON COLUMN "public"."t_bill_items_info"."sub_order_no" IS 'subOrderNo';
COMMENT ON COLUMN "public"."t_bill_items_info"."item_id" IS 'itemId';
COMMENT ON COLUMN "public"."t_bill_items_info"."item_name" IS 'itemName';
COMMENT ON COLUMN "public"."t_bill_items_info"."item_price" IS 'itemPrice';
COMMENT ON COLUMN "public"."t_bill_items_info"."num" IS 'num';
COMMENT ON COLUMN "public"."t_bill_items_info"."total_price" IS 'totalPrice';
COMMENT ON TABLE "public"."t_bill_items_info" IS 't_bill_items_info';

-- ----------------------------
-- Table structure for t_bill_log
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_bill_log";
CREATE TABLE "public"."t_bill_log"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"          varchar(50) COLLATE "pg_catalog"."default",
    "update_user"          varchar(50) COLLATE "pg_catalog"."default",
    "create_date"          timestamp(6),
    "update_date"          timestamp(6),
    "order_no"             varchar(50) COLLATE "pg_catalog"."default",
    "patient_code"         varchar(50) COLLATE "pg_catalog"."default",
    "patient_id"           varchar(50) COLLATE "pg_catalog"."default",
    "current_total_price"  numeric(13, 4),
    "previous_total_price" numeric(13, 4),
    "previous_id" int8,
    "type"                 varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_bill_log"."id" IS 'id';
COMMENT ON COLUMN "public"."t_bill_log"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_bill_log"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_bill_log"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_bill_log"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_bill_log"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_bill_log"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_bill_log"."order_no" IS '订单号';
COMMENT ON COLUMN "public"."t_bill_log"."patient_code" IS '体检号';
COMMENT ON COLUMN "public"."t_bill_log"."patient_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_bill_log"."current_total_price" IS '当前价格';
COMMENT ON COLUMN "public"."t_bill_log"."previous_total_price" IS '之前价格';
COMMENT ON COLUMN "public"."t_bill_log"."previous_id" IS '之前Id';
COMMENT ON COLUMN "public"."t_bill_log"."type" IS '类型
     *
     * @see  BillLogType';
COMMENT ON TABLE "public"."t_bill_log" IS 't_bill_log';

-- ----------------------------
-- Table structure for t_bill_sub_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_bill_sub_info";
CREATE TABLE "public"."t_bill_sub_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "sub_order_no" varchar(50) COLLATE "pg_catalog"."default",
    "bill_id"      varchar(50) COLLATE "pg_catalog"."default",
    "order_no"     varchar(50) COLLATE "pg_catalog"."default",
    "total_price"  numeric(13, 4),
    "status"       varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_bill_sub_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_bill_sub_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_bill_sub_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_bill_sub_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_bill_sub_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_bill_sub_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_bill_sub_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_bill_sub_info"."sub_order_no" IS '子单单号';
COMMENT ON COLUMN "public"."t_bill_sub_info"."bill_id" IS '总单ID';
COMMENT ON COLUMN "public"."t_bill_sub_info"."order_no" IS '总单单号';
COMMENT ON COLUMN "public"."t_bill_sub_info"."total_price" IS '总价';
COMMENT ON COLUMN "public"."t_bill_sub_info"."status" IS '状态
     * @see BillSubInfoStatus';
COMMENT ON TABLE "public"."t_bill_sub_info" IS 't_bill_sub_info';

-- ----------------------------
-- Table structure for t_check_department
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_check_department";
CREATE TABLE "public"."t_check_department"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "code"        varchar(50) COLLATE "pg_catalog"."default",
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "type"        varchar(50) COLLATE "pg_catalog"."default",
    "location"    varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_check_department"."id" IS 'id';
COMMENT ON COLUMN "public"."t_check_department"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_check_department"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_check_department"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_check_department"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_check_department"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_check_department"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_check_department"."code" IS 'code';
COMMENT ON COLUMN "public"."t_check_department"."name" IS 'name';
COMMENT ON COLUMN "public"."t_check_department"."type" IS 'type';
COMMENT ON COLUMN "public"."t_check_department"."location" IS 'location';
COMMENT ON TABLE "public"."t_check_department" IS 't_check_department';

-- ----------------------------
-- Table structure for t_check_department_items
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_check_department_items";
CREATE TABLE "public"."t_check_department_items"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "code"          varchar(50) COLLATE "pg_catalog"."default",
    "name"          varchar(50) COLLATE "pg_catalog"."default",
    "check_item_id" varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_check_department_items"."id" IS 'id';
COMMENT ON COLUMN "public"."t_check_department_items"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_check_department_items"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_check_department_items"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_check_department_items"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_check_department_items"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_check_department_items"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_check_department_items"."code" IS 'code';
COMMENT ON COLUMN "public"."t_check_department_items"."name" IS 'name';
COMMENT ON COLUMN "public"."t_check_department_items"."check_item_id" IS 'checkItemId';
COMMENT ON TABLE "public"."t_check_department_items" IS 't_check_department_items';

-- ----------------------------
-- Table structure for t_check_item
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_check_item";
CREATE TABLE "public"."t_check_item"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "fee_item_id" int8,
    "code"          varchar(50) COLLATE "pg_catalog"."default",
    "name"          varchar(50) COLLATE "pg_catalog"."default",
    "lowest_value"  numeric(13, 4),
    "highest_value" numeric(13, 4),
    "yin_yang"      varchar(50) COLLATE "pg_catalog"."default",
    "lis_code"      varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_check_item"."id" IS 'id';
COMMENT ON COLUMN "public"."t_check_item"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_check_item"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_check_item"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_check_item"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_check_item"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_check_item"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_check_item"."fee_item_id" IS 'feeItemId';
COMMENT ON COLUMN "public"."t_check_item"."code" IS 'code';
COMMENT ON COLUMN "public"."t_check_item"."name" IS 'name';
COMMENT ON COLUMN "public"."t_check_item"."lowest_value" IS 'lowestValue';
COMMENT ON COLUMN "public"."t_check_item"."highest_value" IS 'highestValue';
COMMENT ON COLUMN "public"."t_check_item"."yin_yang" IS 'yinYang';
COMMENT ON COLUMN "public"."t_check_item"."lis_code" IS 'lisCode';
COMMENT ON TABLE "public"."t_check_item" IS 't_check_item';

-- ----------------------------
-- Table structure for t_customer_contract
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_customer_contract";
CREATE TABLE "public"."t_customer_contract"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "code"         varchar(50) COLLATE "pg_catalog"."default",
    "name"         varchar(50) COLLATE "pg_catalog"."default",
    "customer_id" int8,
    "signing_time" timestamp(6),
    "status"       varchar(50) COLLATE "pg_catalog"."default",
    "file_name"    varchar(50) COLLATE "pg_catalog"."default",
    "bukect_name"  varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_customer_contract"."id" IS 'id';
COMMENT ON COLUMN "public"."t_customer_contract"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_customer_contract"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_customer_contract"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_customer_contract"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_customer_contract"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_customer_contract"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_customer_contract"."code" IS '合同编号';
COMMENT ON COLUMN "public"."t_customer_contract"."name" IS '客户名称';
COMMENT ON COLUMN "public"."t_customer_contract"."customer_id" IS '客户ID';
COMMENT ON COLUMN "public"."t_customer_contract"."signing_time" IS '签约时间';
COMMENT ON COLUMN "public"."t_customer_contract"."status" IS '合同状态';
COMMENT ON COLUMN "public"."t_customer_contract"."file_name" IS 'fileName';
COMMENT ON COLUMN "public"."t_customer_contract"."bukect_name" IS 'bukectName';
COMMENT ON TABLE "public"."t_customer_contract" IS 't_customer_contract';

-- ----------------------------
-- Table structure for t_customer_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_customer_info";
CREATE TABLE "public"."t_customer_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "code"        varchar(50) COLLATE "pg_catalog"."default",
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "type"        varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_customer_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_customer_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_customer_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_customer_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_customer_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_customer_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_customer_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_customer_info"."code" IS '编号';
COMMENT ON COLUMN "public"."t_customer_info"."name" IS '名称';
COMMENT ON COLUMN "public"."t_customer_info"."type" IS '类型';
COMMENT ON TABLE "public"."t_customer_info" IS 't_customer_info';

-- ----------------------------
-- Table structure for t_customer_order
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_customer_order";
CREATE TABLE "public"."t_customer_order"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "order_no"      varchar(50) COLLATE "pg_catalog"."default",
    "customer_id"   varchar(50) COLLATE "pg_catalog"."default",
    "customer_code" varchar(50) COLLATE "pg_catalog"."default",
    "customer_name" varchar(50) COLLATE "pg_catalog"."default",
    "total_amount"  numeric(13, 4),
    "status"        varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_customer_order"."id" IS 'id';
COMMENT ON COLUMN "public"."t_customer_order"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_customer_order"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_customer_order"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_customer_order"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_customer_order"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_customer_order"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_customer_order"."order_no" IS 'orderNo';
COMMENT ON COLUMN "public"."t_customer_order"."customer_id" IS 'customerId';
COMMENT ON COLUMN "public"."t_customer_order"."customer_code" IS 'customerCode';
COMMENT ON COLUMN "public"."t_customer_order"."customer_name" IS 'customerName';
COMMENT ON COLUMN "public"."t_customer_order"."total_amount" IS 'totalAmount';
COMMENT ON COLUMN "public"."t_customer_order"."status" IS 'status';
COMMENT ON TABLE "public"."t_customer_order" IS 't_customer_order';

-- ----------------------------
-- Table structure for t_department
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_department";
CREATE TABLE "public"."t_department"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "code"        varchar(50) COLLATE "pg_catalog"."default",
    "pid" int8
)
;
COMMENT ON COLUMN "public"."t_department"."id" IS 'id';
COMMENT ON COLUMN "public"."t_department"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_department"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_department"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_department"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_department"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_department"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_department"."name" IS 'name';
COMMENT ON COLUMN "public"."t_department"."code" IS 'code';
COMMENT ON COLUMN "public"."t_department"."pid" IS 'pid';
COMMENT ON TABLE "public"."t_department" IS 't_department';

-- ----------------------------
-- Table structure for t_department_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_department_role";
CREATE TABLE "public"."t_department_role"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "department_id" int8,
    "role_id" int8
)
;
COMMENT ON COLUMN "public"."t_department_role"."id" IS 'id';
COMMENT ON COLUMN "public"."t_department_role"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_department_role"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_department_role"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_department_role"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_department_role"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_department_role"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_department_role"."department_id" IS 'departmentId';
COMMENT ON COLUMN "public"."t_department_role"."role_id" IS 'roleId';
COMMENT ON TABLE "public"."t_department_role" IS 't_department_role';

-- ----------------------------
-- Table structure for t_fee_item
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_fee_item";
CREATE TABLE "public"."t_fee_item"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "code"         varchar(50) COLLATE "pg_catalog"."default",
    "name"         varchar(50) COLLATE "pg_catalog"."default",
    "price"        numeric(13, 4),
    "dis_price"    numeric(13, 4),
    "market_price" numeric(13, 4),
    "type"         varchar(50) COLLATE "pg_catalog"."default",
    "sex"          varchar(50) COLLATE "pg_catalog"."default",
    "age_start" int4,
    "age_end" int4
)
;
COMMENT ON COLUMN "public"."t_fee_item"."id" IS 'id';
COMMENT ON COLUMN "public"."t_fee_item"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_fee_item"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_fee_item"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_fee_item"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_fee_item"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_fee_item"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_fee_item"."code" IS '项目编号';
COMMENT ON COLUMN "public"."t_fee_item"."name" IS '项目名称';
COMMENT ON COLUMN "public"."t_fee_item"."price" IS '价格';
COMMENT ON COLUMN "public"."t_fee_item"."dis_price" IS '优惠价';
COMMENT ON COLUMN "public"."t_fee_item"."market_price" IS '市价';
COMMENT ON COLUMN "public"."t_fee_item"."type" IS '类型';
COMMENT ON COLUMN "public"."t_fee_item"."sex" IS '性别';
COMMENT ON COLUMN "public"."t_fee_item"."age_start" IS '年龄';
COMMENT ON COLUMN "public"."t_fee_item"."age_end" IS '年龄';
COMMENT ON TABLE "public"."t_fee_item" IS 't_fee_item';

-- ----------------------------
-- Table structure for t_meal
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_meal";
CREATE TABLE "public"."t_meal"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "code"         varchar(50) COLLATE "pg_catalog"."default",
    "name"         varchar(50) COLLATE "pg_catalog"."default",
    "type"         varchar(50) COLLATE "pg_catalog"."default",
    "price"        numeric(13, 4),
    "dis_price"    numeric(13, 4),
    "market_price" numeric(13, 4)
)
;
COMMENT ON COLUMN "public"."t_meal"."id" IS 'id';
COMMENT ON COLUMN "public"."t_meal"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_meal"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_meal"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_meal"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_meal"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_meal"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_meal"."code" IS 'code';
COMMENT ON COLUMN "public"."t_meal"."name" IS 'name';
COMMENT ON COLUMN "public"."t_meal"."type" IS 'type';
COMMENT ON COLUMN "public"."t_meal"."price" IS 'price';
COMMENT ON COLUMN "public"."t_meal"."dis_price" IS 'disPrice';
COMMENT ON COLUMN "public"."t_meal"."market_price" IS 'marketPrice';
COMMENT ON TABLE "public"."t_meal" IS 't_meal';

-- ----------------------------
-- Table structure for t_meal_fee_item
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_meal_fee_item";
CREATE TABLE "public"."t_meal_fee_item"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "meal_id" int8,
    "fee_item_id" int8
)
;
COMMENT ON COLUMN "public"."t_meal_fee_item"."id" IS 'id';
COMMENT ON COLUMN "public"."t_meal_fee_item"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_meal_fee_item"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_meal_fee_item"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_meal_fee_item"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_meal_fee_item"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_meal_fee_item"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_meal_fee_item"."meal_id" IS 'mealId';
COMMENT ON COLUMN "public"."t_meal_fee_item"."fee_item_id" IS 'feeItemId';
COMMENT ON TABLE "public"."t_meal_fee_item" IS 't_meal_fee_item';

-- ----------------------------
-- Table structure for t_patient
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient";
CREATE TABLE "public"."t_patient"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "team_id" int8,
    "team_code"     varchar(50) COLLATE "pg_catalog"."default",
    "team_name"     varchar(50) COLLATE "pg_catalog"."default",
    "group_id" int8,
    "group_code"    varchar(50) COLLATE "pg_catalog"."default",
    "group_name"    varchar(50) COLLATE "pg_catalog"."default",
    "type"          varchar(50) COLLATE "pg_catalog"."default",
    "code"          varchar(50) COLLATE "pg_catalog"."default",
    "customer_id" int8,
    "customer_type" varchar(50) COLLATE "pg_catalog"."default",
    "customer_name" varchar(50) COLLATE "pg_catalog"."default",
    "age" int4,
    "sex"           varchar(50) COLLATE "pg_catalog"."default",
    "marriage"      varchar(50) COLLATE "pg_catalog"."default",
    "bear"          varchar(50) COLLATE "pg_catalog"."default",
    "phone"         varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_patient"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient"."team_id" IS 'groupId';
COMMENT ON COLUMN "public"."t_patient"."team_code" IS 'groupCode';
COMMENT ON COLUMN "public"."t_patient"."team_name" IS 'groupName';
COMMENT ON COLUMN "public"."t_patient"."group_id" IS 'groupItemId';
COMMENT ON COLUMN "public"."t_patient"."group_code" IS 'groupItemCode';
COMMENT ON COLUMN "public"."t_patient"."group_name" IS 'groupItemName';
COMMENT ON COLUMN "public"."t_patient"."type" IS 'type';
COMMENT ON COLUMN "public"."t_patient"."code" IS 'code';
COMMENT ON COLUMN "public"."t_patient"."customer_id" IS 'customerId';
COMMENT ON COLUMN "public"."t_patient"."customer_type" IS 'customerType';
COMMENT ON COLUMN "public"."t_patient"."customer_name" IS 'customerName';
COMMENT ON COLUMN "public"."t_patient"."age" IS 'age';
COMMENT ON COLUMN "public"."t_patient"."sex" IS 'sex';
COMMENT ON COLUMN "public"."t_patient"."marriage" IS 'marriage';
COMMENT ON COLUMN "public"."t_patient"."bear" IS 'bear';
COMMENT ON COLUMN "public"."t_patient"."phone" IS 'phone';
COMMENT ON TABLE "public"."t_patient" IS 't_patient';

-- ----------------------------
-- Table structure for t_patient_check_item
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_check_item";
CREATE TABLE "public"."t_patient_check_item"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"     varchar(50) COLLATE "pg_catalog"."default",
    "update_user"     varchar(50) COLLATE "pg_catalog"."default",
    "create_date"     timestamp(6),
    "update_date"     timestamp(6),
    "patient_id" int8,
    "fee_item_id" int8,
    "check_item_id"   varchar(50) COLLATE "pg_catalog"."default",
    "check_item_code" varchar(50) COLLATE "pg_catalog"."default",
    "check_item_name" varchar(50) COLLATE "pg_catalog"."default",
    "meal_id" int8,
    "source"          varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_patient_check_item"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_check_item"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_check_item"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_check_item"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_check_item"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_check_item"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_check_item"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_check_item"."patient_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_patient_check_item"."fee_item_id" IS 'feeItemId';
COMMENT ON COLUMN "public"."t_patient_check_item"."check_item_id" IS 'checkItemId';
COMMENT ON COLUMN "public"."t_patient_check_item"."check_item_code" IS 'checkItemCode';
COMMENT ON COLUMN "public"."t_patient_check_item"."check_item_name" IS 'checkItemName';
COMMENT ON COLUMN "public"."t_patient_check_item"."meal_id" IS 'mealId';
COMMENT ON COLUMN "public"."t_patient_check_item"."source" IS 'source';
COMMENT ON TABLE "public"."t_patient_check_item" IS 't_patient_check_item';

-- ----------------------------
-- Table structure for t_patient_fee_item
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_fee_item";
CREATE TABLE "public"."t_patient_fee_item"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "patient_id" int8,
    "fee_item_id" int8,
    "fee_item_code" varchar(50) COLLATE "pg_catalog"."default",
    "fee_item_name" varchar(50) COLLATE "pg_catalog"."default",
    "meal_id" int8,
    "patient_meal_id" int8,
    "price"         numeric(13, 4),
    "dis_price"     numeric(13, 4),
    "market_price"  numeric(13, 4),
    "source"        varchar(50) COLLATE "pg_catalog"."default",
    "type"          varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_patient_fee_item"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_fee_item"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_fee_item"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_fee_item"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_fee_item"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_fee_item"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_fee_item"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_fee_item"."patient_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_patient_fee_item"."fee_item_id" IS 'feeItemId';
COMMENT ON COLUMN "public"."t_patient_fee_item"."fee_item_code" IS 'feeItemCode';
COMMENT ON COLUMN "public"."t_patient_fee_item"."fee_item_name" IS 'feeItemName';
COMMENT ON COLUMN "public"."t_patient_fee_item"."meal_id" IS 'mealId';
COMMENT ON COLUMN "public"."t_patient_fee_item"."patient_meal_id" IS 'patientMealId';
COMMENT ON COLUMN "public"."t_patient_fee_item"."price" IS 'price';
COMMENT ON COLUMN "public"."t_patient_fee_item"."dis_price" IS 'disPrice';
COMMENT ON COLUMN "public"."t_patient_fee_item"."market_price" IS 'marketPrice';
COMMENT ON COLUMN "public"."t_patient_fee_item"."source" IS 'source';
COMMENT ON COLUMN "public"."t_patient_fee_item"."type" IS 'type';
COMMENT ON TABLE "public"."t_patient_fee_item" IS 't_patient_fee_item';

-- ----------------------------
-- Table structure for t_patient_group
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_group";
CREATE TABLE "public"."t_patient_group"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "code"        varchar(50) COLLATE "pg_catalog"."default",
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "customer_id" int8,
    "team_id" int8,
    "team_meal_id" int8,
    "meal_id" int8,
    "meal_name"   varchar(50) COLLATE "pg_catalog"."default",
    "person_num" int4
)
;
COMMENT ON COLUMN "public"."t_patient_group"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_group"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_group"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_group"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_group"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_group"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_group"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_group"."code" IS 'code';
COMMENT ON COLUMN "public"."t_patient_group"."name" IS 'name';
COMMENT ON COLUMN "public"."t_patient_group"."customer_id" IS 'customerId';
COMMENT ON COLUMN "public"."t_patient_group"."team_id" IS 'groupId';
COMMENT ON COLUMN "public"."t_patient_group"."team_meal_id" IS 'teamMealId';
COMMENT ON COLUMN "public"."t_patient_group"."meal_id" IS 'mealId';
COMMENT ON COLUMN "public"."t_patient_group"."meal_name" IS 'mealName';
COMMENT ON COLUMN "public"."t_patient_group"."person_num" IS 'personNum';
COMMENT ON TABLE "public"."t_patient_group" IS 't_patient_group';

-- ----------------------------
-- Table structure for t_patient_meal
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_meal";
CREATE TABLE "public"."t_patient_meal"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "team_id" int8,
    "group_id" int8,
    "meal_type"    varchar(50) COLLATE "pg_catalog"."default",
    "meal_source"  varchar(50) COLLATE "pg_catalog"."default",
    "meal_id" int8,
    "team_meal_id" int8,
    "meal_code"    varchar(50) COLLATE "pg_catalog"."default",
    "meal_name"    varchar(50) COLLATE "pg_catalog"."default",
    "price"        numeric(13, 4),
    "dis_price"    numeric(13, 4),
    "market_price" numeric(13, 4)
)
;
COMMENT ON COLUMN "public"."t_patient_meal"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_meal"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_meal"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_meal"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_meal"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_meal"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_meal"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_meal"."team_id" IS 'teamId';
COMMENT ON COLUMN "public"."t_patient_meal"."group_id" IS 'groupId';
COMMENT ON COLUMN "public"."t_patient_meal"."meal_type" IS 'mealType';
COMMENT ON COLUMN "public"."t_patient_meal"."meal_source" IS 'mealSource';
COMMENT ON COLUMN "public"."t_patient_meal"."meal_id" IS 'mealId';
COMMENT ON COLUMN "public"."t_patient_meal"."team_meal_id" IS 'teamMealId';
COMMENT ON COLUMN "public"."t_patient_meal"."meal_code" IS 'mealCode';
COMMENT ON COLUMN "public"."t_patient_meal"."meal_name" IS 'mealName';
COMMENT ON COLUMN "public"."t_patient_meal"."price" IS 'price';
COMMENT ON COLUMN "public"."t_patient_meal"."dis_price" IS 'disPrice';
COMMENT ON COLUMN "public"."t_patient_meal"."market_price" IS 'marketPrice';
COMMENT ON TABLE "public"."t_patient_meal" IS 't_patient_meal';

-- ----------------------------
-- Table structure for t_patient_team
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_team";
CREATE TABLE "public"."t_patient_team"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "customer_id" int8,
    "code"        varchar(50) COLLATE "pg_catalog"."default",
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "age_start" int4,
    "age_end" int4,
    "sex"         varchar(50) COLLATE "pg_catalog"."default",
    "marriage"    varchar(50) COLLATE "pg_catalog"."default",
    "bear"        varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_patient_team"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_team"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_team"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_team"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_team"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_team"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_team"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_team"."customer_id" IS 'customerId';
COMMENT ON COLUMN "public"."t_patient_team"."code" IS 'code';
COMMENT ON COLUMN "public"."t_patient_team"."name" IS 'name';
COMMENT ON COLUMN "public"."t_patient_team"."age_start" IS 'ageStart';
COMMENT ON COLUMN "public"."t_patient_team"."age_end" IS 'ageEnd';
COMMENT ON COLUMN "public"."t_patient_team"."sex" IS 'sex';
COMMENT ON COLUMN "public"."t_patient_team"."marriage" IS 'marriage';
COMMENT ON COLUMN "public"."t_patient_team"."bear" IS 'bear';
COMMENT ON TABLE "public"."t_patient_team" IS 't_patient_team';

-- ----------------------------
-- Table structure for t_patient_team_meal
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_team_meal";
CREATE TABLE "public"."t_patient_team_meal"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "patient_id" int8,
    "team_id" int8,
    "team_code"    varchar(50) COLLATE "pg_catalog"."default",
    "team_name"    varchar(50) COLLATE "pg_catalog"."default",
    "meal_type"    varchar(50) COLLATE "pg_catalog"."default",
    "meal_id" int8,
    "meal_code"    varchar(50) COLLATE "pg_catalog"."default",
    "meal_name"    varchar(50) COLLATE "pg_catalog"."default",
    "price"        numeric(13, 4),
    "dis_price"    numeric(13, 4),
    "market_price" numeric(13, 4)
)
;
COMMENT ON COLUMN "public"."t_patient_team_meal"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_team_meal"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_team_meal"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_team_meal"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_team_meal"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_team_meal"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_team_meal"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_team_meal"."patient_id" IS '体检者ID';
COMMENT ON COLUMN "public"."t_patient_team_meal"."team_id" IS 'teamId';
COMMENT ON COLUMN "public"."t_patient_team_meal"."team_code" IS 'teamCode';
COMMENT ON COLUMN "public"."t_patient_team_meal"."team_name" IS 'teamName';
COMMENT ON COLUMN "public"."t_patient_team_meal"."meal_type" IS 'mealType';
COMMENT ON COLUMN "public"."t_patient_team_meal"."meal_id" IS 'mealId';
COMMENT ON COLUMN "public"."t_patient_team_meal"."meal_code" IS 'mealCode';
COMMENT ON COLUMN "public"."t_patient_team_meal"."meal_name" IS 'mealName';
COMMENT ON COLUMN "public"."t_patient_team_meal"."price" IS 'price';
COMMENT ON COLUMN "public"."t_patient_team_meal"."dis_price" IS 'disPrice';
COMMENT ON COLUMN "public"."t_patient_team_meal"."market_price" IS 'marketPrice';
COMMENT ON TABLE "public"."t_patient_team_meal" IS 't_patient_team_meal';

-- ----------------------------
-- Table structure for t_patient_team_meal_check_item
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_team_meal_check_item";
CREATE TABLE "public"."t_patient_team_meal_check_item"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"     varchar(50) COLLATE "pg_catalog"."default",
    "update_user"     varchar(50) COLLATE "pg_catalog"."default",
    "create_date"     timestamp(6),
    "update_date"     timestamp(6),
    "team_id" int8,
    "meal_id" int8,
    "team_meal_id" int8,
    "fee_item_id" int8,
    "team_fee_item_id" int8,
    "check_item_id"   varchar(50) COLLATE "pg_catalog"."default",
    "check_item_code" varchar(50) COLLATE "pg_catalog"."default",
    "check_item_name" varchar(50) COLLATE "pg_catalog"."default",
    "source"          varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."team_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."meal_id" IS 'mealId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."team_meal_id" IS 'teamMealId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."fee_item_id" IS 'feeItemId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."team_fee_item_id" IS 'teamFeeItemId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."check_item_id" IS 'checkItemId';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."check_item_code" IS 'checkItemCode';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."check_item_name" IS 'checkItemName';
COMMENT ON COLUMN "public"."t_patient_team_meal_check_item"."source" IS 'source';
COMMENT ON TABLE "public"."t_patient_team_meal_check_item" IS 't_patient_team_meal_check_item';

-- ----------------------------
-- Table structure for t_patient_team_meal_fee_item
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_patient_team_meal_fee_item";
CREATE TABLE "public"."t_patient_team_meal_fee_item"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "team_id" int8,
    "team_meal_id" int8,
    "meal_id" int8,
    "fee_item_id" int8,
    "fee_item_code" varchar(50) COLLATE "pg_catalog"."default",
    "fee_item_name" varchar(50) COLLATE "pg_catalog"."default",
    "price"         numeric(13, 4),
    "dis_price"     numeric(13, 4),
    "market_price"  numeric(13, 4),
    "source"        varchar(50) COLLATE "pg_catalog"."default",
    "type"          varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."id" IS 'id';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."team_id" IS 'teamId';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."team_meal_id" IS 'teamMealId';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."meal_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."fee_item_id" IS 'feeItemId';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."fee_item_code" IS 'feeItemCode';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."fee_item_name" IS 'feeItemName';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."price" IS 'price';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."dis_price" IS 'disPrice';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."market_price" IS 'marketPrice';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."source" IS 'source';
COMMENT ON COLUMN "public"."t_patient_team_meal_fee_item"."type" IS 'type';
COMMENT ON TABLE "public"."t_patient_team_meal_fee_item" IS 't_patient_team_meal_fee_item';

-- ----------------------------
-- Table structure for t_personal_report_check_items
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_personal_report_check_items";
CREATE TABLE "public"."t_personal_report_check_items"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"     varchar(50) COLLATE "pg_catalog"."default",
    "update_user"     varchar(50) COLLATE "pg_catalog"."default",
    "create_date"     timestamp(6),
    "update_date"     timestamp(6),
    "patient_id" int8,
    "fee_item_id" int8,
    "check_item_id" int8,
    "check_item_name" varchar(50) COLLATE "pg_catalog"."default",
    "result_type"     varchar(50) COLLATE "pg_catalog"."default",
    "lower_limit"     varchar(50) COLLATE "pg_catalog"."default",
    "upper_limit"     varchar(50) COLLATE "pg_catalog"."default",
    "detection_value" varchar(50) COLLATE "pg_catalog"."default",
    "conclusion"      varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_personal_report_check_items"."id" IS 'id';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."patient_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."fee_item_id" IS 'feeItemId';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."check_item_id" IS 'checkItemId';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."check_item_name" IS 'checkItemName';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."result_type" IS 'resultType';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."lower_limit" IS 'lowerLimit';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."upper_limit" IS 'upperLimit';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."detection_value" IS 'detectionValue';
COMMENT ON COLUMN "public"."t_personal_report_check_items"."conclusion" IS 'conclusion';
COMMENT ON TABLE "public"."t_personal_report_check_items" IS 't_personal_report_check_items';

-- ----------------------------
-- Table structure for t_personal_report_fee_items
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_personal_report_fee_items";
CREATE TABLE "public"."t_personal_report_fee_items"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "patient_id" int8,
    "fee_item_id" int8,
    "fee_item_name" varchar(50) COLLATE "pg_catalog"."default",
    "conclusion"    varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."id" IS 'id';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."patient_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."fee_item_id" IS 'feeItemId';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."fee_item_name" IS 'feeItemName';
COMMENT ON COLUMN "public"."t_personal_report_fee_items"."conclusion" IS 'conclusion';
COMMENT ON TABLE "public"."t_personal_report_fee_items" IS 't_personal_report_fee_items';

-- ----------------------------
-- Table structure for t_personal_report_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_personal_report_info";
CREATE TABLE "public"."t_personal_report_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"       varchar(50) COLLATE "pg_catalog"."default",
    "update_user"       varchar(50) COLLATE "pg_catalog"."default",
    "create_date"       timestamp(6),
    "update_date"       timestamp(6),
    "patient_id" int8,
    "patient_name"      varchar(50) COLLATE "pg_catalog"."default",
    "patient_id_number" varchar(50) COLLATE "pg_catalog"."default",
    "patient_phone"     varchar(50) COLLATE "pg_catalog"."default",
    "file_name"         varchar(50) COLLATE "pg_catalog"."default",
    "bucket_name"       varchar(50) COLLATE "pg_catalog"."default",
    "template_id" int8
)
;
COMMENT ON COLUMN "public"."t_personal_report_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_personal_report_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_personal_report_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_personal_report_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_personal_report_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_personal_report_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_personal_report_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_personal_report_info"."patient_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_personal_report_info"."patient_name" IS 'patientName';
COMMENT ON COLUMN "public"."t_personal_report_info"."patient_id_number" IS 'patientIdNumber';
COMMENT ON COLUMN "public"."t_personal_report_info"."patient_phone" IS 'patientPhone';
COMMENT ON COLUMN "public"."t_personal_report_info"."file_name" IS 'fileName';
COMMENT ON COLUMN "public"."t_personal_report_info"."bucket_name" IS 'bucketName';
COMMENT ON COLUMN "public"."t_personal_report_info"."template_id" IS 'templateId';
COMMENT ON TABLE "public"."t_personal_report_info" IS 't_personal_report_info';

-- ----------------------------
-- Table structure for t_personal_report_summary
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_personal_report_summary";
CREATE TABLE "public"."t_personal_report_summary"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "patient_id" int8,
    "conclusion"  varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_personal_report_summary"."id" IS 'id';
COMMENT ON COLUMN "public"."t_personal_report_summary"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_personal_report_summary"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_personal_report_summary"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_personal_report_summary"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_personal_report_summary"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_personal_report_summary"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_personal_report_summary"."patient_id" IS 'patientId';
COMMENT ON COLUMN "public"."t_personal_report_summary"."conclusion" IS 'conclusion';
COMMENT ON TABLE "public"."t_personal_report_summary" IS 't_personal_report_summary';

-- ----------------------------
-- Table structure for t_potential_customers
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_potential_customers";
CREATE TABLE "public"."t_potential_customers"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "code"        varchar(50) COLLATE "pg_catalog"."default",
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "phone"       varchar(50) COLLATE "pg_catalog"."default",
    "level"       varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_potential_customers"."id" IS 'id';
COMMENT ON COLUMN "public"."t_potential_customers"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_potential_customers"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_potential_customers"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_potential_customers"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_potential_customers"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_potential_customers"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_potential_customers"."code" IS 'code';
COMMENT ON COLUMN "public"."t_potential_customers"."name" IS 'name';
COMMENT ON COLUMN "public"."t_potential_customers"."phone" IS 'phone';
COMMENT ON COLUMN "public"."t_potential_customers"."level" IS 'level';
COMMENT ON TABLE "public"."t_potential_customers" IS 't_potential_customers';

-- ----------------------------
-- Table structure for t_report_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_report_info";
CREATE TABLE "public"."t_report_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"  varchar(50) COLLATE "pg_catalog"."default",
    "update_user"  varchar(50) COLLATE "pg_catalog"."default",
    "create_date"  timestamp(6),
    "update_date"  timestamp(6),
    "code"         varchar(50) COLLATE "pg_catalog"."default",
    "patient_id" int8,
    "patient_code" varchar(50) COLLATE "pg_catalog"."default",
    "name"         varchar(50) COLLATE "pg_catalog"."default",
    "bucket_name"  varchar(50) COLLATE "pg_catalog"."default",
    "file_name"    varchar(50) COLLATE "pg_catalog"."default",
    "versions" int4
)
;
COMMENT ON COLUMN "public"."t_report_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_report_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_report_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_report_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_report_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_report_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_report_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_report_info"."code" IS '报告编号';
COMMENT ON COLUMN "public"."t_report_info"."patient_id" IS '体检ID';
COMMENT ON COLUMN "public"."t_report_info"."patient_code" IS '体检号';
COMMENT ON COLUMN "public"."t_report_info"."name" IS '人员姓名';
COMMENT ON COLUMN "public"."t_report_info"."bucket_name" IS '对象名称';
COMMENT ON COLUMN "public"."t_report_info"."file_name" IS '文件名称';
COMMENT ON COLUMN "public"."t_report_info"."versions" IS 'versions';
COMMENT ON TABLE "public"."t_report_info" IS 't_report_info';

-- ----------------------------
-- Table structure for t_resource
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_resource";
CREATE TABLE "public"."t_resource"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "type"        varchar(50) COLLATE "pg_catalog"."default",
    "url"         varchar(50) COLLATE "pg_catalog"."default",
    "pid" int8,
    "weight" int4
)
;
COMMENT ON COLUMN "public"."t_resource"."id" IS 'id';
COMMENT ON COLUMN "public"."t_resource"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_resource"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_resource"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_resource"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_resource"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_resource"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_resource"."name" IS 'name';
COMMENT ON COLUMN "public"."t_resource"."type" IS 'type';
COMMENT ON COLUMN "public"."t_resource"."url" IS 'url';
COMMENT ON COLUMN "public"."t_resource"."pid" IS 'pid';
COMMENT ON COLUMN "public"."t_resource"."weight" IS 'weight';
COMMENT ON TABLE "public"."t_resource" IS 't_resource';

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_role";
CREATE TABLE "public"."t_role"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "name"        varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_role"."id" IS 'id';
COMMENT ON COLUMN "public"."t_role"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_role"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_role"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_role"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_role"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_role"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_role"."name" IS 'name';
COMMENT ON TABLE "public"."t_role" IS 't_role';

-- ----------------------------
-- Table structure for t_role_resource
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_role_resource";
CREATE TABLE "public"."t_role_resource"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "role_id" int8,
    "resource_id" int8
)
;
COMMENT ON COLUMN "public"."t_role_resource"."id" IS 'id';
COMMENT ON COLUMN "public"."t_role_resource"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_role_resource"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_role_resource"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_role_resource"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_role_resource"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_role_resource"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_role_resource"."role_id" IS 'roleId';
COMMENT ON COLUMN "public"."t_role_resource"."resource_id" IS 'permissionId';
COMMENT ON TABLE "public"."t_role_resource" IS 't_role_resource';

-- ----------------------------
-- Table structure for t_sales_record
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_sales_record";
CREATE TABLE "public"."t_sales_record"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user"   varchar(50) COLLATE "pg_catalog"."default",
    "update_user"   varchar(50) COLLATE "pg_catalog"."default",
    "create_date"   timestamp(6),
    "update_date"   timestamp(6),
    "seller_id" int8,
    "seller_code"   varchar(50) COLLATE "pg_catalog"."default",
    "customer_id" int8,
    "customer_code" varchar(50) COLLATE "pg_catalog"."default",
    "customer_name" varchar(50) COLLATE "pg_catalog"."default",
    "amount"        numeric(13, 4)
)
;
COMMENT ON COLUMN "public"."t_sales_record"."id" IS 'id';
COMMENT ON COLUMN "public"."t_sales_record"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_sales_record"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_sales_record"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_sales_record"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_sales_record"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_sales_record"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_sales_record"."seller_id" IS '销售员Id';
COMMENT ON COLUMN "public"."t_sales_record"."seller_code" IS '销售员编号';
COMMENT ON COLUMN "public"."t_sales_record"."customer_id" IS '客户ID';
COMMENT ON COLUMN "public"."t_sales_record"."customer_code" IS '客户编号';
COMMENT ON COLUMN "public"."t_sales_record"."customer_name" IS '客户姓名';
COMMENT ON COLUMN "public"."t_sales_record"."amount" IS '金额';
COMMENT ON TABLE "public"."t_sales_record" IS 't_sales_record';

-- ----------------------------
-- Table structure for t_seller_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_seller_info";
CREATE TABLE "public"."t_seller_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "code"        varchar(50) COLLATE "pg_catalog"."default",
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "age" int4,
    "phone"       varchar(50) COLLATE "pg_catalog"."default",
    "address"     varchar(50) COLLATE "pg_catalog"."default",
    "status"      varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_seller_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_seller_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_seller_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_seller_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_seller_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_seller_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_seller_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_seller_info"."code" IS 'code';
COMMENT ON COLUMN "public"."t_seller_info"."name" IS 'name';
COMMENT ON COLUMN "public"."t_seller_info"."age" IS 'age';
COMMENT ON COLUMN "public"."t_seller_info"."phone" IS 'phone';
COMMENT ON COLUMN "public"."t_seller_info"."address" IS 'address';
COMMENT ON COLUMN "public"."t_seller_info"."status" IS 'status';
COMMENT ON TABLE "public"."t_seller_info" IS 't_seller_info';

-- ----------------------------
-- Table structure for t_template_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_template_info";
CREATE TABLE "public"."t_template_info"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "type"        varchar(50) COLLATE "pg_catalog"."default",
    "code" int8,
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "bucket_name" varchar(50) COLLATE "pg_catalog"."default",
    "file_name"   varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_template_info"."id" IS 'id';
COMMENT ON COLUMN "public"."t_template_info"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_template_info"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_template_info"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_template_info"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_template_info"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_template_info"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_template_info"."type" IS 'type';
COMMENT ON COLUMN "public"."t_template_info"."code" IS 'code';
COMMENT ON COLUMN "public"."t_template_info"."name" IS 'name';
COMMENT ON COLUMN "public"."t_template_info"."bucket_name" IS 'bucketName';
COMMENT ON COLUMN "public"."t_template_info"."file_name" IS 'fileName';
COMMENT ON TABLE "public"."t_template_info" IS 't_template_info';

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_user";
CREATE TABLE "public"."t_user"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "username"    varchar(50) COLLATE "pg_catalog"."default",
    "name"        varchar(50) COLLATE "pg_catalog"."default",
    "password"    varchar(50) COLLATE "pg_catalog"."default",
    "status"      varchar(50) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."t_user"."id" IS 'id';
COMMENT ON COLUMN "public"."t_user"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_user"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_user"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_user"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_user"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_user"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_user"."username" IS '用户名';
COMMENT ON COLUMN "public"."t_user"."name" IS '姓名';
COMMENT ON COLUMN "public"."t_user"."password" IS '密码';
COMMENT ON COLUMN "public"."t_user"."status" IS '状态
     *
     * @see TUserStatus';
COMMENT ON TABLE "public"."t_user" IS 't_user';

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_user_role";
CREATE TABLE "public"."t_user_role"
(
    "id" int8 NOT NULL,
    "create_id" int8,
    "update_id" int8,
    "create_user" varchar(50) COLLATE "pg_catalog"."default",
    "update_user" varchar(50) COLLATE "pg_catalog"."default",
    "create_date" timestamp(6),
    "update_date" timestamp(6),
    "user_id" int8,
    "role_id" int8
)
;
COMMENT ON COLUMN "public"."t_user_role"."id" IS 'id';
COMMENT ON COLUMN "public"."t_user_role"."create_id" IS 'createId';
COMMENT ON COLUMN "public"."t_user_role"."update_id" IS 'updateId';
COMMENT ON COLUMN "public"."t_user_role"."create_user" IS 'createUser';
COMMENT ON COLUMN "public"."t_user_role"."update_user" IS 'updateUser';
COMMENT ON COLUMN "public"."t_user_role"."create_date" IS 'createDate';
COMMENT ON COLUMN "public"."t_user_role"."update_date" IS 'updateDate';
COMMENT ON COLUMN "public"."t_user_role"."user_id" IS 'userId';
COMMENT ON COLUMN "public"."t_user_role"."role_id" IS 'roleId';
COMMENT ON TABLE "public"."t_user_role" IS 't_user_role';

-- ----------------------------
-- Primary Key structure for table t_bill_info
-- ----------------------------
ALTER TABLE "public"."t_bill_info"
    ADD CONSTRAINT "t_bill_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_bill_items_info
-- ----------------------------
ALTER TABLE "public"."t_bill_items_info"
    ADD CONSTRAINT "t_bill_items_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_bill_log
-- ----------------------------
ALTER TABLE "public"."t_bill_log"
    ADD CONSTRAINT "t_bill_log_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_bill_sub_info
-- ----------------------------
ALTER TABLE "public"."t_bill_sub_info"
    ADD CONSTRAINT "t_bill_sub_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_check_department
-- ----------------------------
ALTER TABLE "public"."t_check_department"
    ADD CONSTRAINT "t_check_department_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_check_department_items
-- ----------------------------
ALTER TABLE "public"."t_check_department_items"
    ADD CONSTRAINT "t_check_department_items_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_check_item
-- ----------------------------
ALTER TABLE "public"."t_check_item"
    ADD CONSTRAINT "t_check_item_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_customer_contract
-- ----------------------------
ALTER TABLE "public"."t_customer_contract"
    ADD CONSTRAINT "t_customer_contract_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_customer_info
-- ----------------------------
ALTER TABLE "public"."t_customer_info"
    ADD CONSTRAINT "t_customer_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_customer_order
-- ----------------------------
ALTER TABLE "public"."t_customer_order"
    ADD CONSTRAINT "t_customer_order_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_department
-- ----------------------------
ALTER TABLE "public"."t_department"
    ADD CONSTRAINT "t_department_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_department_role
-- ----------------------------
ALTER TABLE "public"."t_department_role"
    ADD CONSTRAINT "t_department_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_fee_item
-- ----------------------------
ALTER TABLE "public"."t_fee_item"
    ADD CONSTRAINT "t_fee_item_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_meal
-- ----------------------------
ALTER TABLE "public"."t_meal"
    ADD CONSTRAINT "t_meal_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_meal_fee_item
-- ----------------------------
ALTER TABLE "public"."t_meal_fee_item"
    ADD CONSTRAINT "t_meal_fee_item_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient
-- ----------------------------
ALTER TABLE "public"."t_patient"
    ADD CONSTRAINT "t_patient_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_check_item
-- ----------------------------
ALTER TABLE "public"."t_patient_check_item"
    ADD CONSTRAINT "t_patient_check_item_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_fee_item
-- ----------------------------
ALTER TABLE "public"."t_patient_fee_item"
    ADD CONSTRAINT "t_patient_fee_item_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_group
-- ----------------------------
ALTER TABLE "public"."t_patient_group"
    ADD CONSTRAINT "t_patient_group_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_meal
-- ----------------------------
ALTER TABLE "public"."t_patient_meal"
    ADD CONSTRAINT "t_patient_meal_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_team
-- ----------------------------
ALTER TABLE "public"."t_patient_team"
    ADD CONSTRAINT "t_patient_team_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_team_meal
-- ----------------------------
ALTER TABLE "public"."t_patient_team_meal"
    ADD CONSTRAINT "t_patient_team_meal_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_team_meal_check_item
-- ----------------------------
ALTER TABLE "public"."t_patient_team_meal_check_item"
    ADD CONSTRAINT "t_patient_team_meal_check_item_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_patient_team_meal_fee_item
-- ----------------------------
ALTER TABLE "public"."t_patient_team_meal_fee_item"
    ADD CONSTRAINT "t_patient_team_meal_fee_item_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_personal_report_check_items
-- ----------------------------
ALTER TABLE "public"."t_personal_report_check_items"
    ADD CONSTRAINT "t_personal_report_check_items_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_personal_report_fee_items
-- ----------------------------
ALTER TABLE "public"."t_personal_report_fee_items"
    ADD CONSTRAINT "t_personal_report_fee_items_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_personal_report_info
-- ----------------------------
ALTER TABLE "public"."t_personal_report_info"
    ADD CONSTRAINT "t_personal_report_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_personal_report_summary
-- ----------------------------
ALTER TABLE "public"."t_personal_report_summary"
    ADD CONSTRAINT "t_personal_report_summary_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_potential_customers
-- ----------------------------
ALTER TABLE "public"."t_potential_customers"
    ADD CONSTRAINT "t_potential_customers_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_report_info
-- ----------------------------
ALTER TABLE "public"."t_report_info"
    ADD CONSTRAINT "t_report_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_resource
-- ----------------------------
ALTER TABLE "public"."t_resource"
    ADD CONSTRAINT "t_resource_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_role
-- ----------------------------
ALTER TABLE "public"."t_role"
    ADD CONSTRAINT "t_role_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_role_resource
-- ----------------------------
ALTER TABLE "public"."t_role_resource"
    ADD CONSTRAINT "t_role_resource_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_sales_record
-- ----------------------------
ALTER TABLE "public"."t_sales_record"
    ADD CONSTRAINT "t_sales_record_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_seller_info
-- ----------------------------
ALTER TABLE "public"."t_seller_info"
    ADD CONSTRAINT "t_seller_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_template_info
-- ----------------------------
ALTER TABLE "public"."t_template_info"
    ADD CONSTRAINT "t_template_info_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_user
-- ----------------------------
ALTER TABLE "public"."t_user"
    ADD CONSTRAINT "t_user_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table t_user_role
-- ----------------------------
ALTER TABLE "public"."t_user_role"
    ADD CONSTRAINT "t_user_role_pkey" PRIMARY KEY ("id");
