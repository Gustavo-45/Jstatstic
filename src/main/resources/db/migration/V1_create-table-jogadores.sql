-- Active: 1751023768953@@localhost@3308@kalangoweb
CREATE TABLE jogador(
    id BIGINT NOT NULL auto_increment,
    nome VARCHAR(100) NOT NULL,
    nickName VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    celular VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
)