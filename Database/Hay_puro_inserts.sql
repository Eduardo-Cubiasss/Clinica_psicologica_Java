use dbMindLink;
go

EXEC PDRegistrarAdmin 'Eduardo Ren�', 'Guayito', 'Contrase�a', '52281'
EXEC PDRegistrarAdmin 'Orlando', 'Pepito', 'Contrase�a', '52281'


DECLARE @resultado INT;
DECLARE @ventana INT;
EXEC PDLogear 'Guayito', 'Melocoton', @ventana OUTPUT, @resultado OUTPUT;
SELECT @resultado AS acceso;
SELECT @ventana AS abrirventana;

EXEC PDRegistrarpaciente 'Luis','CagaLindo','9-10-2001','52281','Pepito','contrase�a', ' 7689 6281';

Exec PDActualizarContraGmail 'guayito.palom0@gmail.com', 'Melocoton';
SELECT * from TbUsuarios

EXEC PDActualizarContraNum '69839847','Papitaaaaa'

DECLARE @CorreoExis INT;
EXEC PdBuscarCorreo 'guayito.palom0@gmail.com', @CorreoExis OUTPUT;
SELECT @CorreoExis AS Correoexistente;

DECLARE @NumeroExis INT;
EXEC PdBuscarNum '69839847', @NumeroExis OUTPUT;
SELECT @NumeroExis AS NumeroExistente;

EXEC PDInsertarAgendaPersonal 'Contenido de la agenda', 'Pepito';

EXEC PDGuardarComentario 'Este es un comentario de ejemplo', 'Pepito';