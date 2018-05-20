CREATE TABLE `itah`.`addresses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `client_id` INT,
  `line1` VARCHAR(64) NOT NULL,
  `line2` VARCHAR(64),
  `city` VARCHAR(64) NOT NULL,
  `state` VARCHAR(64) NOT NULL,
  `zip` VARCHAR(5) not null,
  `version` INT NOT NULL DEFAULT 0,
  `created` TIMESTAMP NOT NULL DEFAULT NOW(),
  `updated` TIMESTAMP NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_clients_01`
  FOREIGN KEY (`client_id`)
  REFERENCES `itah`.`clients` (`id`));
