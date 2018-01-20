create table TUser 
(
   uname                varchar2(30)                   not null,
   pwd                  varchar2(15)                   not null,
   role                 number(1)                      not null,
   addr                 varchar2(200),
   constraint PK_TUSER primary key clustered (uname)
);

create table TBook 
(
   isbn                 varchar2(20)                   not null,
   bname                varchar2(20),
   author               varchar2(30),
   press                varchar2(50),
   pdate                date,
   price                number(6,2),
   kcount               number(8),
   constraint PK_TBOOK primary key clustered (isbn)
);