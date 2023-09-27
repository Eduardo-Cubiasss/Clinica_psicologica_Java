 
/*
Drop database dbMindLink
go 

*/

Create database dbMindLink
go

Use dbMindLink
go
SELECT * FROM TbAgendasPersonales;
SELECT * FROM TbUsuarios;
SELECT * FROM TbPacientes;
Create table TbArticulos(
IDArticulo int identity(1,1) primary key,
Titulo varchar(70) not null,
Descripcion varchar(400),
Imagen image,
Fecha date,
IDTerapeuta int
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
create table TbCantidadArticulo(
IDCantArticulo int identity (1,1) primary key,
cantArticulo int,
IDTerapeuta INT,
IDArticulo int
);

-- Crear el trigger para insertar en TbCantidadArticulo después de insertar en TbArticulos
-- Modificar el trigger para obtener el valor de IDArticulo de TbArticulos
ALTER TRIGGER Tr_InsertarCantidadArticulo
ON TbArticulos
AFTER INSERT
AS
BEGIN
    -- Insertar en TbCantidadArticulo
    INSERT INTO TbCantidadArticulo (cantArticulo, IDTerapeuta, IDArticulo)
    SELECT 1, a.IDTerapeuta, a.IDArticulo
    FROM TbArticulos a
    INNER JOIN inserted i ON a.IDTerapeuta = i.IDTerapeuta;
END;



-- Crear el trigger para actualizar TbCantidadArticulo después de un UPDATE en TbArticulos
ALTER TRIGGER Tr_ActualizarCantidadArticulo
ON TbArticulos
AFTER UPDATE
AS
BEGIN
    -- Actualizar la columna cantArticulo en TbCantidadArticulo solo si hay un IDTerapeuta válido
    UPDATE ca
    SET ca.cantArticulo = ca.cantArticulo + 1
    FROM TbCantidadArticulo ca
    INNER JOIN inserted i ON ca.IDArticulo = i.IDArticulo
    LEFT JOIN TbTerapeutas t ON i.IDTerapeuta = t.IDTerapeuta
    WHERE t.IDTerapeuta IS NOT NULL;
END;



ALTER TABLE TbCantidadArticulo
ADD CONSTRAINT FK_TbCantidadArticulo_TbArticulos
FOREIGN KEY (IDArticulo)
REFERENCES TbArticulos (IDArticulo);

Alter table TbCantidadArticulo Add constraint fk_IDTerapeuta_TBCantArt
Foreign key (IDTerapeuta) References [dbo].[TbTerapeutas](IDTerapeuta);

Alter table TbCantidadArticulo Add constraint fk_IDScretaria_TBCantArt
Foreign key (IDSecretaria) References [dbo].TbSecretaria(IDSecretaria);

ALTER TABLE TbCantidadArticulo
ADD IDSecretaria int;
Insert into TbCantidadArticulo (cantArticulo, IDTerapeuta)
values
	(12,1),
	(9,2),
	(4,3),
	(6,4),
	(2,5);
	SELECT * FROM TbArticulos;

ALTER TABLE TbArticulos
DROP COLUMN Imagen;

ALTER TABLE TbArticulos 
ADD Imagen varbinary(max);

ALTER TABLE TbArticulos
DROP COLUMN Descripcion;

ALTER TABLE TbArticulos 
ADD Descripcion VARCHAR(max);


Create table TbAnuncio(
IDAnuncio int identity(1,1) primary key,
Titulo nvarchar(70),
Descripcion varchar(400),
Imagen image,
Fecha date,
IDSecretaria int,
IDAdministrador int
);
ALTER TABLE TbAnuncio
DROP COLUMN Imagen;

SELECT * FROM TbAnuncio;

ALTER TABLE TbAnuncio 
ADD Imagen varbinary(max);
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
NumPruebas int,
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
Alter Table TbCitas
ADD Hora VARCHAR(8);

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
Select * from TbSecretaria;

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
Padecimiento varchar(200),
Descripcion varchar(900),
NombreMedicamento varchar(500),
IDPaciente int,
IDClinica Varchar(5),
IDMedicamento int
);

Create Table TbPermisos(
IDPermiso int identity(1,1) primary key,
Asunto VARCHAR(100), 
Contenido VARCHAR(900),
aceptado int, 
IDClinica int, 
IDSecretaria int, 
IDTerpeuta int
);

create table TbContPermisos(
IDContPermiso int identity (1,1) primary key,
nombre varchar(50),
contAceptado int,
IDPermiso int
);	
alter table TbContPermisos add constraint fk_idpermiso_contpermi
foreign key (IDPermiso) references TbPermisos(IDPermiso);

Insert into TbContPermisos (nombre, contAceptado)
values
	('Exequiel',4),
	('Chris',3),
	('Rebeca',10),
	('Juan',12),
	('Dios',14);

ALTER TABLE TbPermisos
ALTER COLUMN IDClinica VARCHAR(5);
SELECT * FROM TbUsuarios;
SELECT * FROM TbAdministrador;
--Datos --
Insert into TbRecetasMedicas (Padecimiento, Descripcion, NombreMedicamento)
Values
	('Trastornos de ansiedad', 'Cada 8 hora', 'Sertralina y Escitalopram'),
	('Depresión', 'Cada 8 horas','Escitalopram'),
	('Trastornos bipolares', 'Cada 8 hora','Litio'),
	('Trastornos alimentarios', 'Cada 8 hora','Fluoxetina'),
	('Trastorno del espectro autista ', 'Cada 12 horas','Risperidona'),
	('Trastornos de personalidad', 'Cada 8 hora','Sertralina y Escitalopram'),
	('Trastornos del sueño', 'Antes de dormir','Zolpidem'),
	('Trastorno por déficit de atención e hiperactividad', 'Cada 12 horas','Metilfenidato  y Haloperidol '),
	('Trastorno de estrés postraumático', 'Cada 12 horas','Paroxetina '),
	('Trastorno de ansiedad social', 'Cada 12 horas','Paroxetina '),
	('Problemas de sueño', 'Antes de dormir','Eszopiclona y Trazodona ');
	

--Datos --
INSERT INTO TbTerapeutas (Nombre, Apellido, FNacimiento, DUI)
VALUES
    ('Juan', 'Pérez', '1990-01-15', '12345678-9'),
    ('María', 'Gómez', '1985-05-20', '98765432-1'),
    ('Carlos', 'López', '1988-09-10', '87654321-0'),
    ('Ana', 'Martínez', '1992-03-25', '76543210-2'),
    ('Luis', 'Hernández', '1980-07-12', '65432109-3'),
    ('Laura', 'Ramírez', '1995-11-30', '54321098-4'),
    ('Pedro', 'Sánchez', '1987-04-05', '43210987-5'),
    ('Rosa', 'Torres', '1993-08-08', '32109876-6'),
    ('Manuel', 'García', '1986-02-18', '21098765-7'),
    ('Sofía', 'Díaz', '1998-12-03', '10987654-8');

--Datos--
INSERT INTO TbSecretaria (Nombre, Apellido, FNacimiento, DUI)
VALUES
    ('Isabel', 'Gutiérrez', '1991-06-14', '13579246-0'),
    ('Andrés', 'Fernández', '1984-02-27', '98765432-1'),
    ('Lucía', 'Rodríguez', '1989-09-05', '56789012-3'),
    ('Diego', 'Pérez', '1994-03-10', '43210987-6'),
    ('Valentina', 'López', '1987-07-22', '87654321-5'),
    ('Mariano', 'Martínez', '1990-12-18', '76543210-4'),
    ('Catalina', 'Hernández', '1983-11-28', '21098765-9'),
    ('Eduardo', 'Ramírez', '1996-08-07', '65432109-2'),
    ('Fernanda', 'Sánchez', '1993-04-09', '34567890-7'),
    ('Joaquín', 'García', '1988-01-03', '98712345-1');



--DATOS--
INSERT INTO TbPruebas (Titulo, Descripcion, Precio, NumPruebas)
VALUES
	('Prueba de Estrés','Ver niveles de estrés',55.00,7),
	('Prueba de Autoestima','Evaluación de la autoestima del paciente',40.00,16),
	('Evaluación de Trauma','Análisis de experiencias traumáticas',65.00, 5),
	('Habilidades Sociales','Evaluación de habilidades de comunicación',50.00,20),
	('Evaluación de Parejas','Análisis de relaciones de pareja',80.00, 12),
	('Prueba de TDAH','Evaluación de TDH',70.00,15),
	('Estrategias de Afrontamiento','Afrontamiento al estrés',70.00,8),
	('Prueba de Ansiedad Social','Evaluación de ansiedad social',55.00,4),
	('Habilidades Cognitivas','Análisis de habilidades cognitivas',60.00,10),
	('Prueba de Sueño','Evaluación de patrones de sueño',75.00,13);


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

Alter table TbCantidadArticulo Add constraint fk_IDTerapeuta_TBCantArt
Foreign key (IDTerapeuta) References TbTerapeutas(IDTerapeuta);

Alter table TbCantidadArticulo Add constraint fk_IDArticulo_TBCantArt
Foreign key (IDArticulo) References TbArticulos(IDArticulo);


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

SELECT * FROM TbClinicas;
/*
Ya esta bien aaaa
Lo de abajo lo agregué jejeje para los foreignkey
*/

ALTER TABLE TbPermisos Add constraint fk_IDclinica_Permisos
Foreign key (IDClinica) references TbClinicas(IDClinica);

ALTER TABLE TbPermisos Add constraint fk_IDSecretaria_Permiso
Foreign key (IDSecretaria) references TbSecretaria(IDSecretaria);

ALTER TABLE TbPermisos Add constraint fk_IDTerpeuta_Permiso
Foreign key (IDTerpeuta) references TbTerapeutas(IDTerapeuta);

alter table TbContPermisos add constraint fk_idpermiso_contpermi
foreign key (IDPermiso) references TbPermisos(IDPermiso);
/*
Aqui empieza lo de cascade on delete
*/

ALTER TABLE TbIncapacidades
ADD CONSTRAINT fk_IDTerapeuta_TbIncap1
FOREIGN KEY (IDTerapeuta)
REFERENCES TbTerapeutas(IDTerapeuta)
ON DELETE CASCADE;

-- Para la restricción fk_IDSecretaria_TbIncap
ALTER TABLE TbIncapacidades
ADD CONSTRAINT fk_IDSecretaria_TbIncap1
FOREIGN KEY (IDSecretaria)
REFERENCES TbSecretaria(IDSecretaria)
ON DELETE CASCADE;

-- Para la restricción fk_IDAdministrador_TbIncap
ALTER TABLE TbIncapacidades
ADD CONSTRAINT fk_IDAdministrador_TbIncap1
FOREIGN KEY (IDAdministrador)
REFERENCES TbAdministrador(IDAdministrador)
ON DELETE CASCADE;


-- Para la restricción fk_IDSecretaria_TbAnun
ALTER TABLE TbAnuncio
ADD CONSTRAINT fk_IDSecretaria_TbAnun1
FOREIGN KEY (IDSecretaria)
REFERENCES TbSecretaria(IDSecretaria)
ON DELETE CASCADE;

-- Para la restricción fk_IDAdministrador_TbAnun
ALTER TABLE TbAnuncio
ADD CONSTRAINT fk_IDAdministrador_TbAnun1
FOREIGN KEY (IDAdministrador)
REFERENCES TbAdministrador(IDAdministrador)
ON DELETE CASCADE;

ALTER TABLE TbPermisos
ADD CONSTRAINT fk_IDClinica_Permisos1
FOREIGN KEY (IDClinica)
REFERENCES TbClinicas(IDClinica)
ON DELETE CASCADE;

ALTER TABLE TbPreguntas
ADD CONSTRAINT fk_IDPrueba_TbPreg1
FOREIGN KEY (IDPrueba)
REFERENCES TbPruebas(IDPrueba)
ON DELETE CASCADE;

/*
Desde aquí comienzan los procesos almacenados
*/
CREATE PROCEDURE PDRegistrarAdmin
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
EXEC PDRegistrarAdmin 'Juanpepe', 'dios', 'Contraseña', '98389'
/* esto es para comprobar que el PDResgistrarAdmin funciona jejeje
Drop Procedure PDRegistrarAdmin

INSERT INTO TbContactos Values ('Guayito.palom0@gmail.com', '69839847')
SELECT * FRom TbContactos
SELECT * FROM TbUsuarios
SELECT * FROM TbAdministrador;
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

CREATE PROCEDURE PDLogear
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
        DECLARE @Contraseñareal VARBINARY(64);
		DECLARE @HashContraseñaTbU VARBINARY(64);
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
EXEC PDLogear 'Katelin', 'Contraseña', @ventana OUTPUT, @resultado OUTPUT;
SELECT @resultado AS acceso;
SELECT @ventana AS abrirventana;



select* from TbUsuarios
SELECT * FROM TbClinicas
select * from TbAdministrador

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

CREATE PROCEDURE PDRegistrarpaciente
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
ALTER PROCEDURE PDCrearActualizarUsuario
    @nombreUsuario VARCHAR(50),
    @contraseña VARCHAR(50)
AS
BEGIN
			DECLARE @HashContraseñaTbU VARBINARY (64);
			DECLARE @newHash VARBINARY (64);
			SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @contraseña);
			SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);
    -- Verificar si el usuario ya existe en la tabla
    IF EXISTS (SELECT 1 FROM dbo.TbUsuarios WHERE UserName = @nombreUsuario)
    BEGIN
        -- Actualizar la contraseña existente
        UPDATE dbo.TbUsuarios
        SET Contraseña = @newHash
        WHERE UserName = @nombreUsuario
    END
    ELSE
    BEGIN
        -- Insertar un nuevo registro
        INSERT INTO dbo.TbUsuarios (UserName, Contraseña)
        VALUES (@nombreUsuario, @newHash)
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
EXEC PDCrearActualizarUsuario 'Guayito', 'Contraseña';
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

CREATE PROCEDURE PDGuardarComentario
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
CREATE PROCEDURE PDInsertarAcercademi
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
CREATE PROCEDURE PDPrimerUso
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


CREATE PROCEDURE PDprimerusoinfo
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

CREATE PROCEDURE PDRegistrarEmpleado
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

EXEC PDRegistrarEmpleado 'pipi', 'Contraseña', 'djfhskdjhf@gmail.com', 'Bryan', 1;
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
	@Edad INT OUTPUT,  -- Cambiar el tipo de dato de @Fnacimiento a INT
	@Correo Varchar(100) OUTPUT,
	@imagen varbinary(max) OUTPUT,
	@MsjApoyo VARCHAR(300)
AS
BEGIN
	DECLARE @IDUsuario INT;
	DECLARE @Gmail VARCHAR(100);
	DECLARE @IDContacto INT;
	DECLARE @FechaNacimiento DATE;

	SET @IDUsuario = (SELECT TOP 1 IDUsuario FROM TbPacientes WHERE IDPaciente = @IDPaciente);
	SET @IDContacto = (SELECT TOP 1 IDContacto FROM TbUsuarios WHERE IDUsuario = @IDUsuario);
	
	---Declaramos el correo ya real del usuario
	SET @Gmail = (SELECT TOP 1 Correo FROM TbContactos WHERE IDContacto = @IDContacto);

	---Obtenemos la fecha de nacimiento
	SET @FechaNacimiento = (SELECT TOP 1 FNacimiento FROM TbPacientes WHERE IDPaciente = @IDPaciente);
	
	---Calculamos la edad en años
	SET @Edad = DATEDIFF(YEAR, @FechaNacimiento, GETDATE());

	---Le damos valores a los parametros de salida que son: el nombre, Correo y de último insertamos el mensaje de cariño y la imagen
	SET @nombre = (SELECT TOP 1 Nombre FROM TbPacientes WHERE IDPaciente = @IDPaciente);
	SET @Correo = @Gmail;
	SET @imagen = (SELECT TOP 1 FotoPerfil FROM TbUsuarios WHERE IDUsuario = @IDUsuario);
	
	---Actualizamos el mensaje de cariño hacia el usuario
	IF @MsjApoyo IS NOT NULL AND @MsjApoyo != '' AND @MsjApoyo != ' '
	BEGIN
		UPDATE TbPacientes SET MensajesDeCariño = @MsjApoyo WHERE IDPaciente = @IDPaciente;
	END
END

/*
CREATE PROCEDURE PDinforPacienteview
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
*/
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


CREATE PROCEDURE PDDetallesperfil
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

CREATE PROCEDURE PDClinicainfo
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



---
---MostrarAnuncios---
----Descripción del proceso: Este nada más es un, se manda a llamar tanto en EliminarAnuncio como
---- Agregar anuncio: SELECT IDAnuncio, Titulo, Imagen, Fecha FROM TbAnuncios where IDAdministrador = ?;
/*
El trigger de abajo es para obtener la fecha actual y que se inserte cuando se haga un insert a la tabla TbAnuncios
*/

CREATE TRIGGER TriggerInsertarFecha
ON TbAnuncio
AFTER INSERT
AS
BEGIN
    -- Actualizar la columna 'Fecha' con la fecha actual
    UPDATE TbAnuncio
    SET Fecha = GETDATE()
    FROM TbAnuncio
    INNER JOIN INSERTED ON TbAnuncio.IDAnuncio = INSERTED.IDAnuncio;
END;


---AgregarRegistro---
----Descripción del proceso: Este nada más es un INSERT INTO TbAnuncio (Titulo, Imagen, IDAdministrador) VALUES (?,?,?);

---EliminarAnunciosActuales---
----Descripción del proceso: DELETE FROM TbAnuncio WHERE IDAnuncio = ?;


---VisualizarNotas---
---Descripción: Es un select Contenido y ya SELECT TOP 1 Contenido FROM TbAgendasPersonales where IDPaciente = 1;
---Información adicional: He creado un trigger que obtiene la fecha actual al hacer un insert en la tabla y la agrega al inicio del contenido.
---Posterior ha eso también cree un trigger igual pero updates.

-- Trigger del insert a agenda personal

CREATE TRIGGER TriggerInsertarFechaEnContenido
ON TbAgendasPersonales
AFTER INSERT
AS
BEGIN
    UPDATE A
    SET A.Contenido = CONVERT(varchar(max), GETDATE(), 120) + ' - ' + ISNULL(I.Contenido, '')
    FROM TbAgendasPersonales A
    INNER JOIN INSERTED I ON A.IDAgendaPersonal = I.IDAgendaPersonal;
END;

-- Trigger del update a agenda personal
CREATE TRIGGER TriggerActualizarFechaAlFinal
ON TbAgendasPersonales
AFTER UPDATE
AS
BEGIN
    UPDATE A
    SET A.Contenido = ISNULL(A.Contenido + ' Escrito el día: ', '') + CONVERT(varchar(max), GETDATE(), 120)
    FROM TbAgendasPersonales A
    INNER JOIN INSERTED I ON A.IDAgendaPersonal = I.IDAgendaPersonal;
END;

---EscribirEnTuExpediente---
---Descripción: Es proceso almacenado que inserte o actualice un EXEC InsertarActualizarExpediente ?, ?, ?;
---Información adicional: He creado un trigger que obtiene la fecha actual al hacer un insert en la tabla y la agrega al inicio del contenido.
---Posterior ha eso también cree un trigger igual pero updates.

-- Trigger del insert a expediente
CREATE TRIGGER TriggerInsertarFechaEnContenidoExpediente
ON TbExpedientes
AFTER INSERT
AS
BEGIN
    UPDATE A
    SET A.Contenido = CONVERT(varchar(max), GETDATE(), 120) + ' - ' + ISNULL(I.Contenido, '')
    FROM TbExpedientes A
    INNER JOIN INSERTED I ON A.IDExpediente = I.IDExpediente;
END;

-- Trigger del update a expediente
CREATE TRIGGER TriggerActualizarFechaAlFinalExpediente
ON TbExpedientes
AFTER UPDATE
AS
BEGIN
    UPDATE A
    SET A.Contenido = ISNULL(A.Contenido + ' Escrito el día: ', '') + CONVERT(varchar(max), GETDATE(), 120)
    FROM TbExpedientes A
    INNER JOIN INSERTED I ON A.IDExpediente = I.IDExpediente;
END;


-- Crear un procedimiento almacenado para insertar o actualizar un expediente
CREATE PROCEDURE InsertarActualizarExpediente
    @IDPaciente int,
    @Contenido varchar(max),
    @IDTerapeuta int
AS
BEGIN
    -- Verificar si existe un expediente para el IDPaciente dado
    IF EXISTS (SELECT 1 FROM TbExpedientes WHERE IDPaciente = @IDPaciente)
    BEGIN
        -- Si existe, realizar una actualización (UPDATE) para el primer registro encontrado (TOP 1)
        UPDATE TOP (1) TbExpedientes
        SET Contenido = @Contenido,
            IDTerapeuta = @IDTerapeuta
        WHERE IDPaciente = @IDPaciente;
    END
    ELSE
    BEGIN
        -- Si no existe, realizar una inserción (INSERT)
        INSERT INTO TbExpedientes (Contenido, IDPaciente, IDTerapeuta)
        VALUES (@Contenido, @IDPaciente, @IDTerapeuta);
    END
END;

---AgregarAritculo---
---Descripción: Es un INSERT INTO TbArticulos(Titulo, Descripcion, Imagen, IDTerapeuta) values (?,?,?,?);
---Información adicional: He creado un trigger que obtiene la fecha actual al hacer un insert en la tabla y la agrega al final del contenido

CREATE TRIGGER TriggerActualizarFechaAlFinalArticulo
ON TbArticulos
AFTER INSERT
AS
BEGIN
    UPDATE A
    SET A.Descripcion = ISNULL(A.Descripcion + ' Escrito el día: ', '') + CONVERT(varchar(400), GETDATE(), 120)
    FROM TbArticulos A
    INNER JOIN INSERTED I ON A.IDArticulo = I.IDArticulo;
END;

---ActualizarAritculo---
---Descripción: Es un Procedemiento almacenado que primero verirfica que el articulo pertenece al IDterapeuta que quiere hacer los cambios: EXEC InsertarActualizarArticulo ?, ?, ?, ?, ?

use dbMindLink;
go

SELECT * FROM TbArticulos;

ALTER PROCEDURE PDArticulosInsertOupdate
    @IDTerapeuta INT,
    @Titulo VARCHAR(70),
    @Contenido VARCHAR(MAX),
    @Imagen VARBINARY(MAX),
    @IDArticulo INT OUTPUT
AS
BEGIN
    DECLARE @Nombre VARCHAR(30);
    DECLARE @newcontenido VARCHAR(MAX);

    -- Verificar si el terapeuta ya tiene un artículo
    IF EXISTS (SELECT 1 FROM TbArticulos WHERE IDTerapeuta = @IDTerapeuta)
    BEGIN
        PRINT 'El terapeuta ya tiene un artículo. Realizando una actualización.';
        -- Actualizar el artículo existente
        UPDATE TbArticulos
        SET Titulo = @Titulo, Descripcion = @Contenido, Imagen = @Imagen
        WHERE IDTerapeuta = @IDTerapeuta;
        SET @IDArticulo = (SELECT IDArticulo FROM TbArticulos WHERE IDTerapeuta = @IDTerapeuta);
    END
    ELSE
    BEGIN
        PRINT 'El terapeuta no tiene ningún artículo. Realizando una inserción.';
        SET @Nombre = (SELECT Nombre FROM TbTerapeutas WHERE IDTerapeuta = @IDTerapeuta);
        SET @newcontenido = (@Contenido + ' Escrito por: ' + @Nombre);
        -- Insertar un nuevo artículo
        INSERT INTO TbArticulos (Titulo, Descripcion, Imagen, IDTerapeuta)
        VALUES (@Titulo, @newcontenido, @Imagen, @IDTerapeuta);
        SET @IDArticulo = SCOPE_IDENTITY(); -- Obtener el ID del artículo insertado
    END;
END;

select * from TbTerapeutas;
DECLARE @IDArticulo INT;

EXEC PDArticulosInsertOupdate 7, 'ssjdhs', 'dhjsdhs', 0x89504E470D0A1A0A0000000D4948445200000282000003000806000000B0FF0672000000017352474200AECE1CE90000000467414D410000B18F0BFC6105000000097048597300000EC300000EC301C76FA8640000FFA549444154785EEC9D057814C916850749428000C109EE2EC18367717716776717777777820709EE6E092EC19DE0B2B83B0F59ECBCAA0E61038CF47466321372F2BDFE789B547775DDAA3AFDD7ADAA5B3AF08716A00568015A8016A00568015A205C5A40172E4BCD42D302B4002D400BD002B4002D400B8020C846400BD002B4002D400BD002B44038B50041309C563C8B4D0BD002B4002D400BD002B40041906D8016A00568015A8016A0056881706A01826038AD78169B16A00568015A8016A00568018220DB002D400BD002B4002D400BD002E1D40204C1705AF12C362D400BD002B4002D400BD0020441B6015A8016A00568015A8016A005C2A9050882E1B4E2596C5A8016A00568015A8016A00508826C03B4002D400BD002B4002D400B84530B1004C369C5B3D8B4002D400BD002B4002D400B1004D90668015A8016A00568015A801608A716200886D38A67B169015A8016A00568015A80162008B20DD002B4002D400BD002B4002D104E2D40100CA715CF62D302B4002D400BD002B4002D4010641BA00568015A8016A00568015A209C5A8020184E2B9EC5A60568015A8016A00568015A8020C836400BD002B4002D400BD002B44038B50041309C563C8B4D0BD002B4002D400BD002B40041906D8016A00568015A8016A0056881706A01826038AD78169B16A00568015A8016A005680182A0A936F0E2026674AF8C0A7547E0D0BDF7A6529BFFF7AF5FF0F1D1510CED540F152A9447B9BA6DB1E2ECFFCC7F8EA93BBE7EC683BDB350AD7205259F8E5336E1D167533769FFFBB9158351B35C79546B360AC75E6A7F8EFE3B5FC06F541754AB20CB22AF0618B7E20C3E5A3A1BF9BCA70198DAB15C603E95FFC6DA0B162ECCA787583FB983F2FC8A952AA38AA89FF24DBB63EBD54F162FCD2DBFF1A8A9D4BFC8A3CD68F8DFFED7E279F081BF9F059E1C98813FAB5642EB89BBF0CE0AC5FBFAE5136EED9A8ACAB25D962F8F46C397E38EC533FA8ACFEF6F61C9A8B681EDBF6A6D2C3CFEDA0AA5F9F6C80F37E0DDA102CA55A88881F3FD61E99CDE3FDE8FA1552A7DD3BF0AA85C6D380E3EFD6095F2DCD93E1A8DAB05EA46EB7E8BF0CF170B6773631BFE6A54553CBF222A55AE8C4A15CBA1D5E4AD786669417F7B1B4B86350CACFFF215D07CD67E58BA2816B64CA83D8E2068C4D4FFBBB9035D8A24414C271D74D1CB63F9454B776791F9EB004C993511E356EFC7A1834B5133A50E094BFC8D834F2CDB06FE7DB80F63A6ACC09143DB31BE494EE82265C338FF3B96CDE4DBD3BE3CDC8D1645F2C029A20E4E6E65B0E6BEA5B3B98709A5D3C1297B4B6C397008870E1DC7D5BBAF2CDEA9BFBEB981B13572A2448331387CE1022E045CC1A3371606B4AF1FF0E0FA5951864338ECEF8B3639455B4B510C6B6F7CB5A8D13E9FF14191AC7151B0EF369C583F06F9E2E950A8F726BCB0682E7CD8EF65818F3832AB130A278A019D4E879475E7E295150AF8BF332BD166EC021C107D60EDA80648E2181D7F7A1DB13074BE84FFEEA598E0BD0387FCA7A248D4C848967330CE5BA13CC057DC5AD517A962C785A3B05B81764B606139C7EB2BB39133421C14EFBB2C503B8E5CC6B37F2D8D355FF170EF7894CF980B7D96EDC7850BE771E5C603BCB5AC34016F1FE1CC89233874F810FC6676426A61B31C9DD7E0B9458BF3167B4795479474853071DB19ACEA9801511226C7B4A356F48658A56D59E7A104412376BD777011FAB6EE844E8D8AC1C1B522565E7963F95AF8FA116FDE7D10D211F8B3B6B51B74C98A62E965CBF6B6AF9F3F20C8FF736A6A4D38E8D261C4DE7B962F0FDE606DD78A2852AD0B3A55CB8194A92A62FD034B67731F5E55722269CD39967EF00FCF7BB66F04B2264A8146A3D663DBCE7D3876E59955F3C33F3EC89B302E8AF5D8FCBDAE2C95E1ABC3A391DE5907CFA1DBF1F8B22F2AA58C8C227D36C0C2FE4D4BBD2E9F631716788055037B62609F4E28903C05B2379C671510FCFAF11D5E0539B36E6F40F9643AA468B50C2F2D2A815FF0EFC7A08FFE45B44C1B172EE97AE0B235ECFC6A075AE5F140FD7E0350294E2414EBB2124F2D9CCF9B2B73913F7E7674F07B6BE127077FDC23CC6F93076ED9EA60C6FAEDD87DE0246EBFB0289DFDF4EE5FB1674469448CE98939279F5BB65C5F5E614DE72CD0C5CE8705E704784EAD8F7889D363EA290B0FEC2DFBD6A1F63482A04953BFC28A0E85A073A9601D100C9EBFF0DA55C9A443D2F27D70D90ACCF9F0F82A8C18D409A533BB217BA35978608599EEF75796A25A862218B423008BDAB92351D2F2D8F0D0A491CD4C700F134BA5852E5151F41A3A1A93176CC6052B30DAC5390DE09AC00D659A74478352591125A90726ECB7063CCBE2FF0FBE9D8A215AF4B41876D00A4B03C4277CEFD856C81D350252A44E8378D99A63C7034BCFBD98598D4C1E362CF064034A278A8FCC0DAC0382FF19E133CEFAB4809B435CB45974C1F24B3DDE3DC0CEA5E330B45519C4889F077FFBDEB682FDBFE0F0889AC8537A280E9C5D85AAB17428DA65152C2D4FAFAFCE411E9D23D2576E8F51E32663D69E6BDF9D09162BD49B73E853211162662D8D464D9BA348EA18485963182E5B98D182DEF7C383BD689A5E87B89586E2B215F8F6ED83E31850260B92A54886F83113A34CBFDD161F705BCCF6A1FC2082A049833FC192BF0B5A1F043F5FC1C42A99C4147439789F7A6CF2ADB424B87F6419060DE88F16154AA268E90698B5FBAA653BC2FB0798D9C81D05AA4C56A6425636CA8804C92A62B3A587C3788F4B7EAB3075DC08F46A5B156E11A2A278FF357864E1C1DD81E19E88E4961513CF8AC2FCBB53006E34246BB10C16CE26B02A9FEF40C554AE88556C10ACB274EFE1098C1BD202850B5643D3DA85903A43210CDF1A60E1E9372DAD92F7D8BD05EEAD46C95000C1C727A62377C2E8C85E67066EFDCF0A9EA777F7E0BB6024FA0FFE0BC513E745839E625D9D8597ADBC38370F95936742FF9D8FF0F9E116548E2EBCF03DD659DCF3FEF17F37E03B7512C60C1B84BA05C42C52FC9CF03E6A61FFFEC34368975F0797EA93C43015B8BFA42E22C6CA86C1BBAC41825F7165794B448F9818ED7CCE5AF6BBA474B08FB8B57F3E1A97AD846A4D1AA174AAD82850AD1B0E58632C60F71DFAD71724089AACB43758DDA93074312A63C31D2BAD27F8FA18AB3B5742B228A5E17DCCD2AB49020BF8F5D30704BDFD9713539055ACC3706BB618CF2C58A44F8FFDD13A9303120AC8A858BEAC98568D06A728F151B1F37C5CB7603EF812EC615F2FE2AF34625D5DBEB63862E161F7B579F5112941268CF497163C8B96EE8910AFEE1C2B881470664613C4778C805A0BFF31D922B524B8BEB03E62468A83AEFBC41CDC97336899233274F97BE2B21596BD6A793FDE63C71678B60965DC12206B93C596F7D27D2BF6DBDB9BD1247D6AE4AE3901FF58C3512D37E57DFE6FAE79534B014F3A27F4DE6ED9558FE7E6B744DA287190BB740594F92327E245D221764A4F4CD87ED5A20348519CEF3F0F570A2FAAD0F3E2634F5AB611BDBD807E65E3C0A9F47048D7C4DB9D3D112D5A66F4D862855991F75731ACB00BA264A9816D168673C5281FEE6274A9C8889AAD032E8AFF7CB7B61322089B959C72CEB2360BA34F23081AA9B88FAF1FE0FC713F0CA8945A88863B86AE120B66EF5978D4F5F12956F528291615C74183B1AB71E262004E9D388FBBCF2D3B6FFBEFF9D5183E7F038E1C3F812D939A20934B42B45B781AFF5A701DCED7CFEFF1ECFE4D5CBF720167CFEC43CF227110D93927A61C7E80F716CC07F7F762C68245D878F838F62DEB81CC8ECE28D567391E58D855F74A782872C64D84429D96C17F552FE4CE90046D175FB1FC14CCFBB3E85E383674114B61C303EBECE47DE83710EE6ECE6838F3244EEF5B846A39A32255A319B86BF1DD99615409F9DA7A2CF02F9EDCBC84E39B8721B34324C42BD60B7BCE5EC6A3FF597254279CED4F36A3763C17448B5D15F3F71DC7B9B3A771F2E21DBCB564361F1EC07FD32CB129EF088E1FDF875E7F2446CADC0DB1F59E253311BCF1FA29EEDDBC814B01677160CD50E410B091BEE6189C7BFECE82BAF111F70ECDC79085BB4559F66344E5EC881B270F261E7A64E156FC14EBFB9541A458C53071FD4E4C6F2DA6553D9BC1EFAE656D265FFAC9FE2148246C95B7C9028BAFA7548CF2E9197C5A8A2531392A61E9D133D83FB63262A4C8842EAB6F58D86661F371044123F5F6ECEC0AB42E570E65CB9446E9D26550B66C65E1B63E66D99A7E760E933B55C41F254AA3625511A646E457AE625BCCD967E11DBD9F3FE2CCAA41A8A494A70206CCF317DB3AACF9F3193B46B740ED060371DCD24BDE44B889C787E7A3D99FB22CA5D0ACF742DCB224687E37CB079C5D3918A564DD8B36D06FF15131296D859FBBFBD1AF6929349AB81B56581AF3ED855F63EBE8E6285746B4AFB26551BDBB17022CEC41B58265F8489B5AE009B64DEE8AF2E5CA0AFD131A58A62CCA35EC850D172CAB1C8FF64F458DD27FA054D98AA85CB922CA098DAAD2C11B57FF67C94EFD059F9E9CC5D49EB5C4F34539AA74C296EB56E9CDDF6BECEB9383E85FB934BACF3D6CF125185FFE7D82AD5E6D95B2942E591BD376FE6341D00CD6E85E9EC5C80EB595BAAF50A705365FB7649DFC97CFD535FD50AE56132C3A61D9B615BCFBFCEFE62E0CAC530A65CACAEF4659F45F1560D3DE654F991304EDA936F82EB4002D400BD002B4002D400B84A2050882A1686C66450BD002B4002D400BD002B4803D59802068C5DAF8F851C4087CF386176DA0B90DFCEF7FFFC3D7AFD6998EB162D3E7A36901C5026FDFBED5DCF6A99DFC76C836F0E183754E4C6117FDCF0204412BB686B973E722418204881A352A1C1C1C78D10666B50157575764C890012F5EBCB0622BE5A36901EB59A0448912881B37AE59ED9E5AC96F856C034E4E4ECAF7B3478F1ED66BA07CB2620182A0151BC2C4891395A399F2E4C9A32C80E6451B98D306E2C411BBAE2347C6D3A7160FC468C556CF47D302FF59205DBA744A1B36A7DD332D7552B6014F4F4FE5FBD9AC593376292B5B80206845034F99324569C8C78E5978A7B115DF998FB61F0BD4AE5D5B693FCF9E717BAFFDD40ADFC41C0BA44A950AE9D3A737E716A6A505140BC86961A97FCD9B37A745AC6C0182A0150D1C0482BB77EFB6622E7CF4EF6A81EAD5AB13047FD7CA0D27E54A9D3A35D2A64D1B4E4ACB625AD20277EFDE25085AD2A0469E4510B4A2A1098256346E38783441301C54F26F5E4482E06F5EC1562C1E41D08AC6FDE9D104412BDA9A206845E38683471304C34125FFE6452408FEE6156CC5E21104AD685C8260E8199720187AB6FE1D732208FE8EB51ABECA44100C5FF56DC9D212042D694DE3CFA247D08AB626085AD1B8E1E0D104C17050C9BF79110982BF79055BB17804412B1A971EC1D0332E4130F46CFD3BE64410FC1D6B357C95892018BEEADB92A525085AD29AF408869E357FCA89206833D3FF161913047F8B6A0CD785200886EBEA0F51E1098221329F5937736AD82C7399979820689EBD98FA470B1004D922C2BA05088261BD066DF7FE04C1D0B33D41D08AB626085AD1B8E1E0D104C17050C9BF79110982BF79055BB17804412B1AF7A7471304AD686B82A0158D1B0E1E4D100C0795FC9B179120F89B57B0158B4710B4A2710982A1675C8260E8D9FA77CC8920F83BD66AF82A1341307CD5B7254B4B10B4A4358D3F8B1E412BDA9A206845E38683471304C34125FFE6452408FEE6156CC5E21104AD685C7A0443CFB804C1D0B3F5EF981341F077ACD5F055268260F8AA6F4B96962068496BD223187AD6FC29A7B973E72A87669F3871C266EFC08CC3AE05EAD4A9A3B41FFED00261D502E9D2A543860C19C2EAEBF3BD6D6881B76FDF2AFAD7AE5D3B1BBE45F8C8DAE65F9961C386A161C386901FBDDFED727777571AB2A7A7E76F57B6DFADAEECB13C89122552DA4FB56AD57EBBF653AF5E3D346AD408FEFEFEE143690D94F2C68D1B8A1DEAD7AFFFDBD5B1EC534E4E4E881225CA6F59367BD48CDFE99D2A57AEACE85FF2E4C97FCBF6D3A0410374ECD811FFFEFBAFCD35D0E62098356B56A5B27FC72B62C488707171F92DCBF63BD697BD95497E447FF7F6337BF66C9B8BA02D5FE0E0C183BFB53E448D1A15F2B2B7BEC5F7091BDF5CA97F0E0E0EBF6DFB9183A4FFFDEF7FB69420256F9B8360CE9C39113F7E7C3C7AF488176DC036104EDAC0A2458B1471F7F1F1B1B908DAF2058E1E3DAAD8A14F9F3E6CFBE1A4EDF35BC76FBD6C03458A14510649720ADCD63F360741397D2AA7C0F8430BD002E1C702DBB66D23088AEA0E02C13163C6849FCA674969015A00A54A9552964D10044563902098306142360B5A8016084716D8B87123413018088E1831221CD53E8B4A0BD002254A9480B3B3334150360582203B042D10FE2C40100CACF3208F204130FCF50196387C5B802018ACFE0982E1BB33B0F4E1D30204418260F86CF92C352D106801822041907D811608D71620081204C3750760E1C3BD05088204C170DF096880F06D01822041307CF700963EBC5B802048100CEF7D80E50FE71620081204C3791760F1C3B905088204C170DE0558FCF06E0182204130BCF701963F7C5B802048100CDF3D80A50FF71620081204C37D27A001C2B505088204C170DD0158785A80204810642FA005C2B305088204C1F0DCFE59765A0004418220BB012D109E2D4010240886E7F6CFB2D30204C16F6D8001A5D9196881F06901822041307CB67C969A16F866017A04E9116467A005C2B305088204C1F0DCFE59765A801E417A04D90B6881706D0182A08D41F0DF7FFF85AFAF2F366FDE1CA2EBFEFDFB461BF2CD9B3743F47CF97E3B77EEC4972F5F8CE6E3EFEF1FE27C2E5CB860348F972F5F86380F599E57AF5E19CD27202020C4F91C3C78D0681E9F3E7DC2F6EDDB439CCFEDDBB78DE673EFDEBD10E7E1E7E7878F1F3F1ACDE7C8912321CEE7CC9933A12ACAF408DAD62378E3C68D10B7995DBB76E1EBD7AF46DBCDFEFDFB439CCFE5CB978DE6F1FCF9F310E721B5E9CD9B3746F3397BF66C88F3397CF8B0496D927D3EA4DFA6BB77EF1ACDE7CE9D3B21CE436AA8D452633F870E1D0A713EE7CE9D339AC7EBD7AF439C87B4B76C47A1F94310B431083E7CF8103A9D2EC4D792254B8CB69BF1E3C787380F57D758F8F0E183D17CB264C912E27CDAB56B67B2435BC266274E9C309A4F8B162D425C16797EB5B11F291CD1A2460D713ED3A64D339A8F8F8F4F88F3881C39129E3E7D6A349FC2850B85389FDAB56B87A606D223F8CDDAB65A233872E48810B79978F1E2990481B469D384389FAE5DBB186D9BFBF6ED0B711E52DB4C0147FDFAF5439C4FFEFC1E46CBF2E2C50B383A3A86389F3973E618CD67F6ECD921CEC3D9D9D9E4C03E6F9E3C21CEA749E3C646CB2207B196F836C9414B68FE10046D0C828F1E3D8293833312268F8A4A4D33A06CBDB4AAAF4A4DD32347A1844AC35BB972A5D176E3E5E5A5A4CB5B22092A3649AF3A0FF93E151BA747CC780E4810DFCD240866CF9907B19D74F06E9445B96635C8ACEA9AD7242B865649ABBC63C74E9D8D9625E883E59A2C3BD27A3645AA4275555F327DACA481B07AFAF469A3F9FC258054A64B96A70A52176EA03A8F5485EA2B6975BAC828E091DF681E72E41F3D561C644E1805F39A655365AB209BCAF41D4B2457DE71B6B7B7D17C168B81824C572C594434CF11190DB3A8BF5A88F449A2E9E0EC120BCF9E3D339A4FF192A51041E4535F3CBF7156F57934C9161935334452DEB151A326A1A98104411B83E0B8718183D49E6553625E53F57D6076C3CC227D56A48A2DB4297152932098217336C48FAAC31CA94D0DCDD02691C7E04A8110D9B3576FA36D53CE88C8741972C6416533F55CA64F99319672FFF9F3E78DE6D3BC59B36FDA54D56C6D4A59B08EB837223C8B15359A879C798915233A9C62B9214DB12666E85F5DA429DA0409321655DE71C1820546F3993F7FBE922EB7A71B2A99F96D92E9E3247412EF191B72506DECA76091A28824F26920B4A99199DA54237DA036B56AD5C6681E721649A6CB1257879666EAAC4C9F334104E57E53334996164882A01D8060A4085190296F6C8C5C5E0AFDE778AABE462C2F89EAAD339B05828DBAE7C0B0A52555E721DF67D89212489C362AE2C64E6412043365CF8D143174C0A20A81974F7975D7B2CAB83BC653294B878EEA4030599E6AF0ECB81C055B79ABBE64FA24B92AAA04C1B64ABA3CF546A3703B1FD579146A3D5749ABD3454181FC794D82A043F4D828972926B0B28A3A5B05D954A4DFD72D9F5920D8218F0356578F828515D55F6B44FA9C42D82247330D829E254A21A2B0D9BC0A51B0A4B2FA3C9655898229A502BD0F0D098296D67955CFB395473008044FF52F00AC30A30F2C14DAB2BC320AA6880AD704494C8260EA0C59913E760460714560A119DA24F2B839B298D2367BA804C1527FA6C2A815E6E9B94CEF5126894A106C1AA84D0DC69AAD4D055ACE5206A99E450B9B04C198D1A2C025493614EBB054B5FE49ED2BD67E293296696F1608D6ED980D239699F76D92E953667641F4A8AE2641307FE1A2701436F311DAB4D84C6D9A5432509B5AAA04C18A6922607D0D67B37476AD48FF67C6880441556A65C544721A2F61C28456CCE1D7474B8F60E48851903EA7AB0267DD2617527DF59B534C78F732980582B5DB6745DFD9C554E721DFA7EFACA24894CA19F1E29806C1CC397223998B0E1F679456AEF7D34AA9BAE05D16018302A715D5826012F70A28D47A0EF2359EA4FA92E9DDB297310B04DD6B0E8447B369AAF3C8DF648A9256A7735205828E2EB151327D0C605E3955B60AB2A94CBFE9EF5C6681602B7707F85474C2F432EAAF05227DB6383A389801825EA59D30ABACFA3CBCCB39619427413054C5E7A7CC6C0D827BBA8941D35CF57DE0C3F452C09CB2C897CC19B1139A06C13419B3228D6B047C9E5906FF4E37439B441EA7FB17340B043DABA6C080B9E6E9B94C9FA7B89B5920E85E6BB0D9DA94B7D104F52018DD19D1DD320B089CAD5AFFA4F6156C391BE98AB7340B046B08A7463F6FF3BE4D327DF20CD1E112CD34087A7C03C169429B669AA94D238A990782655246C0A24A51CCD2D985227DD5740441E146B2ED0F41503F84120409820441DB6A5368E44E10D43F6895B0491024089AE31124086A572C82203D82F408AAF4A04AAF203D82DAC526F89DDC351C680D8220413078BF906B0463D22308395B418FA065B456CD5308820441822041906B04D5A8A515D21004098204C15F97B31004AD2036461E491024081204098204C1D0D5DDEFB911040982044182A08DE4E77BB6044182204190204810B4911213040982044182A08DE48720C85DC362BD1B770D73D730770DDB548309820441822041D0A6222432A747901E417A04E911A447D0464A4C1024081204098236921F7A04E911A4479071041947D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A147901E417A04E911A447D0D6024C10240812040982B6D6217A04E911A447901E417A046DA4C4044182204190206823F9A14730724467A4CE1E0D5DA7E644DB5159555F5DA6BAA354BD640A3CAD5CB9D268FD79797929E96AB7CF8ABEB38BA1DBE442AAAFBEB38A22512A67C48B93081F3E7C309A4FE61C79902CBA0E1F277A28D7BBF1F9545DF02A8873BD73D82508A62ED71319FF1C8FF43546AABA32D41CA3A4D3E91C51D023AF517BBD79F3068E2EB1115A1EC126E975985554870905D45FB345FACC31747088EE8A67CF9E192D8F6789528828DA99576927CC2AFBABA84E2FA3FF77DEE5E811B4B500DB1A047777C80C4C2BA44A2FA4AEBC9F900F985A10F992382076A2A4F8F4E9935113A6C99815695C23E0F3CC32F8777A69BC5739E8C29CB238DDBFA0A24D3D7AF5369A87BFBFBF92AE608504E836CD3C3D97E973148DA3DC7FFEFC79A3F9346FD65449E75E6B303C9A4D43BEC693545DF99B4C41DE4613C4BD91E159B4B0D13C5EBE7C89582E51E1143F03B2D49BA24AFB8234324BDD29485CA0B1F28E0B162C309ACFFCF9F39574355A67463F6FF3BE4D327DF20CD1E112CD15AF5FBF369A8F4791627010F98CF7D0615241F5FAE755488781B974CA3BB66CD5C6681E0101014ABA3229236051A52830A477FA7EBF50A4AF9A2EA272FFC1830743550E4A942801676767BC7DFB3654F3D59759B8F508468C1009A5CA15C6B18B1B70E8DC3AD5974C3F746C37FB02C1ACD9913C611C7C39BF59B93E9FDFA4EAC2C52DB8B47576200876E868B431067DB092B85740A1D6735409609050CAF46ED9CB28F99C3E7DDA683E6DDBB451D2CD5AEE87B57BCE63CDEE73AAAEB5DFD2C588E18A3CB973D907082E5EAC946572DFB6B82CEC7C7EB3FA4BA62FE1911311233B12046D2E93D67B01DB81E038A56D1E583C16B8B445955E04E98AD48DFCD9D2C1356E3CBB02C18EDD9BE2D82533F55CA46FD0AC9A5D81A0934364E429E08975FB2EAAD2BE208D5CB7F7227A0F0F743EF8F8F8D80508E6CBEF81982E2E38B769162E6C51AF7F1745DADD0BC6286569D1A22541D07A12A43C39DC82A06C608D1A36D164DE756B37DA170866CE84E429526A2ACBB5DB0FBF816007BB00C1D6AD5B2BEFF3E2E9234DE571734B841C39DCED0A0437FBEED054965AB5EB2AB6A0475093F9C2C44DB606C183C7CF68B29347C1C2708D15CBAE4070AAD70C4D65E9D777805D81A0ECF3356B54D754965D3B7CED0A04F3E4CE8DF80912682ACB9357EF94B2346FDE9C20A8C982EA6F0AD72058AF5E3DF5960A9672F9F2E576068299913C79724D65B97AF5AA5D82E0AD5BB734952761C2847077B72F105CBB76ADA6B254AF5E9D20A8C97261E7269B83A0C6E9300F0F0FB8BABADA15084E98304153C5F7ECD9D3AE4030428408A852A58AA6B26CDC18E8A4B0178F609E3C79102F5E3C7CF9F2C5ECF2DCBD7B972068B6D5B4DD4010D4603782A0F5A686833C8204418020A8A17386B15B088296DB2C42100408825C23A8450209821AAC46102408CA51F76C6F6FA3AD67F1B73582F408FE6A26B51F2C0DDD334CDD42102408066FB072B3083D828116A14730F4A48C20A8C1D604418220415043C709760B4130D018044182204150BF96100443A6B1E6DC4D1034C75ADFD21204098204410D1D8720F88BD10882044182204130646A1AF2BB09821A6C48102408120435741C822041D08A7104B946906B041947509B2E130435D88D20481024086AE8380441822041D068C7E11AC1FFCCC3A9E19069AC39771304CDB116A78661ED80D2DC35FC5F83E4AE610D9D338CDDC2A9614E0D736A9853C3B6962D82A0861AA047901E417A0435741C7A04E911A447901E4195D2418FA04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592059B806C1460D9B6832E1BAB51B214160E5CA9546EFF7F2F252D2D56E9F157D671743B7C985545F7D671545A254CE881727113E7CF860349FCC993321798A949ACA72EDF603E51D3B74E860F4FEA3478F2AE992B85740A1D6D607C1174F1F692A8F9B5B22E4C8E16EF4DE376FDEC0D125364AA68F01CC2B87F72A3F4E329D4CBFE9EF5C8A2D667B7B1BCD67F1E2C54ABACDBE3B3495A556EDBACAFDCF9E3D337ABF6789528828D2799576C2ACB24E985E46DDE55DCE09A33C1D953C1A36D2D61734154CDCB47163601FF2F1F1D1FA88DFE2BEA07E3562C488502DCFB871E314FB1F3C7E4653BE1E050BC335562C7CFAF4C9E8FD693266451AD708F83CB30CFE9D5E5A755FC39CB238DDBFA0F28E3D7AF5369A87BFBFBF926EAAD70C4D65E9D7778072FFF9F3E78DDEDFBC5953259D7BADC1F068360DF91A4F5275E56F3205791B4D10F7468667D1C2264150E651B346754D65D9B5C35755BF9A3F7FBE92AE46EBCCE8E76DDEB749A64F9E213A5CA2B9E2F5EBD746DF334FEEDC889F2081A6B23C79F55679C7E6CD9B1BBD3F20204049572665042CAA1445B5FE499D5C28D2574D1731B02F1C3CA8E93DB5DE54A24409383B3BE3EDDBB75A1F61B1FBC22D08468C1009A5CA17C1F14B9B70386083EAEBF8A58D1836AEBB7D8160D6EC489E300EBE5CD8A25C9FCFABBB7069ABF89FF73710EC681720D8B64D9B40C85AB11DEBF79EC7BA3DE7D45D7B0394743163BA224FEE5C76058253FAFD852BBE737061ABFA4BA62F51202722467624085A4CEEECEF41B606C1034BC60197B7AAD68CCF425FA46EE4CF960EAE71E3D9150876ECDE0CC72F9BA9E7227DC366D5ED0A049D1C22234F414FACDF7F519DF67DD3C8F5FB2EA2CF88A9760582F9F27B20A68B0B02367BE3A219FA7749A4DDBD70AC5296162D5A1204AD2C5DE1160423477446EAECD1D0756A4EB41D9D55F5D565AA3B4AD54B665F2098230F9245D7E1E3440FE57A373EBFAA0B5E0571AE778E4010ECD8D92E40F0AF766D95F7495DAE2732FD391E196A8C547565AC394649A7D339A2A0475EFB00C1254B94B23449AFC3ACA23A4C28A0FE9A2DD2678EA18343745782A09545D0968FB71D088E57DAE69E0E9981698554E985D495F713F203530B225F1207C44E94D4AE40B0608504E836CD3C3D97E973148D63572018CB252A9CE26740967A5354695F904666A93B05890B3456CAB260C102A3CD3AB43C821E458AC141BCCF780F1D261554AF7F5E857418984BA794A565AB3604412B8B543806C128489FD315FDE778AA9EAE9553BBFDE61443C52619EC0C047323998B00C119A5954BED5427BCCB22605021BB0441F79A03CD9E7E9153353A9D130AE4B72F106CE5EE009F8AEAA66B83A6751788F4D9E208108C168B20686511B4E5E36D0E82DD445F99AB7E79C487E962798498B6CD97CC19B11326B12B10F4AC9A0203E69AA7E7327D9EE26E76058231A33B23BA5B66146C355BD5D473D01475C196B391AE784BFB02C1C245E128606E9A58B632D3CC652B238A052E5B21085A5FA10882044182A0B5D6087EF30812047F1532AE110CB40941B094DE81AB96358204418220D7086A834682204190204810E466116DFA19E2BB088204C1E08DE8E5CB97A047D00972231B3D82219617D50F200812040982044182A06AC9B46C428220419020F8EBB21982A06575C6D4D3088204418220419020684A29ADF47782204190204810B492BCA87E2C419020481024081204554BA6651312040982044182A06555C5FCA7110409820441822041D07CEDB4C81D0441822041902068113109C1430882044182204190201802110DC9AD0441822041902018120DB1C4BD044182204190204810B4849A6A7806419020481024086A900E8BDE421024081204098204418BCAAAFA8711040982044182A07AC5B04E4A8220419020481024085A475F4D3E95204810240812044D0A859513100409820441822041D0CA426BE8F1044182204190206823F9F99E2D4190204810240812046DA4C4044182204190206823F92108468E1805E973BAA23F41902048102408DA488909820441822041D046F2431024089602BCCB22605021822041902068232526081204098204411BC90F41902048102C993E0630AF1CDE1304098236526282204190204810B491FC10040982044182A01346793A2A1EE1868D9A84AA166DDCB851C9D7C7C72754F3B5B7CC08820441822041D0D6BAC4CD225C23C8A9617A04098236526282204190204810B491FCD023488F203D82F408D223686B0126081204098204415BEB103D82F408D223488F203D8236526282204190204810B491FCD023488F203D82F408D223686B0126081204098204415BEB103D82F408D223488F203D8236526282204190204810B491FCD023488F203D82F408D223686B0126081204098204415BEB103D82F408D223488F203D8236526282204190204810B491FCD023488F203D82F408D223686B0126081204098204415BEB103D82F408D223488F203D8236526282204190204810B491FCD023488F203D82F408D223686B0126081204098204415BEB103D82F408D223488F203D8236526282204190204810B491FCD023488F203D82F408D223686B0126081204098204415BEB103D82F408D223488F203D8236526282204190204810B491FCD023488F203D82F408D223686B0126081204098204415BEB5038F6083A2375F668E832D51D6D4765517D759E9A0325EB2555BC682B57AE345A7F5E5E5E4ABADAEDB3A2EFEC62E836B990EAABEFACA24894CA19F1E224C2870F1F8CE69339471E248BAEC3C709F995EBDDB87CAA2E7815C0B9DED9EDD22398AA6C4F64AC350EE9AA8F547565A8315A49A7D339A2A0475EA3F67AF3E60D1C5D6223B440B0497A1D6616D161BC87FA6B96489F39860E0ED15DF1ECD933A3E5F12C510A11453BF32AED8459657F15D5E965F4FFCEBB1C41D0D6026C6B10DCDD3E1330ADA02ABD90BAF27E7C3E606A01E44BE280D88992E2D3A74F464D98266356A4718D80CF33CBE0DFE9A5F15EA5F71D73CAE274FF828A36F5E8D5DB681EFEFEFE4ABA821512A0EB34F3F45CA6CF5E34B672FFF9F3E78DE6D3BC5953259D7BADC1F068360DF91A4F5275E56F3205791B4D10F7468667D1C246F378F9F22562B9448563FC0CC85C778A2AED0BD2C8CC75A6C0AD4063E51D172C5860349FF9F3E72BE96AB4CE8C7EDEE67D9B64FAE419A2C3259A2B5EBF7E6D341F8F22C5E020F219975F874905D4EB9F57411D06E4D429EFD8B2551BA37904040428E9CAA48C804595A2C090DEE9FBFD4291BE6ABA88CAFD070F1E0C55392851A2049C9D9DF1F6EDDB50CD575F66E116042346888CE2653CB0FFCC52EC3EBE48F5B5FFCC12F41FF9B77D8160D6EC489EC0155F4E2D57AE4F27D55D38B30297D64F0A04C10E1D8D36C6A00F5612F70A28D47A8E2A010C124A99DE2D7B19259FD3A74F1BCDA76D9B364ABA09F33761E1969358B0F9B8BA6BCB09259D8B4B2CE4C99DCB3E4070F162A52CE3BB36C6B95563716A85FA2B40A4FF234F164474702208DA5C26ADF702B603C1714ADBDC3F7F087076A56ACDF82CF445EA46FE2CA9E11A37BE5D8160BBCEF5B0FFAC997A2ED2D76954C1AE40308AA30372E42B8A45DB4EABD3BE6F1A29D3771A208153071F1F1FBB00C17C1E0510235A349C583606A7CDD0BF332BC7C277463FA52C2D5AB424085A4F829427875B10940DAC51C3269ACCBB7EED26FB02C1CC99903C452A4D65B976FBE13710EC601720D8BA756BE57D5E3E7BA4A93C6E6E89902387BB5D81E066DF9D9ACA52AB765DC516F4086A325F98B8C9D62078F0C4594D76F2285818AEB162D915084EF59AA1A92CFDFB0EB42B10947DBE568DEA9ACAB27B87AF5D81609EDCB9113F41024D6579FAFA9D5296E6CD9B1304355950FD4DE11A04EBD5ABA7DE52C1522E5FBEDCCE40303392274FAEA92C57AF5EB54B10BC75EB96A6F2244C9810EEEEF605826BD7AED55496EAD5AB130435592EECDC647310D4381DE6E1E101575757BB02C109132668AAF89E3D7BDA15084688100155AA54D154968D1B37DA1708E6C98378F1E2E1CB972F6697E7EEDDBB0441B3ADA6ED0682A006BB1104AD37351CE41124080204410D9D338CDD4210B4DC661182204010E41A412D124810D46035822041504E59CCF6F636DA7A167F5B23488FE0AF6652FBC1D2D03DC3D42D04418260F0062B378BD0231868117A04434FCA08821A6C4D102408120435749C60B71004038D411024081204F56B094130641A6BCEDD044173ACF52D2D4190204810D4D0710882BF188D2048102408120443A6A621BF9B20A8C18604418220415043C721081204AD1847906B04B946907104B5E932415083DD0882044182A0868E4310240812048D761CAE11FCCF3C9C1A0E99C69A733741D01C6B716A18D60E28CD5DC3FF3548EE1AD6D039C3D82D9C1AE6D430A78639356C6BD922086AA8017A04E911A4475043C7A147901E417A04E91154291DF408AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592110435189120481024086AE83804418220419020A8523A08822A0D65816404410D462408120409821A3A0E41902048102408AA940E82A04A43592019415083110982044182A0868E43102408120409822AA58320A8D25016484610D460448220419020A8A1E310040982044182A04AE92008AA34940592856B106CD4B0B12613AE5BB301120456AE5C69F47E2F2F2F255DEDF659D1777631749B5C48F5D5775651244AE58C787112E1C3870F46F3C99C391392A748A9A92C576FDD57DEB143870E46EF3F7AF4A8922E897B05146A6D7D107CFEE4A1A6F2B8B925428E1CEE46EF7DF3E60D1C5D62A364FA18C0BC7278AFF2E324D3C9F49BFECEA5D862B6B7B7D17C162F5EACA4DBB46DBBA6B2D4AA5D47B9FFD9B36746EFF72C510A11453AAFD24E9855D609D3CBA8BBBCCB396194A7A39247C3464D34BDA3D69B366EDCA8E4EBE3E3A3F511BFC57D41FD6AC48811A15A9E71E3C629F63F78FCB4A67C3D0A16826BAC58F8F4E993D1FBD364CC8A34AE11F0796619FC3BBDB4EABE86396571BA7F41E51D7BF4EA6D340F7F7F7F25DDD429D33595A55FDF01CAFDE7CF9F377A7FF3664D9574EEB506C3A3D934E46B3C49D595BFC914E46D3441DC1B199E450B9B04419947CD1AD5359565E7765F55FD6AFEFCF94ABA1AAD33A39FB779DF26993E7986E87089E68AD7AF5F1B7DCF3CB973237E82049ACAF2E4E5FF94776CDEBCB9D1FB0302029474655246C0A24A5154EB9FD4C985227DD5741103FBC2C1839ADE53EB4D254A9480B3B333DEBE7DABF51116BB2FDC826084089150AEE21F08B8B11B67AEEC527D9D13E9474FEA6F5F2098351B92278A872FD7F62AD76795176EECC3E59D4BBE816047BB00C1366DDA28EFB364C31EEC3C760D3B8E5E51795D55D2C58A151BB973E5B22B109C3EAC3BFED9BF0AD7F6A9BF6E8AF4A58BE443C4C80E04418BC99DFD3DC8D6207860E534481D50AB19525F64FAFC3932C2354E3CBB02C16EBDDB9AADE752FF9BB60C1C70D90B083A3A4486479112D879FCBA4AED0BD448997EE8B89976058279F3E747AC18317065CF4A5C3743FF6E88B4FEAB67296569D1A22541D0CAD2156E4130724467A4CE1E1DDDA6E5C65F63B2ABBEBA4ECB85D2F593DB1708E6C88364D175F838A9A072BD9BE0A1EAC2D4C238D7C73D10043B76B60B10FCAB5D5BE57DD296EF852CB5272063CDD1AAAE4CB5C62AE9743A4714CC9FD73E407049206437CD20BC879E3A4C2CA4FEF216E933C7D4C121BA2B41D0CA2268CBC7DB0E04C72B6D734F872CC0F422AAF442EACAFB891EC0B4C2C897C411B11326B52B102C543121BA4F374FCF65FA1C45E3DA1508C672890AA7F81990AD81972AED0BD2C86CF5BD90A46013A52C0B162C30DAAC43CB23E851A4181CC4FB4C28A8C3E4C2EAF56F6A111D06E5D1296569D9AA0D41D0CA22158E41300AD2E77445FF399EAAA76BE5D46EBF39C550B149063B03C1DC48E62240704669E5523BD509EFB2081854C82E41D0BDE640B3A75FE4548D4EE78402760682ADDC1DE05351DD746DD0B4EE02913E5B1C0182D1621104AD2C82B67CBCCD41B09B1834CD55BF3CE2C374B13C424CDBE64BE62C4030895D81A067D5141830D73C3D97E9F31477B32B108C19DD19D1DD32A360ABD9AAA69E83A6A80BB69C8D74C55BDA1708162E0A470173D3C4B29599662E5B19512C70D90A41D0FA0A451024081204ADB546F09B479020F8AB90718D60A04D0882A5F40E5CB5AC1124081204B946501B341204098204418220378B68D3CF10DF45102408066F442F5FBE043D824E901BD9E8110CB1BCA87E00419020481024081204554BA665131204098204C15F97CD10042DAB33A69E46102408120409820441534A69A5BF13040982044182A095E445F563098204418220419020A85A322D9B90204810240812042DAB2AE63F8D204810240812040982E66BA745EE20081204098204418B8849081E421024081204098204C1108868486E25081204098204C190688825EE250812040982044182A025D454C3330882044182204150837458F4168220419020481024085A5456D53F8C20481024081204D52B867552120409820441822041D03AFA6AF2A904418220419020685228AC9C8020481024081204098256165A438F27081204098204411BC9CFF76C09820441822041902068232526081204098204411BC90F413072C428489FD315FD09820441822041D0464A4C1024081204098236921F822041B014E05D1601830A1104098204411B293141902048102408DA487E088204418260C9F4318079E5F09E204810B4911213040982044182A08DE487204810240812049D30CAD351F108376CD42454B568E3C68D4ABE3E3E3EA19AAFBD654610240812040982B6D6256E16E11A414E0DD3234810B4911213040982044182A08DE4871E417A04E911A447901E415B0B3041902048102408DA5A87E811A447901E417A04E911B4911213040982044182A08DE4871E417A04E911A447901E415B0B3041902048102408DA5A87E811A447901E417A04E911B4911213040982044182A08DE4871E417A04E911A447901E415B0B3041902048102408DA5A87E811A447901E417A04E911B4911213040982044182A08DE4871E417A04E911A447901E415B0B3041902048102408DA5A87E811A447901E417A04E911B4911213040982044182A08DE4871E417A04E911A447901E415B0B3041902048102408DA5A87E811A447901E417A04E911B4911213040982044182A08DE4871E417A04E911A447901E415B0B3041902048102408DA5A87E811A447901E417A04E911B4911213040982044182A08DE4871E417A04E911A447901E415B0B3041902048102408DA5A87C2B147D019A9B3474397A9EE683B2A8BEAABF3D41C28592FA9E2455BB972A5D1FAF3F2F252D2D56E9F157D671743B7C985545F7D671545A254CE881727113E7CF860349FCC39F22059741D3E4EC8AF5CEFC6E55375C1AB00CEF5CE6E971EC154657B2263AD7148577DA4AA2B7D8DD14A3A9DCE11053DF21AB5D79B376FE0E8121BA105824DD2EB30B3880EE33DD45FB344FACC31747088EE8A67CF9E192D8F6789528828DA99576927CC2AFBABA84E2FA3FF77DEE50882B616605B83E0EEF69980690555E985D495F7E3F301530B205F1207C44E94149F3E7D326AC23419B3228D6B047C9E5906FF4E2F8DF72ABDEF985316A7FB1754B4A947AFDE46F3F0F7F757D215AC90005DA799A7E7327DF6A2B195FBCF9F3F6F349FE6CD9A2AE9DC6B0D8647B369C8D77892AA2B7F9329C8DB6882B837323C8B16369AC7CB972F11CB252A1CE36740E6BA5354695F904666AE33056E051A2BEFB860C102A3F9CC9F3F5F4957A37566F4F336EFDB24D327CF101D2ED15CF1FAF56BA3F9781429060791CFB8FC3A4C2AA05EFFBC0AEA3020A74E79C796ADDA18CD2320204049572665042CAA140586F44EDFEF178AF455D34554EE3F78F060A8CA41891225E0ECEC8CB76FDF866ABEFA320BB72018314264142B991BDB8FCDC616FF19AA2FBF63B3D073480BFB02C16C39902C7E4C7C3E3257B93E1D9EA3EAC2B179B8B86AC43710EC64B431067DB092B85740A1D6735409609050CAF46ED9CB28F99C3E7DDA683E6DDBB651D20D9DBE06D3571FC6B495FEEAAE55079574D1A2C544DE3CB9ED0A0447FD5D13277CFAE2F05CF5D74991BEA87B7A44728C4210B4B94C5AEF056C0D82FB670BC83A3E5F955E04E98AD48DFC99532076BC047605822DDBD7C0F6E3E6E9B94C5FB37E29BB02C1284E0EC892BB1066AC3DAA4EFBBE69E48C3547D1A6E768BB02C17C1E05E012352A0ECDE98323F3D4EBDFB1F97DB1715C07A52C2D5AB622085A4F829427875B10940DAC51C3269ACCBB7EED26FB02C1CC99903C452A4D65B976FB61200876E8601720D8BA756BE57D5E3E7BA4A93C6E6E89902387BB7D80E0E2C54A5936FBEED454965AB5EB2AF7D323A8C97C61E226DB81E0B8402FC889B39AECE451B0305C63C5B22B109CEA35435359FAF71D68572028EBA5568DEA9ACAB27B87AF52161F1F1FBBF008E6C99D1BF11324D05496A7AFDF296569DEBC3941509305D5DF14AE41B05EBD7AEA2D152CE5F2E5CBED0C04332379F2E49ACA72F5EA55BB04C15BB76E692A4FC28409E1EE6E5F20B876ED5A4D65A95EBD3A415093E5C2CE4D3607418DD3611E1E1E707575B52B109C306182A68AEFD9B3A75D816084081150A54A154D65D9B871A37D81609E3C88172F1EBE7CF9627679EEDEBD4B1034DB6ADA6E20086AB01B41D07A53C3411E4182204010D4D039C3D82D0441CB6D162108020441AE11D4228104410D5623081204E594C56C6F6FA3AD67F1B7A9617A047F3593DA0F9686EE19A66E21081204833758B959841EC1408BD023187A524610D4606B8220419020A8A1E304BB852018680C8220419020A85F4B088221D35873EE26089A63AD6F690982044182A0868E4310FCC568044182204190201832350DF9DD04410D362408120409821A3A0E41902068C538825C23C835828C23A84D9709821AEC46102408120435741C822041902068B4E3708DE07FE6E1D470C834D69CBB0982E6588B53C3B0764069EE1AFEAF4172D7B086CE19C66EE1D430A7863935CCA9615BCB164150430DD023488F203D821A3A0E3D82F408D223488FA04AE9A04750A5A12C908C20A8C18804418220415043C7210812040982044195D241105469280B2423086A30224190204810D4D0710882044182204150A5741004551ACA02C908821A8C48102408120435741C8220419020481054291D04419586B2403282A006231204098204410D1D8720481024081204554A074150A5A12C908C20A8C18804418220415043C7210812040982044195D241105469280B2423086A30224190204810D4D0710882044182204150A5741004551ACA02C908821A8C48102408120435741C8220419020481054291D04419586B2403282A006231204098204410D1D8720481024081204554A074150A5A12C908C20A8C18804418220415043C7210812040982044195D241105469280B2423086A30224190204810D4D0710882044182204150A5741004551ACA02C908821A8C48102408120435741C8220419020481054291D04419586B2403282A006231204098204410D1D8720481024081204554A074150A5A12C908C20A8C18804418220415043C7210812040982044195D241105469280B2423086A30224190204810D4D0710882044182204150A5741004551ACA02C908821A8C48102408120435741C8220419020481054291D04419586B2403282A006231204098204410D1D8720481024081204554A074150A5A12C908C20A8C18804418220415043C7210812040982044195D241105469280B2423086A30224190204810D4D0710882044182204150A5741004551ACA02C908821A8C48102408120435741C8220419020481054291D04419586B2403282A006231204098204410D1D8720481024081204554A074150A5A12C902C5C8360C3868D359970ED9AF59020B072E54AA3F77B797929E96AB7CF8ABEB38BA1DBE442AAAFBEB38A22512A67C48B93081F3E7C309A4FE6CC99903C454A4D65B97AEB9EF28E1D3A74307AFFD1A347957449DC2BA0506BEB83E0D3C70F3495C7CD2D1172B8BB1BBDF7CD9B377074898D92E96300F3CAE1BDCA8F934C27D36FFA3B97628BD9DEDE46F359BC78B1926ED3563F4D65A9F9676DE5FE67CF9E19BDDFB344294414E9BC4A3B615659274C2FA3EEF22EE784519E8E4A1E0D1B35D1F48E5A6FDAB871A392AF8F8F8FD647FC16F705F5AB112346846A79C68D1BA7D8FFE0B1539AF2F5285808AEAEB1F0E9D327A3F7A7C99815695C23E0F3CC32F8777A69D57D0D73CAE274FF82CA3BF6E8D5DB681EFEFEFE4A3AAF29D33495A56F9FFECAFDE7CF9F377A7FF3664D9574EEB506C3A3D934E46B3C49D595BFC914E46D3441DC1B199E450B9B044199478DEAD534956587DF3655FD6AFEFCF94ABA1AAD33A39FB779DF26993E7986E87089E68AD7AF5F1B7DCF3CB973237EFCF89ACAF2F8F96BE51D9B376F6EF4FE808000255D999411B0A85214D5FA277572A1485F355DC4C0BE70F0A0A6F7D47A53891225E0ECEC8CB76FDF6A7D84C5EE0BB7201821424454AC521AD7EE1DC795DB47555FD7EE1DC3C469C3ED0B04B3644572B704F87AE784727D5179E1EE495CDEBFEE1B0876B40B106CD3A68DF23EEBB71FC2D1F3777024E096CAEBB6922E76EC38C8952BA75D81A0F7B841B87F6A07EE9C547FC9F465FF288C08912213042D2677F6F7205B83E08175F3807B27556B86D416993E7FCE2C708D13D7AE40B077FF4E1AF4FC385AB66D645720E81039128A7896C2D10B77556A5FA046CAF4E3A6CEB52B10CC9B2F3F5C63C6C4ADE3DBCDD2BFBB422B8F6D5BA694A5458B1604412B4B57B805C1C811A3204D0E17F498910FEDC7E6547D759F9117651AA4B42F10CC911BC9A2EBF0714A11E57A3FA9B0AA0BD38B21A06FEE4010ECD8D92E40F0AF766D95F7C950A90FB2D79B84ACB5C7A8BAB2D519A7A4D3E91C51207F5EFB00C1254B94B234CBAC8377091D2617557FCD11E9B3C4D2C121BA2B41D0CA2268CBC7DB0E04C72B6D734FA7ECC04C4F557A2175E5C364E1D19A510CF9923A2176C2A4760582852BB9A1E74CF3F45CA6CF592C9E5D81602C17673827C808F746D354695F9046BA379C86E48503BD960B162C30DAAC43CB23E851B8181CC4FB4C2A223CB6C5D4EBDF744F1D06E7D7296569D9AA0D41D0CA2215AE41307D4E57F49B530C5D2717547DF59D5314159B64B03F1074112038A39472BD9F5652D505EF3208181438FD626F2098A3C640E46F3A4D4CA94C5275E56B2CA75F2689B238D91D08B6728F0C9F0A8E985E5AFDB540A4CF16478060B45804412B8BA02D1F6F7310EC9607985B56955E485DF930BD2430A70CF22573162098C4AE40D0B36A0A0C986B9E9ECBF4798ABBD91508C68CEE8CE86E9951A0E56C55DA17A491055ACC46DAE22DED0C048BC2517C5FA69572C4CC32EAF5CFBBAC234614752008869238857B10EC3FC753F5BA3DB9C64F82A3FD826069018266ACC3F12E2B40B0905D82A07BCD8166AFC3916B76EC13041DE05351DDBABDA0F57D0B447A826028A9A00DB3B13D080AEFF95CF5EB643F4C17EB64C5FA3DFB0541F3F47CC05C4FBB05C182AD66AB5A8318B456B1A000C774F60A8262FDF24C33D72F8F2816B87E991E41EB0B144190204810B4D666916F53C3ADDC09823F4B19378B045A84202867307EBDB46C1609F4081204ED6B6AF89B479020F80BCD71B3483093B88B1D9E091326B43EF206CBE1D1A347906B04E5D4303D82F4085A6DD73041D060BF260812048DF53B826066D023488F606881113D82F408D223488F20C3C78496E2FE940F3D82F408066F122F5FBE44D01A4182204130B46489204810240812040982A1A5B8044155B104E911A447906B04434F94088204418220419020187A9AFB434EF408D223488FE0AF1BE964B07B8260E88912419020481024081204434F7309822AFA1B3D82F4081204434F940882044182A08A0F53D0C276B38E98E366116E1631A1E5F408D223488F203D82A1877CFA7322081204098204417A046DA4C4044182204190206823F9F99E2D4190204810240812046DA4C4044182204190206823F92108328EA0382180278B404EF5328EA08E2068232526081204098204411BC90F41902048102C993E0641D033305657C3464D42558B18503AD0DC0441822041902018AAE2AB27334E0D736A9853C39C1A2608DA488909820441822041D046F2438F203D82F408D223E88451F408DA548309820441822041D0A6222432A747901E417A04E911A447D0464A4C1024081204098236921F7A04E911A447901E417A046D2DC004418220419020686B1DA247901E417A04E911A447D0464A4C1024081204098236921F7A04E911A447901E417A046D2DC004418220419020686B1DA247901E417A04E911A447D0464A4C1024081204098236921F7A04E911A447901E417A046D2DC004418220419020686B1DA247901E417A04E911A447D0464A4C1024081204098236921F7A04E911A447901E417A046D2DC004418220419020686B1DA247901E417A04E911A447D0464A4C1024081204098236921F7A04E911A447901E417A046D2DC004418220419020686B1DA247901E417A04E911A447D0464A4C1024081204098236921F7A04E911A447901E417A046D2DC004418220419020686B1DA247901E417A04E911A447D0464A4C1024081204098236921F7A04E911A447901E417A046D2DC004418220419020686B1DA247901E417A04E911A447D0464A4C1024081204098236929FF0ED117CFFFE3DA44730639ED818B6A424FACE2EA6FA1ABAA404AAB5CAA4C0D3E6CD9B8DD6DF9C397394740DBAE6C090452554E721DF67C8C2E2704B1315F1E3BA996C23D972E5438A1882E97DCA075EF3CAA9BB1657C4CD51C59477ECDEA397D17C2E5CB8A0A44B96BB0A8AB55F82022D67A9BE64FA24392B28F75FBB76CD683E9D3B7554D2E5AE3B1285DACC539D47C156DE4A5A9DCE09850B7A98B499638C38289B3126B0AC923A5B05D954A4DFDD25AFF28E8B162F369ACFDA75EB94747FE776C08A6A4E985F41FDB54AA4778FAB834374577CFAF4C9683E25CB94434491CF9CF24E5858517D1E8B2B3961524947E51D9BB76865D266964CB071E346255F1F1F1F4B3E36CC3DCB56203875EA34C5FEC7FA8ABEB2D48C3E305F68CB928A2890222AE2244A66D2DEE932E740BAD81180051580F9666893C8E3DAB022CA3BF61F38C8683E67CE9C51D295AC950AC3979AA7E7327DFED24994FB6FDDBA65349FB66D5A076A53BDD1666B93478BE9E2DEC82859DCD3681E5FBF7E452C97A87049920D45FE5EA45AFFA4F615F96B113294FE4B79C755AB5619CD67F9F2E54ABA3AEDB361E862F3BE4D327DCA4C2E88113DB6C9FA2FE4591C8E229F79429B1698A94D134A046AD35F7F77309ACFCD9B379574155247C09AEA51CCD2D9D5227DAD0C1195FBCF9E3D6BB23C964C50A24409383B3BE3EDDBB7967CACA667FD561EC12F5FBEE0F0E1C3D8BB77AFD16BFDFAF58814C111C9D2B9A0510F77D4E99055F5D5A8470E14289B4C693883070F369A4FC78E815053BC7A2A34EC9643751EF27D64FA386E4E88258065C78E1D46F34999263D1244D561A70014796DEF9C47D5B5B77B3EF834CDAABC638D9AB58CE63173E64C255DBCB40590B5720F642ADB5EF525D3C74D934FB97FEEDCB946F3A956B58A922E6DB126C85CBEB3EA3C3295EDA0A4D5E91C90255346A3796CDBB60D0E51632077B268D8DB33BF2A5B05D954A61F593DBDF28EDDBA77379A4FBFFEFD957495D24646EF020EE89C4FFDD547A44F2DE03E7294E8D8B46993D17CDC73E54104914FC7BC0EE866461EDDF33BA0B5BB83F28EA5CB9435D96F64BFBA71E38626A1F9F9268260A0452C0D820F1F3E54558FEDDA0502C3A43AA2AF98D10776086DD9DB231F322570428CD8F1B06BD72EA3F9254E9E0A895D226077D77CD8D9D90C6D1279CC6D14A84D75EBD7379AC7D4A9539574EE8513A2714FF3F45CA6CF902BEEF74189B16F4785F2E502B5C9B3A9D9DA94B18CB47724B8E7C866B42C5BB66C4134672738C74D89AC95BA99A17FED91B5623724CD555179C73E7DFA18CDA757AF5E4ABA629553A25177F3BE4D327D8264CE881AC5055BB76E359A4FE66C39E020F2E92CB4A9AB99DAD43247A03655AC54C5681E723029D3E54B14017D0B3A9AA7B3227DE1A41194FBA74D9BA6AAEFBC7BF7CE221A48100C6646777777244C98D022869564ED1A3BB652A9BC6803B601CBB781CE9D3B5BA4AF1204AD038272A0C5766FF9764F9BD2A6416D40CE8E59E28720684D10748D09B7A4A9D0B1EF18B4ED3E146DBB0DD17BB5EB310CEDBA0F0B4C63E6D54EA497F71B7BBE92EFB77432BDB97928F78AF76BD7C3701982CAF6C3FB68C8CBDCB228F969B9CCB499D63C147B1BA8F7EF360B41FD07D5ABDAFA6FABB433F32FA58D4A9B992ACBF7F6687E1EF2BD02FB82619BB5EF330A759A7508F48276EB66090D0441D03A2018E41D2957AD3E3AF51B6BB8ED04D7308D9A618FDAA44D67D5E97990CE6AD2A5E0DF0253FD59E9F71A353654BF4DA1A34D6A7536F07B6EFE15F89D35FE3DEF3C603CB2E52EA868E0A54B972CA28104412B8260F468CEC8E5E189738F8043D7DFE3D0B577BC6803B68110B48153F781E5DB4F2B22D8B56B578B882041D0BA203866D66A043C111A18827AE7BDFC76B00D04B6818B2FF07D304C10B4C827E0C787587A6AD8257A5464CF5308FB2FBDC6B613F7B0EDF85D5EB401DB4008DAC09EF3CFE1BD7A2F41D00AFA67E93582411EC14113E6E3C095376CF72168F7FC76F0DB19D406A453A95AFD56F4085A410395471204D9D928B8F6DD060882D6523FCB6F162108DA775FA2D685CDFA21085A4F03ED0E04B71EBB8BED679FE3C0D5B7F017A3E90357FE87FD179FC22F2C8E2A45597C4F3DC17EA52CFF53CAE27FE5057684552FE98987D823CB70F55B59AEBEC2AED3F7B14D9433AC89EBD663F7B1EBE2EB6F6579A3B4B53DE71EC2F7D81DBB2C0B41D07A22687F1EC107D87D49B449A59FC97F5F63CF9907A29FD967DB34D6F7B71EBB879DE75F2965917D4C5EFBCE3FB6DB7E66BC2CBF7E9B0E5C7A8AED61F8DBB4EFE76FD349FB9DC123085A4F03ED0C04C5C7F9C22DCC9D3E01D52A548767A94A285AAA3AEA765D89350206C35687BB871DE7EE63F5FAE5685CA106FE285319454B5646B9BA9330FFF803EC3829002A0C0988EFC987D87A700F3AFD590FC5CB561165A904CF72BD306EDB356C178B41C35259B609A0DD21E2550DEBF0374A96ABAA94A5589996E831E7187C85B0DBE3A08320683D11B42710F4156DD3EFD431F46BD10225BEB54DCFB27F63E0F273D87E41005418D28C6D42E7765DB88289037AA36CF96A2826F4BC5899FA683B6617B65C7E16C6F45C7E9BEEC067F614D490DFA6D2F2DB540DB5447CD655179E604798AA977BC2D9721F6B37AF42B360DFA6D2B5C661CED1FBD8211624DBA39E1304ADA7817606820FB1EFFA4D8CF9BBAC08CE9B0C55FACC40EF8E95E01231036A8CDE05BF8B4FECF223ADBFD308E1B8F4008B6777477C5D14E4A83F1A23C674400A8744C8D5740ED6063CC6F61361C793E677FA31B6ECF141DE080E88EBD10123668C46C1C40991287F0F781F11D06BA7E2A1B76E4E3CC69E8B07502F4302448C5F113DA6CE409D2219103561550CDA74153B05D8DADB079720683D11B42B103CF958F4A5AD281F3F069CD3D6C7C0995350217B0AC448DB18E376DDC2CEB30FECAE6D1A86864742CFCFA163898CD039E4479B71B3D1BA7A5E38462F8C0E8BCF626798025BF96DBA8D89DDAA88987C8950AEDB34F4EB56033175695071B02FB685A959ABFBD879F121962FEC87C43A4764AA390C23277445EA280991B5CE74AC3A2BBF4DF6E71924085A4F03ED0E04F75EBB89F19DAA20BA63090C3FFC16870ECC446A5D74B837F2C1A66B2FC3D028524E3D3EC092B9BD9144971675665DC7C5C787502E6E6CC4C9DA1D0BCF3F0D5353C48120B81005632646CE565B10F0E931BA95CC844891CA61E45EF1819253576165542C4070F7858368E49E16F1F30CC7CE371F31A74F354412A2DE7CCE09ECB043AF2041D07A22687F20E88BCA29532065B9D938F2EF3B8C6B5E4C042BCF85AE6B2E8A69D6B0E4157C84BDD702D0A57C2EC44CD61A2BEE7EC6FAD9ED115D171F9587EFC2F6ABCFC3D0C05E0409BF761B537AFD8918110BA1DFEE5738767C0132896F53A69A33B1F1DA8B30F56DDA79E121562C1E8494BA54A832F1222EBD38896A49E221469AF698274070871D4E111304ADA781F609825D6B2156A43428DD7A009AD7298A6809F2A1EDA2DB3872E101B68615D838FE0D04E70D10201B17D9AB7643C78E7591C8D50DC5071FC281F3616B3A5501C1BD4BE0192B0EDCF2351131223BC23D492CA4AAEF832DA705D4DAA17018045305040FA169EE74E218A9D268DEA72FCAE54A8A18F93B63F681E7D827A64DEC0D6A0982D61341FB03413FD4489314AE19AAA35DBF9E2896213EE2961A8E65479F63F769FBF3D418F3084A10EC5E291FA2C7CA8FBADD06A256F18C8892BE1646F93EC5C180FB6148CFBF8160DF0688132105FE68DE0FAD1A9640F4B839D074EE8D30F76D524070C97064D0C546A60A9DD0B14B43248D9D0085FAECC53E315B656FFA27DF8720683D0DB44B109CD0ED4FC48EE8869C151AA14A8D4A489B24352AF75D8F554208779C0C2BD3A9DF4070FE20A4D5C540AA023550AD51036449160B051A8DC19CBD4FB133CC94E52E1410DCB7147FB8BA224EFA12A8D2B4253C32264496124D3172A39C1A0E6B1EC1436896271DA2C6CD89D20D5AA164E11C489DB51C3ACE3B8F6DA71EC3CFCEA6ED0982D61341BB03C1D3DB51336D12444F5200151AB782A768A7E9F2D640EF65D7C5FA41FB5BB66012042BE747B468E951ECCF162857BA3052A72E80A6938F60D309B14ED0CEFA99E1B20482A057DF8688AB4B80EC651AA2CA9F55912E715294EBBE022B8E84AD6F9302824B47088FA60B92E7AB8A6A8D1B215BF258C857770866EE7E22BE4DF637E020085A4F03ED120403A786FFC0A0BD6F71E1D635B4C82B0EBE4E510E23B6BDC0FEB3F6D7400DAE11FC36359C544C39FE39ED222EBEF982F14DB240E79C084DE7DCC47E3122B6C79197BE770A3E35ECDE620D8E7F00D68C6B8A98117528D07B9F981A7E02DFB022EAC1A786730FC02611F4D77FF32C648BAE43FC6A5E587D5CECEC3E655FED8C20683D11B43B103C1538359CA28C17F6BC01762E1E82E48E3AA469B61C9B4E0978B2C38FB47E1D0B9C1AEE2AA7869336C7027144F6A9235B51D24D07A7423D31CFFF15769FB1AF7E660A04A7F41653C3110AA097EF4B5CB877077F17890E9D5B31B1B6F839F68BCD816143CFC51AC16F53C3A974295169EC695C1047F77AB5C9039D634CD49B715594E5A1DD958520683D0DB43F10149B45C6B62F2F16E4664293A97BB16CDD1A54CC1C09C9CB0EC5FC632FB0FB5418F208CACD22DE3D9050E78A229D9660D9EE13F8AB9C1BE264AA85E17E0FC3D4344FD066917C0ED1455D0CC1BCFD5731E2AF62889F20335ACD176B97CE88D02B6165DA5E82E0457FD4CF9418CE291A60ECD6CBF01ED711E9E24645897E7ED87C46EC50B733A825085A4F04ED0F04B7A2825B5CB8BAFF8DA9BBAEC16B607D248B131FD5C71DC63631E0B2376FB5518FA0D82CD2A9541644762985BEABCE60E19CB1C8E31609B95A2DC59AD361C98B263C8262B3C8A4EED5E02406F675C7EFC0B24D9B513D870392FCD107DE87C5B4BD9D0D1E0DD74BD06691FE48AA8B897C6DE763D9DE33E854250562A7AD88415BEE896F93FD412D41D07A1A68672028E2675DBE85E9237B225FE65CC89ABB10DCF31440EE324D306AF313317AB4BFC669B4B39DBF8F152B66A04C667764CE5900EEF90A216B3E4F749C7F093BC2123809C09353525BFCB7A0A1870732E6C82FCA5204D972E444DD61DB152F45D8F9388981C48947D81570123D6A5542C6AC7991236F11E4C89507A5DA4CC3E223AFB0D30E059D20683D11B42F107C84EDA70EE0AFB22590215B3EE410FD2C7BCEDCA8D84D842939FE5278AAC3CA4058BEA718EC5EBE88616D1B226B963CC89EB73072E4CE87C2750760F63E198334AC78036559E4B7E936668FEF078FCC3903BF4D790B2067893A18BAFE5198FB36ED087880D56BE7A082F8366552BE4D8591257761FC353B00DBCFD8E7F20382A0F534D0CE403050E464CCBA9D671FC14F4C81F89EB82F1AA60CA91096203098589F103103E5767CF1FEBE624BBEF4ACED381D96424004FFF07CAB8B6FEF2FE17087108D300581DFBD96B22E1E057A3245BDF89E14F524DA99BD4EBB1104AD2782F6048281034B11E74D6A9EEC67C2332DF530ECF633B9BE38B09FF985817E666A6A37E8DB247542F936493D97DA1E56664382BF67F06F936873B29E769CB6DF991D82A0F534D02E41509E4FEC2B022E7FBFEC30A69129C1F8EFEF3F97258C8AC6370191E2F763DD84250FC58FEF1A088061A39D1104AD2782F6078202FE7E699B61B79FFD567A1E8634C3F4372A6C7D9B0882D6D340FB04C1B038BAE23BDBDDE262D34218763EAE0441EB89A03D82E0EFD4765996B0A333F65C570441EB692041900047800B036D8020683D1124081254EC1980F86E81ED9320683D0D2408860108A010F0434510B49E081204D9BFA8B1F6DF060882D6D340822041901EC130D0060882D6134182A0FD4300418D754410B49E061204C30004500429820441EB89204190FD8B1A6BFF6D8020683D0DB43F1014613C76053CC32E25CEDE1DC55BB55509A7F0047B029E5826D0EF3119D240C42514F9FC708284D84EBFF39CC8FBACA5B6D0DFC70EF1BC3D229F9D3240E731511EB1EB56C9E38C38924DBC87650548D8E9ECB7FC94E707DACFD2970CA120EB48A90F4B9F72F0AD0EF60488F38B653C3FC566816D22D086962D8FAF088123DB81ACA33DE28C4D6B049296ED778708521D984750DB36AF1C0441EB89A0BD81609036ED3EF72D9E9B68F352FF768BF6E967B1FE6C409B94F669216D12EF2DFBD7F7BEFB4DCFB78973D8779C7D8AEFE5B35499647EC1B5C98AD126FC94EFD133ECB6D8B7E29B1E28DF2611F0DEC0B7C9D2F929DA24EA2224DAA4EAFBF2BD5EA4060669BB791A4810B49E06DA1508FA0AA8D8EC7F1E0B56EDC3C29D97B1F5442090F99DBC83F5BB4EC27BD511AC3E784B09ADA0AAF1E91518B965FE0ED6F81DC1BC35FBC4F3C4B394E789384AC76F60E9868398B7F91C36CB3001211128F9CC6337B062F37ECC5973102BF6DD849F14D8A3D7441EFE58E877095B64E89290E4F1C3BD32AE952897AF3FBC57EFC7D25D37B0CD0A015B65B895AD872F63F1BA7D229F935877E48EB06748EAE33F3190F5BAF5F015611F69B3635873E88E62B32D872E61D15A7F2C11A72C6C15F96BAFFB1F8567FB1921E4472F62F6D2AD98387F03262F3F860DC7446C300B95679BFCF00988DD73EE3136EC3884A90B37897C3663F6962BE2C36EDED9CC0441EB89A03D81A0AF387F7CFDCEE398BB663F7CB65CC256D14E64BF5EBBFD28E6AF3F89F51276427AEA8DD4A6A3D7B17CD33ED1CF0E61E5FE5B4A3FDB7AE42A96AEF7C7223FA1BD16D026A90B1BF69CC2FC55FBB16CDF3F4A5F5074F6E42DACDE760473D68AF21C15FA11223D0FA61FDFB469D15AA94DA7029F6DB1BEFC633E1B761D1379ECC3822DC25616D3D9C06F93ACEB7942C357F98B3C83BE4D276E60F9C64398BBF12C36091B86FCBB21B5E9A1A24DEBB71FFCA64D5B307BEB55B3B5C9A81E8B81BCEFE9A7D87BEA0616ACF6C324A1B39316EDC34A51B61D66DA8D20683D0DB42310142393F3CFB07EA5370AC4D6215EA90198EFFF1A7B85876BFF89E3E850252D74F12A61C8861B622419128FDD7DECBAF810133B9411E719EBE039F4B018010BCFD69917D8B67E0AB2257441CACA53B14E0481960150B542879F0808BB759F1FFECCEA009D2E1A72379F8BF5D73E60FBEE3528952836B254F1C2AA6BE24C5B0B81A01C79FB1DDC89BAEED1447E0EC8567312565C7C8B9D21FD68FC049BBB2F3EC682A93D9151D84E17210B5A789F809FA8B7900B93A87F31525CB7CE077F2412CFD6B9A1FC105F6CFFE703D6AD9C0877C7D828D6612D365D7F81ED16B099EF49312ADDB70F5D9BFD0167B71C28F84739115DBF229A4EDE89CDA764DD9B375AD5DB4E64C056512F1B964D82679E8C489ECD13858B14439ECA9D307ADB3FE20413F5504B10B49E08DA0F088AD32B2EDEC6B096451145A743F454E2F8C3434F71E8F23FE853272FE2C5AE8CE1FBEE08CFB87983889FDBA60C56BD65CF1654CF1451F4B318C8DF7A21365EFF00DF1DCBF1473C5764AF39036B42AC4DF7B0EBD2732C9AD40D299D7448DB7C11369C7821024BBFC0DE039B51D93D2E9CB37682B7BF9821B1C87166F7B1FBD223CC9FDC15E9234B6D72471B9F33F0139A12726D0AAE05129ECEA36B954C8828EA285EF6BF30E3E44BECB208708A6FD3A5C7F0EA511DB11C7428D87F9F80A5C06F939F380B3D4F9218485C663C564BAD0F697E429BB69F7A88F58BC7A148CE0C48995D6853614FE4ADD21563B7DFC22E33B4C9E837F2E463EC3C721E13FAD6418CC41990A74839E4CB5D0295FB2CC6CA134FB0D38C721004ADA781760482721A418C1C4E1C43C7AA69A073298A5EAB2EE1C03FEFB065FD3C148A1B11A9FE9C8215A79E8B46AA1DD064A3F5131D6BF38649C8E61A15B13D8663951815EDBEF40CD37B5681AB7332D49D794AC0E1233162D20E030A08EED9861AEED11141089343FC32E8BFE1AEE8141B51325E0C64AC38C5A22028C562F5BC7E704F9219B9F2A44194F4D53074CB53F85BF22074D1A9F79FBE80DEF54B226386BC48953A3ED2369C8F4D27C514BB191D5ABF707C03C1357351346524F181D221469A169826CEF0DCB87E32B2458C81C2EDD7580804C554F3C59B1851BF9010F354A839EB248EFEF311DB362E45CF699BB1EAE083900BAD6867DBCF3DC5B65D1B503EB91362666F03AFC3AF70E2E23DCCF1F6C280A517CCFA001204AD2782F60582B730B47911448F2A0743B151AAF376ECBDFF007D6BE544EC181530CC5220B86B13AA648FAA689363C20A18BC594CD7FAAF81A7AB0BB2549B6E0110147A7EFA0576F96F14F9C4862E71634C15EFBEF7DA5BAC9CD907A99D9D51A0D7266CB1D4B9DE279F60DFA973E85EDB13998436A548191F199B2E16B32EE2DC70E165D53AA0FFF93EDF33AFB1D3771EFE489B0939F36547D444EE683EEF1F1C3C1732380FCA477E9BB66E9D893C09A2C125E7002C13A77DECBDFC02B307D4465CA744A83EE5A872CA4CC8E0562C213AF7045BFD56A174D2C88895F36F4C3FF61AC72FDCC5ECD95E18B4FC9238FE4FFD20D5B06D05D85E7D82B9839B21B62E2A72F6DC88DDD73E63EF9EEDE83F6531BC77DD33EB384F82A0F534D0AE40504E1BECBAFA0A8BA7744772072714EDB703BBAEBFC29CE10D11CD212B5ACE3E8BFD579E84B0134877BB18795FB889EEA55320866B4EF4DEF61247038EA269D1D4889EB903161C15473A85B0232820B87B132AE54D8B0C05CB20630267646EB908ABF7FBA29C9B2B3257B6A44750ACD93B7F1E5DCAE7478A524331657A0F248E9C0235461F10F67C6EB175453BC41AA54D1BBC9137893B2A8F5C8FBE0DF323865B1D4C3920EA2D845E0A59F78A4770F50C78644A8B9C62749A34466C9418BE176BD7CF404E475714B59047D0F7F433ECDDBD040592B9C225F740AC16C02641D64F4C15EF158302CB78038587E2EC3DCC1FDB04CE1193A1E2907DD87FFDB968BB728DE80BEC11E7666F3563BD2341D07A22686F2038B8992712672E824259E3235A86BA9878F41E8637C887B8AE952CE711DCB90EE572A745A642A591215E5464FF6B19D6ECD98452F163215B0D4B780485CE1EBB273EFC2F30B94379C489181BF5E65CC1A16BB715D075885D1EC3B6DC14EBC51E5A00D2A4763CC18635D391D3CD1DD5C7AC47CF3AB9112369434C3B68298FA38449F1DDB87A57CC265543C20C4D3062E10CE48B9700B99B2D81AF28A765D66F0ADDB87C17FDAA64440C974CE8B2F1198E5E388D36A5D2236A9AD6F03E24D6B187546B95E52A77C477B52EA2444C8EAA23FCFFD3A68017CAB9C9E6689341101410EE7F623F1A154B810889EB8A81C07D91AF98CD3B15B8BE728700F4AD66CCEE1004ADA781760682A2B38911D7FE9D2B5122537438151A813562CD60D70A6E70CEDE1893F6BEC13E33D71518F43E898FFEF2F10D11395A1CFC31E40CF66F998E1C0923214787F5D872FA7988370D0482E04694CB9206853B4E43CFA61E8816AD38BA2E5C8CF2C9E2238B0541D0F7F44BECDE3213EE49632367F7BD3878641F6A6515DECEE2FD31FFB058071742A8556C28C5E3CC5DCCEC575978100AA1D7B6F7D8EEDD094962C645A9A1FBC4061B314A0D8107F53F109C86DCC933A2DAF0396859321D5C9334C1E0859390374A1C8B81E0F680D7D83C6F3092C58F88E8B5668A75398F2CB82E30D0FB2017ADEF3E7913635BE6862E4626D4997A1A47CF3F324BF882B75D82A0F544D0DE407060E3C2489EBF15064FEA84640EF151AADF2AF46E590C092D0A826B512A635A78769B89EE0DF3217AF432E8B168014A278A8BEC96024165F6E50DB6AF1889D4099C90A4E15AEC3EB003D5B239224185D1587AEC0D769FB280B74E6C30DC7BE68E98522D8BC8898AA1DFF60FD836A31D12C58C8F72230F5A409BBEBDA3F0701E3CB41DD5F3C4433CA1DF5B4FDF41DF2A29E094AE1646F83DC2BEB396F0A2C98D652FB1DAAB159C5D62C2A3EF31ECF79B8F7C89232153AB15D8744A2C270AA18753D1A6E3D731BC4976E8626643C399E742A44D8640D0F7DC2BF15D5A86E219C51284BC5DB1609FFC8668F79C1204ADA781F60782C71F62DFD5ABE85943889383073ACE9C8E2289E2217FB3C5D828BC8596581F261BAE5C27B375EF4A148A1A0DE9CB0FC280418D91D839073A2EBB28D62A3E0EB1D7F13B08664E8ADCEDD662E79E9528983A2E52956F03CF140991CD826B04775E7E833983EA2181531414E9E083690B7C50BB4852E81C0BA3C70AE1E63F1F722FAA5C83B8FD7800DA158A85A8493DD16EDA0E788DEB8C542E5190A0C8102C57A6784232651FE41114209834052A0801F75D331E6913B92177CD56C81B3BBEC5D608FA0AA1DDBDDE0B99124543B4E2E3B049780495E923B13670B7005ACB780485E8890FC5CCDE15A0734A23BC144771E8EA5331D2963BE0C58E4901E7E68C860982D61341FB03C1824898B3357CFCCFA257CDEC70CE540555CA782059E22A16F4080A10CC9014F93B6DC2AE5D4B912F653CA4ABD8164593C6470E8BAC11FC36203AF14878810EA35EB6A4889BAA1EFA4D1B848CCE6EC20BB50FBE57C480DB0C8F9041E010FD76FBD1D368992F3AA2A52885F6337662F2E8F6481E350ADC8A8FC40AB12B3664DA1458961D17FF87350B46216B741DD2551F86718B36A053BDBC620A3F396A8FF5C7CECBCF2CE21594BB867D0F6C8067AC1848F5472F0C18D11A49A36446DB05E7B0E3C29390E72106F57B4FDFC4D46EA58436A547ED09C703B54989CE21B5496CDAB340BD6C13E0ECBF6F0BAAE589035DDA9698734068E259B129496C52D925D6E04BCD35271F82A0F534D00E415040DAF9B75831A91D52C4D52165B6DC489CA2347AAEBD8F03165CEFA68419387E0DBD6B244334B724489B329DD8C0311A4B8E8A752D215C8318B80EF19B475080604E3175B0F3CE7378F5AC0937C7E44898382672549F669135825BC582DB8362EAE0AFF2D911256E26E4FFA3228A94AE8242F97220866374FCD17F1BB69D151B2C42E4AD137522767E6DDB360B39C51AA284998BA358A90A285CB222B2A78E832849FE409F2D0FC5FA414B816072941DB407FB6FDEC2C0869E88172539E2274880121D2DB359C457AC75DC73EC101AE58D2B1695E741C78DB7211C13387CFC38268B9DE96B0E8969E210DA4BEEF6DB29C46ED522E10D110BBF93161F8625973FE3DCCD37D8BC7D27266D103B87CD58574910B49E08DA2508666D8A996273C516B13EB64082D4889724AE00A93F31D2526B0477068260DE36ABB0FBCE334CEA5A15891C8436B9C544AE3F6759648D60E04C82E807E79E635AB712708DE3843499B32079AEE698B8E785F0A085442F823C8981A199366F9A8AAC31A2C32D6B09784A6D2A5111D952C68273F252E8BFEDB10566921EC15F6CDA19D3B9B298D949821C852B0A0DAC8C22450A23918B0EE9EB4EC58AD3C2C319426F5DD06CC22E319B30A86E5A444B980069D3A447C67243B0E08898B60D91C67EB399A8935D2234D18A7943905CAC114D5E6634965FFD8273FFBCC2263F01D11BC5CE6133B4C9E0D4B01804EC3B7715FD1B48587643E5C9C77048E8ECC980CB9825765C2FDC73C7ACB5E50441EB69A05D82A0EFA967D877701D8A277554360D24F86310969C7D69E11DB062BD42C07D2CF4EA081791874E1757ACA9DB0BBF8B9659EBA180E02E518614B190B1C13C6CBDFA3FEC3B7A0875734650CA94BEFC64ACBCFE3284BB86C508EEC273ACF7198E7451C428B5E50AF85DFD8CC33781238736A2745AE1924FD40893F78AD1AC0C43A17194E72B63FB9DBD89518D45878E9A1E6D573CC071B189E7F08DF75839A585D8E11809B91A2FC5E64B62E4AD310F656A58EC3E5EBB721232BBC6C61F7DFCB0E7E63B6CDF2E16B0BBC9FA7142B1F6ABB1E9C6CB10E4F1DF34949F684F2B174F44C9DCB111397549D468D80E55ABD443DDD15BB1F69865A68A25706E3FFE0F26F7AA896409E32353F186A857BF11CAD5EB2236425D316BCA9E20683D11B42B10BC740B7DEBE4804BEADA98B4EF210E5F7F82F19DCB283B547591AB61E4010BED1ADEB1124592C642D6A68BE07BFD2DF61E92CB49643FD321739569582DFA99A5221AC818885B374C465A456775C8D97C01365E7A8D1D211D6CC92518529BCE5CC7B07A39A18B9E051DD63CC6891B529BDE61D9848670D04546BEE62BB1456893F6357C62602862BFFA6D5B819289C56EEE62FDB1E4DC571CBFF91927CE9FC3DF6513085D2C80EECB2F63E78590CF26C9388BBBC5E69365B37B2096623317B1C678077C2FBD0CF900F59B3EFB4A2FEAB1EB98D0BD3A120BD8CC5AB211EAD56B8872F5BBA1EFDA6B666993E1CD2232FC9780CB2DEBD1A46C06E812E641F93A6DF16795DAA8D26BBE880A22624C9AE17421085A4F03ED120495585367AF63FEAC45E83B6A16C6AC3C035FB180552BC8185A27E82BA6E7361F388609A366A2EFF8B5F0D9F38FF07C59629D875C23269E7338005ED31762EC8A5322A69FDCAEFF182B567F2BD3A263D8A404CD0EC91A19B9C1E13E566FDA86C1C36661BA8801B54D8404F09541AB4F5DC3DC794BD167F07231C57433F07D34E7755FECA2BD81D9B3E661D0C4F5587E44ECAA957116E5330F1CC5C891B33174E65E1172E76108C456EE1A7F80CDFB8E62DC9485F0DA7851944D4ED3DEC182C5B3443B988F296BCF61AB0503B8EE3A2FD60A6EDD8C5E0347E3AF1EC3F0D7D09558AAC4B70A89AD82D767600CAD7D676E63CEDC59E8DC6704DAF51C893EDE87C587C5BC45F20441EB89A0FD80A0E8CF6239C192E5AB3174862F561D961F52E115DCB51723C74A8DDA2AFA9E986D08D1128C406DDA7AE81CA64C5B8871AB4E0B6D12FD56E8C6F2950B443F9B8DB14B8E63B305FB990CA2BFEDC405CC9820FBF1224CDD7C594C415AAA8F496DBA865933E662F0E44D582136FA0569D3D6FD473062C46C0C9BBD0FEB43A84D7E429B36EE3E8891C3A761BCD0F3CD72FA56946BC7E95B58BE7A03FA0C9D8FE9BE97159D0F99A67F9B5217E15BB61C3C8949F2DB347635E689B8B096FA3629DF0125BE9F70B89CB985D9DE33D149D1A651E83BE7A8D9DA643C8EE06D6C0F78839DFB0E60C88871F8BBE730B4EB3B07337D6F08AFA479EB050982D6D3403B0541D95065BCBFD7F0979EB40011CAC51AA7642891EFC5B481C8C3FF8A880525632759321FB9C14294619F70C3CBE7CAF5103BC44605A54C62E380AF25F212CFF013B0B15F3C535988AB3C53E62542A45C907989C5C51618794B38DF29C0E9C065E12908F63CB9036CFF55B189478E84435A1E294EC28BB657780BFE2B8B68071744FD883CF60831B768FD28215EC43A1659FFF212611A94303866ECE6350DD781815B775F7CF33D9FFD1AD6A01204AD2782F6038262CD94687B3B025E62FFC567CA728EADC76E2B1FECFD5764FB0CF926B6EFED55061316FD6CAF1C907CEBB73BC4075BF683BD426F43DC977F1E74CAFC2ECB7E26FAB6582766D97E2CB44968DD01D97FA5CDBE7BBDBE6993EC6F96D226510FF27BF4FDD42BB1E677C7B9974AB92CFAFD504E49115AA87C9B5E0586730969197E71047C0B2A1D426D32A981DFA0F3806CC3DFCAA36C6034B33C0441EB69A0C541503E30864B34E4F2F084F86EE3E0F57738286247F1A20DD806B4B701318382657EA795A9B57EFDFA594411366EDCA83CCFC7C7C722CF0BAB0FB13408AE5EBD5AB1EB9859AB20C2B551FBA8FF6C031668036215146A37EBA0F4AD870F055C58E0A74489127016312DDFBE7D6B81A785EC11BA90DD1EF2BBDDDDDD91306142930F5AB76E1DE6CF9F8F79F3E619BC66CE9C09272707244D9116BD474C47978113D065C0785EB401DB4008DA40CF6153D1E4AF9E8A08962953C6681F94FD53F6D3808000A37D9A2018681EB52078F7EE5DC5AEA634B079F3E64A3D55A9D31CBD47CE60BB0F41BBE7B783DFCEA036D077F42CE1602AA6F4AD11234618D540D947172F5E8C77EFDE19D540826030F3A805C1C489132B95C08B36601BB0FF363064C81082A0C9E1AD7A10DCB06103B58FFACF361086DAC0FDFBF709822A34D0ACA9E1142952405E5BB66C317A6DDDBA155B4DA431F50CFEDDB88D699FF0691FD9B74CD5FDF8F1E303A726C78C2108AA1041B51E41697769D78E1D3B9AAC0335F564AA1EF9F7F0D9C759EFA6F9C2948D3C3D3D112952249353C8F4086AF408E6C8914385B432092D400BD8CA02E7CE9D23089A617C734170E9D2A5663C9D4969015A20B42DD0A44913556B0909821A4030499224C89A356B68D729F3A3056801332C70F0E04182A019F6321704E7CC9963C6D3999416A00542DB02F5EAD523089A6B74B56B040982E65A96E96981D0B70041D03C9B1304CDB31753D302F66E0182A0861A22086A301A6FA105ECD4020441F32A8620689EBD989A16B0770B100435D410415083D1780B2D60A71620089A57310441F3ECC5D4B480BD5B8020A8A18608821A8CC65B68013BB50041D0BC8A21089A672FA6A605ECDD0204410D354410D46034DE420BD8A9050882E6550C41D03C7B31352D60EF1620086AA82182A006A3F1165AC04E2D401034AF620882E6D98BA969017BB7004150430D110435188DB7D002766A0182A07915431034CF5E4C4D0BD8BB0508821A6A8820A8C168BC8516B0530B1004CDAB1882A079F6626A5AC0DE2D4010D4504304410D46E32DB4809D5A8020685EC51004CDB31753D302F66E0182A0861A22086A301A6FA105ECD4020441F32A8620689EBD989A16B0770B100435D410415083D1780B2D60A71620089A57310441F3ECC5D4B480BD5B8020A8A18608821A8CC65B68013BB50041D0BC8A21089A672FA6A605ECDD0204410D354410D46034DE420BD8A9050882E6550C41D03C7B31352D60EF1620086AA82182A006A3F1165AC04E2D401034AF620882E6D98BA969017BB7004150430D110435188DB7D002766A0182A07915431034CF5E4C4D0BD8BB0508821A6A8820A8C16861FA969B58D6BB1B3A75EAA4F71A307F075E86A07C5FAE6D458F2EFA9F2DF31CBC681FDE84E0F9BCD5B8050882E6B51082A079F6FA7D52BFC7FE69230DEA60E7517310F03A04A57D730E9386F630F8FCAE637D70F96D089ECF5B0D5A8020A8A171842F10FC84B32BC7A276E9D2286DB5AB1AC6AE0FC0BF3FD4C5BFF09FD91955439867EDCEA370FA85864AFEFA0EC7160E432D917F896259105DA783CED0E59410798B9546CD46D370E98BCABCBE3CC4E6F19D149B16CE14D7F0B3659ECE8991FF8FD2A8D668080E3E519B81B1F7F88C538B7B18ADCF9EF30EE27F2A8B12D6931104CDABC1F00A824F02D6A07D08F5C89486B61FBD0E0F7FA88EAFB8B96B3A9A970D99FE96FBB319D65FFE6A5E452BA9BFE0DEF1A568A794BB00924430A2833A07A4CB574AA4EB01DF9B6A89F003CE6F9A801AF2F9F9D31AD7419D133278C8F76881A5A79E4055695EDD8077372DB62B8BD67DD6E0C1E7CFF8FCD9129AABC1F4A1780B415083B1C315087EB88E31F53298E8A0C6C441DDDF3C3A2FC393E03DFBFE7654CF1E35E4F9C6CE8771FECFCDA8E5CFB87F720DDA154D8978CE11CCCC3F09BA6CBA6332AF874797A16581A48811599D6DFE03D0088893BC303ACC3C844F2673319CE0D33F2B513E5124E3658B521A4BAFBC0A412E61E75682A07975153E41F01DF68DAF6AA61E98DBBF758853B42D8E04EF76FFDEC0F846592C906F74549B1D605645BF7D7206E31AE4459278D1CCCEBFF8F0ED3F0DEC7FCDFADF472731F24F77248C11D9ECE7478B9F06E53A2FC6A31FBD073F65F209E717B48193B141BCD1BFB92069AA544895CA037D16F9E3C1ABCF66D92F2C2526086AA8AD7005824F8EA04BE93866775483DE33031D2F6DA329B8F92E5865DC5A8B525962863C5FD73C18B0F9B6CA5AFE1797D60D426E57476DF9467245C971878CE4F5458CEE27A3544C8DCF0FB25DD4ECF86BF129FCAB69A0FA2F8E8EAA8168114D7FA4AA4C3BA1D26E613B1941D0BCFA0B9720F8E5059675CEA54D17CC0091A879EB61CB3FC1EAE3C3450CA99D31E4F9468A835223F70AFF9EBA9FA71797A1568EC49AF38DDB680EDE18C9ECE5755FFC9533B9E6E7077E5FE2A1648F157814FCBBF143F1DE634BBF4221CCE39B4E4670448A925DE017704FB50DD559DA3E52110435D443B802C1C787D1A594AB653A9311414C557F22FE09BEFEE3F60694CB6E817CA3BBA3CFBAEBAA6AF9B6EF68E47375D05ED688B1F1C7587F8379BDB9360F95E347D1FEFCE0F64B5A196B2F6898BC7D73104DB3C657F50E313D47E3B6AAF91755E6B5DB440441F3AA267C82E0732CE9985355BF3177101C3C7D94DC75B129B85C7DB88CE1F52CE0118C2806A983B6AB9A497873732B1A674B10A2B2C66E381BAF0D80E0976727D0EF8F64217AFE779B454D8B1E2BAE18289700C1FE452D93CF37ED8D9EAC3CE61DFB71F2DEBCDE639FA909821AEA255C81A058C0DBBF5A48476EA6BD4F39DBCDC3FDE0F39D9602C1781E18BEFB89C95A7E7A66196A2737E28114DEBEB27F8FC38C19337EBA86A05AF684DFC42626EACEBD6020AF0798D72C27221B82E11849D07850F0674F45CF7A1E703008CF8EA836D95F95B0077FA1A77E7D90214E4455E2E8102D17BC2F856412DAA4D9ED220141D0BC6A089720F8F50DB60E2CAEAADF84040463176E86BD8F827B042D0482BA3828E775DC64457F7C7A06C3CAA536AC53428F3255EFA1470727A36355F7EFF6C9D87125DEE91D448AB5D7335B22A183E16F4289B6637F78FE845EB5E066C48990A9D124FCF35E5FD1DE63EB806216AFB354D546E0CA6FB67B8F2068B26BFC9A205C81A0D8AFBA6D787D24891A15510D5ECE707230B4E62C02223B4681B3D1FBD3A3EBA2533F428D01108C18D911CECEC6DEE5C7BF2529580F9B6E7D345ECB9FEF61769BBC88A0576C22205EA5DED876E8349E1AF08EBDFA2700FBF7EFC7FE834771EBB9FEBCBE5E5F814A19F57B03A325A88A9987CEE3172D7B7B176B4634423A27FD6B15E3961A81AB1FCC69C0AFB1BA4371C434BAE03B9840477246E9B147CDC9204CA625089A576DE11204C584E03FDB4720A7511D8B0A672707033AA24324A95D46EF8F8B327F2FC2E3E09E34031EC1089122C3C90C1D74499C1923F79AA2974F383DA709A21980AEC8D9FFC4B435FB71DDD0D2E197377148EAA0B82EDC7DA57F33C7EB8B1856C3806321620E7499B7058F7E598AF71AC7568C444937FD03D88829FFC49ACBFACA66180423A72A84418B02DFF5E76BFADFF911378A9135D451DD31626BF0F97BF3FA8F3DA626086AA895F00582C0E777AFF1E8DE3DDC33785DC1D2DE950C08487C349FBA0BB78DDEFF146F7F5EF0660004B3349B8280DBC6DEE5C7BF3D7AF60AC697F87EC5A323B3502C9E1ED88A1805399A4FC2E967219F1F7DE8370879E2E81B0547432B835E44D9382F6168F92C7A3F2E8EB16B61E343A3ABA57F6CDD4FF7A179E144BF8C902366C8819C096321CA2F1F00B139256773EC7BA1A19384A15B0882E65556F80441E0EBE7F7786E54C7EEE1C4F21E48AD17A422A3708B293863F4FE8778F1E6A781A401108C55B805369C51AF83F71F3DC607130B04BF3E3D8276B9F56DD08B0857E1A95C7DDEE0623CD50DE8E33F3BD03CA73E1D744091F60B6078EE4640DDA02A06A23764C730BF1B7AC0D330083AE4A8818D86F6F57D7A81EBC7E6A14A6C2703DEC4E8A837710F426E0DD566B37A4282A00613873710346DA28FD833B6AE814EEA862E2BAF987EC4CF290C8060AECECB2D1BD6E4CB4BACEA915B6F878F91BB39B6DF55BBBCDA5811BFE0D88C9648A5778346692CBE666CA4FE0EEB3A95414C3D1F17871825B1F09A7A39BAB76D18F2C6FE59842320CFDFF3B1725865B838EA11E818E9D17BD303F3EB2F0CDD411034AFB2C22B08AAB1D2937D2391C1000896EABA1C66EFC3370082714A75C5F190042FD55398EB4B1A218A9ED90287387931649FE9E5356AECF3F8D86C9472D5078269D075C939A38FB8B8B2373246D2776F0AF4587D51CF260E232098B532965F3496DD47EC9D50DB60D8308F8E0B45681935250E1B6908821AEA8920F8B3D15EC36FE49F063A4D2274101DDCEC95660640D0BDFD223C35FB61862BF9E39343689B568FB8382540BDF1FB7F9DAED5D05E20C68E5BFBD5441CBD1F888A5876DD78CCAD43136A21B19E7BA344AF8BCD06A6A27F7DCD5758D3AFC2AF751429357AADBE8277779620B7DEE9906828D67EA9F91F304D76B2CD4D0441F3EC4E10346CAFBB3B8622BD01102CD17111822FFF536575032018BB44471CB4E89E85A7985139999E990747646E30FDA7D886AADE5C6FA21BDB8721875EFBA4478FA5C6C3DBDCDF331E85A3EB03C19C18B9F3A69EFC420282C0FD03535024AAFEB58C29EA4DC08DDF28B8354150439B2608FE3E2078CFAF1F12EA11A6E819CA62C9554B0DF93EE3C8D4E648A1776D5E22F4F7BD67A4153EC1FC5685E1ACE71DA3151D842BEFD4792CDF8A9D804DB3C7F8C5F3E994B92E36DE94647D07238AEA8F17163B7F33EC7CACA1A384915B0882E6551441F03704C1DBCBE099E8D7FE1F216A4274D9624E1C56E36DE9D191992811431F5CB9A0EAF0AD30CC569F70624E3B24D6177B357975ACD47BA449C840F0F9491F5488AF1F04F3B6F7A147D03CD9B0786A9DC59F68E6030982BF0B087EC4DACEFA627439227BE571B8A58EB154B59E077E03914BEF94880EC92B8FC5650333BCAF4E4E47E914FAD6AA4444B5A9C74CAC7F0C7AB5CF38B7A4831EAF6244E4693615B795727EC2A12995F52F748F9E038337A98DC5A8CA1C76958820685E7510047F3F10BC34B72E1244F9157A6224AB8FDDA6F69898D17C3EDEDC8E6639F4C355944C0DB1D6D0765C1172A65BF15F07B23A5D046416EBC66FEA5D2A1D3210BCE93B14EE7A83FE47136B04F71A8156330C622749E911D4501104C1DF0404BF5CC7B0627A8E778B101BA5FA6FB768E0D0AF8F0FA05991840676144643CE061370E1D14F0BC59F1F41AFEA99F4DE13297D43F8DDD61B33E1D716FDF101BC9BA7FF751DA4636AFCED73FE7BFAE7A7E7C153CFC740278E762AD269311E5A704A5E43B7B3DA2D0441F34C4B10FCDD40F08358875C0431F4CC3A24AA3809C6E62BCC6B3972BC790F73DA1B0A8B1511B1F3B7C5A6B33F7920C5719CCBFB55D41FD2265A0E0CDF7ECBC06B8400043FDFC2B8DA191051DFDAEC846531EFF8EF3545421034BB25030441DB81609E1E1B34D498FE5BBEBEF44303373DA34CC744A83CED54B09B1E61CFAAE558B66CD94FD76A1C0878A1FA7D026635442C83F1B0222143D176F0DE1D008983EF2EAF41CF9AD9F4EF5A734E80D6DE47556F9A797F73136A27FD75141E2D5355ACFA27D88E6819DAA1B28120DEC96A60D5790BBA06545BCDFA090982E6D99820687B108C53AE172E586A602606C463CA65D50B5A6EAD17071B107F42C0CE8D7A74701936EDB8A6BA113D393C1, @IDArticulo OUTPUT;

SELECT @IDArticulo AS 'ID del Artículo';
SELECT * FROM TbArticulos;
DELETE FROM TbArticulos WHERE IDArticulo = 19;
-- Eliminar registros de TbCantidadArticulo que hacen referencia al registro en TbArticulos
DELETE FROM TbCantidadArticulo WHERE IDArticulo = 19;

-- Luego, eliminar el registro en TbArticulos
DELETE FROM TbArticulos WHERE IDArticulo = 19;

---EliminarArticulo---
---Descripción: Es nada más un DELETE FROM TbArticulos WHERE IDArticulos = ?;


---DocumentosDeapoyo---
----Descripción: SELECT	IDArticulo, Titulo, Descripcion, Imagen FROM TbArticulos;


---CrearCitas---
---Descripción: INSERT INTO TbCitas(Hora, Fecha, IDPaciente, IDTerapeuta) Values (?, ?, ?, ?);
---Información adicional: Primero debe cargarse el nombre de los terapeutas en un combobox, por medio de un select TOP 1 IDTerapeuta FROM TbTerapeutas Where Nombre = ? and IDClinica = ? 

---PruebasDP---
---Descripción: Lo haré el domingo lol
---Información adicional:


---SolicitudesDeEmpleado---
---Descripción: Primero se debe llenar una tabla por medio de un SELECT primeros50, Asunto FROM VistaTbPermisos WHERE IDClinica = ?;
---Información adicional: Se seleccionarán todas los registros sin importar si estan en 0 en aceptados

CREATE VIEW VistaTbPermisos
AS
SELECT
    CASE 
        WHEN LEN(Contenido) > 40 THEN LEFT(Contenido, 37) + '...'
        ELSE Contenido
    END AS primeros50,
    Asunto,
    IDClinica,
    aceptado
FROM TbPermisos;


---SolicitudesDeEmpleado---
---Descripción: Primero se debe llenar una tabla por medio de un SELECT primeros50, Asunto FROM VistaTbPermisos WHERE IDClinica = ? AND aceptado = 1;

---Información adicional: 


---RedactarMensaje(Permiso)---
---Descripción: Se hace un EXEC PDPermiso ?,?,?
---Información adicional: 

/*
.
*/
CREATE PROCEDURE PDPermiso
	@Asunto VARCHAR(100),
	@Contenido VARCHAR(900),
	@IDUsuario INT
AS
BEGIN
	DECLARE @SecretExist INT;
	DECLARE @TerapeExist INT;
	DECLARE @IDSecretaria INT;
	DECLARE @IDTerapeuta INT;
	DECLARE @IDPermisoT INT;
	DECLARE @IDPermisoS INT;
	DECLARE @IDClinica VARCHAR(5);

	SET @SecretExist = (SELECT TOP 1 IDUsuario FROM TbSecretaria WHERE IDUsuario = @IDUsuario);
	SET @TerapeExist = (SELECT TOP 1 IDUsuario FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
	SET @IDTerapeuta = (SELECT TOP 1 IDTerapeuta FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
	SET @IDSecretaria = (SELECT TOP 1 IDSecretaria FROM TbSecretaria WHERE IDUsuario = @IDUsuario); 
	SET @IDPermisoT = (SELECT TOP 1 IDPermiso FROM TbPermisos WHERE IDTerpeuta = @IDTerapeuta);
	SET @IDPermisoS = (SELECT TOP 1 IDPermiso FROM TbPermisos WHERE IDSecretaria = @IDSecretaria);

	IF (@SecretExist IS NOT NULL)
	BEGIN
		SET @IDClinica = (SELECT IDClinica FROM TbSecretaria WHERE IDUsuario = @SecretExist);
		
		IF (@IDPermisoS IS NULL)
		BEGIN
			-- Insertar un nuevo permiso si no existe uno
			INSERT INTO TbPermisos(Asunto, Contenido, aceptado, IDClinica, IDSecretaria) 
			VALUES (@Asunto, @Contenido, 0, @IDClinica, @IDSecretaria);
		END
		ELSE
		BEGIN
			-- Actualizar el permiso existente
			UPDATE TbPermisos
			SET Asunto = @Asunto,
				Contenido = @Contenido
			WHERE IDPermiso = @IDPermisoS;
		END
	END
	ELSE IF (@TerapeExist IS NOT NULL)
	BEGIN
		SET @IDClinica = (SELECT IDClinica FROM TbTerapeutas WHERE IDUsuario = @TerapeExist);
		
		IF (@IDPermisoT IS NULL)
		BEGIN
			-- Insertar un nuevo permiso si no existe uno
			INSERT INTO TbPermisos(Asunto, Contenido, aceptado, IDClinica, IDTerpeuta) 
			VALUES (@Asunto, @Contenido, 0, @IDClinica, @IDTerapeuta);
		END
		ELSE
		BEGIN
			-- Actualizar el permiso existente
			UPDATE TbPermisos
			SET Asunto = @Asunto,
				Contenido = @Contenido
			WHERE IDPermiso = @IDPermisoT;
		END
	END
END;

---SolicitudesAprobadas2--- ---VerSolicitudAprobada
---Descripción: El botón de rechazar solicitud Solo actualizará el campo aceptado a "2" en base a un IDUsuario y el de aceptar se actualizará a 1
---Información adicional: Este proceso es usado en 2 ventanas diferentes, cuando ve el mensaje desde recibidos y cuando ve el mensaje desde aceptados

CREATE PROCEDURE ActualizarAceptado
	@IDUsuario INT,
	@case INT
AS
BEGIN
	DECLARE @IDSecretaria INT;
	DECLARE @IDTerapeuta INT;
	DECLARE @IDPermisoT INT;
	DECLARE @IDPermisoS INT;

	SET @IDTerapeuta = (SELECT TOP 1 IDTerapeuta FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
	SET @IDSecretaria = (SELECT TOP 1 IDSecretaria FROM TbSecretaria WHERE IDUsuario = @IDUsuario); 
	SET @IDPermisoT = (SELECT TOP 1 IDPermiso FROM TbPermisos WHERE IDTerpeuta = @IDTerapeuta);
	SET @IDPermisoS = (SELECT TOP 1 IDPermiso FROM TbPermisos WHERE IDSecretaria = @IDSecretaria);
	IF (@IDPermisoS IS not null)
	BEGIN
		-- Actualizar permisos de secretaria
		UPDATE TbPermisos
		SET aceptado = CASE 
			WHEN @case = 1 THEN 1
			WHEN @case = 2 THEN 2
			ELSE aceptado -- Mantener el valor actual si @case no es 1 ni 2
		END
		WHERE IDPermiso = @IDPermisoS;
	END
	-- Verificar si el usuario es un terapeuta
	ELSE IF (@IDPermisoT IS NOT NULL)
	BEGIN
		-- Actualizar permisos de terapeuta
		UPDATE TbPermisos
		SET aceptado = CASE 
			WHEN @case = 1 THEN 1
			WHEN @case = 2 THEN 2
			ELSE aceptado -- Mantener el valor actual si @case no es 1 ni 2
		END
		WHERE IDPermiso = @IDPermisoT;
	END
END;

---BuscadorEmpleado---
---Descripción: esta vista busca en tres tablas para mostrar el ID y el nombre, debido a que ActividadLaboral es de otra tabla hace la union tambien
---Información adicional: esta es la consulta para hacaer uso de la vista:  SELECT ID, Nombre, DUI, NombreDeActividad, IDUsuarioEm, Edad, FotoPerfil  FROM VistaEmpleadosConActividad WHERE Nombre LIKE '%Peña%';
SELECT * FROM TbTerapeutas;
SELECT * FROM TbUsuarios;
ALTER VIEW VistaEmpleadosConActividad AS
SELECT
    S.IDSecretaria AS ID,
    S.Nombre AS Nombre,
    S.DUI AS DUI,
    A.NombreDeActividad AS NombreDeActividad,
    S.IDUsuario AS IDUsuarioEm,
    DATEDIFF(YEAR, S.FNacimiento, GETDATE()) AS Edad,
    U.FotoPerfil AS FotoPerfil 
FROM
    TbSecretaria S
INNER JOIN
    TbActividadesLaborales A
ON
    S.IDActividadLaboral = A.IDActividadLaboral
INNER JOIN
    TbUsuarios U  -- Unirse a la tabla TbUsuarios para obtener la FotoPerfil
ON
    S.IDUsuario = U.IDUsuario
UNION ALL
SELECT
    T.IDTerapeuta AS ID,
    T.Nombre AS Nombre,
    T.DUI AS DUI,
    A.NombreDeActividad AS NombreDeActividad,
    T.IDUsuario AS IDUsuarioEm,
    DATEDIFF(YEAR, T.FNacimiento, GETDATE()) AS Edad,
    U.FotoPerfil AS FotoPerfil  
FROM
    TbTerapeutas T
INNER JOIN
    TbActividadesLaborales A
ON
    T.IDActividadLaboral = A.IDActividadLaboral
INNER JOIN
    TbUsuarios U  -- Unirse a la tabla TbUsuarios para obtener la FotoPerfil
ON
    T.IDUsuario = U.IDUsuario;






CREATE VIEW VistaTerapeutasEdad AS
SELECT
    IDTerapeuta,
    DATEDIFF(YEAR, FNacimiento, GETDATE()) AS Edad
FROM
    TbTerapeutas;

CREATE VIEW VistaSecreatariaEdad AS
SELECT
    IDSecretaria,
    DATEDIFF(YEAR, FNacimiento, GETDATE()) AS Edad
FROM
    TbSecretaria;

CREATE VIEW VistaPacienteEdad AS
SELECT
    IDPaciente,
    DATEDIFF(YEAR, FNacimiento, GETDATE()) AS Edad
FROM
    TbPacientes;

	-- Eliminar el trigger TriggerInsertarFechaEnContenidoAgenda
DROP TRIGGER TriggerInsertarFechaEnContenidoAgenda
ON TbAgendasPersonales;

-- Eliminar el trigger TriggerActualizarFechaAlFinalAgenda
DROP TRIGGER TriggerActualizarFechaAlFinalAgenda
ON TbAgendasPersonales;

CREATE VIEW VistaClinicaUsuario AS
	SELECT IDUsuario, IDClinica FROM TbTerapeutas
	UNION ALL
	SELECT IDUsuario, IDClinica FROM TbSecretaria
	UNION ALL
	SELECT IDUsuario, IDClinica FROM TbAdministrador;
--Para realizar la query es así: SELECT IDClinica FROM VistaClinicaUsuario WHERE IDUsuario = 18;


CREATE PROCEDURE InsertarActualizarExpediente
    @IDPaciente int,
    @Contenido varchar(max),
    @IDTerapeuta int
AS
BEGIN
    -- Verificar si existe un expediente para el IDPaciente dado
    IF EXISTS (SELECT 1 FROM TbExpedientes WHERE IDPaciente = @IDPaciente)
    BEGIN
        -- Si existe, realizar una actualización (UPDATE) para el primer registro encontrado (TOP 1)
        UPDATE TOP (1) TbExpedientes
        SET Contenido = @Contenido,
            IDTerapeuta = @IDTerapeuta
        WHERE IDPaciente = @IDPaciente;
    END
    ELSE
    BEGIN
        -- Si no existe, realizar una inserción (INSERT)
        INSERT INTO TbExpedientes (Contenido, IDPaciente, IDTerapeuta)
        VALUES (@Contenido, @IDPaciente, @IDTerapeuta);
    END
END;

CREATE PROCEDURE PDInsertarOActualizarNotas
	@IDPaciente int,
	@Contenido VARCHAR(MAX)
AS
BEGIN
    -- Verificar si existe una agenda para el IDPaciente dado
    IF EXISTS (SELECT 1 FROM TbAgendasPersonales WHERE IDPaciente = @IDPaciente)
    BEGIN
        -- Si existe, realizar una actualización (UPDATE) para el primer registro encontrado (TOP 1)
        UPDATE TOP (1) TbAgendasPersonales
        SET Contenido = @Contenido
        WHERE IDPaciente = @IDPaciente;
    END
    ELSE
    BEGIN
        -- Si no existe, realizar una inserción (INSERT)
        INSERT INTO TbAgendasPersonales(Contenido, IDPaciente)
        VALUES (@Contenido, @IDPaciente);
    END
END;



CREATE PROCEDURE PDEliminarSinCascade
	@IDUsuario INT
AS
BEGIN
	DECLARE @IDTerapeuta int;
	DECLARE @IDSecretaria int;
	SET @IDTerapeuta = (SELECT TOP 1 IDTerapeuta FROM TbTerapeutas WHERE IDUsuario = @IDUsuario);
	SET @IDSecretaria = (SELECT TOP 1 IDSecretaria FROM TbSecretaria WHERE IDUsuario = @IDUsuario);

	IF(@IDTerapeuta IS NOT NULL)
	BEGIN
		UPDATE TbArticulos SET IDTerapeuta = null where IDTerapeuta = @IDTerapeuta;
		UPDATE TbPruebas SET IDTerapeuta = NULL where IDTerapeuta = @IDTerapeuta;
		UPDATE TbExpedientes SET IDTerapeuta = null WHERE IDTerapeuta = @IDTerapeuta;
		DELETE FROM TbTerapeutas WHERE IDTerapeuta = @IDTerapeuta; 

	END
		
	ELSE
	BEGIN
		UPDATE TbPruebas SET IDSecretaria = null where IDSecretaria = @IDSecretaria;
		UPDATE TbCitas SET IDSecretaria = null WHERE IDSecretaria = @IDSecretaria
		DELETE FROM TbSecretaria WHERE IDSecretaria = @IDSecretaria;
	END
END;



 ---AgrgarPerfilDeEmpleado---
 ---Descripción: Este procedimiento almacenado crea un usuario e interactúa con 3 tablas TbContactos, TbUsuario y TbTerpaeuta/TbSecretaria, se ejecuta con este exec:
 ---EXEC PDCrearEmpleado 27, 'whats@gmail.com', 'whats', 'Contraseña', 2, 'Doris';
 CREATE PROCEDURE PDCrearEmpleado
	@IDAdministrador INT,
	@Correo varchar(400),
	@Username VARCHAR(100),
	@Contraseña VARCHAR(100),
	@TipoDeEm INT,
	@Nombre VARCHAR(200),
	@imagen VARBINARY(MAX)
 AS
 BEGIN
		DECLARE @HashContraseñaTbU VARBINARY(64);
		DECLARE @newHash VARBINARY(64);
		DECLARE @IDClinica VARCHAR(5);
		DECLARE @IDUsuario INT;
		SET @IDClinica = (SELECT IDClinica FROM TbAdministrador WHERE IDAdministrador = @IDAdministrador);
        SET @HashContraseñaTbU = HASHBYTES('SHA2_256', @Contraseña);
		SET @newHash = HASHBYTES('SHA2_256', @HashContraseñaTbU);

		IF(@Correo is not null)
		BEGIN
		INSERT INTO TbContactos(Correo) VALUES (@Correo);
		DECLARE @IDContacto INT; 
		set @IDContacto = (SELECT IDContacto FROM TbContactos WHERE Correo = @Correo);
			IF (@Username IS NOT NULL AND @Contraseña IS NOT NULL)
			BEGIN
				INSERT INTO TbUsuarios(UserName, Contraseña, IDContacto, Primeruso, FotoPerfil)
				VALUES (@Username, @newHash, @IDContacto, 0, @imagen);
				SET @IDUsuario = (select IDUsuario FROM TbUsuarios WHERE UserName = @Username);
					IF(@TipoDeEm = 1 AND @TipoDeEm IS NOT NULL)
					BEGIN
						INSERT INTO TbTerapeutas(Nombre, IDUsuario, IDClinica) VALUES (@Nombre, @IDUsuario, @IDClinica);
					END
					ELSE IF(@TipoDeEm = 2)
					BEGIN 
						INSERT INTO TbSecretaria(Nombre, IDUsuario, IDClinica) VALUES (@Nombre, @IDUsuario, @IDClinica);
					END
			END
		END

		ELSE
		BEGIN
			IF (@Username IS NOT NULL AND @Contraseña IS NOT NULL)
			BEGIN
				INSERT INTO TbUsuarios(UserName, Contraseña, Primeruso, FotoPerfil)
				VALUES (@Username, @newHash, 0, @imagen);
				SET @IDUsuario = (select IDUsuario FROM TbUsuarios WHERE UserName = @Username);
				IF(@TipoDeEm = 1 AND @TipoDeEm IS NOT NULL)
					BEGIN
						INSERT INTO TbTerapeutas(Nombre, IDUsuario, IDClinica) VALUES (@Nombre, @IDUsuario, @IDClinica);
					END
					ELSE IF(@TipoDeEm = 2)
					BEGIN 
						INSERT INTO TbSecretaria(Nombre, IDUsuario, IDClinica) VALUES (@Nombre, @IDUsuario, @IDClinica);
					END
			END
		END

 END;

CREATE PROCEDURE ObtenerIDTerapeuta
    @UserName varchar(50),
    @IDTerapeuta int OUTPUT
AS
BEGIN
    SET NOCOUNT ON;

    SELECT @IDTerapeuta = TT.IDTerapeuta
    FROM TbUsuarios TU
    INNER JOIN TbTerapeutas TT ON TU.IDUsuario = TT.IDUsuario
    WHERE TU.UserName = @UserName;
END;

DECLARE @IDTerapeutaResultado int;


CREATE PROCEDURE ObtenerIDAdministrador
    @UserName varchar(50),
    @IDAdmin int OUTPUT
AS
BEGIN
    SET NOCOUNT ON;

    SELECT @IDAdmin = TT.IDAdministrador
    FROM TbUsuarios TU
    INNER JOIN TbAdministrador TT ON TU.IDUsuario = TT.IDUsuario
    WHERE TU.UserName = @UserName;
END;

CREATE PROCEDURE ObtenerIDSecretaria
    @UserName varchar(50),
    @IDTerapeuta int OUTPUT
AS
BEGIN
    SET NOCOUNT ON;

    SELECT @IDTerapeuta = TT.IDSecretaria
    FROM TbUsuarios TU
    INNER JOIN TbSecretaria TT ON TU.IDUsuario = TT.IDUsuario
    WHERE TU.UserName = @UserName;
END;

create table TbCantidadArticulo(
IDCantArticulo int identity (1,1) primary key,
cantArticulo int,
IDTerapeuta INT,
IDArticulo int
);

create table TbContPermisos(
IDContPermiso int identity (1,1) primary key,
nombre varchar(50),
contAceptado int,
IDPermiso int
);	
