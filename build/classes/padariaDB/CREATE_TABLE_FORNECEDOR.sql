CREATE TABLE `fornecedor` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`razaoSocial` VARCHAR(255) NULL DEFAULT NULL,
	`cnpj` VARCHAR(255) NULL DEFAULT NULL,
	`endereco` VARCHAR(255) NULL DEFAULT NULL,
	`recorrente`TINYINT(1) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)