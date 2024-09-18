CREATE TABLE producto ( codigoproducto int NOT NULL,nombre varchar(100) NOT NULL,precio decimal(18,2) NOT NULL,PRIMARY KEY (codigoproducto)) ;

CREATE TABLE venta ( codigoventa int NOT NULL,cliente varchar(100) NOT NULL,fecha datetime NOT NULL,PRIMARY KEY (codigoventa));

CREATE TABLE detalleventa ( codigoventa int NOT NULL,codigoproducto int NOT NULL,cantidad decimal(18,2) NOT NULL,descuento decimal(18,2) NOT NULL,PRIMARY KEY (codigoventa,codigoproducto), KEY FK_DetalleVenta_Producto_idx (codigoproducto),CONSTRAINT FK_DetalleVenta_Producto FOREIGN KEY (codigoproducto) REFERENCES producto (codigoproducto) ON DELETE NO ACTION ON UPDATE NO ACTION,CONSTRAINT FK_DetalleVenta_Venta FOREIGN KEY (codigoventa) REFERENCES venta (codigoventa) ON DELETE NO ACTION ON UPDATE NO ACTION );

CREATE TABLE demotest.persona (
	codigoPersona INT auto_increment NOT NULL,
	nombres varchar(100) NULL,
	apellidos varchar(100) NULL,
	ciudad varchar(100) NULL,
	direccion varchar(100) NULL,
	email varchar(100) NULL,
	dni varchar(100) NULL,
	CONSTRAINT persona_PK PRIMARY KEY (codigoPersona)
)