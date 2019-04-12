create table t_user(
	user_id bigint(20) not null auto_increment,
	login_name varchar(32) not null ,
	password varchar(32) not null,
	could_id varchar(32) ,
	qq_id	varchar(32) ,
	kugou_id	varchar(32),
	real_name varchar(32),
	phone varchar(16),
	email varchar(32),
	sex tinyint(2),
	photo varchar(64),

	primary key(user_id) 

)

create table t_song(
	song_id bigint(20) not null auto_increment,
	song_name varchar(32) not null ,
	sing_id bigint(20) default 0 ,
	could_id varchar(32) ,
	qq_id varchar(32) ,
	kugou_id varchar(32) ,
	primary key(song_id)

)

create table t_label(
	label_id bigint(20) not null auto_increment,
	label_name varchar(32) not null,
	primary key(label_id)
)

create table song_label(
	t_id bigint(20) not null auto_increment,
	sing_id bigint(20) ,
	label_id bigint(20),
	primary key(sl_id)
)

create table t_sList(
	list_id bigint(20) not null auto_increment,
	list_name varchar(32) not null,
	list_pic varchar(64) ,
	user_id bigint(20),
	belong_site tinyint(4) comment '1网易,2qq,3kugou',
	primary key(list_id)
)

create table sList_song(
	t_id bigint(20) not null auto_increment,
	list_id bigint(20) ,
	sing_id bigint(20),
	primary key(t_id)
)