CREATE DATABASE  IF NOT EXISTS `useradmin`;


USE `useradmin`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(90) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
	`orderid` int(11) NOT NULL AUTO_INCREMENT,
    `length` int(45) NOT NULL,
    `width` int(45) NOT NULL,
    `height` int(45) NOT NULL,
    `status` DATETIME,
    PRIMARY KEY (`orderid`),
    foreign key (orderid) references user(userid));

LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');
UNLOCK TABLES;

