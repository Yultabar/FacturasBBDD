--sqlite3 db_Facturacion.sqlt < COSA.sql

--posibilidad de añadir atributo "pais" para ver si el iva y retencion de factura sera 0
CREATE TABLE TClientes (
Id		INTEGER			PRIMARY KEY AUTOINCREMENT,
Alias		VARCHAR(20)		NOT NULL UNIQUE,
CIF		VARCHAR(9)		NOT NULL,
Direccion1	VARCHAR(20)		NOT NULL,
Direccion2	VARCHAR(20)		NOT NULL,
Zona     	VARCHAR(20)		NOT NULL,   
Pais		VARCHAR(20),      
Telefono1	VARCHAR(12),
Telefono2	VARCHAR(12),
Contacto	VARCHAR(20),
Inhabilitado	BOOLEAN			DEFAULT 0
);

CREATE TABLE TMatriculas (
Matricula	VARCHAR(10)		PRIMARY KEY
);

--CREATE TABLE TPortes (
--Id		INTEGER			PRIMARY KEY AUTOINCREMENT,
--Fecha		DATE			NOT NULL,
--Origen		VARCHAR(20)		NOT NULL,
--Destino		VARCHAR(50)		NOT NULL,
--Precio		DECIMAL(7,2)		NOT NULL,
--Matricula	VARCHAR(10)		NOT NULL,
--IdCliente	INTEGER			NOT NULL,
--FOREIGN KEY(IdCliente) REFERENCES TClientes(Id)
--);

CREATE TABLE TFacturas (
Id		INTEGER			PRIMARY KEY AUTOINCREMENT,
Fecha		DATE			NOT NULL,
TipoIva		DECIMAL(3,2)		NOT NULL,
TipoRetencion	DECIMAL(3,2)		NOT NULL,
FechaPorte	DATE			NOT NULL,
Origen		VARCHAR(20)		NOT NULL,
Destino		VARCHAR(50)		NOT NULL,
Precio		DECIMAL(7,2)		NOT NULL,
Matricula	VARCHAR(10)		NOT NULL,
IdCliente	INTEGER			NOT NULL,
FOREIGN KEY(IdCliente) REFERENCES TClientes(Id)

);




