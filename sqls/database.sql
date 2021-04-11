create table if not exists t_customer_contract
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment '合同编号',
    name varchar(50) default '' null comment '客户名称',
    customer_id bigint default -1 null comment '客户ID',
    signing_time datetime default '1000-01-01 00:00:00' null comment '签约时间',
    status varchar(50) default '' null comment '合同状态',
    file_name varchar(50) default '' null comment 'fileName',
    bukect_name varchar(50) default '' null comment 'bukectName'
)
    comment 't_customer_contract' charset=utf8mb4;

create table if not exists t_customer_info
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment '编号',
    name varchar(50) default '' null comment '名称',
    type varchar(50) default '' null comment '类型'
)
    comment 't_customer_info' charset=utf8mb4;

create table if not exists t_department
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    name varchar(50) default '' null comment 'name',
    code varchar(50) default '' null comment 'code',
    pid bigint default -1 null comment 'pid'
)
    comment 't_department' charset=utf8mb4;

create table if not exists t_patient
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    group_id bigint default -1 null comment 'groupId',
    group_code varchar(50) default '' null comment 'groupCode',
    group_name varchar(50) default '' null comment 'groupName',
    group_item_id bigint default -1 null comment 'groupItemId',
    group_item_code varchar(50) default '' null comment 'groupItemCode',
    group_item_name varchar(50) default '' null comment 'groupItemName',
    type varchar(50) default '' null comment 'type',
    meal_type varchar(50) default '' null comment 'mealType',
    meal_id bigint default -1 null comment 'mealId',
    meal_code varchar(50) default '' null comment 'mealCode',
    meal_name varchar(50) default '' null comment 'mealName',
    code varchar(50) default '' null comment 'code',
    customer_id bigint default -1 null comment 'customerId',
    customer_type varchar(50) default '' null comment 'customerType',
    customer_name varchar(50) default '' null comment 'customerName',
    age int default -1 null comment 'age',
    sex varchar(50) default '' null comment 'sex',
    marriage varchar(50) default '' null comment 'marriage',
    bear varchar(50) default '' null comment 'bear',
    phone varchar(50) default '' null comment 'phone'
)
    comment 't_patient' charset=utf8mb4;

create table if not exists t_patient_group
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    customer_id bigint default -1 null comment 'customerId',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    age_start int default -1 null comment 'ageStart',
    age_end int default -1 null comment 'ageEnd',
    sex varchar(50) default '' null comment 'sex',
    marriage varchar(50) default '' null comment 'marriage',
    bear varchar(50) default '' null comment 'bear'
)
    comment 't_patient_group' charset=utf8mb4;

create table if not exists t_patient_group_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    customer_id bigint default -1 null comment 'customerId',
    group_id bigint default -1 null comment 'groupId',
    person_num int default -1 null comment 'personNum',
    meal_id bigint default -1 null comment 'mealId',
    meal_name varchar(50) default '' null comment 'mealName',
    meal_price decimal(13,4) default -1.0000 null comment 'mealPrice',
    meal_dis_price decimal(13,4) default -1.0000 null comment 'mealDisPrice',
    max_dis_price decimal(13,4) default -1.0000 null comment 'maxDisPrice',
    max_discount decimal(13,4) default -1.0000 null comment 'maxDiscount'
)
    comment 't_patient_group_item' charset=utf8mb4;

create table if not exists t_resource
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    name varchar(50) default '' null comment 'name',
    type varchar(50) default '' null comment 'type',
    url varchar(50) default '' null comment 'url',
    pid bigint default -1 null comment 'pid',
    weight int default -1 null comment 'weight'
)
    comment 't_permission' charset=utf8mb4;

create table if not exists t_role
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    name varchar(50) default '' null comment 'name'
)
    comment 't_role' charset=utf8mb4;

create table if not exists t_role_resource
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    role_id bigint default -1 null comment 'roleId',
    permission_id bigint default -1 null comment 'permissionId'
)
    comment 't_role_permission' charset=utf8mb4;

create table if not exists t_seller_info
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    age int default -1 null comment 'age',
    phone varchar(50) default '' null comment 'phone',
    address varchar(50) default '' null comment 'address',
    status varchar(50) default '' null comment 'status'
)
    comment 't_seller_info' charset=utf8mb4;

create table if not exists t_user
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    username varchar(50) default '' null comment '用户名',
    name varchar(50) default '' null comment '姓名',
    password varchar(50) default '' null comment '密码',
    status varchar(50) default '' null comment '状态'
)
    comment 't_user' charset=utf8mb4;

create table if not exists t_user_role
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    user_id bigint default -1 null comment 'userId',
    role_id bigint default -1 null comment 'roleId'
)
    comment 't_user_role' charset=utf8mb4;

