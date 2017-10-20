CREATE DATABASE IF NOT EXISTS `legohouseDB` DEFAULT CHARSET = latin1;
USE `legohouseDB`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(90) NOT NULL,
  `password` CHAR(64) NOT NULL,
  `role` VARCHAR(20) NOT NULL DEFAULT 'Customer',
  PRIMARY KEY (`id`),
  UNIQUE KEY (`email`)) 
ENGINE = InnoDB;

DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `userId` INT(11) NOT NULL,
  `length` INT NOT NULL,
  `width` INT NOT NULL,
  `height` INT NOT NULL,
  `receivedDate` DATE NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_order_userId_idx` (`userId` ASC),
  CONSTRAINT `fk_order_userId`
    FOREIGN KEY (`userId`)
    REFERENCES `user` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;
