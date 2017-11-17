CREATE TABLE clientes
(
codigo INTEGER NOT NULL PRIMARY KEY,
nome VARCHAR(45) NOT NULL,
endereco VARCHAR(45) NOT NULL,
numero INTEGER NOT NULL,
bairro VARCHAR(45) NOT NULL,
referencia VARCHAR(45) DEFAULT NULL,
cidade VARCHAR(45) NOT NULL,
cep INTEGER NOT NULL,
telefone INTEGER DEFAULT NULL,
celular INTEGER DEFAULT NULL,
email varchar(45) DEFAULT NULL,
rg INTEGER DEFAULT NULL,
cpf INTEGER DEFAULT NULL,
data_nasc varchar(45) NOT NULL,
observacao varchar(255) DEFAULT NULL
)