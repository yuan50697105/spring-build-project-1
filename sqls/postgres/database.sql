create table if not exists t_user
(
    id bigserial not null
        constraint t_user_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    username varchar(50) default ''::character varying not null,
    name varchar(50) default ''::character varying not null,
    password varchar(50) default ''::character varying,
    status varchar(50) default ''::character varying
);

comment on column t_user.id is 'id';

comment on column t_user.create_id is 'createId';

comment on column t_user.update_id is 'updateId';

comment on column t_user.create_user is 'createUser';

comment on column t_user.update_user is 'updateUser';

comment on column t_user.create_date is 'createDate';

comment on column t_user.update_date is 'updateDate';

comment on column t_user.username is 'username';

comment on column t_user.name is 'name';

comment on column t_user.password is 'password';

comment on column t_user.status is 'status';

alter table t_user owner to yuanenzhi;

create unique index if not exists t_user_username_uindex
    on t_user (username);

create table if not exists t_role
(
    id bigserial not null
        constraint t_role_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    name varchar(50) default ''::character varying not null
);

comment on column t_role.id is 'id';

comment on column t_role.create_id is 'createId';

comment on column t_role.update_id is 'updateId';

comment on column t_role.create_user is 'createUser';

comment on column t_role.update_user is 'updateUser';

comment on column t_role.create_date is 'createDate';

comment on column t_role.update_date is 'updateDate';

comment on column t_role.name is 'name';

alter table t_role owner to yuanenzhi;

create unique index if not exists t_role_name_uindex
    on t_role (name);

create table if not exists t_user_role
(
    id bigserial not null
        constraint t_user_role_pkey
        primary key,
    create_id bigint default '-1'::integer not null,
    update_id bigint default '-1'::integer not null,
    create_user varchar(50) default ''::character varying not null,
    update_user varchar(50) default ''::character varying not null,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    user_id bigint default '-1'::integer not null,
    role_id bigint default '-1'::integer not null
);

comment on column t_user_role.id is 'id';

comment on column t_user_role.create_id is 'createId';

comment on column t_user_role.update_id is 'updateId';

comment on column t_user_role.create_user is 'createUser';

comment on column t_user_role.update_user is 'updateUser';

comment on column t_user_role.create_date is 'createDate';

comment on column t_user_role.update_date is 'updateDate';

comment on column t_user_role.user_id is 'userId';

comment on column t_user_role.role_id is 'roleId';

alter table t_user_role owner to yuanenzhi;

create table if not exists t_resource
(
    id bigserial not null
        constraint t_resource_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    name varchar(50) default ''::character varying,
    type varchar(50) default ''::character varying,
    url varchar(50) default ''::character varying,
    pid bigint default '-1'::integer,
    weight integer default '-1'::integer
);

comment on column t_resource.id is 'id';

comment on column t_resource.create_id is 'createId';

comment on column t_resource.update_id is 'updateId';

comment on column t_resource.create_user is 'createUser';

comment on column t_resource.update_user is 'updateUser';

comment on column t_resource.create_date is 'createDate';

comment on column t_resource.update_date is 'updateDate';

comment on column t_resource.name is 'name';

comment on column t_resource.type is 'type';

comment on column t_resource.url is 'url';

comment on column t_resource.pid is 'pid';

comment on column t_resource.weight is 'weight';

alter table t_resource owner to yuanenzhi;

create table if not exists t_role_resource
(
    id bigserial not null
        constraint t_role_resource_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    role_id bigint default '-1'::integer,
    resource_id bigint default '-1'::integer
);

comment on column t_role_resource.id is 'id';

comment on column t_role_resource.create_id is 'createId';

comment on column t_role_resource.update_id is 'updateId';

comment on column t_role_resource.create_user is 'createUser';

comment on column t_role_resource.update_user is 'updateUser';

comment on column t_role_resource.create_date is 'createDate';

comment on column t_role_resource.update_date is 'updateDate';

comment on column t_role_resource.role_id is 'roleId';

comment on column t_role_resource.resource_id is 'permissionId';

alter table t_role_resource owner to yuanenzhi;

create table if not exists t_department
(
    id bigserial not null
        constraint t_department_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    name varchar(50) default ''::character varying,
    code varchar(50) default ''::character varying,
    pid bigint default '-1'::integer
);

comment on column t_department.id is 'id';

comment on column t_department.create_id is 'createId';

comment on column t_department.update_id is 'updateId';

comment on column t_department.create_user is 'createUser';

comment on column t_department.update_user is 'updateUser';

comment on column t_department.create_date is 'createDate';

comment on column t_department.update_date is 'updateDate';

comment on column t_department.name is 'name';

comment on column t_department.code is 'code';

comment on column t_department.pid is 'pid';

alter table t_department owner to yuanenzhi;

create table if not exists t_department_role
(
    id bigserial not null
        constraint t_department_role_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    department_id bigint default '-1'::integer,
    role_id bigint default '-1'::integer
);

comment on column t_department_role.id is 'id';

comment on column t_department_role.create_id is 'createId';

comment on column t_department_role.update_id is 'updateId';

comment on column t_department_role.create_user is 'createUser';

comment on column t_department_role.update_user is 'updateUser';

comment on column t_department_role.create_date is 'createDate';

comment on column t_department_role.update_date is 'updateDate';

comment on column t_department_role.department_id is 'departmentId';

comment on column t_department_role.role_id is 'roleId';

alter table t_department_role owner to yuanenzhi;

create table if not exists t_customer_contract
(
    id bigserial not null
        constraint t_customer_contract_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    customer_id bigint default '-1'::integer,
    signing_time timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    status varchar(50) default ''::character varying,
    file_name varchar(50) default ''::character varying,
    bukect_name varchar(50) default ''::character varying
);

comment on column t_customer_contract.id is 'id';

comment on column t_customer_contract.create_id is 'createId';

comment on column t_customer_contract.update_id is 'updateId';

comment on column t_customer_contract.create_user is 'createUser';

comment on column t_customer_contract.update_user is 'updateUser';

comment on column t_customer_contract.create_date is 'createDate';

comment on column t_customer_contract.update_date is 'updateDate';

comment on column t_customer_contract.code is '合同编号';

comment on column t_customer_contract.name is '客户名称';

comment on column t_customer_contract.customer_id is '客户ID';

comment on column t_customer_contract.signing_time is '签约时间';

comment on column t_customer_contract.status is '合同状态';

comment on column t_customer_contract.file_name is 'fileName';

comment on column t_customer_contract.bukect_name is 'bukectName';

alter table t_customer_contract owner to yuanenzhi;

create table if not exists t_customer_info
(
    id bigserial not null
        constraint t_customer_info_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    type varchar(50) default ''::character varying
);

comment on column t_customer_info.id is 'id';

comment on column t_customer_info.create_id is 'createId';

comment on column t_customer_info.update_id is 'updateId';

comment on column t_customer_info.create_user is 'createUser';

comment on column t_customer_info.update_user is 'updateUser';

comment on column t_customer_info.create_date is 'createDate';

comment on column t_customer_info.update_date is 'updateDate';

comment on column t_customer_info.code is '编号';

comment on column t_customer_info.name is '名称';

comment on column t_customer_info.type is '类型';

alter table t_customer_info owner to yuanenzhi;

create table if not exists t_seller_info
(
    id bigserial not null
        constraint t_seller_info_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    age integer default '-1'::integer,
    phone varchar(50) default ''::character varying,
    address varchar(50) default ''::character varying,
    status varchar(50) default ''::character varying
);

comment on column t_seller_info.id is 'id';

comment on column t_seller_info.create_id is 'createId';

comment on column t_seller_info.update_id is 'updateId';

comment on column t_seller_info.create_user is 'createUser';

comment on column t_seller_info.update_user is 'updateUser';

comment on column t_seller_info.create_date is 'createDate';

comment on column t_seller_info.update_date is 'updateDate';

comment on column t_seller_info.code is 'code';

comment on column t_seller_info.name is 'name';

comment on column t_seller_info.age is 'age';

comment on column t_seller_info.phone is 'phone';

comment on column t_seller_info.address is 'address';

comment on column t_seller_info.status is 'status';

alter table t_seller_info owner to yuanenzhi;

create table if not exists t_check_item
(
    id bigserial not null
        constraint t_check_item_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    fee_item_id bigint default '-1'::integer,
    code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    lowest_value numeric(13,4) default '-1'::integer,
    highest_value numeric(13,4) default '-1'::integer,
    yin_yang varchar(50) default ''::character varying,
    lis_code varchar(50) default ''::character varying
);

comment on column t_check_item.id is 'id';

comment on column t_check_item.create_id is 'createId';

comment on column t_check_item.update_id is 'updateId';

comment on column t_check_item.create_user is 'createUser';

comment on column t_check_item.update_user is 'updateUser';

comment on column t_check_item.create_date is 'createDate';

comment on column t_check_item.update_date is 'updateDate';

comment on column t_check_item.fee_item_id is 'feeItemId';

comment on column t_check_item.code is 'code';

comment on column t_check_item.name is 'name';

comment on column t_check_item.lowest_value is 'lowestValue';

comment on column t_check_item.highest_value is 'highestValue';

comment on column t_check_item.yin_yang is 'yinYang';

comment on column t_check_item.lis_code is 'lisCode';

alter table t_check_item owner to yuanenzhi;

create table if not exists t_fee_item
(
    id bigserial not null
        constraint t_fee_item_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    price numeric(13,4) default '-1'::integer,
    dis_price numeric(13,4) default '-1'::integer,
    market_price numeric(13,4) default '-1'::integer,
    type varchar(50) default ''::character varying,
    sex varchar(50) default ''::character varying,
    age_start integer default '-1'::integer,
    age_end integer default '-1'::integer
);

comment on column t_fee_item.id is 'id';

comment on column t_fee_item.create_id is 'createId';

comment on column t_fee_item.update_id is 'updateId';

comment on column t_fee_item.create_user is 'createUser';

comment on column t_fee_item.update_user is 'updateUser';

comment on column t_fee_item.create_date is 'createDate';

comment on column t_fee_item.update_date is 'updateDate';

comment on column t_fee_item.code is '项目编号';

comment on column t_fee_item.name is '项目名称';

comment on column t_fee_item.price is '价格';

comment on column t_fee_item.dis_price is '优惠价';

comment on column t_fee_item.market_price is '市价';

comment on column t_fee_item.type is '类型';

comment on column t_fee_item.sex is '性别';

comment on column t_fee_item.age_start is '年龄';

comment on column t_fee_item.age_end is '年龄';

alter table t_fee_item owner to yuanenzhi;

create table if not exists t_meal
(
    id bigserial not null
        constraint t_meal_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    type varchar(50) default ''::character varying,
    price numeric(13,4) default '-1'::integer,
    dis_price numeric(13,4) default '-1'::integer,
    market_price numeric(13,4) default '-1'::integer
);

comment on column t_meal.id is 'id';

comment on column t_meal.create_id is 'createId';

comment on column t_meal.update_id is 'updateId';

comment on column t_meal.create_user is 'createUser';

comment on column t_meal.update_user is 'updateUser';

comment on column t_meal.create_date is 'createDate';

comment on column t_meal.update_date is 'updateDate';

comment on column t_meal.code is 'code';

comment on column t_meal.name is 'name';

comment on column t_meal.type is 'type';

comment on column t_meal.price is 'price';

comment on column t_meal.dis_price is 'disPrice';

comment on column t_meal.market_price is 'marketPrice';

alter table t_meal owner to yuanenzhi;

create table if not exists t_meal_fee_item
(
    id bigserial not null
        constraint t_meal_fee_item_pkey
        primary key,
    create_id bigint,
    update_id bigint,
    create_user varchar(50),
    update_user varchar(50),
    create_date timestamp,
    update_date timestamp,
    meal_id bigint,
    fee_item_id bigint
);

comment on column t_meal_fee_item.id is 'id';

comment on column t_meal_fee_item.create_id is 'createId';

comment on column t_meal_fee_item.update_id is 'updateId';

comment on column t_meal_fee_item.create_user is 'createUser';

comment on column t_meal_fee_item.update_user is 'updateUser';

comment on column t_meal_fee_item.create_date is 'createDate';

comment on column t_meal_fee_item.update_date is 'updateDate';

comment on column t_meal_fee_item.meal_id is 'mealId';

comment on column t_meal_fee_item.fee_item_id is 'feeItemId';

alter table t_meal_fee_item owner to yuanenzhi;

create table if not exists t_patient
(
    id bigserial not null
        constraint t_patient_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    team_id bigint default '-1'::integer,
    team_code varchar(50) default ''::character varying,
    team_name varchar(50) default ''::character varying,
    group_id bigint default '-1'::integer,
    group_code varchar(50) default ''::character varying,
    group_name varchar(50) default ''::character varying,
    type varchar(50) default ''::character varying,
    code varchar(50) default ''::character varying,
    customer_id bigint default '-1'::integer,
    customer_type varchar(50) default ''::character varying,
    customer_name varchar(50) default ''::character varying,
    age integer default '-1'::integer,
    sex varchar(50) default ''::character varying,
    marriage varchar(50) default ''::character varying,
    bear varchar(50) default ''::character varying,
    phone varchar(50) default ''::character varying
);

comment on column t_patient.id is 'id';

comment on column t_patient.create_id is 'createId';

comment on column t_patient.update_id is 'updateId';

comment on column t_patient.create_user is 'createUser';

comment on column t_patient.update_user is 'updateUser';

comment on column t_patient.create_date is 'createDate';

comment on column t_patient.update_date is 'updateDate';

comment on column t_patient.team_id is 'groupId';

comment on column t_patient.team_code is 'groupCode';

comment on column t_patient.team_name is 'groupName';

comment on column t_patient.group_id is 'groupItemId';

comment on column t_patient.group_code is 'groupItemCode';

comment on column t_patient.group_name is 'groupItemName';

comment on column t_patient.type is 'type';

comment on column t_patient.code is 'code';

comment on column t_patient.customer_id is 'customerId';

comment on column t_patient.customer_type is 'customerType';

comment on column t_patient.customer_name is 'customerName';

comment on column t_patient.age is 'age';

comment on column t_patient.sex is 'sex';

comment on column t_patient.marriage is 'marriage';

comment on column t_patient.bear is 'bear';

comment on column t_patient.phone is 'phone';

alter table t_patient owner to yuanenzhi;

create table if not exists t_patient_check_item
(
    id bigserial not null
        constraint t_patient_check_item_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    patient_id bigint default '-1'::integer,
    fee_item_id bigint default '-1'::integer,
    check_item_id varchar(50) default ''::character varying,
    check_item_code varchar(50) default ''::character varying,
    check_item_name varchar(50) default ''::character varying,
    meal_id bigint default '-1'::integer,
    source varchar(50) default ''::character varying
);

comment on column t_patient_check_item.id is 'id';

comment on column t_patient_check_item.create_id is 'createId';

comment on column t_patient_check_item.update_id is 'updateId';

comment on column t_patient_check_item.create_user is 'createUser';

comment on column t_patient_check_item.update_user is 'updateUser';

comment on column t_patient_check_item.create_date is 'createDate';

comment on column t_patient_check_item.update_date is 'updateDate';

comment on column t_patient_check_item.patient_id is 'patientId';

comment on column t_patient_check_item.fee_item_id is 'feeItemId';

comment on column t_patient_check_item.check_item_id is 'checkItemId';

comment on column t_patient_check_item.check_item_code is 'checkItemCode';

comment on column t_patient_check_item.check_item_name is 'checkItemName';

comment on column t_patient_check_item.meal_id is 'mealId';

comment on column t_patient_check_item.source is 'source';

alter table t_patient_check_item owner to yuanenzhi;

create table if not exists t_patient_fee_item
(
    id bigserial not null
        constraint t_patient_fee_item_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    patient_id bigint default '-1'::integer,
    fee_item_id bigint default '-1'::integer,
    fee_item_code varchar(50) default ''::character varying,
    fee_item_name varchar(50) default ''::character varying,
    meal_id bigint default '-1'::integer,
    patient_meal_id bigint default '-1'::integer,
    price numeric(13,4) default '-1'::integer,
    dis_price numeric(13,4) default '-1'::integer,
    market_price numeric(13,4) default '-1'::integer,
    source varchar(50) default ''::character varying,
    type varchar(50) default ''::character varying
);

comment on column t_patient_fee_item.id is 'id';

comment on column t_patient_fee_item.create_id is 'createId';

comment on column t_patient_fee_item.update_id is 'updateId';

comment on column t_patient_fee_item.create_user is 'createUser';

comment on column t_patient_fee_item.update_user is 'updateUser';

comment on column t_patient_fee_item.create_date is 'createDate';

comment on column t_patient_fee_item.update_date is 'updateDate';

comment on column t_patient_fee_item.patient_id is 'patientId';

comment on column t_patient_fee_item.fee_item_id is 'feeItemId';

comment on column t_patient_fee_item.fee_item_code is 'feeItemCode';

comment on column t_patient_fee_item.fee_item_name is 'feeItemName';

comment on column t_patient_fee_item.meal_id is 'mealId';

comment on column t_patient_fee_item.patient_meal_id is 'patientMealId';

comment on column t_patient_fee_item.price is 'price';

comment on column t_patient_fee_item.dis_price is 'disPrice';

comment on column t_patient_fee_item.market_price is 'marketPrice';

comment on column t_patient_fee_item.source is 'source';

comment on column t_patient_fee_item.type is 'type';

alter table t_patient_fee_item owner to yuanenzhi;

create table if not exists t_patient_group
(
    id bigserial not null
        constraint t_patient_group_pkey
        primary key,
    create_id bigint default '-1'::integer not null,
    update_id bigint default '-1'::integer not null,
    create_user varchar(50) default ''::character varying not null,
    update_user varchar(50) default ''::character varying not null,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    code varchar(50) default ''::character varying not null,
    name varchar(50) default ''::character varying not null,
    customer_id bigint default '-1'::integer not null,
    team_id bigint default '-1'::integer not null,
    team_meal_id bigint default '-1'::integer not null,
    meal_id bigint default '-1'::integer not null,
    meal_name varchar(50) default ''::character varying not null,
    person_num integer default '-1'::integer not null
);

comment on column t_patient_group.id is 'id';

comment on column t_patient_group.create_id is 'createId';

comment on column t_patient_group.update_id is 'updateId';

comment on column t_patient_group.create_user is 'createUser';

comment on column t_patient_group.update_user is 'updateUser';

comment on column t_patient_group.create_date is 'createDate';

comment on column t_patient_group.update_date is 'updateDate';

comment on column t_patient_group.code is 'code';

comment on column t_patient_group.name is 'name';

comment on column t_patient_group.customer_id is 'customerId';

comment on column t_patient_group.team_id is 'groupId';

comment on column t_patient_group.team_meal_id is 'teamMealId';

comment on column t_patient_group.meal_id is 'mealId';

comment on column t_patient_group.meal_name is 'mealName';

comment on column t_patient_group.person_num is 'personNum';

alter table t_patient_group owner to yuanenzhi;

create table if not exists t_patient_meal
(
    id bigserial not null
        constraint t_patient_meal_pkey
        primary key,
    create_id bigint default '-1'::integer not null,
    update_id bigint default '-1'::integer not null,
    create_user varchar(50) default ''::character varying not null,
    update_user varchar(50) default ''::character varying not null,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    team_id bigint default '-1'::integer not null,
    group_id bigint default '-1'::integer not null,
    meal_type varchar(50) default ''::character varying not null,
    meal_source varchar(50) default ''::character varying not null,
    meal_id bigint default '-1'::integer not null,
    team_meal_id bigint default '-1'::integer not null,
    meal_code varchar(50) default ''::character varying not null,
    meal_name varchar(50) default ''::character varying not null,
    price numeric(13,4) default '-1'::integer not null,
    dis_price numeric(13,4) default '-1'::integer not null,
    market_price numeric(13,4) default '-1'::integer not null
);

comment on column t_patient_meal.id is 'id';

comment on column t_patient_meal.create_id is 'createId';

comment on column t_patient_meal.update_id is 'updateId';

comment on column t_patient_meal.create_user is 'createUser';

comment on column t_patient_meal.update_user is 'updateUser';

comment on column t_patient_meal.create_date is 'createDate';

comment on column t_patient_meal.update_date is 'updateDate';

comment on column t_patient_meal.team_id is 'teamId';

comment on column t_patient_meal.group_id is 'groupId';

comment on column t_patient_meal.meal_type is 'mealType';

comment on column t_patient_meal.meal_source is 'mealSource';

comment on column t_patient_meal.meal_id is 'mealId';

comment on column t_patient_meal.team_meal_id is 'teamMealId';

comment on column t_patient_meal.meal_code is 'mealCode';

comment on column t_patient_meal.meal_name is 'mealName';

comment on column t_patient_meal.price is 'price';

comment on column t_patient_meal.dis_price is 'disPrice';

comment on column t_patient_meal.market_price is 'marketPrice';

alter table t_patient_meal owner to yuanenzhi;

create table if not exists t_patient_team
(
    id bigserial not null
        constraint t_patient_team_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    customer_id bigint default '-1'::integer,
    code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    age_start integer default '-1'::integer,
    age_end integer default '-1'::integer,
    sex varchar(50) default ''::character varying,
    marriage varchar(50) default ''::character varying,
    bear varchar(50) default ''::character varying
);

comment on column t_patient_team.id is 'id';

comment on column t_patient_team.create_id is 'createId';

comment on column t_patient_team.update_id is 'updateId';

comment on column t_patient_team.create_user is 'createUser';

comment on column t_patient_team.update_user is 'updateUser';

comment on column t_patient_team.create_date is 'createDate';

comment on column t_patient_team.update_date is 'updateDate';

comment on column t_patient_team.customer_id is 'customerId';

comment on column t_patient_team.code is 'code';

comment on column t_patient_team.name is 'name';

comment on column t_patient_team.age_start is 'ageStart';

comment on column t_patient_team.age_end is 'ageEnd';

comment on column t_patient_team.sex is 'sex';

comment on column t_patient_team.marriage is 'marriage';

comment on column t_patient_team.bear is 'bear';

alter table t_patient_team owner to yuanenzhi;

create table if not exists t_patient_team_meal
(
    id bigserial not null
        constraint t_patient_team_meal_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    patient_id bigint default '-1'::integer,
    team_id bigint default '-1'::integer,
    team_code varchar(50) default ''::character varying,
    team_name varchar(50) default ''::character varying,
    meal_type varchar(50) default ''::character varying,
    meal_id bigint default '-1'::integer,
    meal_code varchar(50) default ''::character varying,
    meal_name varchar(50) default ''::character varying,
    price numeric(13,4) default '-1'::integer,
    dis_price numeric(13,4) default '-1'::integer,
    market_price numeric(13,4) default '-1'::integer
);

comment on column t_patient_team_meal.id is 'id';

comment on column t_patient_team_meal.create_id is 'createId';

comment on column t_patient_team_meal.update_id is 'updateId';

comment on column t_patient_team_meal.create_user is 'createUser';

comment on column t_patient_team_meal.update_user is 'updateUser';

comment on column t_patient_team_meal.create_date is 'createDate';

comment on column t_patient_team_meal.update_date is 'updateDate';

comment on column t_patient_team_meal.patient_id is '体检者ID';

comment on column t_patient_team_meal.team_id is 'teamId';

comment on column t_patient_team_meal.team_code is 'teamCode';

comment on column t_patient_team_meal.team_name is 'teamName';

comment on column t_patient_team_meal.meal_type is 'mealType';

comment on column t_patient_team_meal.meal_id is 'mealId';

comment on column t_patient_team_meal.meal_code is 'mealCode';

comment on column t_patient_team_meal.meal_name is 'mealName';

comment on column t_patient_team_meal.price is 'price';

comment on column t_patient_team_meal.dis_price is 'disPrice';

comment on column t_patient_team_meal.market_price is 'marketPrice';

alter table t_patient_team_meal owner to yuanenzhi;

create table if not exists t_patient_team_meal_check_item
(
    id bigserial not null
        constraint t_patient_team_meal_check_item_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    team_id bigint default '-1'::integer,
    meal_id bigint default '-1'::integer,
    team_meal_id bigint default '-1'::integer,
    fee_item_id bigint default '-1'::integer,
    team_fee_item_id bigint default '-1'::integer,
    check_item_id varchar(50) default ''::character varying,
    check_item_code varchar(50) default ''::character varying,
    check_item_name varchar(50) default ''::character varying,
    source varchar(50) default ''::character varying
);

comment on column t_patient_team_meal_check_item.id is 'id';

comment on column t_patient_team_meal_check_item.create_id is 'createId';

comment on column t_patient_team_meal_check_item.update_id is 'updateId';

comment on column t_patient_team_meal_check_item.create_user is 'createUser';

comment on column t_patient_team_meal_check_item.update_user is 'updateUser';

comment on column t_patient_team_meal_check_item.create_date is 'createDate';

comment on column t_patient_team_meal_check_item.update_date is 'updateDate';

comment on column t_patient_team_meal_check_item.team_id is 'patientId';

comment on column t_patient_team_meal_check_item.meal_id is 'mealId';

comment on column t_patient_team_meal_check_item.team_meal_id is 'teamMealId';

comment on column t_patient_team_meal_check_item.fee_item_id is 'feeItemId';

comment on column t_patient_team_meal_check_item.team_fee_item_id is 'teamFeeItemId';

comment on column t_patient_team_meal_check_item.check_item_id is 'checkItemId';

comment on column t_patient_team_meal_check_item.check_item_code is 'checkItemCode';

comment on column t_patient_team_meal_check_item.check_item_name is 'checkItemName';

comment on column t_patient_team_meal_check_item.source is 'source';

alter table t_patient_team_meal_check_item owner to yuanenzhi;

create table if not exists t_patient_team_meal_fee_item
(
    id bigserial not null
        constraint t_patient_team_meal_fee_item_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    team_id bigint default '-1'::integer,
    team_meal_id bigint default '-1'::integer,
    meal_id bigint default '-1'::integer,
    fee_item_id bigint default '-1'::integer,
    fee_item_code varchar(50) default ''::character varying,
    fee_item_name varchar(50) default ''::character varying,
    price numeric(13,4) default '-1'::integer,
    dis_price numeric(13,4) default '-1'::integer,
    market_price numeric(13,4) default '-1'::integer,
    source varchar(50) default ''::character varying,
    type varchar(50) default ''::character varying
);

comment on column t_patient_team_meal_fee_item.id is 'id';

comment on column t_patient_team_meal_fee_item.create_id is 'createId';

comment on column t_patient_team_meal_fee_item.update_id is 'updateId';

comment on column t_patient_team_meal_fee_item.create_user is 'createUser';

comment on column t_patient_team_meal_fee_item.update_user is 'updateUser';

comment on column t_patient_team_meal_fee_item.create_date is 'createDate';

comment on column t_patient_team_meal_fee_item.update_date is 'updateDate';

comment on column t_patient_team_meal_fee_item.team_id is 'teamId';

comment on column t_patient_team_meal_fee_item.team_meal_id is 'teamMealId';

comment on column t_patient_team_meal_fee_item.meal_id is 'patientId';

comment on column t_patient_team_meal_fee_item.fee_item_id is 'feeItemId';

comment on column t_patient_team_meal_fee_item.fee_item_code is 'feeItemCode';

comment on column t_patient_team_meal_fee_item.fee_item_name is 'feeItemName';

comment on column t_patient_team_meal_fee_item.price is 'price';

comment on column t_patient_team_meal_fee_item.dis_price is 'disPrice';

comment on column t_patient_team_meal_fee_item.market_price is 'marketPrice';

comment on column t_patient_team_meal_fee_item.source is 'source';

comment on column t_patient_team_meal_fee_item.type is 'type';

alter table t_patient_team_meal_fee_item owner to yuanenzhi;

create table if not exists t_personal_report_check_items
(
    id bigserial not null
        constraint t_personal_report_check_items_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    patient_id bigint default '-1'::integer,
    fee_item_id bigint default '-1'::integer,
    check_item_id bigint default '-1'::integer,
    check_item_name varchar(50) default ''::character varying,
    result_type varchar(50) default ''::character varying,
    lower_limit varchar(50) default ''::character varying,
    upper_limit varchar(50) default ''::character varying,
    detection_value varchar(50) default ''::character varying,
    conclusion varchar(50) default ''::character varying
);

comment on column t_personal_report_check_items.id is 'id';

comment on column t_personal_report_check_items.create_id is 'createId';

comment on column t_personal_report_check_items.update_id is 'updateId';

comment on column t_personal_report_check_items.create_user is 'createUser';

comment on column t_personal_report_check_items.update_user is 'updateUser';

comment on column t_personal_report_check_items.create_date is 'createDate';

comment on column t_personal_report_check_items.update_date is 'updateDate';

comment on column t_personal_report_check_items.patient_id is 'patientId';

comment on column t_personal_report_check_items.fee_item_id is 'feeItemId';

comment on column t_personal_report_check_items.check_item_id is 'checkItemId';

comment on column t_personal_report_check_items.check_item_name is 'checkItemName';

comment on column t_personal_report_check_items.result_type is 'resultType';

comment on column t_personal_report_check_items.lower_limit is 'lowerLimit';

comment on column t_personal_report_check_items.upper_limit is 'upperLimit';

comment on column t_personal_report_check_items.detection_value is 'detectionValue';

comment on column t_personal_report_check_items.conclusion is 'conclusion';

alter table t_personal_report_check_items owner to yuanenzhi;

create table if not exists t_personal_report_fee_items
(
    id bigserial not null
        constraint t_personal_report_fee_items_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    patient_id bigint default '-1'::integer,
    fee_item_id bigint default '-1'::integer,
    fee_item_name varchar(50) default ''::character varying,
    conclusion varchar(50) default ''::character varying
);

comment on column t_personal_report_fee_items.id is 'id';

comment on column t_personal_report_fee_items.create_id is 'createId';

comment on column t_personal_report_fee_items.update_id is 'updateId';

comment on column t_personal_report_fee_items.create_user is 'createUser';

comment on column t_personal_report_fee_items.update_user is 'updateUser';

comment on column t_personal_report_fee_items.create_date is 'createDate';

comment on column t_personal_report_fee_items.update_date is 'updateDate';

comment on column t_personal_report_fee_items.patient_id is 'patientId';

comment on column t_personal_report_fee_items.fee_item_id is 'feeItemId';

comment on column t_personal_report_fee_items.fee_item_name is 'feeItemName';

comment on column t_personal_report_fee_items.conclusion is 'conclusion';

alter table t_personal_report_fee_items owner to yuanenzhi;

create table if not exists t_personal_report_info
(
    id bigserial not null
        constraint t_personal_report_info_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    patient_id bigint default '-1'::integer,
    patient_name varchar(50) default ''::character varying,
    patient_id_number varchar(50) default ''::character varying,
    patient_phone varchar(50) default ''::character varying,
    file_name varchar(50) default ''::character varying,
    bucket_name varchar(50) default ''::character varying,
    template_id bigint default '-1'::integer
);

comment on column t_personal_report_info.id is 'id';

comment on column t_personal_report_info.create_id is 'createId';

comment on column t_personal_report_info.update_id is 'updateId';

comment on column t_personal_report_info.create_user is 'createUser';

comment on column t_personal_report_info.update_user is 'updateUser';

comment on column t_personal_report_info.create_date is 'createDate';

comment on column t_personal_report_info.update_date is 'updateDate';

comment on column t_personal_report_info.patient_id is 'patientId';

comment on column t_personal_report_info.patient_name is 'patientName';

comment on column t_personal_report_info.patient_id_number is 'patientIdNumber';

comment on column t_personal_report_info.patient_phone is 'patientPhone';

comment on column t_personal_report_info.file_name is 'fileName';

comment on column t_personal_report_info.bucket_name is 'bucketName';

comment on column t_personal_report_info.template_id is 'templateId';

alter table t_personal_report_info owner to yuanenzhi;

create table if not exists t_personal_report_summary
(
    id bigserial not null
        constraint t_personal_report_summary_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    patient_id bigint default '-1'::integer,
    conclusion varchar(50) default ''::character varying
);

comment on column t_personal_report_summary.id is 'id';

comment on column t_personal_report_summary.create_id is 'createId';

comment on column t_personal_report_summary.update_id is 'updateId';

comment on column t_personal_report_summary.create_user is 'createUser';

comment on column t_personal_report_summary.update_user is 'updateUser';

comment on column t_personal_report_summary.create_date is 'createDate';

comment on column t_personal_report_summary.update_date is 'updateDate';

comment on column t_personal_report_summary.patient_id is 'patientId';

comment on column t_personal_report_summary.conclusion is 'conclusion';

alter table t_personal_report_summary owner to yuanenzhi;

create table if not exists t_report_info
(
    id bigserial not null
        constraint t_report_info_pkey
        primary key,
    create_id bigint default '-1'::integer,
    update_id bigint default '-1'::integer,
    create_user varchar(50) default ''::character varying,
    update_user varchar(50) default ''::character varying,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone,
    code varchar(50) default ''::character varying,
    patient_id bigint default '-1'::integer,
    patient_code varchar(50) default ''::character varying,
    name varchar(50) default ''::character varying,
    bucket_name varchar(50) default ''::character varying,
    file_name varchar(50) default ''::character varying,
    versions integer default '-1'::integer
);

comment on column t_report_info.id is 'id';

comment on column t_report_info.create_id is 'createId';

comment on column t_report_info.update_id is 'updateId';

comment on column t_report_info.create_user is 'createUser';

comment on column t_report_info.update_user is 'updateUser';

comment on column t_report_info.create_date is 'createDate';

comment on column t_report_info.update_date is 'updateDate';

comment on column t_report_info.code is '报告编号';

comment on column t_report_info.patient_id is '体检ID';

comment on column t_report_info.patient_code is '体检号';

comment on column t_report_info.name is '人员姓名';

comment on column t_report_info.bucket_name is '对象名称';

comment on column t_report_info.file_name is '文件名称';

comment on column t_report_info.versions is 'versions';

alter table t_report_info owner to yuanenzhi;

create table if not exists t_template_info
(
    id bigserial not null
        constraint t_template_info_pkey
        primary key,
    create_id bigint default '-1'::integer not null,
    update_id bigint default '-1'::integer not null,
    create_user varchar(50) default ''::character varying not null,
    update_user varchar(50) default ''::character varying not null,
    create_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    update_date timestamp default '1000-01-01 00:00:00'::timestamp without time zone not null,
    type varchar(50) default ''::character varying not null,
    code bigint default '-1'::integer not null,
    name varchar(50) default ''::character varying not null,
    bucket_name varchar(50) default ''::character varying not null,
    file_name varchar(50) default ''::character varying not null
);

comment on column t_template_info.id is 'id';

comment on column t_template_info.create_id is 'createId';

comment on column t_template_info.update_id is 'updateId';

comment on column t_template_info.create_user is 'createUser';

comment on column t_template_info.update_user is 'updateUser';

comment on column t_template_info.create_date is 'createDate';

comment on column t_template_info.update_date is 'updateDate';

comment on column t_template_info.type is 'type';

comment on column t_template_info.code is 'code';

comment on column t_template_info.name is 'name';

comment on column t_template_info.bucket_name is 'bucketName';

comment on column t_template_info.file_name is 'fileName';

alter table t_template_info owner to yuanenzhi;

