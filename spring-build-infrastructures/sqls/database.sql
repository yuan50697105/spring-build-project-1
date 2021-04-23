create table if not exists t_check_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    fee_item_id bigint default -1 null comment 'feeItemId',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    lowest_value decimal(13,4) default -1.0000 null comment 'lowestValue',
    highest_value decimal(13,4) default -1.0000 null comment 'highestValue',
    yin_yang varchar(50) default '' null comment 'yinYang',
    lis_code varchar(50) default '' null comment 'lisCode'
)
    comment 't_check_item' charset=utf8mb4;

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

create table if not exists t_department_role
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    department_id bigint default -1 null comment 'departmentId',
    role_id bigint default -1 null comment 'roleId'
)
    comment 't_department_role' charset=utf8mb4;

create table if not exists t_fee_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment '项目编号',
    name varchar(50) default '' null comment '项目名称',
    price decimal(13,4) default -1.0000 null comment '价格',
    dis_price decimal(13,4) default -1.0000 null comment '优惠价',
    market_price decimal(13,4) default -1.0000 null comment '市价',
    type varchar(50) default '' null comment '类型',
    sex varchar(50) default '' null comment '性别',
    age_start int default -1 null comment '年龄',
    age_end int default -1 null comment '年龄'
)
    comment 't_fee_item' charset=utf8mb4;

create table if not exists t_meal
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
    type varchar(50) default '' null comment 'type',
    price decimal(13,4) default -1.0000 null comment 'price',
    dis_price decimal(13,4) default -1.0000 null comment 'disPrice',
    market_price decimal(13,4) default -1.0000 null comment 'marketPrice'
)
    comment 't_meal' charset=utf8mb4;

create table if not exists t_meal_fee_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    meal_id bigint default -1 null comment 'mealId',
    fee_item_id bigint default -1 null comment 'feeItemId'
)
    comment 't_meal_fee_item' charset=utf8mb4;

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
    team_id bigint default -1 null comment 'groupId',
    team_code varchar(50) default '' null comment 'groupCode',
    team_name varchar(50) default '' null comment 'groupName',
    group_id bigint default -1 null comment 'groupItemId',
    group_code varchar(50) default '' null comment 'groupItemCode',
    group_name varchar(50) default '' null comment 'groupItemName',
    type varchar(50) default '' null comment 'type',
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

create table if not exists t_patient_check_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment 'patientId',
    fee_item_id bigint default -1 null comment 'feeItemId',
    check_item_id varchar(50) default '' null comment 'checkItemId',
    check_item_code varchar(50) default '' null comment 'checkItemCode',
    check_item_name varchar(50) default '' null comment 'checkItemName',
    meal_id bigint default -1 null comment 'mealId',
    source varchar(50) default '' null comment 'source'
)
    comment 't_patient_check_item' charset=utf8mb4;

create table if not exists t_patient_fee_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment 'patientId',
    fee_item_id varchar(50) default '' null comment 'feeItemId',
    fee_item_code varchar(50) default '' null comment 'feeItemCode',
    fee_item_name varchar(50) default '' null comment 'feeItemName',
    meal_id bigint default -1 null comment 'mealId',
    patient_meal_id bigint default -1 null comment 'patientMealId',
    price decimal(13,4) default -1.0000 null comment 'price',
    dis_price decimal(13,4) default -1.0000 null comment 'disPrice',
    market_price decimal(13,4) default -1.0000 null comment 'marketPrice',
    source varchar(50) default '' null comment 'source',
    type varchar(50) default '' null comment 'type'
)
    comment 't_patient_fee_item' charset=utf8mb4;

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
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    customer_id bigint default -1 null comment 'customerId',
    team_id bigint default -1 null comment 'groupId',
    person_num int default -1 null comment 'personNum',
    team_meal_id bigint default -1 null comment 'teamMealId',
    meal_id bigint default -1 null comment 'mealId',
    meal_name varchar(50) default '' null comment 'mealName'
)
    comment 't_patient_group' charset=utf8mb4;

create table if not exists t_patient_meal
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    team_id bigint default -1 null comment 'teamId',
    group_id bigint default -1 null comment 'groupId',
    meal_type varchar(50) default '' null comment 'mealType',
    meal_source varchar(50) default '' null comment 'mealSource',
    meal_id bigint default -1 null comment 'mealId',
    team_meal_id bigint default -1 null comment 'teamMealId',
    meal_code varchar(50) default '' null comment 'mealCode',
    meal_name varchar(50) default '' null comment 'mealName',
    price decimal(13,4) default -1.0000 null comment 'price',
    dis_price decimal(13,4) default -1.0000 null comment 'disPrice',
    market_price decimal(13,4) default -1.0000 null comment 'marketPrice'
)
    comment 't_patient_meal' charset=utf8mb4;

create table if not exists t_patient_team
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
    comment 't_patient_team' charset=utf8mb4;

create table if not exists t_patient_team_meal
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 not null comment 'createId',
    update_id bigint default -1 not null comment 'updateId',
    create_user varchar(50) default '' not null comment 'createUser',
    update_user varchar(50) default '' not null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' not null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' not null comment 'updateDate',
    patient_id bigint default -1 not null comment '体检者ID',
    team_id bigint default -1 not null comment 'teamId',
    team_code varchar(50) default '' not null comment 'teamCode',
    team_name varchar(50) default '' not null comment 'teamName',
    meal_type varchar(50) default '' not null comment 'mealType',
    meal_id bigint default -1 not null comment 'mealId',
    meal_code varchar(50) default '' not null comment 'mealCode',
    meal_name varchar(50) default '' not null comment 'mealName',
    price decimal(13,4) default -1.0000 not null comment 'price',
    dis_price decimal(13,4) default -1.0000 not null comment 'disPrice',
    market_price decimal(13,4) default -1.0000 not null comment 'marketPrice'
)
    comment 't_patient_team_meal' charset=utf8mb4;

create table if not exists t_patient_team_meal_check_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    team_id bigint default -1 null comment 'patientId',
    meal_id bigint default -1 null comment 'mealId',
    team_meal_id bigint default -1 null comment 'teamMealId',
    fee_item_id bigint default -1 null comment 'feeItemId',
    team_fee_item_id bigint default -1 null comment 'teamFeeItemId',
    check_item_id varchar(50) default '' null comment 'checkItemId',
    check_item_code varchar(50) default '' null comment 'checkItemCode',
    check_item_name varchar(50) default '' null comment 'checkItemName',
    source varchar(50) default '' null comment 'source'
)
    comment 't_patient_team_meal_check_item' charset=utf8mb4;

create table if not exists t_patient_team_meal_fee_item
(
    id bigint auto_increment comment 'id'
        primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    team_id bigint default -1 null comment 'teamId',
    team_meal_id bigint default -1 null comment 'teamMealId',
    meal_id bigint default -1 null comment 'patientId',
    fee_item_id bigint default -1 null comment 'feeItemId',
    fee_item_code varchar(50) default '' null comment 'feeItemCode',
    fee_item_name varchar(50) default '' null comment 'feeItemName',
    price decimal(13,4) default -1.0000 null comment 'price',
    dis_price decimal(13,4) default -1.0000 null comment 'disPrice',
    market_price decimal(13,4) default -1.0000 null comment 'marketPrice',
    source varchar(50) default '' null comment 'source',
    type varchar(50) default '' null comment 'type'
)
    comment 't_patient_team_meal_fee_item' charset=utf8mb4;

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
    resource_id bigint default -1 null comment 'permissionId'
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

create index t_user_id_name_index
    on t_user (id, name);

create index t_user_id_username_index
    on t_user (id, username);

create index t_user_name_index
    on t_user (name);

create index t_user_username_index
    on t_user (username);

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

