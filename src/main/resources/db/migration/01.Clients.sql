CREATE TABLE `itah`.`clients` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` INT NOT NULL DEFAULT 0,
  `name` VARCHAR(64),
  `home_phone` VARCHAR(18),
  `work_phone` VARCHAR(18),
  `company` VARCHAR(64),
  `profile_image` VARCHAR(64),
  `email` VARCHAR(64),
  `birth_date` TIMESTAMP,
  `created` TIMESTAMP NOT NULL DEFAULT NOW(),
  `updated` TIMESTAMP NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`id`));
