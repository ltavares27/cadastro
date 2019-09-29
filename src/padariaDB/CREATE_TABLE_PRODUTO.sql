CREATE TABLE `produto` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
        `codigo` VARCHAR(255) NULL DEFAULT NULL,
        `apelido` VARCHAR(255) NULL DEFAULT NULL,
	`fornecedor_id` INT(11) NULL DEFAULT NULL,
        `precoCusto` FLOAT(11) NULL DEFAULT NULL,
        `precoFinal` FLOAT(11) NULL DEFAULT NULL,
        `TipoProduto` TINYINT NULL DEFAULT NULL,
        `dataValidade` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)