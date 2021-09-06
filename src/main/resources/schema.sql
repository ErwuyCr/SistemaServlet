drop table if exists usuario;
create table usuario
(
	id int auto_increment primary key,
	nombre varchar(100) not null,
	apellido varchar(100) not null,
);

