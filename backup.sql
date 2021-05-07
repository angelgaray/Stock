-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.43-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema stockfinal
--

CREATE DATABASE IF NOT EXISTS stockfinal;
USE stockfinal;

--
-- Definition of table `categoriaproductos`
--

DROP TABLE IF EXISTS `categoriaproductos`;
CREATE TABLE `categoriaproductos` (
  `idcategoria` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=2030 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categoriaproductos`
--

/*!40000 ALTER TABLE `categoriaproductos` DISABLE KEYS */;
INSERT INTO `categoriaproductos` (`idcategoria`,`descripcion`) VALUES 
 (1,'ELECTRICIDAD'),
 (12,'plomeria'),
 (2023,'Higiene y Seguridad'),
 (2029,'HERRAMIENTAS mecon');
/*!40000 ALTER TABLE `categoriaproductos` ENABLE KEYS */;


--
-- Definition of table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE `empleado` (
  `idEmpleado` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `apellido` varchar(90) NOT NULL,
  `primerNombre` varchar(90) NOT NULL,
  `segundoNombre` varchar(90) NOT NULL,
  `fechaNacimiento` varchar(45) NOT NULL,
  `jefe` varchar(90) NOT NULL,
  `descripcion` varchar(90) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `fechaAlta` varchar(45) NOT NULL,
  `fechaBaja` varchar(45) DEFAULT NULL COMMENT 'Activo',
  PRIMARY KEY (`idEmpleado`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=40889775 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empleado`
--

/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` (`idEmpleado`,`apellido`,`primerNombre`,`segundoNombre`,`fechaNacimiento`,`jefe`,`descripcion`,`telefono`,`fechaAlta`,`fechaBaja`) VALUES 
 (22222221,'FDSDG','DFGFDGFD','FDGDFGFDG','2020-11-01','FDGDFGFD','JEFE','5343453445','2020-11-01','1900-01-01'),
 (38598000,'GARAY','ANGEL','DAVID','1994-06-11','OMEGA TRADERS SA','ENCARGADO DE DEPOSITO','2616762876','2020-11-02','1900-01-01'),
 (40999000,'IMPA VERA','ANA','MARISOL','1991-12-19','IMPA','AYUDATE','3343','2021-01-11','1900-01-01');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;


--
-- Definition of table `ingresoproducto`
--

DROP TABLE IF EXISTS `ingresoproducto`;
CREATE TABLE `ingresoproducto` (
  `idingresoProducto` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fecha` varchar(45) NOT NULL,
  `idProducto` int(10) unsigned NOT NULL,
  `cantidad` double NOT NULL,
  `idProveedor` double NOT NULL,
  `descripcion` varchar(90) NOT NULL,
  `idUsuario` int(10) unsigned NOT NULL,
  `idMarca` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idingresoProducto`),
  KEY `fkIdProducto` (`idProducto`),
  KEY `idProveedor` (`idProveedor`),
  KEY `idMarca` (`idMarca`),
  CONSTRAINT `fkIdProducto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idproducto`),
  CONSTRAINT `idMarca` FOREIGN KEY (`idMarca`) REFERENCES `marcas` (`idMarca`),
  CONSTRAINT `idProveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idproveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ingresoproducto`
--

/*!40000 ALTER TABLE `ingresoproducto` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingresoproducto` ENABLE KEYS */;


--
-- Definition of table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
CREATE TABLE `marcas` (
  `idMarca` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(80) NOT NULL,
  PRIMARY KEY (`idMarca`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marcas`
--

/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
INSERT INTO `marcas` (`idMarca`,`descripcion`) VALUES 
 (1,'GENROD'),
 (2,'AWADUCT'),
 (3,'SILENTIUM'),
 (4,'DFDS');
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;


--
-- Definition of table `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `idproducto` int(10) unsigned NOT NULL,
  `descripcion` varchar(90) NOT NULL,
  `stock` double NOT NULL,
  `unidadMedida` varchar(45) NOT NULL,
  `idCategoria` int(10) unsigned NOT NULL,
  `stockMinimo` double NOT NULL,
  PRIMARY KEY (`idproducto`),
  KEY `idCategoria` (`idCategoria`),
  CONSTRAINT `idCategoria` FOREIGN KEY (`idCategoria`) REFERENCES `categoriaproductos` (`idcategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `producto`
--

/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;


--
-- Definition of table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE `proveedor` (
  `idproveedor` double NOT NULL AUTO_INCREMENT,
  `razonSocial` varchar(90) NOT NULL,
  `descripcion` varchar(90) NOT NULL,
  `direccion` varchar(90) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`idproveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `proveedor`
--

/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` (`idproveedor`,`razonSocial`,`descripcion`,`direccion`,`telefono`) VALUES 
 (1,'GIIFK','KIIIIIII','B EK DJFDFDADFJFDJ','3223234233'),
 (2,'CASA CASTRO','VARUIS','CIUDAD CAPIYA','2121'),
 (3,'GIMENEZ S.A','ELECTRICIDAD Y VARIOS','DR. MORENO 1533','2616323777');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;


--
-- Definition of table `salidaproducto`
--

DROP TABLE IF EXISTS `salidaproducto`;
CREATE TABLE `salidaproducto` (
  `idSalida` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fecha` varchar(45) NOT NULL,
  `idProducto` int(10) unsigned NOT NULL,
  `cantidad` double NOT NULL,
  `idEmpleado` int(10) unsigned NOT NULL,
  `descripcion` varchar(90) NOT NULL,
  `idUsuario` int(10) unsigned NOT NULL,
  `idMarca` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idSalida`),
  KEY `idProducto` (`idProducto`),
  KEY `idEmpleado` (`idEmpleado`),
  KEY `idMarcaa` (`idMarca`),
  CONSTRAINT `idEmpleado` FOREIGN KEY (`idEmpleado`) REFERENCES `empleado` (`idEmpleado`),
  CONSTRAINT `idMarcaa` FOREIGN KEY (`idMarca`) REFERENCES `marcas` (`idMarca`),
  CONSTRAINT `idProducto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salidaproducto`
--

/*!40000 ALTER TABLE `salidaproducto` DISABLE KEYS */;
/*!40000 ALTER TABLE `salidaproducto` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
