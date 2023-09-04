 
/*
Drop database dbMindLink
go 

*/


Create database dbMindLink
go

Use dbMindLink
go

Create table TbArticulos(
IDArticulo int identity(1,1) primary key,
Titulo varchar(70) not null,
Descripcion varchar(400),
Imagen image,
Fecha date,
IDTerapeuta int
);
Create table TbAnuncio(
IDAnuncio int identity(1,1) primary key,
Titulo nvarchar(70),
Descripcion varchar(400),
Imagen image,
Fecha date,
IDSecretaria int,
IDAdministrador int
);
Create table TbIncapacidades(
IDIncapacidad int identity(1,1) primary key,
Fecha date,
Mensaje varchar(1000),
IDTerapeuta int,
IDSecretaria int,
IDAdministrador int
);
Create table TbEstadisticas(
IDEstadistica int identity(1,1) primary key,
IDCita int,
IDClinica varchar(5)
);
Create table TbPruebas(
IDPrueba int identity(1,1) primary key,
Titulo nvarchar(100)not null,
Descripcion varchar(800),
Precio money not null,
IDTerapeuta int,
IDSecretaria int,
IDAdministrador int
);
Create table TbRespuestas(
IDRespuesta int identity(1,1) primary key,
IDOpcion int,
IDPregunta int
);
Create table TbPreguntas(
IDPregunta int identity(1,1) primary key,
Pregunta varchar(300) not null,
IDPrueba int
);
Create table TbOpciones(
IDOpcion int identity(1,1) primary key,
Opcion varchar(30),
ValorOpcion int,
IDPregunta int
);
Create table TbLlaves(
IDLlave int identity(1,1) primary key,
Llave nvarchar(10) unique,
Fecha Date,
IDPrueba int
);
Create table TbResultados(
IDResultados int identity(1,1) primary key,
Resultados varchar(400),
IDPrueba int
);
Create table TbCitas(
IDCitas int identity(1,1) primary key,
Fecha date not null,
IDTerapeuta int,
IDSecretaria int,
IDPaciente int
);
Create table TbClinicas(
IDClinica Varchar(5) primary key,
NombreClinica varchar(300),
Ubicacion Varchar(1000), 
Dueño nvarchar(100),
Descripcion varchar(400),
Logo image
);
Create table TbUsuarios(
IDUsuario int identity(1,1) primary key,
UserName varchar(50) unique,
Contraseña varbinary(64),
FotoPerfil image,
IDContacto int
);
ALTER TABLE TbUsuarios
ADD Primeruso int;

ALTER TABLE TbUsuarios
DROP COLUMN FotoPerfil;

ALTER TABLE TbUsuarios 
ADD FotoPerfil varbinary(max);

Select * from TbUsuarios;

CREATE table TbContactos(
IDContacto int identity(1,1) primary key,
Correo varchar(300),
NumTelefonico varchar(14)
);
Create table TbGenero(
IDGenero int identity(1,1) primary key,
Genero int
);
Create table TbActividadesLaborales(
IDActividadLaboral int identity(1,1) primary key,
NombreDeActividad varchar(50)
);
Create Table TbTerapeutas(
IDTerapeuta int identity(1,1) primary key,
Nombre varchar(90),
Apellido varchar(90),
Salario varbinary(max),
FNacimiento date,
DUI varchar(20),
IDTipoUsuario int,
IDActividadLaboral int,
IDGenero int,
IDClinica varchar(5),
IDUsuario int
);
Create Table TbSecretaria(
IDSecretaria int identity(1,1) primary key,
Nombre varchar(90),
Apellido varchar(90),
Salario varbinary(max),
FNacimiento date,
DUI varchar(20),
IDTipoUsuario int,
IDActividadLaboral int,
IDGenero int,
IDClinica varchar(5),
IDUsuario int
);
Create Table TbAdministrador(
IDAdministrador int identity(1,1) primary key,
Nombre varchar(90),
Apellido varchar(90),
FNacimiento date,
DUI varchar(20),
IDTipoUsuario int,
IDGenero int,
IDClinica varchar(5),
IDUsuario int
);
ALTER TABLE TbAdministrador
add IDActividadLaboral int;
ALTER TABLE TbPacientes
add MensajesDeCariño VARCHAR(300);

Create Table TbPacientes(
IDPaciente int identity(1,1) primary key,
Nombre varchar(90),
Apellido varchar(90),
FNacimiento date,
DUI varchar(20),
IDTipoUsuario int,
IDGenero int,
IDClinica Varchar(5),
IDUsuario int
);

Create Table TbTipoUsuarios(
IDTipoUsuario int identity(1,1) primary key,
Cargo varchar(60),
);
Create Table TbAgendasPersonales(
IDAgendaPersonal int identity(1,1) primary key,
Contenido varchar(max),
Fecha date,
IDPaciente int
);
Create Table TbExpedientes(
IDExpediente int identity(1,1) primary key,
Contenido varchar(max),
Fecha date,
IDPaciente int,
IDTerapeuta int
);
Create Table TbComentarios(
IDComentario int identity(1,1) primary key,
Mensaje varchar(1000),
Fecha date,
IDPaciente int
);
Create Table TbRecetasMedicas(
IDReceta int identity(1,1) primary key,
Fecha date,
Descripcion varchar(900),
IDPaciente int,
IDClinica Varchar(5),
IDMedicamento int
);
Create table TbMedicamentos(
IDMedicamento int identity(1,1) primary key,
NombreMedicamento varchar(500)
);

-- Aquí empiezan los unique's para que existan valores nulos repeditos en caso que el usuario no llene una de las preguntas de algun formulario
CREATE UNIQUE INDEX TbCont_Correo1 ON TbContactos (Correo)
WHERE Correo IS NOT NULL AND Correo != '';

CREATE UNIQUE INDEX TbCont_NumTelefonico1 ON TbContactos (NumTelefonico)
WHERE NumTelefonico IS NOT NULL AND NumTelefonico != '';

CREATE UNIQUE INDEX TbAdministrador_DUI1 ON TbAdministrador (DUI)
WHERE DUI IS NOT NULL AND DUI != '';

CREATE UNIQUE INDEX TbPacientes_DUI1 ON TbPacientes (DUI)
WHERE DUI IS NOT NULL AND DUI != '';

CREATE UNIQUE INDEX TbSecretaria_DUI1 ON TbSecretaria (DUI)
WHERE DUI IS NOT NULL AND DUI != '';

CREATE UNIQUE INDEX TbTerapeutas_DUI1 ON TbTerapeutas (DUI)
WHERE DUI IS NOT NULL AND DUI != '';
--Insert into TbAdministrador 
--Select * from TbMedicamentos

Alter table TbArticulos Add constraint fk_IDTerapeuta_TBArt
Foreign key (IDTerapeuta) References TbTerapeutas(IDTerapeuta);

Alter table TbAnuncio Add constraint fk_IDSecretaria_TbAnun
Foreign key (IDSecretaria) References TbSecretaria(IDSecretaria);


/*
Hasta aquí va bien (ya lo probe)
*/
Alter table TbAnuncio Add constraint fk_IDAdministrador_TbAnun
Foreign key (IDAdministrador) References TbAdministrador(IDAdministrador);

Alter table TbIncapacidades Add constraint fk_IDTerapeuta_TbIncap
Foreign key (IDTerapeuta) References TbTerapeutas(IDTerapeuta);

Alter table TbIncapacidades Add constraint fk_IDSecretaria_TbIncap
Foreign key (IDSecretaria) References TbSecretaria(IDSecretaria);

Alter table TbIncapacidades Add constraint fk_IDAdministrador_TbIncap
Foreign key (IDAdministrador) References TbAdministrador(IDAdministrador);

Alter table TbEstadisticas Add constraint fk_IDCita_TbEstad
Foreign key (IDCita) References TbCitas(IDCitas);

Alter table TbEstadisticas Add constraint fk_IDClinica_TbClin
Foreign key (IDClinica) References TbClinicas(IDClinica);

Alter table TbPruebas Add constraint fk_IDTerapeuta_TbPrue
Foreign key (IDTerapeuta) References TbTerapeutas(IDTerapeuta);

Alter table TbPruebas Add constraint fk_IDSecretaria_TbPrue
Foreign key (IDSecretaria) References TbSecretaria(IDSecretaria);

Alter table TbPruebas Add constraint fk_IDAdministrador_TbPrue
Foreign key (IDAdministrador) References TbAdministrador(IDAdministrador);

Alter table TbRespuestas Add constraint fk_IDOpcion_TbResp
Foreign key (IDOpcion) References TbOpciones(IDOpcion);

Alter table TbRespuestas Add constraint fk_IDPregunta_TbResp
Foreign key (IDPregunta) References TbPreguntas(IDPregunta);

Alter table TbPreguntas Add constraint fk_IDPregunta_TbPreg
Foreign key (IDPrueba) References TbPruebas(IDPrueba);

Alter table TbOpciones Add constraint fk_IDPregunta_TbOpci
Foreign key (IDPregunta) References TbPreguntas(IDPregunta);

Alter table TbLlaves Add constraint fk_IDPrueba_TBLlav
Foreign key (IDPrueba) References TbPruebas(IDPrueba);
/*
Hasta aquí good
*/
Alter table TbResultados Add constraint fk_IDPrueba_TbResul
Foreign key (IDPrueba) References TbPruebas(IDPrueba);

Alter table TbCitas Add constraint fk_IDSecretaria_TbCit
Foreign key (IDSecretaria) References TbSecretaria(IDSecretaria);

Alter table TbCitas Add constraint fk_IDTerapeuta_TbCit
Foreign key (IDTerapeuta) References TbTerapeutas(IDTerapeuta);

Alter table TbCitas Add constraint fk_IDPaciente_TbCit
Foreign key (IDPaciente) References TbPacientes(IDPaciente);

Alter table TbUsuarios Add constraint fk_IDContacto_TbUsuar
Foreign key (IDContacto) References TbContactos(IDContacto);
/*
Hasta aqui good
*/
Alter table TbTerapeutas Add constraint fk_IDTipoUsuarios_TbTerape
Foreign key (IDTipoUsuario) References TbTipoUsuarios(IDTipoUsuario);

Alter table TbTerapeutas Add constraint fk_IDActividadLaboral_TbTerape
Foreign key (IDActividadLaboral) References TbActividadesLaborales(IDActividadLaboral);

Alter table TbTerapeutas Add constraint fk_IDGenero_TbTerape
Foreign key (IDGenero) References TbGenero(IDGenero);

Alter table TbTerapeutas Add constraint fk_IDClinica_TbTerape
Foreign key (IDClinica) References TbClinicas(IDClinica);

Alter table TbTerapeutas Add constraint fk_IDUsuario_TbTerape
Foreign key (IDUsuario) References TbUsuarios(IDUsuario);

Alter table TbSecretaria Add constraint fk_IDTipoUsuarios_TbSecret
Foreign key (IDTipoUsuario) References TbTipoUsuarios(IDTipoUsuario);

Alter table TbSecretaria Add constraint fk_IDActividadLaboral_TbSecret
Foreign key (IDActividadLaboral) References TbActividadesLaborales(IDActividadLaboral);

Alter table TbSecretaria Add constraint fk_IDGenero_TbSecret
Foreign key (IDGenero) References TbGenero(IDGenero);

Alter table TbSecretaria Add constraint fk_IDSecretaria_TbSecret
Foreign key (IDClinica) References TbClinicas(IDClinica);

Alter table TbSecretaria Add constraint fk_IDUsuario_TbSecret
Foreign key (IDUsuario) References TbUsuarios(IDUsuario);

Alter table TbAdministrador Add constraint fk_IDTipoUsuario_TbAdmin
Foreign key (IDTipoUsuario) References TbTipoUsuarios(IDTipoUsuario);

Alter table TbAdministrador Add constraint fk_IDGenero_TbAdmin
Foreign key (IDGenero) References TbGenero(IDGenero);

Alter table TbAdministrador Add constraint fk_IDClinica_TbAdmin
Foreign key (IDClinica) References TbClinicas(IDClinica);

Alter table TbAdministrador Add constraint fk_IDUsuario_TbAdmin
Foreign key (IDUsuario) References TbUsuarios(IDUsuario);

Alter table TbAdministrador Add constraint fk_IDActividadLaboral_TbAdmin
Foreign key (IDActividadLaboral) References TbActividadesLaborales(IDActividadLaboral);

Alter table TbPacientes Add constraint fk_IDTipoUsuario_TbPacie
Foreign key (IDTipoUsuario) References TbTipoUsuarios(IDTipoUsuario);

Alter table TbPacientes Add constraint fk_IDGenero_TbPacie
Foreign key (IDGenero) References TbGenero(IDGenero);

Alter table TbPacientes Add constraint fk_IDClinica_TbPacie
Foreign key (IDClinica) References TbClinicas(IDClinica);

Alter table TbPacientes Add constraint fk_IDUsuario_TbPacie
Foreign key (IDUsuario) References TbUsuarios(IDUsuario);

Alter table TbAgendasPersonales Add constraint fk_IDPaciente_TbAgen
Foreign key (IDPaciente) References TbPacientes(IDPaciente);

Alter table TbExpedientes Add constraint fk_IDPaciente_TbExpe
Foreign key (IDPaciente) References TbPacientes(IDPaciente);

Alter table TbExpedientes Add constraint fk_IDTerapeuta_TbExpe
Foreign key (IDTerapeuta) References TbTerapeutas(IDTerapeuta);

Alter table TbComentarios Add constraint fk_IDPaciente_TBComen
Foreign key (IDPaciente) References TbPacientes(IDPaciente);

Alter table TbRecetasMedicas Add constraint fk_IDPaciente_TBRecet
Foreign key (IDPaciente) References TbPacientes(IDPaciente);

Alter table TbRecetasMedicas Add constraint fk_IDClinica_TbRecet
Foreign key (IDClinica) References TbClinicas(IDClinica);

Alter table TbRecetasMedicas Add constraint fk_IDMedicamentos_Medica
Foreign key (IDMedicamento) References TbMedicamentos(IDMedicamento);
/*
Ya esta bien aaaa
*/

/*
Desde aquí comienzan los procesos almacenados
*/
ALTER PROCEDURE PDRegistrarAdmin
    @nombreTbA VARCHAR(90),
    @UsernameTbU VARCHAR(50),
    @ContraseñaTbU VARCHAR(90),
	@IdTbCli VARCHAR(5)
AS
BEGIN

    -- Insertar datos en la tabla TbClinicas si no existe
    IF NOT EXISTS (SELECT 1 FROM TbClinicas WHERE IDClinica = @IdTbCli)
    BEGIN
        INSERT INTO TbClinicas (IDClinica)
        VALUES (@IdTbCli)
    END

    -- Insertar datos en la tabla TbUsuarios si no existe
    IF NOT EXISTS (SELECT 1 FROM TbUsuarios WHERE UserName = @UsernameTbU)
    BEGIN
	-- Con esto declaramos la variable que contendra el Hash
		DECLARE @HashContraseñaTbU VARBINARY (64);
		DECLARE @newHash VARBINARY(64);
		SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @ContraseñaTbU);
		SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);
    -- Con las dos lineas de abajo mandamos a almacenar el Username y la contraseña con Hash
		INSERT INTO TbUsuarios (Username, Contraseña, Primeruso)
        VALUES (@UsernameTbU, @newHash, 1)
    END
	-- Obtener el IDUsuario basado en el Username
    DECLARE @IDUsuario INT
    SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE Username = @UsernameTbU)
	-- Insertar datos en la tabla TbAdministrador
    INSERT INTO TbAdministrador (Nombre, IDClinica, IDUsuario)
    VALUES (@nombreTbA, @IdTbCli, @IDUsuario)

END

EXEC PDRegistrarAdmin 'Eduardo René', 'Guayito', 'Contraseña', '52281'
EXEC PDRegistrarAdmin 'Orlando', 'Pepito', 'Contraseña', '52281'
EXEC PDRegistrarAdmin 'Brian', 'Bryan', 'Contraseña', '001291'
/* esto es para comprobar que el PDResgistrarAdmin funciona jejeje
Drop Procedure PDRegistrarAdmin

INSERT INTO TbContactos Values ('Guayito.palom0@gmail.com', '69839847')
SELECT * FRom TbContactos
SELECT * FROM TbUsuarios
INSERT INTO TbUsuarios IDContacto(1)
Delete TbAdministrador
Delete TbUsuarios
Delete TbClinicas
 
	esto es para reiniciar los PK en 0
DBCC CHECKIDENT ('TbUsuarios', RESEED, 0);
DBCC CHECKIDENT ('TbAdministrador', RESEED, 0);
DBCC CHECKIDENT ('TbClinicas', RESEED, 0);

Create table TbUsuarios(
IDUsuario int identity(1,1) primary key,
UserName varchar(50),
Contraseña varbinary(64),
FotoPerfil image,
IDContacto int
);
Select * from TbAdministrador
Select * from TbClinicas
Select * from TbUsuarios
Select * from TbSecretaria
Insert into TbUsuarios values ('JuanaGalindo', '');
Insert into TbSecretaria values ('Juana','','','','','');
*/

--Aqui empieza el proceso para logear todo tipo de usuario, admin, empleado, usuario

ALTER PROCEDURE PDLogear
    @UsernameIngresado VARCHAR(50),
    @ContraseñaIngresado VARCHAR(90),
    @abrirventana INT OUTPUT,
    @acceso INT OUTPUT
AS
BEGIN
    -- Agrega la declaración de la variable @resultado y @ventana aquí
	 DECLARE @ventana INT;
    DECLARE @resultado INT;
   

    -- Con esto declaramos las variables para el control del nivel de usuario
    DECLARE @IDUsuario INT;
    DECLARE @username VARCHAR(50);
    DECLARE @AdminExist INT;
    DECLARE @SecretExist INT;
    DECLARE @TerapeExist INT;

    -- Con esto seleccionamos de cada tabla de cada nivel de usuario si existe un ID como el ingresado
    SET @IDUsuario = (SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE Username = @UsernameIngresado);
	SET @username = (SELECT TOP 1 UserName FROM TbUsuarios WHERE IDUsuario = @IDUsuario);
	SET @AdminExist = (SELECT TOP 1 IDUsuario FROM TbAdministrador WHERE IDUsuario = @IDUsuario);
	SET @SecretExist = (SELECT TOP 1 IDUsuario FROM TbSecretaria WHERE IDUsuario = @IDUsuario);
	SET @TerapeExist = (SELECT TOP 1 IDUsuario FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);


    IF (@username = @UsernameIngresado)
    BEGIN
	--SET @acceso = 1;
        -- Con esto declaramos la variable que contendrá el Hash
        DECLARE @HashContraseñaTbU VARBINARY(64);
        DECLARE @Contraseñareal VARBINARY(64);
		DECLARE @newHash VARBINARY(64);

        SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @ContraseñaIngresado);
		SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);
        SET @Contraseñareal = (SELECT Contraseña FROM TbUsuarios WHERE IDUsuario = @IDUsuario);
	--	PRINT @HashContraseñaTbU
		--PRINT @Contraseñareal
        -- Con las líneas de abajo, veremos si la contraseña mandada ya hasheada coincide con la registrada
        IF (@newHash = @Contraseñareal)
        BEGIN
		
            IF (@IDUsuario = @AdminExist)
            BEGIN
                SET @ventana = 1;
            END
            ELSE IF (@IDUsuario = @SecretExist)
            BEGIN
                SET @ventana = 2;
            END
            ELSE IF (@IDUsuario = @TerapeExist)
            BEGIN
                SET @ventana = 3;
            END
            ELSE
            BEGIN
                SET @ventana = 4;
            END
            SET @resultado = 1;
        END
        ELSE
        BEGIN
            SET @resultado = 0;
        END
    END
    ELSE
    BEGIN
        SET @resultado = 0;
        SET @ventana = 0; -- Asignación para el caso en que el username no coincida
    END

    SET @abrirventana = @ventana;
    SET @acceso = @resultado;
END




DECLARE @resultado INT;
DECLARE @ventana INT;
EXEC PDLogear 'Guayito', 'contraseña', @ventana OUTPUT, @resultado OUTPUT;
SELECT @resultado AS acceso;
SELECT @ventana AS abrirventana;


select * from TbAdministrador
select* from TbUsuarios

PRINT @resultado;

---Aqui comienza otro proceso, este es para registrar pacientes
/*
Esto es namas para comprobar que funciona el proceso
DECLARE @resultado INT;


*/

--Esto borra el proceso jejejeje
--DROP Procedure PDLogear
---
--- Aqui empieza el proceso de registrar pacientes

ALTER PROCEDURE PDRegistrarpaciente
    @nombreTbP VARCHAR(90),
	@apellidoTbp VARCHAR(90),
	@fechadenaci DATE,
	@IdTbCli VARCHAR(5),
    @UsernameTbU VARCHAR(50),
    @ContraseñaTbU VARCHAR(90),
	@Correo varchar(300)
AS
BEGIN
	DECLARE @clinica Varchar(5);
	SET @clinica = (SELECT IDClinica FROM TbClinicas WHERE IDClinica = @IdTbCli);
    -- Insertar datos en la tabla TbClinicas si existe
    IF (@clinica = @IdTbCli)
    BEGIN
         -- Insertar datos en la tabla TbUsuarios si no existe
		 IF NOT EXISTS (SELECT 1 FROM TbUsuarios WHERE UserName = @UsernameTbU)
			BEGIN
			-- Con esto declaramos la variable que contendra el Hash
			DECLARE @HashContraseñaTbU VARBINARY (64);
			DECLARE @newHash VARBINARY (64);
			SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @ContraseñaTbU);
			SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);
			INSERT INTO TbContactos (Correo)
			VALUES (@Correo)
			DECLARE @CorreoEle VARCHAR
			SET @CorreoEle = (SELECT IDContacto FROM TbContactos WHERE Correo = @Correo)
			-- Con las dos lineas de abajo mandamos a almacenar el Username y la contraseña con Hash
			INSERT INTO TbUsuarios (Username, Contraseña, IDContacto)
			VALUES (@UsernameTbU, @newHash, @CorreoEle)
		END
	-- Obtener el IDUsuario basado en el Username
		DECLARE @IDUsuario INT
		SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE Username = @UsernameTbU)
	-- Insertar datos en la tabla TbAdministrador
		
		INSERT INTO TbPacientes (Nombre, Apellido, FNacimiento, IDClinica, IDUsuario)
		VALUES (@nombreTbP, @apellidoTbp,@fechadenaci,@IdTbCli, @IDUsuario)
		END
		
END


EXEC PDRegistrarpaciente 'prueba','prueba1','9-10-2001','52281','pruba2','contraseña', 'JuanPabloFlamenco@gmail.com';
--Select * from TbContactos;
--Select * from TbUsuarios;
--Select * from TbClinicas;
--Select * from TbPacientes;
--DROP Procedure PDRegistrarpaciente

/*
Aqui empieza el proceso para Crear o actualizar un usuario de tipo empleado:
*/
CREATE PROCEDURE PDCrearActualizarUsuario
    @nombreUsuario VARCHAR(50),
    @contraseña VARCHAR(50)
AS
BEGIN
    -- Verificar si el usuario ya existe en la tabla
    IF EXISTS (SELECT 1 FROM dbo.TbUsuarios WHERE UserName = @nombreUsuario)
    BEGIN
        -- Actualizar la contraseña existente
        UPDATE dbo.TbUsuarios
        SET Contraseña = CONVERT(VARBINARY(MAX), @contraseña)
        WHERE UserName = @nombreUsuario
    END
    ELSE
    BEGIN
        -- Insertar un nuevo registro
        INSERT INTO dbo.TbUsuarios (UserName, Contraseña)
        VALUES (@nombreUsuario, CONVERT(VARBINARY(MAX), @contraseña))
    END
END
/*
Esto nada más lo hice pa entender cómo se conecta un Foreign key a una registro existente
INSERT INTO TbContactos Values ('guayito.palom0@gmail.com','69839847')
INSERT INTO TbContactos Values ('juanpflapi@gmail.com', '8328932')
Select * from TbContactos
UPDATE TbUsuarios SET IDContacto = 3 WHERE UserName = 'Pepito'
SELECT * FROM TbUsuarios where UserName = 'Pepito'
SELECT * FROM TbPacientes 
SELECT * FROM TbUsuarios where UserName = 'Guayito'
use DbMindLink
EXEC CrearActualizarUsuario @nombreUsuario = 'ejemplo_usuario', @contraseña = 'ejemplo_contraseña';
--- DROP Procedure PDCrearActualizarUsuario
*/

/*
El siguiente proceso es para solo ACTUALIZAR la contraseña de los usuarios basandonos en su correo electronico, más no crear usuarios, solo actualizar
Basicamente esta hecho para recuperacion de contraseña por medio del correo electronico
*/
CREATE PROCEDURE PDActualizarContraGmail
    @Correo VARCHAR(300),
    @contraseña VARCHAR(50)
AS
BEGIN
    -- Verificar si el usuario ya existe en la tabla
	
    IF EXISTS (SELECT 1 FROM dbo.TbContactos WHERE Correo = @Correo)
    BEGIN
	DECLARE @IDContacto INT;
	SET @IDContacto =  (SELECT IDContacto FROM TbContactos WHERE Correo = @Correo)
	DECLARE @IDUsuario INT;
	SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE IDContacto = @IDContacto)
        -- Actualizar la contraseña existente
		DECLARE @HashContraseñaTbU VARBINARY (64);
		DECLARE @newHash VARBINARY (64);
		SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @contraseña);
		SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);

        UPDATE dbo.TbUsuarios
		SET Contraseña = @newHash
        WHERE IDUsuario = @IDUsuario
    END
	ELSE 
	BEGIN
		PRINT 'ta equivocado'
	END
END

Exec PDActualizarContraGmail 'guayito.palom0@gmail.com', 'Melocoton';

SELECT * FROM TbContactos
print('0x6022F22F6F3B6F0DD4E78D178312CD14DB0DC43A0C6F30F188E1D5DC5BC62709');

/*
El siguiente ploceso es para cambiar la contraseña con el numero de telefono
*/
CREATE PROCEDURE PDActualizarContraNum
    @Num VARCHAR(50),
    @contraseña VARCHAR(50)
AS
BEGIN
    -- Verificar si el usuario ya existe en la tabla
	
    IF EXISTS (SELECT 1 FROM dbo.TbContactos WHERE NumTelefonico = @Num)
    BEGIN
	DECLARE @IDContacto INT;
	SET @IDContacto =  (SELECT IDContacto FROM TbContactos WHERE NumTelefonico = @Num)
	DECLARE @IDUsuario INT;
	SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE IDContacto = @IDContacto)
        -- Actualizar la contraseña existente
		DECLARE @HashContraseñaTbU VARBINARY (64);
		DECLARE @newHash VARBINARY (64);
		SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @contraseña);
		SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);

        UPDATE dbo.TbUsuarios
		SET Contraseña = @newHash
        WHERE IDUsuario = @IDUsuario
    END
	ELSE 
	BEGIN
		PRINT 'ta equivocado'
	END
END

EXEC PDActualizarContraNum '69839847','Papitaaaaa'

/*Este proceso es para devolver un valor 1 en caso de que el correo sea encontrado en la db
*/

CREATE PROCEDURE PdBuscarCorreo
	@Correo VARCHAR(300),
	@Correoexistente INT OUTPUT
	AS
	BEGIN
		DECLARE @CorreoExis INT;
		SET @CorreoExis = 0;
		IF EXISTS (SELECT 1 FROM dbo.TbContactos WHERE Correo = @Correo)
		BEGIN
			SET @CorreoExis = 1;
		END
	SET @Correoexistente = @CorreoExis

END

DECLARE @CorreoExis INT;
EXEC PdBuscarCorreo 'guayito.palom0@gmail.com', @CorreoExis OUTPUT;
SELECT @CorreoExis AS Correoexistente;

/*Este proceso es para devolver un valor 1 en caso de que el correo sea encontrado en la db
*/

CREATE PROCEDURE PdBuscarNum
	@Numero VARCHAR(300),
	@NumeroExistente INT OUTPUT
	AS
	BEGIN
		DECLARE @NumeroExis INT;
		SET @NumeroExis= 0;
		IF EXISTS (SELECT 1 FROM dbo.TbContactos WHERE NumTelefonico= @Numero)
		BEGIN
			SET @NumeroExis = 1;
		END
	SET @NumeroExistente = @NumeroExis

END

DECLARE @NumeroExis INT;
EXEC PdBuscarNum '69839847', @NumeroExis OUTPUT;
SELECT @NumeroExis AS NumeroExistente;

/*
Desde aquí comienzan las vistas

*/

/*
Procesos de Chris para Android:
*/
/*
Pantalla de notas:
Un proceso que almacene los datos 
ingresados en notas y una vista que muestre la 
nota que el usuario recien acaba de ingresar  
para que este se muestre en el sector de notas.
*/

/*
Creamos el procedimiento
*/

CREATE PROCEDURE PDInsertarAgendaPersonal(
    @Contenido varchar(100),  
	@username1 varchar(50)
)
AS
BEGIN
    SET NOCOUNT ON;
    DECLARE @FechaActual date = GETDATE();
	DECLARE @username VARCHAR(50);
	DECLARE @IDUsuario INT;
	DECLARE @PacienteExit INT;


	SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE Username = @username1);
	SET @PacienteExit = (SELECT IDPaciente FROM TbPacientes WHERE IDUsuario = @IDUsuario);

    INSERT INTO TbAgendasPersonales (Contenido, Fecha, IDPaciente )
    VALUES (@Contenido, @FechaActual, @PacienteExit);
END;


EXEC PDInsertarAgendaPersonal 'Contenido de la agenda', 'Pepito';


/*
Un proceso donde se pueda enviar datos a la base de datos
en la tabla correspondiente y hacer una vista donde se pueda
ver los comentarios que otros usarios ya habian mandado 
a la base de datos y tambien muestre el comentario que 
acaba de ingresar el usuario.
*/

ALTER PROCEDURE PDGuardarComentario
    @mensaje varchar(1000),
	@Username varchar (50)
AS
BEGIN
    DECLARE @fechaActual datetime
	DECLARE @IDUsuario INT;
	DECLARE @PacienteExit INT;

    SET @fechaActual = GETDATE()
	SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE Username = @Username);
	SET @PacienteExit = (SELECT IDPaciente FROM TbPacientes WHERE IDUsuario = @IDUsuario);
    INSERT INTO TbComentarios (Mensaje, Fecha, IDPaciente)
    VALUES (@mensaje, @fechaActual, @PacienteExit)
END

EXEC PDGuardarComentario 'Este es un comentario de ejemplo', 'Pepito';
--Se generaron 30 comentarios, investigar por qué

/*
Un proceso donde almacena los datos ingresados por 
el usuario y quede guardado en la base de datos en
la tabla correspondiente.
*/

--Creamos el procedimiento que guarde los datos

-- Crear el procedimiento almacenado para insertar datos del paciente
ALTER PROCEDURE PDInsertarAcercademi
(
    @username varchar(200),
    @Nombre varchar(90),
    @Apellido varchar(90),
    @FNacimiento date,
    @DUI varchar(20),
    @Correo varchar(300)
)
AS
BEGIN
    DECLARE @IDContacto int
    DECLARE @IDUsuario int

    -- Insertar en la tabla TbContactos y obtener el IDContacto
    INSERT INTO TbContactos (Correo)
    VALUES (@Correo)

    SET @IDContacto = SCOPE_IDENTITY();  -- Obtener el ID generado

    -- Verificar si el usuario existe
    SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE Username = @username);

    -- Insertar en la tabla TbPacientes utilizando el IDContacto obtenido
    INSERT INTO TbPacientes (Nombre, Apellido, FNacimiento, DUI, IDContacto)
    VALUES (@Nombre, @Apellido, @FNacimiento, @DUI, @IDContacto);

    -- Actualizar TbPacientes donde IDUsuario coincide con @IDUsuario
    UPDATE TbPacientes
    SET IDContacto = @IDContacto
    WHERE IDContacto IS NULL AND IDUsuario = @IDUsuario;

    -- Actualizar TbUsuarios donde IDUsuario coincide con @IDUsuario
    UPDATE TbUsuarios
    SET IDContacto = @IDContacto
    WHERE IDUsuario = @IDUsuario;
END

-- Ejecutar el procedimiento para insertar un paciente de ejemplo
EXEC PDInsertarAcercademi 'Pepito', 'Jose', 'Perez','2023-08-30', '1234-5677','correo@yajuuu.com';


----Creamos procedimiento alamcenado para acercademi Java---
ALTER PROCEDURE PDPrimerUso
    @username VARCHAR(200),
    @Correo VARCHAR(100),
    @ActividadLabor VARCHAR(90),
    @fechadeNaci DATE,
    @Numerotel VARCHAR(9),
    @DUI VARCHAR(20),
    @Genero INT
AS
BEGIN
    DECLARE @IDUsuario INT;
    DECLARE @IDContactos INT;
    DECLARE @IDActividad INT;
    DECLARE @IDGenero INT;

    -- Verificar si el usuario existe
    SET @IDUsuario = (SELECT IDUsuario FROM TbUsuarios WHERE Username = @username);

    -- Obtener el último valor de la clave primaria de TbContactos en base a IDUsuario si existe
    SET @IDContactos = (SELECT IDContacto FROM TbUsuarios WHERE IDUsuario = @IDUsuario);

    -- Si @IDContactos es NULL, entonces no existe un registro previo, insertar datos en la tabla TbContactos
    IF @IDContactos IS NULL
    BEGIN
        INSERT INTO TbContactos (Correo, NumTelefonico)
        VALUES (@Correo, @Numerotel);

        -- Obtener el último valor de la clave primaria de TbContactos
        SET @IDContactos = SCOPE_IDENTITY();

		UPDATE TbUsuarios SET IDContacto = @IDContactos WHERE IDUsuario = @IDUsuario;
    END
    ELSE
    BEGIN
        -- Si @IDContactos no es NULL, entonces actualizar los datos en la tabla TbContactos en función de @IDContactos
        UPDATE TbContactos
        SET Correo = @Correo,
            NumTelefonico = @Numerotel
        WHERE IDContacto = @IDContactos;
    END

    -- Insertar datos en la tabla TbActividadesLaborales
    INSERT INTO TbActividadesLaborales (NombreDeActividad)
    VALUES (@ActividadLabor);

    -- Obtener el último valor de la clave primaria de TbActividadesLaborales
    SET @IDActividad = SCOPE_IDENTITY();

    -- Insertar datos en la tabla TbGenero
    INSERT INTO TbGenero (Genero)
    VALUES (@Genero);

    -- Obtener el último valor de la clave primaria de TbGenero
    SET @IDGenero = SCOPE_IDENTITY();

    -- Verificar si el usuario existe en TbAdministrador
    IF EXISTS (SELECT 1 FROM TbAdministrador WHERE IDUsuario = @IDUsuario)
    BEGIN
        DECLARE @IDAdministrador INT;
        SET @IDAdministrador = (SELECT TOP 1 IDAdministrador FROM TbAdministrador WHERE IDUsuario = @IDUsuario);
        

        -- Actualizar datos en la tabla TbAdministrador
        UPDATE TbAdministrador
        SET FNacimiento = @fechadeNaci,
            DUI = @DUI,
            IDGenero = @IDGenero,
            IDActividadLaboral = @IDActividad
        WHERE IDAdministrador = @IDAdministrador;
    END

    -- Verificar si el usuario existe en TbSecretaria
    ELSE IF EXISTS (SELECT 1 FROM TbSecretaria WHERE IDUsuario = @IDUsuario)
    BEGIN
        DECLARE @IDSecretaria INT;
        SET @IDSecretaria = (SELECT TOP 1 IDSecretaria FROM TbSecretaria WHERE IDUsuario = @IDUsuario);

        -- Actualizar datos en la tabla TbSecretaria
        UPDATE TbSecretaria
        SET FNacimiento = @fechadeNaci,
            DUI = @DUI,
            IDGenero = @IDGenero,
            IDActividadLaboral = @IDActividad
        WHERE IDSecretaria = @IDSecretaria;
    END

    -- Verificar si el usuario existe en TbTerapeutas
    ELSE IF EXISTS (SELECT 1 FROM TbTerapeutas WHERE IDUsuario = @IDUsuario)
    BEGIN
        DECLARE @IDTerapeuta INT;
        SET @IDTerapeuta = (SELECT TOP 1 IDTerapeuta FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);

        -- Actualizar datos en la tabla TbTerapeutas
        UPDATE TbTerapeutas
        SET FNacimiento = @fechadeNaci,
            DUI = @DUI,
            IDGenero = @IDGenero,
            IDActividadLaboral = @IDActividad
        WHERE IDTerapeuta = @IDTerapeuta;
    END
END


ALTER PROCEDURE PDprimerusoinfo
	@username VARCHAR(200),
	@Correo VARCHAR(100) OUTPUT,
    @ActividadLabor VARCHAR(90) OUTPUT,
	@fechadeNaci DATE OUTPUT,
    @Numerotel VARCHAR(9) OUTPUT,
	@DUI VARCHAR(9) OUTPUT,
	@Genero INT OUTPUT
AS
BEGIN
	DECLARE @IDUsuario INT;
	DECLARE @Gmail VARCHAR (100);
	DECLARE @Numero VARCHAR(9);
	DECLARE @IDGenero INT;
	DECLARE @IDActividadlab INT;
	DECLARE @IDContacto INT;
	DECLARE @FNaci DATE;
	DECLARE @Duii VARCHAR(9);
	DECLARE @Generoo INT;
	DECLARE @Actividadlabolal VARCHAR (100);

	SET @IDUsuario = (SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE Username = @username);
	SET @IDContacto = (SELECT TOP 1 IDContacto FROM TbUsuarios WHERE IDUsuario = @IDUsuario);
	SET @Gmail = (SELECT TOP 1 Correo FROM TbContactos WHERE IDContacto = @IDContacto);
	SET @Numero = (SELECT TOP 1 NumTelefonico FROM TbContactos WHERE IDContacto = @IDContacto);

	IF EXISTS (SELECT TOP 1 IDAdministrador FROM TbAdministrador WHERE IDUsuario = @IDUsuario)
    BEGIN
		SET @FNaci = (SELECT TOP 1 FNacimiento FROM TbAdministrador WHERE IDUsuario = @IDUsuario);
		SET @Duii = (SELECT TOP 1 DUI FROM TbAdministrador WHERE IDUsuario = @IDUsuario);
		SET @IDGenero =(SELECT TOP 1 IDGenero FROM TbAdministrador WHERE IDUsuario = @IDUsuario);
		SET @IDActividadlab = (SELECT TOP 1 IDActividadLaboral FROM TbAdministrador WHERE IDUsuario = @IDUsuario);
	END
    -- Verificar si el usuario existe en TbSecretaria
    ELSE IF EXISTS (SELECT TOP 1 IDSecretaria FROM TbSecretaria WHERE IDUsuario = @IDUsuario)
    BEGIN
		SET @FNaci = (SELECT TOP 1 FNacimiento FROM TbSecretaria WHERE IDUsuario = @IDUsuario);
		SET @Duii = (SELECT TOP 1 DUI FROM TbSecretaria WHERE IDUsuario = @IDUsuario);
		SET @IDGenero =(SELECT TOP 1 IDGenero FROM TbSecretaria WHERE IDUsuario = @IDUsuario);
		SET @IDActividadlab = (SELECT TOP 1 IDActividadLaboral FROM TbSecretaria WHERE IDUsuario = @IDUsuario);
    END
    -- Verificar si el usuario existe en TbTerapeutas
    ELSE IF EXISTS (SELECT TOP 1 IDTerapeuta FROM TbTerapeutas WHERE IDUsuario = @IDUsuario)
    BEGIN
		SET @FNaci = (SELECT TOP 1 FNacimiento FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
		SET @Duii = (SELECT TOP 1 DUI FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
		SET @IDGenero =(SELECT TOP 1 IDGenero FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
		SET @IDActividadlab = (SELECT TOP 1 IDActividadLaboral FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
	END

	-- Establecer los valores de salida
	SET @Correo = @Gmail;
	SET @Numerotel = @Numero;
	SET @fechadeNaci = @FNaci;
	SET @DUI = @Duii;
	SET @Genero = (SELECT TOP 1 Genero FROM TbGenero WHERE IDGenero = @IDGenero);
	SET @ActividadLabor = (SELECT TOP 1 NombreDeActividad FROM TbActividadesLaborales WHERE IDActividadLaboral = @IDActividadlab);
END

DECLARE @Correo VARCHAR(100);
DECLARE @ActividadLabor VARCHAR(90);
DECLARE @fechadeNaci DATE;
DECLARE @Numerotel VARCHAR(9);
DECLARE @DUI VARCHAR(9);
DECLARE @Genero INT;
-- Ejecutar el procedimiento almacenado PDprimerusoinfo
EXEC PDprimerusoinfo 
  'Pepito123',@Correo OUTPUT, @ActividadLabor OUTPUT, @fechadeNaci OUTPUT,  @Numerotel OUTPUT, @DUI OUTPUT,
  @Genero OUTPUT;

ALTER PROCEDURE PDRegistrarEmpleado
    @UsernameTbT VARCHAR(90),
    @ContraseñaTbTs VARCHAR(90),
    @Correo VARCHAR(300),
    @UsernameTbU VARCHAR(50),
    @Nivel INT
AS
BEGIN
    BEGIN TRY
        DECLARE @clinica VARCHAR(5);
        DECLARE @IDAdministrador INT;
        DECLARE @IDUsuarioT INT;
        DECLARE @CorreoEle VARCHAR(300);
        DECLARE @IDUsuarioEmple INT;

        -- Obtener el IDUsuario basado en el Username
        SET @IDUsuarioT = (SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE UserName = @UsernameTbU);
        SET @IDAdministrador = (SELECT TOP 1 IDAdministrador FROM TbAdministrador WHERE IDUsuario = @IDUsuarioT);
        SET @clinica = (SELECT TOP 1 IDClinica FROM TbAdministrador WHERE IDAdministrador = @IDAdministrador);

        -- Insertar datos en la tabla TbClinicas si existe
        IF @clinica IS NOT NULL
        BEGIN
            -- Insertar datos en la tabla TbUsuarios si no existe
            IF NOT EXISTS (SELECT 1 FROM TbUsuarios WHERE UserName = @UsernameTbT)
            BEGIN
                -- Con esto declaramos la variable que contendrá el Hash
                DECLARE @HashContraseñaTbU VARBINARY(64);
                DECLARE @newHash VARBINARY(64);

                SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @ContraseñaTbTs);
                SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);

                INSERT INTO TbContactos (Correo)
                VALUES (@Correo);

                SET @CorreoEle = (SELECT TOP 1 IDContacto FROM TbContactos WHERE Correo = @Correo);

                INSERT INTO TbUsuarios (Username, Contraseña, IDContacto, Primeruso)
                VALUES (@UsernameTbT, @newHash, @CorreoEle, 1);

                SET @IDUsuarioEmple = (SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE UserName = @UsernameTbT);
            END

            -- Insertar datos en la tabla correspondiente (Secretaria o Terapeutas) según el nivel
            IF @Nivel = 1
            BEGIN
                INSERT INTO TbSecretaria(IDClinica, IDUsuario) VALUES (@clinica, @IDUsuarioEmple);
            END
            ELSE IF @Nivel = 2
            BEGIN 
                INSERT INTO TbTerapeutas(IDClinica, IDUsuario) VALUES (@clinica, @IDUsuarioEmple);
            END
        END
    END TRY
    BEGIN CATCH
        -- Manejo de errores: Puedes realizar acciones específicas de manejo de errores aquí
        -- Ejemplo: INSERT INTO TbLogs (MensajeError) VALUES (ERROR_MESSAGE());
        -- ROLLBACK TRANSACTION; -- Deshacer la transacción en caso de error
        PRINT('Error: ' + ERROR_MESSAGE());
    END CATCH
END
-- Mostrar los valores de salida
SELECT 
  @Correo AS 'Correo',
  @ActividadLabor AS 'ActividadLabor',
  @fechadeNaci AS 'FechaNacimiento',
  @Numerotel AS 'NumeroTelefonico',
  @DUI AS 'DUI',
  @Genero AS 'Genero';

SELECT * FROM TbUsuarios;
SELECT * FROM TbAdministrador;

/*
Creamos la vista
*/
ALTER PROCEDURE PDinforPacienteview
	@IDPaciente INT,
	@nombre VARCHAR(100) OUTPUT,
    @Fnacimiento DATE OUTPUT,
	@Correo Varchar(100) OUTPUT,
	@imagen varbinary(max) OUTPUT,
	@MsjApoyo VARCHAR(300)
AS
BEGIN
	DECLARE @IDUsuario INT;
	DECLARE @Gmail VARCHAR (100);
	DECLARE @IDContacto INT;

	SET @IDUsuario = (SELECT TOP 1 IDUsuario FROM TbPacientes WHERE IDPaciente = @IDPaciente);
	SET @IDContacto = (SELECT TOP 1 IDContacto FROM TbUsuarios WHERE IDUsuario = @IDUsuario);
	
	---Declaramos el correo ya real del usuario
	SET @Gmail = (SELECT TOP 1 Correo FROM TbContactos WHERE IDContacto = @IDContacto);
	
	---Le damos valores a los parametros de salida que son: la fecha de naci, Nombre, Correo y de último isertamos el mensaje de cariño y la imagen
	SET @Fnacimiento = (SELECT TOP 1 FNacimiento FROM TbPacientes WHERE IDPaciente = @IDPaciente);
	SET @nombre = (SELECT TOP 1 Nombre FROM TbPacientes WHERE IDPaciente = @IDPaciente);
	SET @Correo = @Gmail;
	SET @imagen = (SELECT TOP 1 FotoPerfil FROM TbUsuarios WHERE IDUsuario = @IDUsuario);
	---Actualizamos el mensaje de cariño hacia el usuario
	IF @MsjApoyo IS NOT NULL AND @MsjApoyo != '' AND @MsjApoyo != ' '
	BEGIN
		UPDATE TbPacientes SET MensajesDeCariño = @MsjApoyo WHERE IDPaciente = @IDPaciente;
	END

END

ALTER PROCEDURE PDenviarmensajedeCariño
		@IDPaciente INT,
	@MsjApoyo VARCHAR(300)
AS
BEGIN
	DECLARE @IDUsuario INT;
	SET @IDUsuario = (SELECT TOP 1 IDUsuario FROM TbPacientes WHERE IDPaciente = @IDPaciente);
	IF @MsjApoyo IS NOT NULL AND @MsjApoyo != '' AND @MsjApoyo != ' '
	BEGIN
		UPDATE TbPacientes SET MensajesDeCariño = @MsjApoyo WHERE IDPaciente = @IDPaciente;
	END
END


ALTER PROCEDURE PDDetallesperfil
    @Descripcion VARCHAR(350),
    @Username VARCHAR(100)
AS
BEGIN
    DECLARE @IDUser INT;

    -- Obtener el IDUsuario correspondiente al UserName
    SET @IDUser = (SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE UserName = @Username);

    -- Verificar si @Descripcion no es nulo ni una cadena vacía antes de realizar la actualización
    IF @Descripcion IS NOT NULL AND LTRIM(RTRIM(@Descripcion)) != ''
    BEGIN
        -- Actualizar la descripción del usuario
        UPDATE TbUsuarios SET Descripcion = @Descripcion WHERE IDUsuario = @IDUser;
    END
END


-- Crear el procedimiento almacenado
CREATE PROCEDURE PDCambiarContraseña
    @Username VARCHAR(50),
    @contraseña VARCHAR(90),
    @nueva_contraseña VARCHAR(90)
AS
BEGIN
    DECLARE @IDUsuario INT;
    DECLARE @ContraseñaActual VARBINARY(64);

    -- Obtener el IDUsuario basado en el Username
    SET @IDUsuario = (SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE UserName = @Username);

    -- Obtener la contraseña actual almacenada en la base de datos para el usuario
    SET @ContraseñaActual = (SELECT TOP 1 Contraseña FROM TbUsuarios WHERE IDUsuario = @IDUsuario);

    -- Validar si la contraseña actual coincide con la contraseña ingresada
    IF HASHBYTES('SHA2_256', HASHBYTES('SHA2_256', @contraseña)) = @ContraseñaActual
    BEGIN
        -- Encriptar la nueva contraseña dos veces
        DECLARE @HashNuevaContraseña VARBINARY(64);
        SET @HashNuevaContraseña = HASHBYTES('SHA2_256', HASHBYTES('SHA2_256', @nueva_contraseña));

        -- Actualizar la contraseña del usuario en la base de datos
        UPDATE TbUsuarios
        SET Contraseña = @HashNuevaContraseña
        WHERE IDUsuario = @IDUsuario;

        PRINT 'Contraseña actualizada con éxito.';
    END
    ELSE
    BEGIN
        PRINT 'Contraseña actual incorrecta. No se pudo actualizar la contraseña.';
    END
END

EXEC PDCambiarContraseña 'dikei', '12345', 'Contraseña'

SELECT Contraseña, UserName FROM TbUsuarios;
ALTER TABLE TbUsuarios
ADD Descripcion VARCHAR(350);

ALTER PROCEDURE PDClinicainfo
	@Username VArchar(300),
	@Descripcion VARCHAR(300),
	@nombre VARCHAR (100),
	@ubicacion VARCHAR(max)
AS
BEGIN
	DECLARE @IDUsuario INT;
	DECLARE @IDClinica VARCHAR(5);
	DECLARE @IDAdmin INT;
	 SET @IDUsuario = (SELECT TOP 1 IDUsuario FROM TbUsuarios WHERE UserName = @Username);
	 SET @IDAdmin = (SELECT TOP 1 IDAdministrador FROM TbAdministrador WHERE IDUsuario = @IDUsuario);
	 SET @IDClinica =(SELECT TOP 1  IDClinica FROM TbAdministrador WHERE IDAdministrador = @IDAdmin);

	 IF @Descripcion IS NOT NULL AND @Descripcion!= '' AND @Descripcion!= ' '
    BEGIN
       UPDATE TbClinicas SET Descripcion = @Descripcion WHERE IDClinica = @IDClinica;
    END
	IF @nombre IS NOT NULL AND @nombre!= '' AND @nombre!= ' '
    BEGIN
       UPDATE TbClinicas SET NombreClinica = @nombre WHERE IDClinica = @IDClinica;
    END
	IF @ubicacion IS NOT NULL AND @ubicacion!= '' AND @ubicacion!= ' '
    BEGIN
       UPDATE TbClinicas SET Ubicacion= @ubicacion WHERE IDClinica = @IDClinica;
    END
END

EXEC PDClinicainfo 'Guayito', 'Clinica bien genial y suoper sabrosa', 'Michelines', 'Calle mistral';

CREATE VIEW VistaNota
AS
SELECT Contenido, Fecha, IDPaciente
FROM TbAgendasPersonales
WHERE Fecha = (SELECT MAX(Fecha) FROM TbAgendasPersonales)

SELECT * FROM VistaNota


--Esta vista es para ver el usuario, la contraseña y el cargo de un empleado
CREATE VIEW VistaUsuarios
AS
SELECT u.UserName, u.Contraseña, t.Cargo
FROM TbUsuarios u
INNER JOIN TbTipoUsuarios t ON t.IDTipoUsuario = t.IDTipoUsuario

/*
Vista de anuncio:
Una vista que muestres los anuncios que el Admin 
guardada en la base de datos para que este se muestre en la app de android
*/

--Queda pendiente revisar que solo se muestre un anuncio a la vez
CREATE VIEW VistaAnuncios
AS
SELECT IDAnuncio, Titulo, Descripcion, Imagen, Fecha
FROM TbAnuncio

SELECT * FROM VistaAnuncios

/*Duda: Aqui preguntarle a guayito sobre la magen del anuncio!*/

/*
Vista de calendario de cita:
Una vista ya que el calendario
debe de marcar una cita que el usuario 
debe ir a la clinica entonces supongo que la 
vista debe de buscar en la base de datos la fecha
de la cita que el cliente debe ir.
*/

CREATE VIEW VistaFechaCitaCliente
AS
SELECT Fecha, IDPaciente
FROM TbCitas
--Investigar cómo poner la vista en base de un idpaciente especifico

SELECT * FROM VistaFechaCitaCliente




CREATE VIEW VistaComentarios
AS
SELECT IDComentario, Mensaje, Fecha, Username
FROM TbComentarios
INNER JOIN TbUsuario

--Fumar mucho weed y pensar cómo funcionará

SELECT * FROM VistaComentarios;

CREATE VIEW VistaPacientes AS
SELECT IDPaciente, Nombre, Apellido, CorreoElectronico, FNacimiento, DUI
FROM TbPacientes;

SELECT * FROM VistaPacientes;

-- Consulta para obtener datos del usuario y su contacto



--Esto es para seleccionar la vista:
--SELECT * FROM VistaUsuarios
-- DROP VIEW VistaUsuarios
SELECT * FROM TbUsuarios;
Select * from TbAdministrador;
SELECT * FROM TbTerapeutas;