/*Scripts de CREATE de tabela*/
CREATE TABLE Cliente (
  IdCliente INT IDENTITY(1,1) PRIMARY KEY,
  Nome VARCHAR(50) NOT NULL,
  Cpf VARCHAR(11) NOT NULL,
  Telefone VARCHAR(13) NOT NULL
);

CREATE TABLE Veiculo(
  IdVeiculo INT IDENTITY(1,1) PRIMARY KEY,
  Placa VARCHAR(7) NOT NULL,
  Tipo VARCHAR(20) NOT NULL,
  Fk_IdCliente int FOREIGN KEY References Cliente(IdCliente)
);


CREATE TABLE Vaga(
  IdVaga INT IDENTITY(1,1) PRIMARY KEY,
  numero INT NOT NULL
);

CREATE TABLE Alocacao(
  IdAlocacao INT IDENTITY(1,1) PRIMARY KEY,
  horaEntrada INT NOT NULL,
  horaSaida INT NOT NULL,
  Fk_IdVaga int FOREIGN KEY References Vaga(IdVaga),
  Fk_IdVeiculo int FOREIGN KEY References Veiculo(IdVeiculo)
);
