-- Таблица с постами
drop table if exists posts;

create table posts(
  id bigserial primary key,
  title varchar(255),
  picture varchar(255) not null,
  text varchar(255) not null,
);

--delete from posts;
insert into posts(title, picture, text) values ('Пост1', 'Картинка 1', 'Текст 1-ого поста');
insert into posts(title, picture, text) values ('Пост2', 'Картинка 2', 'Текст 2-ого поста');
insert into posts(title, picture, text) values ('Пост3', 'Картинка 3', 'Текст 3-ого поста');