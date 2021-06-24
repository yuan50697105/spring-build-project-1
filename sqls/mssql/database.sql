/*
 Navicat Premium Data Transfer

 Source Server         : 8.140.177.12
 Source Server Type    : SQL Server
 Source Server Version : 15004123
 Source Host           : 8.140.177.12:1433
 Source Catalog        : spring_demo
 Source Schema         : dbo

 Target Server Type    : SQL Server
 Target Server Version : 15004123
 File Encoding         : 65001

 Date: 24/05/2021 11:56:58
*/


-- ----------------------------
-- Table structure for t_bill_info
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_bill_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_bill_info]
    GO

CREATE TABLE [dbo].[t_bill_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [order_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_id_card_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [total_price] decimal
(
    13,
    4
) NULL
    )
    GO

ALTER TABLE [dbo].[t_bill_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'订单号',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'order_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检号',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'patient_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检人ID',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检人姓名',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'patient_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检人身份证号',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'patient_id_card_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'总价',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info',
    'COLUMN', N'total_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_bill_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_info'
    GO


    -- ----------------------------
-- Table structure for t_bill_items_info
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_bill_items_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_bill_items_info]
    GO

CREATE TABLE [dbo].[t_bill_items_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [bill_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [order_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [sub_bill_id] bigint NULL,
    [sub_order_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [item_id] bigint NULL,
    [item_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [item_price] decimal
(
    13,
    4
) NULL,
    [num] decimal
(
    13,
    4
) NULL,
    [total_price] decimal
(
    13,
    4
) NULL
    )
    GO

ALTER TABLE [dbo].[t_bill_items_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'billId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'bill_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'orderNo',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'order_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'subBillId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'sub_bill_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'subOrderNo',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'sub_order_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'itemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'itemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'item_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'itemPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'item_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'num',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'num'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'totalPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info',
    'COLUMN', N'total_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_bill_items_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_items_info'
    GO


    -- ----------------------------
-- Table structure for t_bill_log
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_bill_log]') AND type IN ('U'))
DROP TABLE [dbo].[t_bill_log]
    GO

CREATE TABLE [dbo].[t_bill_log]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [order_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [current_total_price] decimal
(
    13,
    4
) NULL,
    [previous_total_price] decimal
(
    13,
    4
) NULL,
    [previous_id] bigint NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_bill_log] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'订单号',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'order_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检号',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'patient_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'当前价格',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'current_total_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'之前价格',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'previous_total_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'之前Id',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'previous_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'类型
     *
     * @see  BillLogType',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_bill_log',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_log'
    GO


    -- ----------------------------
-- Table structure for t_bill_sub_info
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_bill_sub_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_bill_sub_info]
    GO

CREATE TABLE [dbo].[t_bill_sub_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [sub_order_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [bill_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [order_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [total_price] decimal
(
    13,
    4
) NULL,
    [status] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_bill_sub_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'子单单号',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'sub_order_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'总单ID',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'bill_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'总单单号',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'order_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'总价',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'total_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'状态
     * @see BillSubInfoStatus',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info',
    'COLUMN', N'status'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_bill_sub_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_bill_sub_info'
    GO


    -- ----------------------------
-- Table structure for t_check_department
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_check_department]') AND type IN ('U'))
DROP TABLE [dbo].[t_check_department]
    GO

CREATE TABLE [dbo].[t_check_department]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [location] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_check_department] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'type',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'location',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department',
    'COLUMN', N'location'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_check_department',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department'
    GO


    -- ----------------------------
-- Table structure for t_check_department_items
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_check_department_items]') AND type IN ('U'))
DROP TABLE [dbo].[t_check_department_items]
    GO

CREATE TABLE [dbo].[t_check_department_items]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [check_item_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_check_department_items] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items',
    'COLUMN', N'check_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_check_department_items',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_department_items'
    GO


    -- ----------------------------
-- Table structure for t_check_item
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_check_item]') AND type IN ('U'))
DROP TABLE [dbo].[t_check_item]
    GO

CREATE TABLE [dbo].[t_check_item]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [fee_item_id] bigint NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [lowest_value] decimal
(
    13,
    4
) NULL,
    [highest_value] decimal
(
    13,
    4
) NULL,
    [yin_yang] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [lis_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_check_item] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'lowestValue',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'lowest_value'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'highestValue',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'highest_value'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'yinYang',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'yin_yang'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'lisCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item',
    'COLUMN', N'lis_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_check_item',
    'SCHEMA', N'dbo',
    'TABLE', N't_check_item'
    GO


    -- ----------------------------
-- Table structure for t_customer_contract
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_customer_contract]') AND type IN ('U'))
DROP TABLE [dbo].[t_customer_contract]
    GO

CREATE TABLE [dbo].[t_customer_contract]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_id] bigint NULL,
    [signing_time] datetime2
(
    7
) NULL,
    [status] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [file_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [bukect_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_customer_contract] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'合同编号',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'客户名称',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'客户ID',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'customer_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'签约时间',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'signing_time'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'合同状态',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'status'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'fileName',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'file_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'bukectName',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract',
    'COLUMN', N'bukect_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_customer_contract',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_contract'
    GO


    -- ----------------------------
-- Table structure for t_customer_info
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_customer_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_customer_info]
    GO

CREATE TABLE [dbo].[t_customer_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_customer_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'编号',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'名称',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'类型',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_customer_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_info'
    GO


    -- ----------------------------
-- Table structure for t_customer_order
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_customer_order]') AND type IN ('U'))
DROP TABLE [dbo].[t_customer_order]
    GO

CREATE TABLE [dbo].[t_customer_order]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [order_no] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [total_amount] decimal
(
    13,
    4
) NULL,
    [status] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_customer_order] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'orderNo',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'order_no'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerId',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'customer_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'customer_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerName',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'customer_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'totalAmount',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'total_amount'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'status',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order',
    'COLUMN', N'status'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_customer_order',
    'SCHEMA', N'dbo',
    'TABLE', N't_customer_order'
    GO


    -- ----------------------------
-- Table structure for t_department
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_department]') AND type IN ('U'))
DROP TABLE [dbo].[t_department]
    GO

CREATE TABLE [dbo].[t_department]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [pid] bigint NULL
    )
    GO

ALTER TABLE [dbo].[t_department] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'pid',
    'SCHEMA', N'dbo',
    'TABLE', N't_department',
    'COLUMN', N'pid'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_department',
    'SCHEMA', N'dbo',
    'TABLE', N't_department'
    GO


    -- ----------------------------
-- Table structure for t_department_role
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_department_role]') AND type IN ('U'))
DROP TABLE [dbo].[t_department_role]
    GO

CREATE TABLE [dbo].[t_department_role]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [department_id] bigint NULL,
    [role_id] bigint NULL
    )
    GO

ALTER TABLE [dbo].[t_department_role] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'departmentId',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'department_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'roleId',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role',
    'COLUMN', N'role_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_department_role',
    'SCHEMA', N'dbo',
    'TABLE', N't_department_role'
    GO


    -- ----------------------------
-- Table structure for t_fee_item
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_fee_item]') AND type IN ('U'))
DROP TABLE [dbo].[t_fee_item]
    GO

CREATE TABLE [dbo].[t_fee_item]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [price] decimal
(
    13,
    4
) NULL,
    [dis_price] decimal
(
    13,
    4
) NULL,
    [market_price] decimal
(
    13,
    4
) NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [sex] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [age_start] int NULL,
    [age_end] int NULL
    )
    GO

ALTER TABLE [dbo].[t_fee_item] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'项目编号',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'项目名称',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'价格',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'优惠价',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'dis_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'市价',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'market_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'类型',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'性别',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'sex'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'年龄',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'age_start'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'年龄',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item',
    'COLUMN', N'age_end'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_fee_item',
    'SCHEMA', N'dbo',
    'TABLE', N't_fee_item'
    GO


    -- ----------------------------
-- Table structure for t_meal
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_meal]') AND type IN ('U'))
DROP TABLE [dbo].[t_meal]
    GO

CREATE TABLE [dbo].[t_meal]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [price] decimal
(
    13,
    4
) NULL,
    [dis_price] decimal
(
    13,
    4
) NULL,
    [market_price] decimal
(
    13,
    4
) NULL
    )
    GO

ALTER TABLE [dbo].[t_meal] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'type',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'price',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'disPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'dis_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'marketPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal',
    'COLUMN', N'market_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_meal',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal'
    GO


    -- ----------------------------
-- Table structure for t_meal_fee_item
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_meal_fee_item]') AND type IN ('U'))
DROP TABLE [dbo].[t_meal_fee_item]
    GO

CREATE TABLE [dbo].[t_meal_fee_item]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [meal_id] bigint NULL,
    [fee_item_id] bigint NULL
    )
    GO

ALTER TABLE [dbo].[t_meal_fee_item] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_meal_fee_item',
    'SCHEMA', N'dbo',
    'TABLE', N't_meal_fee_item'
    GO


    -- ----------------------------
-- Table structure for t_patient
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient]
    GO

CREATE TABLE [dbo].[t_patient]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [team_id] bigint NULL,
    [team_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [team_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [group_id] bigint NULL,
    [group_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [group_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_id] bigint NULL,
    [customer_type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [age] int NULL,
    [sex] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [marriage] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [bear] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [phone] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_patient] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'team_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'team_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'team_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'group_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupItemCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'group_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupItemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'group_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'type',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'customer_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerType',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'customer_type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'customer_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'age',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'age'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'sex',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'sex'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'marriage',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'marriage'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'bear',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'bear'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'phone',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient',
    'COLUMN', N'phone'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient'
    GO


    -- ----------------------------
-- Table structure for t_patient_check_item
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_check_item]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_check_item]
    GO

CREATE TABLE [dbo].[t_patient_check_item]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [patient_id] bigint NULL,
    [fee_item_id] bigint NULL,
    [check_item_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [check_item_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [check_item_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_id] bigint NULL,
    [source] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_check_item] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'check_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'check_item_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'check_item_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'source',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item',
    'COLUMN', N'source'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_check_item',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_check_item'
    GO


    -- ----------------------------
-- Table structure for t_patient_fee_item
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_fee_item]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_fee_item]
    GO

CREATE TABLE [dbo].[t_patient_fee_item]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [patient_id] bigint NULL,
    [fee_item_id] bigint NULL,
    [fee_item_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [fee_item_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_id] bigint NULL,
    [patient_meal_id] bigint NULL,
    [price] decimal
(
    13,
    4
) NULL,
    [dis_price] decimal
(
    13,
    4
) NULL,
    [market_price] decimal
(
    13,
    4
) NULL,
    [source] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_fee_item] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'fee_item_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'fee_item_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientMealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'patient_meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'price',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'disPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'dis_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'marketPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'market_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'source',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'source'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'type',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_fee_item',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_fee_item'
    GO


    -- ----------------------------
-- Table structure for t_patient_group
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_group]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_group]
    GO

CREATE TABLE [dbo].[t_patient_group]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_id] bigint NULL,
    [team_id] bigint NULL,
    [team_meal_id] bigint NULL,
    [meal_id] bigint NULL,
    [meal_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [person_num] int NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_group] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'customer_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'team_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamMealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'team_meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'meal_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'personNum',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group',
    'COLUMN', N'person_num'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_group',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_group'
    GO


    -- ----------------------------
-- Table structure for t_patient_meal
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_meal]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_meal]
    GO

CREATE TABLE [dbo].[t_patient_meal]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [team_id] bigint NULL,
    [group_id] bigint NULL,
    [meal_type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_source] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_id] bigint NULL,
    [team_meal_id] bigint NULL,
    [meal_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [price] decimal
(
    13,
    4
) NULL,
    [dis_price] decimal
(
    13,
    4
) NULL,
    [market_price] decimal
(
    13,
    4
) NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_meal] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'team_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'groupId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'group_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealType',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'meal_type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealSource',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'meal_source'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamMealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'team_meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'meal_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'meal_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'price',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'disPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'dis_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'marketPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal',
    'COLUMN', N'market_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_meal',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_meal'
    GO


    -- ----------------------------
-- Table structure for t_patient_team
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_team]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_team]
    GO

CREATE TABLE [dbo].[t_patient_team]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [customer_id] bigint NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [age_start] int NULL,
    [age_end] int NULL,
    [sex] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [marriage] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [bear] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_team] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'customerId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'customer_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'ageStart',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'age_start'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'ageEnd',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'age_end'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'sex',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'sex'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'marriage',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'marriage'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'bear',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team',
    'COLUMN', N'bear'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_team',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team'
    GO


    -- ----------------------------
-- Table structure for t_patient_team_meal
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_team_meal]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_team_meal]
    GO

CREATE TABLE [dbo].[t_patient_team_meal]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [patient_id] bigint NULL,
    [team_id] bigint NULL,
    [team_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [team_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_id] bigint NULL,
    [meal_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [meal_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [price] decimal
(
    13,
    4
) NULL,
    [dis_price] decimal
(
    13,
    4
) NULL,
    [market_price] decimal
(
    13,
    4
) NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_team_meal] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检者ID',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'team_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'team_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'team_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealType',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'meal_type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'meal_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'meal_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'price',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'disPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'dis_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'marketPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal',
    'COLUMN', N'market_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_team_meal',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal'
    GO


    -- ----------------------------
-- Table structure for t_patient_team_meal_check_item
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_team_meal_check_item]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_team_meal_check_item]
    GO

CREATE TABLE [dbo].[t_patient_team_meal_check_item]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [team_id] bigint NULL,
    [meal_id] bigint NULL,
    [team_meal_id] bigint NULL,
    [fee_item_id] bigint NULL,
    [team_fee_item_id] bigint NULL,
    [check_item_id] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [check_item_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [check_item_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [source] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_team_meal_check_item] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'team_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'mealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamMealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'team_meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamFeeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'team_fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'check_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'check_item_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'check_item_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'source',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item',
    'COLUMN', N'source'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_team_meal_check_item',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_check_item'
    GO


    -- ----------------------------
-- Table structure for t_patient_team_meal_fee_item
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_patient_team_meal_fee_item]') AND type IN ('U'))
DROP TABLE [dbo].[t_patient_team_meal_fee_item]
    GO

CREATE TABLE [dbo].[t_patient_team_meal_fee_item]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [team_id] bigint NULL,
    [team_meal_id] bigint NULL,
    [meal_id] bigint NULL,
    [fee_item_id] bigint NULL,
    [fee_item_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [fee_item_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [price] decimal
(
    13,
    4
) NULL,
    [dis_price] decimal
(
    13,
    4
) NULL,
    [market_price] decimal
(
    13,
    4
) NULL,
    [source] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_patient_team_meal_fee_item] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'team_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'teamMealId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'team_meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'meal_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemCode',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'fee_item_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'fee_item_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'price',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'disPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'dis_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'marketPrice',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'market_price'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'source',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'source'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'type',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_patient_team_meal_fee_item',
    'SCHEMA', N'dbo',
    'TABLE', N't_patient_team_meal_fee_item'
    GO


    -- ----------------------------
-- Table structure for t_personal_report_check_items
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_personal_report_check_items]') AND type IN ('U'))
DROP TABLE [dbo].[t_personal_report_check_items]
    GO

CREATE TABLE [dbo].[t_personal_report_check_items]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [patient_id] bigint NULL,
    [fee_item_id] bigint NULL,
    [check_item_id] bigint NULL,
    [check_item_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [result_type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [lower_limit] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [upper_limit] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [detection_value] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [conclusion] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_personal_report_check_items] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'check_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'checkItemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'check_item_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'resultType',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'result_type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'lowerLimit',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'lower_limit'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'upperLimit',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'upper_limit'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'detectionValue',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'detection_value'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'conclusion',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items',
    'COLUMN', N'conclusion'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_personal_report_check_items',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_check_items'
    GO


    -- ----------------------------
-- Table structure for t_personal_report_fee_items
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_personal_report_fee_items]') AND type IN ('U'))
DROP TABLE [dbo].[t_personal_report_fee_items]
    GO

CREATE TABLE [dbo].[t_personal_report_fee_items]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [patient_id] bigint NULL,
    [fee_item_id] bigint NULL,
    [fee_item_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [conclusion] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_personal_report_fee_items] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'fee_item_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'feeItemName',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'fee_item_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'conclusion',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items',
    'COLUMN', N'conclusion'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_personal_report_fee_items',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_fee_items'
    GO


    -- ----------------------------
-- Table structure for t_personal_report_info
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_personal_report_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_personal_report_info]
    GO

CREATE TABLE [dbo].[t_personal_report_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [patient_id] bigint NULL,
    [patient_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_id_number] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_phone] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [file_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [bucket_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [template_id] bigint NULL
    )
    GO

ALTER TABLE [dbo].[t_personal_report_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientName',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'patient_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientIdNumber',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'patient_id_number'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientPhone',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'patient_phone'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'fileName',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'file_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'bucketName',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'bucket_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'templateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info',
    'COLUMN', N'template_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_personal_report_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_info'
    GO


    -- ----------------------------
-- Table structure for t_personal_report_summary
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_personal_report_summary]') AND type IN ('U'))
DROP TABLE [dbo].[t_personal_report_summary]
    GO

CREATE TABLE [dbo].[t_personal_report_summary]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [patient_id] bigint NULL,
    [conclusion] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_personal_report_summary] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'patientId',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'conclusion',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary',
    'COLUMN', N'conclusion'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_personal_report_summary',
    'SCHEMA', N'dbo',
    'TABLE', N't_personal_report_summary'
    GO


    -- ----------------------------
-- Table structure for t_potential_customers
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_potential_customers]') AND type IN ('U'))
DROP TABLE [dbo].[t_potential_customers]
    GO

CREATE TABLE [dbo].[t_potential_customers]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [phone] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [level] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_potential_customers] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'phone',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'phone'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'level',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers',
    'COLUMN', N'level'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_potential_customers',
    'SCHEMA', N'dbo',
    'TABLE', N't_potential_customers'
    GO


    -- ----------------------------
-- Table structure for t_report_info
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_report_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_report_info]
    GO

CREATE TABLE [dbo].[t_report_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [patient_id] bigint NULL,
    [patient_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [bucket_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [file_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [versions] int NULL
    )
    GO

ALTER TABLE [dbo].[t_report_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'报告编号',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检ID',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'patient_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'体检号',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'patient_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'人员姓名',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'对象名称',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'bucket_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'文件名称',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'file_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'versions',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info',
    'COLUMN', N'versions'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_report_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_report_info'
    GO


    -- ----------------------------
-- Table structure for t_resource
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_resource]') AND type IN ('U'))
DROP TABLE [dbo].[t_resource]
    GO

CREATE TABLE [dbo].[t_resource]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [url] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [pid] bigint NULL,
    [weight] int NULL
    )
    GO

ALTER TABLE [dbo].[t_resource] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'type',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'url',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'url'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'pid',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'pid'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'weight',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource',
    'COLUMN', N'weight'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_resource',
    'SCHEMA', N'dbo',
    'TABLE', N't_resource'
    GO


    -- ----------------------------
-- Table structure for t_role
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_role]') AND type IN ('U'))
DROP TABLE [dbo].[t_role]
    GO

CREATE TABLE [dbo].[t_role]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_role] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_role',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_role',
    'SCHEMA', N'dbo',
    'TABLE', N't_role'
    GO


    -- ----------------------------
-- Table structure for t_role_resource
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_role_resource]') AND type IN ('U'))
DROP TABLE [dbo].[t_role_resource]
    GO

CREATE TABLE [dbo].[t_role_resource]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [role_id] bigint NULL,
    [resource_id] bigint NULL
    )
    GO

ALTER TABLE [dbo].[t_role_resource] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'roleId',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'role_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'permissionId',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource',
    'COLUMN', N'resource_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_role_resource',
    'SCHEMA', N'dbo',
    'TABLE', N't_role_resource'
    GO


    -- ----------------------------
-- Table structure for t_sales_record
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_sales_record]') AND type IN ('U'))
DROP TABLE [dbo].[t_sales_record]
    GO

CREATE TABLE [dbo].[t_sales_record]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [seller_id] bigint NULL,
    [seller_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_id] bigint NULL,
    [customer_code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [customer_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [amount] decimal
(
    13,
    4
) NULL
    )
    GO

ALTER TABLE [dbo].[t_sales_record] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'销售员Id',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'seller_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'销售员编号',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'seller_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'客户ID',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'customer_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'客户编号',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'customer_code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'客户姓名',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'customer_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'金额',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record',
    'COLUMN', N'amount'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_sales_record',
    'SCHEMA', N'dbo',
    'TABLE', N't_sales_record'
    GO


    -- ----------------------------
-- Table structure for t_seller_info
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_seller_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_seller_info]
    GO

CREATE TABLE [dbo].[t_seller_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [code] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [age] int NULL,
    [phone] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [address] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [status] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_seller_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'age',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'age'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'phone',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'phone'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'address',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'address'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'status',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info',
    'COLUMN', N'status'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_seller_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_seller_info'
    GO


    -- ----------------------------
-- Table structure for t_template_info
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_template_info]') AND type IN ('U'))
DROP TABLE [dbo].[t_template_info]
    GO

CREATE TABLE [dbo].[t_template_info]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [type] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [code] bigint NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [bucket_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [file_name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_template_info] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'type',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'type'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'code',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'code'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'name',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'bucketName',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'bucket_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'fileName',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info',
    'COLUMN', N'file_name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_template_info',
    'SCHEMA', N'dbo',
    'TABLE', N't_template_info'
    GO


    -- ----------------------------
-- Table structure for t_user
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_user]') AND type IN ('U'))
DROP TABLE [dbo].[t_user]
    GO

CREATE TABLE [dbo].[t_user]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [username] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [name] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [password] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [status] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
    )
    GO

ALTER TABLE [dbo].[t_user] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'用户名',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'username'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'姓名',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'name'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'密码',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'password'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'状态
     *
     * @see TUserStatus',
    'SCHEMA', N'dbo',
    'TABLE', N't_user',
    'COLUMN', N'status'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_user',
    'SCHEMA', N'dbo',
    'TABLE', N't_user'
    GO


    -- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
    IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[t_user_role]') AND type IN ('U'))
DROP TABLE [dbo].[t_user_role]
    GO

CREATE TABLE [dbo].[t_user_role]
(
    [
    id]
    bigint
    NOT
    NULL, [
    create_id]
    bigint
    NULL, [
    update_id]
    bigint
    NULL, [
    create_user]
    nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [update_user] nvarchar
(
    50
) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
    [create_date] datetime2
(
    7
) NULL,
    [update_date] datetime2
(
    7
) NULL,
    [user_id] bigint NULL,
    [role_id] bigint NULL
    )
    GO

ALTER TABLE [dbo].[t_user_role] SET (LOCK_ESCALATION = TABLE)
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'id',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createId',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'create_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateId',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'update_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'create_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateUser',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'update_user'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'createDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'create_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'updateDate',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'update_date'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'userId',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'user_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N'roleId',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role',
    'COLUMN', N'role_id'
    GO
    EXEC sp_addextendedproperty
    'MS_Description', N't_user_role',
    'SCHEMA', N'dbo',
    'TABLE', N't_user_role'
    GO


-- ----------------------------
-- Primary Key structure for table t_bill_info
-- ----------------------------
ALTER TABLE [dbo].[t_bill_info] ADD CONSTRAINT [PK__t_bill_i__3213E83F0AC1FAA4] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_bill_items_info
-- ----------------------------
ALTER TABLE [dbo].[t_bill_items_info] ADD CONSTRAINT [PK__t_bill_i__3213E83FCA2BA127] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_bill_log
-- ----------------------------
ALTER TABLE [dbo].[t_bill_log] ADD CONSTRAINT [PK__t_bill_l__3213E83F074E413C] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_bill_sub_info
-- ----------------------------
ALTER TABLE [dbo].[t_bill_sub_info] ADD CONSTRAINT [PK__t_bill_s__3213E83F65916820] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_check_department
-- ----------------------------
ALTER TABLE [dbo].[t_check_department] ADD CONSTRAINT [PK__t_check___3213E83FA8FAEC4C] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_check_department_items
-- ----------------------------
ALTER TABLE [dbo].[t_check_department_items] ADD CONSTRAINT [PK__t_check___3213E83FC394D6B5] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_check_item
-- ----------------------------
ALTER TABLE [dbo].[t_check_item] ADD CONSTRAINT [PK__t_check___3213E83F3B1572EA] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_customer_contract
-- ----------------------------
ALTER TABLE [dbo].[t_customer_contract] ADD CONSTRAINT [PK__t_custom__3213E83F6A3BC2AF] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_customer_info
-- ----------------------------
ALTER TABLE [dbo].[t_customer_info] ADD CONSTRAINT [PK__t_custom__3213E83FAA7DF4B8] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_customer_order
-- ----------------------------
ALTER TABLE [dbo].[t_customer_order] ADD CONSTRAINT [PK__t_custom__3213E83FA49ADE32] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_department
-- ----------------------------
ALTER TABLE [dbo].[t_department] ADD CONSTRAINT [PK__t_depart__3213E83F833BC300] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_department_role
-- ----------------------------
ALTER TABLE [dbo].[t_department_role] ADD CONSTRAINT [PK__t_depart__3213E83FBCF01F11] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_fee_item
-- ----------------------------
ALTER TABLE [dbo].[t_fee_item] ADD CONSTRAINT [PK__t_fee_it__3213E83FEEB6232D] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_meal
-- ----------------------------
ALTER TABLE [dbo].[t_meal] ADD CONSTRAINT [PK__t_meal__3213E83FADA90493] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_meal_fee_item
-- ----------------------------
ALTER TABLE [dbo].[t_meal_fee_item] ADD CONSTRAINT [PK__t_meal_f__3213E83FF88E7A88] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient
-- ----------------------------
ALTER TABLE [dbo].[t_patient] ADD CONSTRAINT [PK__t_patien__3213E83FDAAD146C] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_check_item
-- ----------------------------
ALTER TABLE [dbo].[t_patient_check_item] ADD CONSTRAINT [PK__t_patien__3213E83F21E3AA3F] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_fee_item
-- ----------------------------
ALTER TABLE [dbo].[t_patient_fee_item] ADD CONSTRAINT [PK__t_patien__3213E83F05EB9AC4] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_group
-- ----------------------------
ALTER TABLE [dbo].[t_patient_group] ADD CONSTRAINT [PK__t_patien__3213E83F47E4B1A9] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_meal
-- ----------------------------
ALTER TABLE [dbo].[t_patient_meal] ADD CONSTRAINT [PK__t_patien__3213E83FA7C65432] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_team
-- ----------------------------
ALTER TABLE [dbo].[t_patient_team] ADD CONSTRAINT [PK__t_patien__3213E83F56A0CD33] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_team_meal
-- ----------------------------
ALTER TABLE [dbo].[t_patient_team_meal] ADD CONSTRAINT [PK__t_patien__3213E83F3A7836C0] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_team_meal_check_item
-- ----------------------------
ALTER TABLE [dbo].[t_patient_team_meal_check_item] ADD CONSTRAINT [PK__t_patien__3213E83F22B4D66F] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_patient_team_meal_fee_item
-- ----------------------------
ALTER TABLE [dbo].[t_patient_team_meal_fee_item] ADD CONSTRAINT [PK__t_patien__3213E83FF342035B] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_personal_report_check_items
-- ----------------------------
ALTER TABLE [dbo].[t_personal_report_check_items] ADD CONSTRAINT [PK__t_person__3213E83F7175F1D4] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_personal_report_fee_items
-- ----------------------------
ALTER TABLE [dbo].[t_personal_report_fee_items] ADD CONSTRAINT [PK__t_person__3213E83F99FBE63C] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_personal_report_info
-- ----------------------------
ALTER TABLE [dbo].[t_personal_report_info] ADD CONSTRAINT [PK__t_person__3213E83FF6091D13] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_personal_report_summary
-- ----------------------------
ALTER TABLE [dbo].[t_personal_report_summary] ADD CONSTRAINT [PK__t_person__3213E83F742C743B] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_potential_customers
-- ----------------------------
ALTER TABLE [dbo].[t_potential_customers] ADD CONSTRAINT [PK__t_potent__3213E83F684D52A4] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_report_info
-- ----------------------------
ALTER TABLE [dbo].[t_report_info] ADD CONSTRAINT [PK__t_report__3213E83F5C29C205] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_resource
-- ----------------------------
ALTER TABLE [dbo].[t_resource] ADD CONSTRAINT [PK__t_resour__3213E83FCB9B30B4] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_role
-- ----------------------------
ALTER TABLE [dbo].[t_role] ADD CONSTRAINT [PK__t_role__3213E83F522126B4] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_role_resource
-- ----------------------------
ALTER TABLE [dbo].[t_role_resource] ADD CONSTRAINT [PK__t_role_r__3213E83F7C6AB10E] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_sales_record
-- ----------------------------
ALTER TABLE [dbo].[t_sales_record] ADD CONSTRAINT [PK__t_sales___3213E83FC794CAE5] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_seller_info
-- ----------------------------
ALTER TABLE [dbo].[t_seller_info] ADD CONSTRAINT [PK__t_seller__3213E83FA266E8E7] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_template_info
-- ----------------------------
ALTER TABLE [dbo].[t_template_info] ADD CONSTRAINT [PK__t_templa__3213E83FBA483684] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_user
-- ----------------------------
ALTER TABLE [dbo].[t_user] ADD CONSTRAINT [PK__t_user__3213E83F64F014DC] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO


-- ----------------------------
-- Primary Key structure for table t_user_role
-- ----------------------------
ALTER TABLE [dbo].[t_user_role] ADD CONSTRAINT [PK__t_user_r__3213E83FB7C34355] PRIMARY KEY CLUSTERED ([id])
    WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
    ON [PRIMARY]
    GO

