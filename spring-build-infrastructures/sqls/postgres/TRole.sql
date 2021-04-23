-- auto Generated on 2021-04-23
-- DROP TABLE IF EXISTS t_role;
CREATE TABLE t_role(
	id bigserial PRIMARY KEY NOT NULL,
	create_id bigint DEFAULT -1 NOT NULL,
	update_id bigint DEFAULT -1 NOT NULL,
	create_user varchar (50) DEFAULT '' NOT NULL,
	update_user varchar (50) DEFAULT '' NOT NULL,
	create_date timestamp without time zone DEFAULT '1000-01-01 00:00:00' NOT NULL,
	update_date timestamp without time zone DEFAULT '1000-01-01 00:00:00' NOT NULL,
	name varchar (50) DEFAULT '' NOT NULL
);


COMMENT ON COLUMN t_role.id IS 'id';
COMMENT ON COLUMN t_role.create_id IS 'createId';
COMMENT ON COLUMN t_role.update_id IS 'updateId';
COMMENT ON COLUMN t_role.create_user IS 'createUser';
COMMENT ON COLUMN t_role.update_user IS 'updateUser';
COMMENT ON COLUMN t_role.create_date IS 'createDate';
COMMENT ON COLUMN t_role.update_date IS 'updateDate';
COMMENT ON COLUMN t_role.name IS 'name';
