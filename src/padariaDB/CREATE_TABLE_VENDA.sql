CREATE TABLE `venda` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`cliente_id` INT(11) NULL DEFAULT NULL,
	`funcionario_id` INT(11) NULL DEFAULT NULL,
	`caixa_id` INT(11) NULL DEFAULT NULL,
        `dataVenda` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)


 