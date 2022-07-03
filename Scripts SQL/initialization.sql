DROP SCHEMA IF EXISTS `rabbit`;

CREATE SCHEMA `rabbit`;

use `rabbit`;


DROP TABLE IF EXISTS `clapiers`;
CREATE TABLE `clapiers`(

`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(45) DEFAULT NULL,
`type` varchar(45) DEFAULT NULL,
`position_x` int(5),
`position_y`int(5),
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `lapins`;
CREATE TABLE `lapins` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `naissance` varchar(45) DEFAULT NULL,
  `clapier_id` int(11),
  PRIMARY KEY (`id`),
  KEY `FK_CLAPIER` (`clapier_id`),
    CONSTRAINT `FK_CLAPIER` FOREIGN KEY (`clapier_id`) REFERENCES `clapiers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

LOCK TABLES `clapiers` WRITE;

INSERT INTO `clapiers` VALUES 
	(1,'concours','reproduction',0,0),
	(2,'concours','sevrage',0,1),
	(3,'consommation','reproduction',1,0),
	(4,'consommation','sevrage',1,1),
    (5,'albinos','reproduction',2,0),
    (6,'albinos','sevrage',2,1);
UNLOCK TABLES;


LOCK TABLES `lapins` WRITE;
INSERT INTO `lapins` VALUES
(1,'lapinou','06-Dec-2021',3),
(2,'lapereau','03-Jun-2022',4),
(3,'bunny','02-Jun-2022',6),
(4,'wolf','11-Nov-2021',5),
(5,'duffy','14-Jun-2022',2),
(6,'etienne','23-Jan-2021',1);

UNLOCK TABLES;
