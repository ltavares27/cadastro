CREATE TABLE `caixa` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`produto_id` INT(11) NULL DEFAULT NULL,
	`quantidadeProduto` INT(11) NULL DEFAULT NULL,
        `subTotalPorProduto` FLOAT(11) NULL DEFAULT NULL,
        `subTotalAPagar` FLOAT(11) NULL DEFAULT NULL,
        `totalAPagar` FLOAT(11) NULL DEFAULT NULL,
        `formaPagamento` TINYINT NULL DEFAULT NULL,
        `parcelas` INT(11) NULL DEFAULT NULL,
	 PRIMARY KEY (`id`)
)

 