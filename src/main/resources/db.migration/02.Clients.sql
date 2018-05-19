CREATE TABLE `itah`.`clients` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` INT NOT NULL DEFAULT 0,
  `name` VARCHAR(64),
#   `phone_number` VARCHAR(18),
  `company` VARCHAR(64),
  `profile_image` VARCHAR(64),
  `email` VARCHAR(64),
  `birth_date` TIMESTAMP,
  `address_id` INT,
  `created` TIMESTAMP NOT NULL DEFAULT NOW(),
  `updated` TI  MESTAMP NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`id`));
