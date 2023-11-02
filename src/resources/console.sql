create table audit_department
(
    revisionNumber varchar primary key not null,
    type varchar not null,
    adress varchar not null
);

insert into audit_department
(revisionNumber, type, adress)
values
    ('Xg_5124', 'Компьютер', 'Общага'),
    ('Gg-9832', 'Телефон', 'Дубосековская 13');

select *
from audit_department;

insert into audit_department
(revisionNumber, type, adress)
values
    ('Xg-9876', 'Часы', 'Оршанская 3'),
    ('Xg-9875', 'Проектор', 'Оршанская 3');
