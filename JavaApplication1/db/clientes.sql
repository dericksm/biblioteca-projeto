CREATE TABLE clientes
(
codigo INTEGER NOT NULL PRIMARY KEY,
nome VARCHAR(45) NOT NULL,
endereco VARCHAR(45) NOT NULL,
numero BIGINT NOT NULL,
bairro VARCHAR(45) NOT NULL,
referencia VARCHAR(45) DEFAULT NULL,
cidade VARCHAR(45) NOT NULL,
cep BIGINT NOT NULL,
telefone BIGINT DEFAULT NULL,
celular BIGINT DEFAULT NULL,
email varchar(45) DEFAULT NULL,
rg BIGINT DEFAULT NULL,
cpf BIGINT DEFAULT NULL,
data_nasc varchar(45) NOT NULL,
observacao varchar(255) DEFAULT NULL
)
insert into clientes (
    codigo,
    nome,
    endereco,
    numero,
    bairro,
    referencia,
    cidade,
    cep,
    telefone,
    celular,
    email,
    rg,
    cpf,
    data_nasc,
    observacao
)
values (
    1,
    'iury',
    'rua santa vista',
    6666,
    'jardim fulano',
    'mercado fulero',
    'santos',
    88888888,
    3434343434,
    99999999999,
    'iury@email.com',
    1222333,
    11122233300,
    '19/10/1920',
    'iury chato'
)