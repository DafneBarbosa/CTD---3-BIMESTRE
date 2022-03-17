

create table IF NOT EXISTS medicamento(
    id int auto_increment PRIMARY KEY,
    nome VARCHAR(64),
    laboratorio VARCHAR(64),
    quantidade INT,
    preco DOUBLE
);



