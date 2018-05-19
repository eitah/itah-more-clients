CREATE TABLE `itah`.`addresses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` INT NOT NULL DEFAULT 0,
  `created` TIMESTAMP NOT NULL DEFAULT NOW(),
  `modified` TIMESTAMP NOT NULL DEFAULT NOW(),
  `client_id` INT NOT NULL,
  `line_1` VARCHAR(64) NOT NULL,
  `line_2` VARCHAR(64),
  `city` VARCHAR(64) NOT NULL,
  `state` VARCHAR(64) NOT NULL,
  `zip` VARCHAR(5) not null,
  PRIMARY KEY (`id`));
