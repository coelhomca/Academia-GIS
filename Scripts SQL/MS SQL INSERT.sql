/*Scripts para INSERT dados tabelas*/

INSERT INTO Cliente (nome, cpf, telefone) 
VALUES 
('Ana', '11223344556', '86911112222'),
('Ricardo', '22233344455', '89944445555'),
('Mel', '77778888999', '86988889999'),
('Ro', '99997777555', '89911114444');

INSERT INTO Veiculo (Fk_IdCliente, placa, tipo) 
VALUES 
(2, 'AAA1234', 'sw'),
(4, 'BBB6668', 'conversível'),
(1, 'CCC7779', 'conversível'),
(3, 'DDD2220', 'minivan');

INSERT INTO Vaga (numero) 
VALUES 
(9), (10), (5), (7);

INSERT INTO Alocacao (horaentrada, horasaida, fk_idveiculo, fk_idvaga)
VALUES (22, 5, 4, 1),
(1, 5, 3, 2),
(9, 10, 1, 3),
(4, 9, 3, 4);