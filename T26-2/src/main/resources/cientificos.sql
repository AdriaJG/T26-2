create database if not exists cientificos;
use cientificos;
create table if not exists cientificos (
	DNI varchar(8) primary key,
    nomapels nvarchar(255)
);

create table if not exists proyecto (
	id char(4) primary key,
    nombre nvarchar(255),
    horas int
);

create table if not exists asignado_a(
	cientifico varchar(8),
    proyecto char(4),
    primary key (cientifico, proyecto),
    foreign key (cientifico) references cientificos(DNI),
    foreign key (proyecto) references proyecto(id)
);