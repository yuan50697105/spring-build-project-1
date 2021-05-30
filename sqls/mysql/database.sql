create table t_bill_info (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    order_no varchar(50) default '' null comment '订单号',
    patient_code varchar(50) default '' null comment '体检号',
    patient_id varchar(50) default '' null comment '体检人ID',
    patient_name varchar(50) default '' null comment '体检人姓名',
    patient_id_card_no varchar(50) default '' null comment '体检人身份证号',
    total_price decimal(13, 4) default -1.0000 null comment '总价'
) comment 't_bill_info' charset = utf8mb4;
create table t_bill_items_info (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    bill_id varchar(50) default '' null comment 'billId',
    order_no varchar(50) default '' null comment 'orderNo',
    sub_bill_id bigint default -1 null comment 'subBillId',
    sub_order_no varchar(50) default '' null comment 'subOrderNo',
    item_id bigint default -1 null comment 'itemId',
    item_name varchar(50) default '' null comment 'itemName',
    item_price decimal(13, 4) default -1.0000 null comment 'itemPrice',
    num decimal(13, 4) default -1.0000 null comment 'num',
    total_price decimal(13, 4) default -1.0000 null comment 'totalPrice'
) comment 't_bill_items_info' charset = utf8mb4;
create table t_bill_log (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    order_no varchar(50) default '' null comment '订单号',
    patient_code varchar(50) default '' null comment '体检号',
    patient_id varchar(50) default '' null comment 'patientId',
    current_total_price decimal(13, 4) default -1.0000 null comment '当前价格',
    previous_total_price decimal(13, 4) default -1.0000 null comment '之前价格',
    previous_id bigint default -1 null comment '之前Id',
    type varchar(50) default '' null comment '类型
     *
     * @see  BillLogType'
) comment 't_bill_log' charset = utf8mb4;
create table t_bill_sub_info (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    sub_order_no varchar(50) default '' null comment '子单单号',
    bill_id varchar(50) default '' null comment '总单ID',
    order_no varchar(50) default '' null comment '总单单号',
    total_price decimal(13, 4) default -1.0000 null comment '总价',
    status varchar(50) default '' null comment '状态
     * @see BillSubInfoStatus'
) comment 't_bill_sub_info' charset = utf8mb4;
create table t_check_department (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    type varchar(50) default '' null comment 'type',
    location varchar(50) default '' null comment 'location'
) comment 't_check_department' charset = utf8mb4;
create table t_check_department_items (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    check_item_id varchar(50) default '' null comment 'checkItemId'
) comment 't_check_department_items' charset = utf8mb4;
create table t_check_item (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    fee_item_id bigint default -1 null comment 'feeItemId',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    lowest_value decimal(13, 4) default -1.0000 null comment 'lowestValue',
    highest_value decimal(13, 4) default -1.0000 null comment 'highestValue',
    yin_yang varchar(50) default '' null comment 'yinYang',
    lis_code varchar(50) default '' null comment 'lisCode'
) comment 't_check_item' charset = utf8mb4;
create table t_customer_contract (
    id bigint auto_increment comment 'id' primary key,
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
) comment 't_customer_contract' charset = utf8mb4;
create table t_customer_info (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment '编号',
    name varchar(50) default '' null comment '名称',
    type varchar(50) default '' null comment '类型'
) comment 't_customer_info' charset = utf8mb4;
create table t_customer_order (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    order_no varchar(50) default '' null comment 'orderNo',
    customer_id varchar(50) default '' null comment 'customerId',
    customer_code varchar(50) default '' null comment 'customerCode',
    customer_name varchar(50) default '' null comment 'customerName',
    total_amount decimal(13, 4) default -1.0000 null comment 'totalAmount',
    status varchar(50) default '' null comment 'status'
) comment 't_customer_order' charset = utf8mb4;
create table t_department (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    name varchar(50) default '' null comment 'name',
    code varchar(50) default '' null comment 'code',
    pid bigint default -1 null comment 'pid'
) comment 't_department' charset = utf8mb4;
create table t_department_role (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    department_id bigint default -1 null comment 'departmentId',
    role_id bigint default -1 null comment 'roleId'
) comment 't_department_role' charset = utf8mb4;
create table t_fee_item (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment '项目编号',
    name varchar(50) default '' null comment '项目名称',
    price decimal(13, 4) default -1.0000 null comment '价格',
    dis_price decimal(13, 4) default -1.0000 null comment '优惠价',
    market_price decimal(13, 4) default -1.0000 null comment '市价',
    type varchar(50) default '' null comment '类型',
    sex varchar(50) default '' null comment '性别',
    age_start int default -1 null comment '年龄',
    age_end int default -1 null comment '年龄'
) comment 't_fee_item' charset = utf8mb4;
create table t_meal (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    type varchar(50) default '' null comment 'type',
    price decimal(13, 4) default -1.0000 null comment 'price',
    dis_price decimal(13, 4) default -1.0000 null comment 'disPrice',
    market_price decimal(13, 4) default -1.0000 null comment 'marketPrice'
) comment 't_meal' charset = utf8mb4;
create table t_meal_fee_item (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    meal_id bigint default -1 null comment 'mealId',
    fee_item_id bigint default -1 null comment 'feeItemId'
) comment 't_meal_fee_item' charset = utf8mb4;
create table t_patient (
    id bigint auto_increment comment 'id' primary key,
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
) comment 't_patient' charset = utf8mb4;
create table t_patient_check_item (
    id bigint auto_increment comment 'id' primary key,
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
) comment 't_patient_check_item' charset = utf8mb4;
create table t_patient_fee_item (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment 'patientId',
    fee_item_id bigint default -1 null comment 'feeItemId',
    fee_item_code varchar(50) default '' null comment 'feeItemCode',
    fee_item_name varchar(50) default '' null comment 'feeItemName',
    meal_id bigint default -1 null comment 'mealId',
    patient_meal_id bigint default -1 null comment 'patientMealId',
    price decimal(13, 4) default -1.0000 null comment 'price',
    dis_price decimal(13, 4) default -1.0000 null comment 'disPrice',
    market_price decimal(13, 4) default -1.0000 null comment 'marketPrice',
    source varchar(50) default '' null comment 'source',
    type varchar(50) default '' null comment 'type'
) comment 't_patient_fee_item' charset = utf8mb4;
create table t_patient_group (
    id bigint auto_increment comment 'id' primary key,
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
    team_meal_id bigint default -1 null comment 'teamMealId',
    meal_id bigint default -1 null comment 'mealId',
    meal_name varchar(50) default '' null comment 'mealName',
    person_num int default -1 null comment 'personNum'
) comment 't_patient_group' charset = utf8mb4;
create table t_patient_meal (
    id bigint auto_increment comment 'id' primary key,
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
    price decimal(13, 4) default -1.0000 null comment 'price',
    dis_price decimal(13, 4) default -1.0000 null comment 'disPrice',
    market_price decimal(13, 4) default -1.0000 null comment 'marketPrice'
) comment 't_patient_meal' charset = utf8mb4;
create table t_patient_team (
    id bigint auto_increment comment 'id' primary key,
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
) comment 't_patient_team' charset = utf8mb4;
create table t_patient_team_meal (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment '体检者ID',
    team_id bigint default -1 null comment 'teamId',
    team_code varchar(50) default '' null comment 'teamCode',
    team_name varchar(50) default '' null comment 'teamName',
    meal_type varchar(50) default '' null comment 'mealType',
    meal_id bigint default -1 null comment 'mealId',
    meal_code varchar(50) default '' null comment 'mealCode',
    meal_name varchar(50) default '' null comment 'mealName',
    price decimal(13, 4) default -1.0000 null comment 'price',
    dis_price decimal(13, 4) default -1.0000 null comment 'disPrice',
    market_price decimal(13, 4) default -1.0000 null comment 'marketPrice'
) comment 't_patient_team_meal' charset = utf8mb4;
create table t_patient_team_meal_check_item (
    id bigint auto_increment comment 'id' primary key,
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
) comment 't_patient_team_meal_check_item' charset = utf8mb4;
create table t_patient_team_meal_fee_item (
    id bigint auto_increment comment 'id' primary key,
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
    price decimal(13, 4) default -1.0000 null comment 'price',
    dis_price decimal(13, 4) default -1.0000 null comment 'disPrice',
    market_price decimal(13, 4) default -1.0000 null comment 'marketPrice',
    source varchar(50) default '' null comment 'source',
    type varchar(50) default '' null comment 'type'
) comment 't_patient_team_meal_fee_item' charset = utf8mb4;
create table t_personal_report_check_items (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment 'patientId',
    fee_item_id bigint default -1 null comment 'feeItemId',
    check_item_id bigint default -1 null comment 'checkItemId',
    check_item_name varchar(50) default '' null comment 'checkItemName',
    result_type varchar(50) default '' null comment 'resultType',
    lower_limit varchar(50) default '' null comment 'lowerLimit',
    upper_limit varchar(50) default '' null comment 'upperLimit',
    detection_value varchar(50) default '' null comment 'detectionValue',
    conclusion varchar(50) default '' null comment 'conclusion'
) comment 't_personal_report_check_items' charset = utf8mb4;
create table t_personal_report_fee_items (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment 'patientId',
    fee_item_id bigint default -1 null comment 'feeItemId',
    fee_item_name varchar(50) default '' null comment 'feeItemName',
    conclusion varchar(50) default '' null comment 'conclusion'
) comment 't_personal_report_fee_items' charset = utf8mb4;
create table t_personal_report_info (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment 'patientId',
    patient_name varchar(50) default '' null comment 'patientName',
    patient_id_number varchar(50) default '' null comment 'patientIdNumber',
    patient_phone varchar(50) default '' null comment 'patientPhone',
    file_name varchar(50) default '' null comment 'fileName',
    bucket_name varchar(50) default '' null comment 'bucketName',
    template_id bigint default -1 null comment 'templateId'
) comment 't_personal_report_info' charset = utf8mb4;
create table t_personal_report_summary (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    patient_id bigint default -1 null comment 'patientId',
    conclusion varchar(50) default '' null comment 'conclusion'
) comment 't_personal_report_summary' charset = utf8mb4;
create table t_potential_customers (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment 'code',
    name varchar(50) default '' null comment 'name',
    phone varchar(50) default '' null comment 'phone',
    level varchar(50) default '' null comment 'level'
) comment 't_potential_customers' charset = utf8mb4;
create table t_report_info (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    code varchar(50) default '' null comment '报告编号',
    patient_id bigint default -1 null comment '体检ID',
    patient_code varchar(50) default '' null comment '体检号',
    name varchar(50) default '' null comment '人员姓名',
    bucket_name varchar(50) default '' null comment '对象名称',
    file_name varchar(50) default '' null comment '文件名称',
    versions int default -1 null comment 'versions'
) comment 't_report_info' charset = utf8mb4;
create table t_resource (
    id bigint auto_increment comment 'id' primary key,
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
) comment 't_resource' charset = utf8mb4;
create table t_role (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    name varchar(50) default '' null comment 'name'
) comment 't_role' charset = utf8mb4;
create table t_role_resource (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    role_id bigint default -1 null comment 'roleId',
    resource_id bigint default -1 null comment 'permissionId'
) comment 't_role_resource' charset = utf8mb4;
create table t_sales_record (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    seller_id bigint default -1 null comment '销售员Id',
    seller_code varchar(50) default '' null comment '销售员编号',
    customer_id bigint default -1 null comment '客户ID',
    customer_code varchar(50) default '' null comment '客户编号',
    customer_name varchar(50) default '' null comment '客户姓名',
    amount decimal(13, 4) default -1.0000 null comment '金额'
) comment 't_sales_record' charset = utf8mb4;
create table t_seller_info (
    id bigint auto_increment comment 'id' primary key,
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
) comment 't_seller_info' charset = utf8mb4;
create table t_template_info (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    type varchar(50) default '' null comment 'type',
    code bigint default -1 null comment 'code',
    name varchar(50) default '' null comment 'name',
    bucket_name varchar(50) default '' null comment 'bucketName',
    file_name varchar(50) default '' null comment 'fileName'
) comment 't_template_info' charset = utf8mb4;
create table t_user (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    username varchar(50) default '' null comment '用户名',
    name varchar(50) default '' null comment '姓名',
    password varchar(50) default '' null comment '密码',
    status varchar(50) default '' null comment '状态
     *
     * @see TUserStatus'
) comment 't_user' charset = utf8mb4;
create table t_user_role (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    user_id bigint default -1 null comment 'userId',
    role_id bigint default -1 null comment 'roleId'
) comment 't_user_role' charset = utf8mb4;
create table t_user_token (
    id bigint auto_increment comment 'id' primary key,
    create_id bigint default -1 null comment 'createId',
    update_id bigint default -1 null comment 'updateId',
    create_user varchar(50) default '' null comment 'createUser',
    update_user varchar(50) default '' null comment 'updateUser',
    create_date datetime default '1000-01-01 00:00:00' null comment 'createDate',
    update_date datetime default '1000-01-01 00:00:00' null comment 'updateDate',
    user_id bigint default -1 null comment '用户ID',
    username varchar(50) default '' null comment '用户名',
    obtain_time datetime default '1000-01-01 00:00:00' null comment '获取时间',
    expiration_time datetime default '1000-01-01 00:00:00' null comment '失效时间',
    token varchar(50) default '' null comment '秘钥内容',
    status varchar(50) default '' null comment '秘钥状态
     *
     * @see org.example.spring.daos.mysql.table.enumerate.TUserTokenStatus'
) comment 't_user_token' charset = utf8mb4;