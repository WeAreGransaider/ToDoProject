insert into role(role) values('admin');
insert into role(role) values('manager');
insert into role(role) values('user');

insert person(login,password, name, sur_name, person_role) values ("cat","cat","Cat","SurCat",2);
insert person(login,password, name, sur_name, person_role) values ("dog","dog","dog","SurDog",2);
insert person(login,password, name, sur_name, person_role) values ("admin","admin","Blob","SurBlob",1);
insert person(login,password, name, sur_name, person_role) values ("Rumko","z123","Rumko","SurRumko",3);
insert person(login,password, name, sur_name, person_role) values ("Kycaka","x123","Kycaka","SurKycaka",3);
insert person(login,password, name, sur_name, person_role) values ("Tatar","c123","Tatar","SurTatar",3);
insert person(login,password, name, sur_name, person_role) values ("BookYak","v123","BookYak","SurBookYak",3);
insert person(login,password, name, sur_name, person_role) values ("Iceman","b123","Iceman","SurIceman",3);


insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",1);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:45:00' ,'2023-11-24 7:55:00' ,"Умыться","CycleLife","CycleLife",1);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 8:00:00' ,'2023-11-24 8:30:00' ,"Поесть","CycleLife","CycleLife",1);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 9:00:00' ,'2023-11-24 12:30:00' ,"Работать","CycleLife","CycleLife",1);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 13:00:00' ,'2023-11-24 14:00:00' ,"Пообедать","CycleLife","CycleLife",1);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 18:00:00' ,'2023-11-24 18:30:00' ,"Вернуться домой","CycleLife","CycleLife",1);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 20:30:00' ,'2023-11-24 21:00:00' ,"Поесть","CycleLife","CycleLife",1);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",1);

insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",2);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:45:00' ,'2023-11-24 7:55:00' ,"Умыться","CycleLife","CycleLife",2);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 8:00:00' ,'2023-11-24 8:30:00' ,"Поесть","CycleLife","CycleLife",2);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 9:00:00' ,'2023-11-24 12:30:00' ,"Работать","CycleLife","CycleLife",2);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 18:00:00' ,'2023-11-24 18:30:00' ,"Вернуться домой","CycleLife","CycleLife",2);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 20:30:00' ,'2023-11-24 21:00:00' ,"Поесть","CycleLife","CycleLife",2);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",2);

insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",3);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 8:00:00' ,'2023-11-24 8:30:00' ,"Поесть","CycleLife","CycleLife",3);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 9:00:00' ,'2023-11-24 12:30:00' ,"Работать","CycleLife","CycleLife",3);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 13:00:00' ,'2023-11-24 14:00:00' ,"Пообедать","CycleLife","CycleLife",3);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 18:00:00' ,'2023-11-24 18:30:00' ,"Вернуться домой","CycleLife","CycleLife",3);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",3);

insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",4);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:45:00' ,'2023-11-24 7:55:00' ,"Умыться","CycleLife","CycleLife",4);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 9:00:00' ,'2023-11-24 12:30:00' ,"Работать","CycleLife","CycleLife",4);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 18:00:00' ,'2023-11-24 18:30:00' ,"Вернуться домой","CycleLife","CycleLife",4);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 20:30:00' ,'2023-11-24 21:00:00' ,"Поесть","CycleLife","CycleLife",4);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",4);

insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",5);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 13:00:00' ,'2023-11-24 14:00:00' ,"Пообедать","CycleLife","CycleLife",5);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 18:00:00' ,'2023-11-24 18:30:00' ,"Вернуться домой","CycleLife","CycleLife",5);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",5);

insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",6);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:45:00' ,'2023-11-24 7:55:00' ,"Умыться","CycleLife","CycleLife",6);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 9:00:00' ,'2023-11-24 12:30:00' ,"Работать","CycleLife","CycleLife",6);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 13:00:00' ,'2023-11-24 14:00:00' ,"Пообедать","CycleLife","CycleLife",6);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 18:00:00' ,'2023-11-24 18:30:00' ,"Вернуться домой","CycleLife","CycleLife",6);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 20:30:00' ,'2023-11-24 21:00:00' ,"Поесть","CycleLife","CycleLife",6);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",6);

insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",7);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 9:00:00' ,'2023-11-24 12:30:00' ,"Работать","CycleLife","CycleLife",7);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 13:00:00' ,'2023-11-24 14:00:00' ,"Пообедать","CycleLife","CycleLife",7);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 18:00:00' ,'2023-11-24 18:30:00' ,"Вернуться домой","CycleLife","CycleLife",7);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 20:30:00' ,'2023-11-24 21:00:00' ,"Поесть","CycleLife","CycleLife",7);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",7);

insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:30:00' ,'2023-11-24 7:40:00' ,"Проснуться","CycleLife","CycleLife",8);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 7:45:00' ,'2023-11-24 7:55:00' ,"Умыться","CycleLife","CycleLife",8);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 8:00:00' ,'2023-11-24 8:30:00' ,"Поесть","CycleLife","CycleLife",8);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 9:00:00' ,'2023-11-24 12:30:00' ,"Работать","CycleLife","CycleLife",8);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 13:00:00' ,'2023-11-24 14:00:00' ,"Пообедать","CycleLife","CycleLife",8);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 20:30:00' ,'2023-11-24 21:00:00' ,"Поесть","CycleLife","CycleLife",8);
insert task(creation_date,experation_date, text, title, tag, person_id) values('2023-11-24 22:00:00' ,'2023-11-25 7:30:00' ,"Спать","CycleLife","CycleLife",8);
