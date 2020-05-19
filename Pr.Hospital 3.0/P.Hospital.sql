create database Hospital;

use Hospital;

create table Hospital(
id_Hospital int primary key auto_increment,
nm_Hospital varchar (45),
ds_endereco varchar(100)
);

create table Paciente(
cd_Paciente int primary key auto_increment,
nm_paciente varchar(50),
nr_cpf varchar(14),
nr_rg varchar(20),
nr_idade int,
ds_senha varchar(45),
id_hospital int,
foreign key (id_Hospital) references Hospital(id_hospital)
);

create table Funcionarios(
id_funcionario int AUTO_INCREMENT primary key,
cd_Pacientes int,
nm_Paciente varchar(50),
nr_cpf varchar(14),
nr_idade int,
ds_senha varchar(45),
vl_hora decimal(5,2),
id_hospital int,
foreign key (id_hospital) references Hospital(id_hospital)
);

create table Medicos(
cd_Medico int PRIMARY KEY auto_increment,
nr_crm varchar(45),
ds_espacialidade varchar(45),
id_funcionario int,
foreign key (id_funcionario) references Funcionarios(id_funcionario)
);

create table Enfermeiros(
cd_enfermeiro int primary key auto_increment,
coren VARCHAR(45),
id_funcionario int,
foreign key (id_funcionario) references Funcionarios(id_funcionario)
);

create table pronto_socorro(
id_pronto_socorro int PRIMARY KEY auto_increment,
ds_endereco VARCHAR(100),
id_hospital int,
foreign key (id_hospital) references Hospital(id_hospital)
);