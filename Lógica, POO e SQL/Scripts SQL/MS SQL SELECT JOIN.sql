/*Scripts para SELELET e JOIN */

Select * From Cliente
Select * FROM Veiculo
Select * FROM Vaga
Select * FROM Alocacao

Select * from Alocacao Where fk_idvaga = 2
SELECT * From Veiculo Where placa = 'CCC7779'

SELECT * from Veiculo v
Right JOIN Alocacao a
On v.idveiculo = a.fk_idveiculo

SELECT * from Veiculo v
Left JOIN Alocacao a
On v.idveiculo = a.fk_idveiculo

SELECT * from Veiculo v
Inner JOIN Alocacao a
On v.idveiculo = a.fk_idveiculo

SELECT * from Veiculo v
Inner JOIN Alocacao a
On v.idveiculo is null

Select * from Cliente
Order By nome desc

SELECT Count(*) from Vaga
