CREATE TABLE emprestimos
(
codigo INTEGER NOT NULL PRIMARY KEY,
codigo_cliente INTEGER NOT NULL,
codigo_livro INTEGER NOT NULL,
data_emprestimo VARCHAR(45) NOT NULL,
data_devolucao VARCHAR(45) NOT NULL,
prazo INTEGER NOT NULL,
observacao varchar(255) DEFAULT NULL
)