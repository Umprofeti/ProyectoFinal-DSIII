/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.4.24-MariaDB : Database - semestral
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`semestral` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `semestral`;

/*Table structure for table `tbl_detalle_planilla` */

DROP TABLE IF EXISTS `tbl_detalle_planilla`;

CREATE TABLE `tbl_detalle_planilla` (
  `id_planilla` bigint(20) DEFAULT NULL,
  `cedula_empleado` varchar(20) DEFAULT NULL,
  `horas_trabajadas` double DEFAULT NULL,
  `sph` double DEFAULT NULL,
  `sb` double DEFAULT NULL,
  `ss` double DEFAULT NULL,
  `se` double DEFAULT NULL,
  `sn` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_detalle_planilla` */

insert  into `tbl_detalle_planilla`(`id_planilla`,`cedula_empleado`,`horas_trabajadas`,`sph`,`sb`,`ss`,`se`,`sn`) values 
(1,'8-000-0001',6,6,36,9.75,1.25,33),
(1,'8-000-0002',7,8,56,9.75,1.25,51);

/*Table structure for table `tbl_empleado` */

DROP TABLE IF EXISTS `tbl_empleado`;

CREATE TABLE `tbl_empleado` (
  `cedula` varchar(20) NOT NULL,
  `nombre1` varchar(100) DEFAULT NULL,
  `nombre2` varchar(100) DEFAULT NULL,
  `apellido1` varchar(100) DEFAULT NULL,
  `apellido2` varchar(100) DEFAULT NULL,
  `fechanacimiento` date DEFAULT NULL,
  `direccion` varchar(250) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_empleado` */

insert  into `tbl_empleado`(`cedula`,`nombre1`,`nombre2`,`apellido1`,`apellido2`,`fechanacimiento`,`direccion`,`telefono`) values 
('8-000-0001','Pedro','Miguel','Torrez','Gutierrez','1997-04-02','Panama, La Chorrera','6123-4567'),
('8-000-0002','Maria','Gabriela','Rodriguez','De Seda','2002-07-21','Panama Oeste, Valle Dorado','6891-0114');

/*Table structure for table `tbl_planilla` */

DROP TABLE IF EXISTS `tbl_planilla`;

CREATE TABLE `tbl_planilla` (
  `id_planilla` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id_planilla`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_planilla` */

insert  into `tbl_planilla`(`id_planilla`,`fecha`) values 
(1,'2022-07-22');

/*Table structure for table `tbl_usuarios` */

DROP TABLE IF EXISTS `tbl_usuarios`;

CREATE TABLE `tbl_usuarios` (
  `cedula` varchar(20) NOT NULL,
  `userid` varchar(20) DEFAULT NULL,
  `contrasenna` varchar(500) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `direccion` varchar(250) DEFAULT NULL,
  `fechaingreso` date DEFAULT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_usuarios` */

insert  into `tbl_usuarios`(`cedula`,`userid`,`contrasenna`,`nombre`,`apellido`,`direccion`,`fechaingreso`) values 
('0-000-0000','admin','MTIzNDU2','------','------','------','2022-07-11'),
('8-000-0000','jmGonzalez','WTZIYlRFMlJic3RVWHM=','Jesus','Gonzalez','Panama','1940-01-01');

/* Procedure structure for procedure `sp_insert_detalle_planilla` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_insert_detalle_planilla` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_detalle_planilla`(in p_id_planilla varchar(20),
						      in p_cedula_empleado varchar(20),
						      in p_horas_trabajadas varchar(20),
						      in p_sph varchar(20),
						      in p_sb varchar(20),
						      in p_ss varchar(20),
						      in p_se varchar(20),
						      in p_sn varchar (20) )
BEGIN
		insert into tbl_detalle_planilla (id_planilla, cedula_empleado, horas_trabajadas, sph, sb, ss, se, sn)
		values (p_id_planilla, p_cedula_empleado, p_horas_trabajadas, p_sph, p_sb, p_ss, p_se, p_sn);
		
		Select cedula_empleado from tbl_detalle_planilla where cedula_empleado = p_cedula_empleado;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_insert_empleado` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_insert_empleado` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_empleado`(in p_cedula varchar(20),
					      in p_nombre1 varchar(100),
					      IN p_nombre2 VARCHAR(100),
					      IN p_apellido1 VARCHAR(100),
					      IN p_apellido2 VARCHAR(100),
					      in p_fechanacimiento date,
					      in p_direccion varchar(250),
					      in p_telefono varchar(30))
BEGIN
		insert into tbl_empleado (cedula, nombre1, nombre2, apellido1, apellido2, fechanacimiento, direccion, telefono)
		values (p_cedula, p_nombre1, p_nombre2, p_apellido1, p_apellido2, p_fechanacimiento, p_direccion, p_telefono);
		
		select cedula from tbl_empleado where cedula = p_cedula;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_insert_planilla` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_insert_planilla` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_planilla`(in p_fecha varchar(20))
BEGIN
		insert into tbl_planilla (fecha)
		values (p_fecha);
		
		select max(id_planilla) as ultimo_id
		from tbl_planilla;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_insert_usuarios` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_insert_usuarios` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_usuarios`(IN p_cedula varchar(20),
					      IN p_userid varchar(20),
					      in p_contrasenna varchar(500),
					      in p_nombre varchar(100),
					      in p_apellido varchar(100),
					      in p_direccion varchar(250),
					      in p_fechaingreso date)
BEGIN
		insert into tbl_usuarios (cedula, userid, contrasenna, nombre, apellido, direccion, fechaingreso)
		values (p_cedula, p_userid, p_contrasenna, p_nombre, p_apellido, p_direccion, p_fechaingreso);
		
		SELECT * FROM tbl_usuarios WHERE cedula = p_cedula;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_admin_account` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_admin_account` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_admin_account`(IN p_cedulaAdmin VARCHAR(20))
BEGIN
		SELECT COUNT(*) AS numero
	          FROM tbl_usuarios WHERE
	          cedula = p_cedulaAdmin;
	
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_empleado` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_empleado` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_empleado`()
BEGIN
		select * from tbl_empleado;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_empleado_por_id` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_empleado_por_id` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_empleado_por_id`(in p_cedula varchar(20))
BEGIN
		Select * from tbl_empleado where cedula = p_cedula;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_MAX_planilla` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_MAX_planilla` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_MAX_planilla`()
BEGIN
		SELECT MAX(id_planilla) FROM tbl_planilla;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_planilla_por_id` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_planilla_por_id` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_planilla_por_id`(in p_id_planilla varchar(20))
BEGIN

		SELECT p.id_planilla, 
		       p.fecha, 
		       e.cedula,
		       e.nombre1,
		       e.nombre2,
		       e.apellido1,
		       e.apellido2,
		       d.horas_trabajadas,
		       d.sph,
		       d.sb,
		       d.ss,
		       d.se,
		       d.sn 
		FROM tbl_planilla p JOIN tbl_detalle_planilla d ON p.id_planilla = d.id_planilla
		 JOIN tbl_empleado e ON d.cedula_empleado = e.cedula 
		 WHERE p.id_planilla=p_id_planilla;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_totales_planilla` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_totales_planilla` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_totales_planilla`()
BEGIN
		SELECT p.id_planilla, 
		       p.fecha, 
		       SUM(sb)AS total_sb, 
		       SUM(ss) AS total_ss, 
		       SUM(se) AS total_se,
		       SUM(sn) AS total_sn
		FROM tbl_planilla p JOIN tbl_detalle_planilla d ON p.id_planilla = d.id_planilla
		GROUP BY p.id_planilla, p.fecha;
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_usuario` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_usuario` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_usuario`(IN p_cedula VARCHAR(20))
BEGIN
		
		SELECT tbl_usuarios.cedula, tbl_usuarios.userid, tbl_usuarios.contrasenna, tbl_usuarios.nombre, tbl_usuarios.apellido,
			tbl_usuarios.direccion, tbl_usuarios.fechaingreso FROM tbl_usuarios WHERE tbl_usuarios.cedula = p_cedula;
		
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_select_validar_usuario` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_select_validar_usuario` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_select_validar_usuario`(in p_userid varchar(20), 
						     in p_contrasenna varchar(500))
BEGIN
		select count(*) as numero
	          from tbl_usuarios
	          where userid = p_userid
	          and contrasenna = p_contrasenna; 
	END */$$
DELIMITER ;

/* Procedure structure for procedure `sp_update_empleado` */

/*!50003 DROP PROCEDURE IF EXISTS  `sp_update_empleado` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_update_empleado`(IN p_cedula VARCHAR(20),
					      IN p_nombre1 VARCHAR(100),
					      IN p_nombre2 VARCHAR(100),
					      IN p_apellido1 VARCHAR(100),
					      IN p_apellido2 VARCHAR(100),
					      IN p_fechanacimiento DATE,
					      IN p_direccion VARCHAR(250),
					      IN p_telefono VARCHAR(30))
BEGIN
		update tbl_empleado set nombre1 = P_nombre1, nombre2 = p_nombre2, apellido1 = p_apellido1,
						apellido2 = p_apellido2, fechanacimiento = p_fechanacimiento,
						direccion = p_direccion, telefono = p_telefono where cedula = p_cedula;
		Select * from tbl_empleado where cedula = p_cedula;
	END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
