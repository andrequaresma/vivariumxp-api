CREATE TABLE JOGOS (
                       id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
                       nome VARCHAR(255) NOT NULL,
                       plataforma VARCHAR(100),
                       status VARCHAR(20) NOT NULL,
                       ano_consumo INTEGER,
                       valor DECIMAL(10,2),
                       nota SMALLINT,
                       observacoes VARCHAR(1000),
                       data_cadastro TIMESTAMP NOT NULL DEFAULT CURRENT TIMESTAMP,
                       PRIMARY KEY (id)
);