CREATE TABLE `user_detail` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dob` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
);

insert  into `user_detail`(`id`,`first_name`,`last_name`,`email`,`dob`)
values (1,'Uzumaki','Naruto','uzumaki_naruto@konohagakure.com','30-08-1986'),
(2,'Uchiha','Sasuke','uchiha_sasuke@konohagakure.com','30-09-1991');