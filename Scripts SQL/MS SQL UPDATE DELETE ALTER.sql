/*Scripts para UPDATE, DELETE, ALTER tabelas*/

UPDATE Veiculo SET Tipo = 'CDAM' WHERE IdVeiculo = 1
UPDATE Cliente SET Nome = 'Talia' WHERE IdCliente = 4

DELETE FROM Alocacao WHERE idalocacao = 1
Delete from Veiculo WHERE Placa = 'DDD2220'
Delete from Cliente WHERE Nome = 'Mel'

ALTER TABLE Veiculo
ADD cor VARCHAR(50);

ALTER TABLE Vaga
ADD ocupada BIT;

ALTER TABLE Cliente
ADD email VARCHAR(100);