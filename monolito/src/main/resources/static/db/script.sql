CREATE DATABASE `monolito`;

USE `monolito`;
CREATE TABLE `users`
(
    `id`       INT          NOT NULL AUTO_INCREMENT,
    `name`     VARCHAR(150) NOT NULL,
    `email`    VARCHAR(150) NOT NULL UNIQUE,
    `password` VARCHAR(250) NOT NULL,
    PRIMARY KEY (`id`)
);

USE `monolito`;
INSERT INTO `users` (name, email, password)
VALUES ('Juliane', 'exemplo@email.com', '123456');