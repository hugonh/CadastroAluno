create database Cadastrosp;
	use Cadastrosp;



Create table Aluno(
Id int primary key not null  auto_increment,
Nome Varchar(80) not null,
Email Varchar(80) not null,
Version int not null);


insert into Aluno(nome,email,version)
values ('Hugo','hugobiller@hotmail.com',1);

select * from aluno;