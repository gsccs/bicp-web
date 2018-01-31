CREATE DATABASE  IF NOT EXISTS `xxbs_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `xxbs_db`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: xxbs_db
-- ------------------------------------------------------
-- Server version	5.6.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `plat_dict_group`
--

DROP TABLE IF EXISTS `plat_dict_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_dict_group` (
  `id` varchar(36) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `val` varchar(45) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典分类表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_dict_group`
--

LOCK TABLES `plat_dict_group` WRITE;
/*!40000 ALTER TABLE `plat_dict_group` DISABLE KEYS */;
INSERT INTO `plat_dict_group` VALUES ('1b4411bb-dfb7-4430-9315-015f05e3f448','PTYPE','收费模式',NULL,NULL,NULL),('1b967051-3d3b-48e7-a269-82aa30989c22',NULL,'服务范围',NULL,NULL,NULL),('bfaba2e3-3457-4db8-b918-d1ed65ae4692','SOBJ','服务对象',NULL,NULL,NULL),('c45fd5a4-8261-425e-b020-64981033224a','STYPE','服务方式',NULL,NULL,NULL),('c45fd5a4-8261-425e-b020-64981033224b','NATURE','单位性质',NULL,NULL,NULL);
/*!40000 ALTER TABLE `plat_dict_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_dict_item`
--

DROP TABLE IF EXISTS `plat_dict_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_dict_item` (
  `id` varchar(36) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `groupid` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `ordernum` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ordernum_UNIQUE` (`ordernum`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='字典表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_dict_item`
--

LOCK TABLES `plat_dict_item` WRITE;
/*!40000 ALTER TABLE `plat_dict_item` DISABLE KEYS */;
INSERT INTO `plat_dict_item` VALUES ('082d002e-ac5f-4647-a23d-fe1da3c5eacd','','电话服务','c45fd5a4-8261-425e-b020-64981033224a','1','电话服务',8),('0cc38478-71e2-4d86-8435-d93bdc70c0cf','','其他','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','其他',33),('1c155788-1408-4ea5-88ff-012265da5f6b','','沙龙','c45fd5a4-8261-425e-b020-64981033224a','1','沙龙',15),('1c8fc543-ef61-4579-884c-45b7d5111065','','个人咨询','c45fd5a4-8261-425e-b020-64981033224a','1','个人咨询',13),('2713d846-55d1-4eef-a798-dc0daf3bfd3e','','上门服务','c45fd5a4-8261-425e-b020-64981033224a','1','上门服务',9),('54c8ad35-5794-49e9-935c-0be24a75bb43','','元/人','1b4411bb-dfb7-4430-9315-015f05e3f448','1','元/人',21),('5de69d17-4107-4226-bbb5-7c8783626615','','大型企业','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','大型企业',27),('71bf405a-ecd5-41b0-a178-95edcd329033','','创业个人或团队','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','创业个人或团队',28),('820c0ff2-9aaf-4d26-b6db-25cebfd462d4','','中型企业','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','中型企业',26),('9c78da52-33f8-4464-b81b-275a4c16d673','','网络服务','c45fd5a4-8261-425e-b020-64981033224a','1','网络服务',12),('9dd99754-877f-4b60-8b7a-b9bb00cbac96','','刊物服务','c45fd5a4-8261-425e-b020-64981033224a','1','刊物服务',10),('9fce64d8-f64a-48ac-abab-50d0a94b5750','','个体工商户','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','个体工商户',29),('a0c45a77-ee11-4588-ab39-140fe78f9e64','','元/月','1b4411bb-dfb7-4430-9315-015f05e3f448','1','元/月',18),('aec4ce9c-7cbc-4536-839e-ea8791c84e4e','','元/次','1b4411bb-dfb7-4430-9315-015f05e3f448','1','元/次',20),('b1a30941-6ae0-4ba0-9d00-1ef389404480','','其他服务','c45fd5a4-8261-425e-b020-64981033224a','1','其他服务',16),('bebce1fd-4791-4cbe-a12d-509b4598406f','','事业单位','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','事业单位',30),('c3c5b834-2658-4d22-8bc9-abd7680c4550','','元/期','1b4411bb-dfb7-4430-9315-015f05e3f448','1','元/期',22),('c82439e4-424a-43de-ad7e-e43ed61aa78a','','元/年','1b4411bb-dfb7-4430-9315-015f05e3f448','1','元/年',19),('cc3d01e2-c2f5-498e-aafc-8fed328de0cc','','小型企业','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','小型企业',25),('cdb5636b-1f81-4de4-a361-9bff4276daa0','','民办非企业','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','民办非企业',32),('d16910d9-6ab2-43d2-8657-5c1bb6ef6135','','大讲坛','c45fd5a4-8261-425e-b020-64981033224a','1','大讲坛',14),('d4d8a5bd-34ef-498b-84c1-3b0c7fabdb67','','微型企业','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','微型企业',24),('ddc73978-3b93-442e-ae1e-8ff917458745','','柜台式服务','c45fd5a4-8261-425e-b020-64981033224a','1','柜台式服务',7),('e7296221-275a-4805-852d-56934f69a588','','社会团体','bfaba2e3-3457-4db8-b918-d1ed65ae4692','1','社会团体',31),('eb92a0f2-0371-46b1-96da-bebb42c208bc','','元/个','1b4411bb-dfb7-4430-9315-015f05e3f448','1','元/个',23),('f22f2371-5921-4795-8533-b919af611aeb','','信函服务','c45fd5a4-8261-425e-b020-64981033224a','1','信函服务',11),('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99261','','元/日','1b4411bb-dfb7-4430-9315-015f05e3f448','1','元/日',17);
/*!40000 ALTER TABLE `plat_dict_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_app`
--

DROP TABLE IF EXISTS `plat_sys_app`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_app` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `app_key` varchar(100) DEFAULT NULL,
  `app_secret` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_app_app_key` (`app_key`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_app`
--

LOCK TABLES `plat_sys_app` WRITE;
/*!40000 ALTER TABLE `plat_sys_app` DISABLE KEYS */;
INSERT INTO `plat_sys_app` VALUES (1,'中心服务器','645ba616-370a-43a8-a8e0-993e7a590cf0','bb74abb6-bae0-47dd-a7b1-9571ea3a0f33',1),(2,'APP-1','645ba612-370a-43a8-a8e0-993e7a590cf0','bb74abb2-bae0-47dd-a7b1-9571ea3a0f33',1),(3,'APP-2','645ba613-370a-43a8-a8e0-993e7a590cf0','bb74abb3-bae0-47dd-a7b1-9571ea3a0f33',1);
/*!40000 ALTER TABLE `plat_sys_app` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_auth`
--

DROP TABLE IF EXISTS `plat_sys_auth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_auth` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `app_id` bigint(20) DEFAULT NULL,
  `role_ids` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sys_user_app_roles_user_id_app_id` (`user_id`,`app_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_auth`
--

LOCK TABLES `plat_sys_auth` WRITE;
/*!40000 ALTER TABLE `plat_sys_auth` DISABLE KEYS */;
INSERT INTO `plat_sys_auth` VALUES (1,1,1,'1,'),(2,1,2,'1,2'),(3,1,3,'1,3'),(4,5,1,'2,3,4,');
/*!40000 ALTER TABLE `plat_sys_auth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_config`
--

DROP TABLE IF EXISTS `plat_sys_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_config` (
  `code` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `configValue` varchar(500) DEFAULT NULL,
  `orderNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_config`
--

LOCK TABLES `plat_sys_config` WRITE;
/*!40000 ALTER TABLE `plat_sys_config` DISABLE KEYS */;
INSERT INTO `plat_sys_config` VALUES ('TEMPLETE_PATH',NULL,'F:\\\\plat\\\\templet\\\\',NULL),('TEST','测试项','测试内容',1);
/*!40000 ALTER TABLE `plat_sys_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_org`
--

DROP TABLE IF EXISTS `plat_sys_org`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_org` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_organization_parent_id` (`parent_id`),
  KEY `idx_sys_organization_parent_ids` (`parent_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_org`
--

LOCK TABLES `plat_sys_org` WRITE;
/*!40000 ALTER TABLE `plat_sys_org` DISABLE KEYS */;
INSERT INTO `plat_sys_org` VALUES (1,'张掖经济技术开发区',0,'0/',1),(2,'管理委员会',1,'0/1/',1),(3,'机构2',1,'0/1/',1),(4,'机构3',2,'0/1/2/',1),(5,'测试组织机构2',3,NULL,0),(6,'测试组织机构2',3,NULL,0),(7,'测试组织机构2',3,NULL,0),(8,'测试组织机构2',3,NULL,0),(9,'测试组织机构2',3,NULL,0);
/*!40000 ALTER TABLE `plat_sys_org` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_resource`
--

DROP TABLE IF EXISTS `plat_sys_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(100) DEFAULT NULL,
  `permission` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  `icon` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_sys_resource_parent_id` (`parent_id`),
  KEY `idx_sys_resource_parent_ids` (`parent_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=7305 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_resource`
--

LOCK TABLES `plat_sys_resource` WRITE;
/*!40000 ALTER TABLE `plat_sys_resource` DISABLE KEYS */;
INSERT INTO `plat_sys_resource` VALUES (5,'企业信息','menu','',1,'0/1/','',1,'icon02'),(6,'土地资源','menu',' ',1,'0/1/','',1,'icon03'),(8,'管网管线','menu',NULL,1,'0/1/','',1,'icon05'),(9,'监测数据','menu',NULL,1,'0/1/','',1,'icon04'),(10,'系统配置','menu','',1,'0/1/','sys:*',1,'icon06'),(21,'用户管理','menu','',10,'0/1/','user:*',1,'icon03'),(31,'资源管理','menu','',10,'0/1/','resource:*',1,'icon04'),(32,'资源新增','button','',31,'0/1/31/','resource:create',1,NULL),(33,'资源修改','button','',31,'0/1/31/','resource:update',1,NULL),(34,'资源删除','button','',31,'0/1/31/','resource:delete',1,NULL),(35,'资源列表','menu','/resource',31,'0/1/31/','resource:view',1,NULL),(41,'角色管理','menu','',10,'0/1/','role:*',1,NULL),(42,'角色新增','button','',41,'0/1/41/','role:create',1,NULL),(43,'角色修改','button','',41,'0/1/41/','role:update',1,NULL),(44,'角色删除','button','',41,'0/1/41/','role:delete',1,NULL),(45,'角色列表','menu','/role',41,'0/1/41/','role:view',1,NULL),(61,'组织机构','menu','',10,'0/1/','config:*',1,NULL),(62,'机构列表','menu','/org',61,'0/1/61','config:view',1,NULL),(71,'地图管理','menu','',10,NULL,'mkfact:*',1,NULL),(72,'图层要素','menu','/mkfact/list',71,'0/1/10/71','mkfact:*view',1,NULL),(201,'用户列表','menu','/user',21,'0/1/21/','user:view',1,NULL),(202,'用户修改','button','',21,'0/1/21/','user:update',1,NULL),(204,'用户删除','button','',21,'0/1/21/','user:delete',1,NULL),(205,'用户新增','button','',21,'0/1/21/','user:create',1,NULL),(501,'企业管理','menu',NULL,5,'0/1/5/',NULL,1,NULL),(502,'企业新增','button','',501,'0/1/5/501','corp:create',0,NULL),(503,'企业修改','button','',501,'0/1/5/501','corp:update',1,NULL),(504,'企业查看','button','',501,'0/1/5/501','corp:view',1,NULL),(505,'企业删除','button','',501,'0/1/5/501','corp:delete',1,NULL),(506,'企业列表','menu','/company/list',501,'0/1/5/501','',1,NULL),(507,'企业分布','menu','/company/map',501,'0/1/5/501','corp:map',1,NULL),(550,'项目管理','menu',NULL,5,NULL,NULL,1,NULL),(551,'重点项目','menu','/proj/list',550,'0/1/5/550',NULL,1,NULL),(601,'土地管理','menu',NULL,6,'0/1/6/','land:view',1,NULL),(610,'土地列表','menu','/land/list',601,'0/1/6/601','land:view',1,NULL),(611,'土地分布','menu','/land/map',601,'0/1/6/601',NULL,0,NULL),(612,' 新增土地','button',NULL,601,'0/1/6/601','land:create',0,NULL),(613,'土地编辑','button','',601,NULL,'land:update',0,NULL),(801,'管网管线','menu','',8,'0/1/8/','pipe:view',1,NULL),(802,'管线列表','menu','/pipe/list',801,'0/1/8/801',NULL,1,NULL),(803,'管线分布','menu','/pipe/map',801,'0/1/8/801',NULL,1,NULL),(901,'监测管理','menu',NULL,9,'0/1/7/','monitorval:view',1,NULL),(911,'监测数据','menu','/monitorval/list',901,'0/1/10/701/',NULL,1,NULL),(912,'监测指标','menu','/monitortype/list',901,'0/1/3/',NULL,1,NULL),(913,'预警规则','menu','/warnrule/list',901,'0/1/3/','',1,NULL),(914,'新增预警','button',NULL,901,NULL,'warn:create',1,NULL),(915,'修改预警','button',NULL,901,NULL,'warn:update',1,NULL),(916,'删除预警','button',NULL,901,NULL,'warn:delete',1,NULL),(7304,'地图配置','menu','/mapconf/list',71,NULL,'mapconf:*',0,NULL);
/*!40000 ALTER TABLE `plat_sys_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_role`
--

DROP TABLE IF EXISTS `plat_sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `resource_ids` varchar(1000) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_role_resource_ids` (`resource_ids`(255))
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_role`
--

LOCK TABLES `plat_sys_role` WRITE;
/*!40000 ALTER TABLE `plat_sys_role` DISABLE KEYS */;
INSERT INTO `plat_sys_role` VALUES (1,'admin','超级管理员','5,501,502,503,504,505,506,507,550,551,6,601,610,611,612,613,8,801,802,803,9,901,911,912,913,914,915,916,10,21,201,202,204,205,31,32,33,34,35,41,42,43,44,45,61,62,71,72,7304,',1),(2,'role1','客户经理',NULL,0),(3,'role2','业务主管',NULL,0),(4,'testA','测试角色','5,501,502,503,504,505,506,507,',0);
/*!40000 ALTER TABLE `plat_sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_sessions`
--

DROP TABLE IF EXISTS `plat_sys_sessions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_sessions` (
  `id` varchar(200) NOT NULL DEFAULT '',
  `session` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_sessions`
--

LOCK TABLES `plat_sys_sessions` WRITE;
/*!40000 ALTER TABLE `plat_sys_sessions` DISABLE KEYS */;
INSERT INTO `plat_sys_sessions` VALUES ('717d63f5-8abf-40d0-97a5-ecca80c62ea0','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJDcxN2Q2M2Y1LThhYmYtNDBkMC05N2E1LWVjY2E4MGM2MmVhMHNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUyWpz5geHNxAH4AA3cIAAABTJao4ex4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAR0AFBvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfQVVUSEVOVElDQVRFRF9TRVNTSU9OX0tFWXNyABFqYXZhLmxhbmcuQm9vbGVhbs0gcoDVnPruAgABWgAFdmFsdWV4cAF0AAZzaXRlSWRzcgAOamF2YS5sYW5nLkxvbmc7i+SQzI8j3wIAAUoABXZhbHVleHIAEGphdmEubGFuZy5OdW1iZXKGrJUdC5TgiwIAAHhwAAAAAAAAA+l0AAZ1c2VySWRzcQB+AAwAAAAAAAAD6HQATW9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5zdXBwb3J0LkRlZmF1bHRTdWJqZWN0Q29udGV4dF9QUklOQ0lQQUxTX1NFU1NJT05fS0VZc3IAMm9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5TaW1wbGVQcmluY2lwYWxDb2xsZWN0aW9uqH9YJcajCEoDAAFMAA9yZWFsbVByaW5jaXBhbHN0AA9MamF2YS91dGlsL01hcDt4cHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaE1hcDTATlwQbMD7AgABWgALYWNjZXNzT3JkZXJ4cQB+AAY/QAAAAAAADHcIAAAAEAAAAAF0AChjb20uZ3NjY3MuYjJjLnNoaXJvLmNsaWVudC5DbGllbnRSZWFsbV8wc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoU2V02GzXWpXdKh4CAAB4cgARamF2YS51dGlsLkhhc2hTZXS6RIWVlri3NAMAAHhwdwwAAAAQP0AAAAAAAAF0AAVhZG1pbnh4AHcBAXEAfgAWeHh4'),('7e6d17b1-b00e-4393-920d-e12f53e92652','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJDdlNmQxN2IxLWIwMGUtNDM5My05MjBkLWUxMmY1M2U5MjY1MnNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx95o6seHNxAH4AA3cIAAABTH3pZBh4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAN0ABFhdXRoYy5mYWxsYmFja1VybHQAJGh0dHA6Ly8xMjcuMC4wLjE6NzA4MC9lYi1zdG9yZS9zdG9yZXQAEXNoaXJvU2F2ZWRSZXF1ZXN0c3IAKWNvbS5nc2Njcy5iMmMuYXBwLmNvcmUuQ2xpZW50U2F2ZWRSZXF1ZXN0ZWbjXB3DOKsCAAVJAARwb3J0TAAHYmFja1VybHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAC2NvbnRleHRQYXRocQB+AAxMAAZkb21haW5xAH4ADEwABnNjaGVtZXEAfgAMeHIAJm9yZy5hcGFjaGUuc2hpcm8ud2ViLnV0aWwuU2F2ZWRSZXF1ZXN0r848rXmCyroCAANMAAZtZXRob2RxAH4ADEwAC3F1ZXJ5U3RyaW5ncQB+AAxMAApyZXF1ZXN0VVJJcQB+AAx4cHQAA0dFVHB0AAovZWItc3RvcmUvAAAbqHB0AAkvZWItc3RvcmV0AAkxMjcuMC4wLjF0AARodHRwdABNb3JnLmFwYWNoZS5zaGlyby5zdWJqZWN0LnN1cHBvcnQuRGVmYXVsdFN1YmplY3RDb250ZXh0X1BSSU5DSVBBTFNfU0VTU0lPTl9LRVlzcgAyb3JnLmFwYWNoZS5zaGlyby5zdWJqZWN0LlNpbXBsZVByaW5jaXBhbENvbGxlY3Rpb26of1glxqMISgMAAUwAD3JlYWxtUHJpbmNpcGFsc3QAD0xqYXZhL3V0aWwvTWFwO3hwc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoTWFwNMBOXBBswPsCAAFaAAthY2Nlc3NPcmRlcnhxAH4ABj9AAAAAAAAMdwgAAAAQAAAAAXQAJGNvbS5nc2Njcy5iMmMucGxhdC5yZWFsbS5Vc2VyUmVhbG1fMHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaFNldNhs11qV3SoeAgAAeHIAEWphdmEudXRpbC5IYXNoU2V0ukSFlZa4tzQDAAB4cHcMAAAAED9AAAAAAAABdAAFYWRtaW54eAB3AQFxAH4AGXh4eA=='),('a0535220-82c1-43c1-b12f-7be8a1b12769','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGEwNTM1MjIwLTgyYzEtNDNjMS1iMTJmLTdiZThhMWIxMjc2OXNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUzlEwvKeHNxAH4AA3cIAAABTOU9Blp4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAR0AFBvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfQVVUSEVOVElDQVRFRF9TRVNTSU9OX0tFWXNyABFqYXZhLmxhbmcuQm9vbGVhbs0gcoDVnPruAgABWgAFdmFsdWV4cAF0AAZzaXRlSWRzcgAOamF2YS5sYW5nLkxvbmc7i+SQzI8j3wIAAUoABXZhbHVleHIAEGphdmEubGFuZy5OdW1iZXKGrJUdC5TgiwIAAHhwAAAAAAAAA+l0AAZ1c2VySWRzcQB+AAwAAAAAAAAD6HQATW9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5zdXBwb3J0LkRlZmF1bHRTdWJqZWN0Q29udGV4dF9QUklOQ0lQQUxTX1NFU1NJT05fS0VZc3IAMm9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5TaW1wbGVQcmluY2lwYWxDb2xsZWN0aW9uqH9YJcajCEoDAAFMAA9yZWFsbVByaW5jaXBhbHN0AA9MamF2YS91dGlsL01hcDt4cHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaE1hcDTATlwQbMD7AgABWgALYWNjZXNzT3JkZXJ4cQB+AAY/QAAAAAAADHcIAAAAEAAAAAF0AChjb20uZ3NjY3MuYjJjLnNoaXJvLmNsaWVudC5DbGllbnRSZWFsbV8wc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoU2V02GzXWpXdKh4CAAB4cgARamF2YS51dGlsLkhhc2hTZXS6RIWVlri3NAMAAHhwdwwAAAAQP0AAAAAAAAF0AAVhZG1pbnh4AHcBAXEAfgAWeHh4'),('a9218085-116a-47b4-935c-a35f659aec44','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGE5MjE4MDg1LTExNmEtNDdiNC05MzVjLWEzNWY2NTlhZWM0NHNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUzlRvQ7eHNxAH4AA3cIAAABTOVObex4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAR0AFBvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfQVVUSEVOVElDQVRFRF9TRVNTSU9OX0tFWXNyABFqYXZhLmxhbmcuQm9vbGVhbs0gcoDVnPruAgABWgAFdmFsdWV4cAF0AAZzaXRlSWRzcgAOamF2YS5sYW5nLkxvbmc7i+SQzI8j3wIAAUoABXZhbHVleHIAEGphdmEubGFuZy5OdW1iZXKGrJUdC5TgiwIAAHhwAAAAAAAAA+l0AAZ1c2VySWRzcQB+AAwAAAAAAAAD6HQATW9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5zdXBwb3J0LkRlZmF1bHRTdWJqZWN0Q29udGV4dF9QUklOQ0lQQUxTX1NFU1NJT05fS0VZc3IAMm9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5TaW1wbGVQcmluY2lwYWxDb2xsZWN0aW9uqH9YJcajCEoDAAFMAA9yZWFsbVByaW5jaXBhbHN0AA9MamF2YS91dGlsL01hcDt4cHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaE1hcDTATlwQbMD7AgABWgALYWNjZXNzT3JkZXJ4cQB+AAY/QAAAAAAADHcIAAAAEAAAAAF0AChjb20uZ3NjY3MuYjJjLnNoaXJvLmNsaWVudC5DbGllbnRSZWFsbV8wc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoU2V02GzXWpXdKh4CAAB4cgARamF2YS51dGlsLkhhc2hTZXS6RIWVlri3NAMAAHhwdwwAAAAQP0AAAAAAAAF0AAVhZG1pbnh4AHcBAXEAfgAWeHh4'),('acbab26a-148d-4113-9ce6-ff469436ca83','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGFjYmFiMjZhLTE0OGQtNDExMy05Y2U2LWZmNDY5NDM2Y2E4M3NyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUyRW5JoeHNxAH4AA3cIAAABTJFeX9x4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAJ0ABFhdXRoYy5mYWxsYmFja1VybHQAJGh0dHA6Ly8xMjcuMC4wLjE6NzA4MC9lYi1zdG9yZS9zdG9yZXQAEXNoaXJvU2F2ZWRSZXF1ZXN0c3IAKWNvbS5nc2Njcy5iMmMuYXBwLmNvcmUuQ2xpZW50U2F2ZWRSZXF1ZXN0ZWbjXB3DOKsCAAVJAARwb3J0TAAHYmFja1VybHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAC2NvbnRleHRQYXRocQB+AAxMAAZkb21haW5xAH4ADEwABnNjaGVtZXEAfgAMeHIAJm9yZy5hcGFjaGUuc2hpcm8ud2ViLnV0aWwuU2F2ZWRSZXF1ZXN0r848rXmCyroCAANMAAZtZXRob2RxAH4ADEwAC3F1ZXJ5U3RyaW5ncQB+AAxMAApyZXF1ZXN0VVJJcQB+AAx4cHQAA0dFVHB0AAovZWItc3RvcmUvAAAbqHB0AAkvZWItc3RvcmV0AAkxMjcuMC4wLjF0AARodHRweHg='),('bf4a234c-067b-4da7-bc0a-d9d69d5be112','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGJmNGEyMzRjLTA2N2ItNGRhNy1iYzBhLWQ5ZDY5ZDViZTExMnNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx9+Dg0eHNxAH4AA3cIAAABTH4VILh4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAAAXcIAAAAAgAAAAJ0ABFhdXRoYy5mYWxsYmFja1VybHQAJGh0dHA6Ly8xMjcuMC4wLjE6NzA4MC9lYi1zdG9yZS9zdG9yZXQAEXNoaXJvU2F2ZWRSZXF1ZXN0c3IAKWNvbS5nc2Njcy5iMmMuYXBwLmNvcmUuQ2xpZW50U2F2ZWRSZXF1ZXN0ZWbjXB3DOKsCAAVJAARwb3J0TAAHYmFja1VybHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAC2NvbnRleHRQYXRocQB+AAxMAAZkb21haW5xAH4ADEwABnNjaGVtZXEAfgAMeHIAJm9yZy5hcGFjaGUuc2hpcm8ud2ViLnV0aWwuU2F2ZWRSZXF1ZXN0r848rXmCyroCAANMAAZtZXRob2RxAH4ADEwAC3F1ZXJ5U3RyaW5ncQB+AAxMAApyZXF1ZXN0VVJJcQB+AAx4cHQAA0dFVHB0AAovZWItc3RvcmUvAAAbqHB0AAkvZWItc3RvcmV0AAkxMjcuMC4wLjF0AARodHRweHg='),('c9c177f1-3f5e-4dc6-a75e-39b9f1056d66','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIAW3QAJGM5YzE3N2YxLTNmNWUtNGRjNi1hNzVlLTM5YjlmMTA1NmQ2NnNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx9mEQdeHNxAH4AA3cIAAABTH2fP2R4dxMAAAAAABt3QAAJMTI3LjAuMC4xeA=='),('d4f138fb-0a7e-45e7-a0b3-b7eb1ad2bbda','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGQ0ZjEzOGZiLTBhN2UtNDVlNy1hMGIzLWI3ZWIxYWQyYmJkYXNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUyTQDX0eHNxAH4AA3cIAAABTJNA8Gp4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAF0AE1vcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfUFJJTkNJUEFMU19TRVNTSU9OX0tFWXNyADJvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3QuU2ltcGxlUHJpbmNpcGFsQ29sbGVjdGlvbqh/WCXGowhKAwABTAAPcmVhbG1QcmluY2lwYWxzdAAPTGphdmEvdXRpbC9NYXA7eHBzcgAXamF2YS51dGlsLkxpbmtlZEhhc2hNYXA0wE5cEGzA+wIAAVoAC2FjY2Vzc09yZGVyeHEAfgAGP0AAAAAAAAx3CAAAABAAAAABdAAoY29tLmdzY2NzLmIyYy5zaGlyby5jbGllbnQuQ2xpZW50UmVhbG1fMHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaFNldNhs11qV3SoeAgAAeHIAEWphdmEudXRpbC5IYXNoU2V0ukSFlZa4tzQDAAB4cHcMAAAAED9AAAAAAAABdAAFYWRtaW54eAB3AQFxAH4ADXh4eA=='),('f89dfd82-953e-4c32-bdc8-6615c07fb32d','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGY4OWRmZDgyLTk1M2UtNGMzMi1iZGM4LTY2MTVjMDdmYjMyZHNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx0rB/IeHNxAH4AA3cIAAABTHSz7St4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAJ0ABFhdXRoYy5mYWxsYmFja1VybHQAI2h0dHA6Ly8xMjcuMC4wLjE6OTA4MC9lYi1zaXRlL2luZGV4dAARc2hpcm9TYXZlZFJlcXVlc3RzcgApY29tLmdzY2NzLmIyYy5hcHAuY29yZS5DbGllbnRTYXZlZFJlcXVlc3RlZuNcHcM4qwIABUkABHBvcnRMAAdiYWNrVXJsdAASTGphdmEvbGFuZy9TdHJpbmc7TAALY29udGV4dFBhdGhxAH4ADEwABmRvbWFpbnEAfgAMTAAGc2NoZW1lcQB+AAx4cgAmb3JnLmFwYWNoZS5zaGlyby53ZWIudXRpbC5TYXZlZFJlcXVlc3SvzjyteYLKugIAA0wABm1ldGhvZHEAfgAMTAALcXVlcnlTdHJpbmdxAH4ADEwACnJlcXVlc3RVUklxAH4ADHhwdAADR0VUcHQADi9lYi1zaXRlL2xvZ2luAAAjeHB0AAgvZWItc2l0ZXQACTEyNy4wLjAuMXQABGh0dHB4eA=='),('fd929280-80f6-4d60-ae1c-415803dafdac','rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIAW3QAJGZkOTI5MjgwLTgwZjYtNGQ2MC1hZTFjLTQxNTgwM2RhZmRhY3NyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx9v0pgeHNxAH4AA3cIAAABTH3F57t4dxMAAAAAABt3QAAJMTI3LjAuMC4xeA==');
/*!40000 ALTER TABLE `plat_sys_sessions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plat_sys_user`
--

DROP TABLE IF EXISTS `plat_sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plat_sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `orgid` bigint(20) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `account` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_user_username` (`account`),
  KEY `idx_sys_user_organization_id` (`orgid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plat_sys_user`
--

LOCK TABLES `plat_sys_user` WRITE;
/*!40000 ALTER TABLE `plat_sys_user` DISABLE KEYS */;
INSERT INTO `plat_sys_user` VALUES (1,4,'系统管理员','admin','9ace5ac7450dd54c05f2c3005e8ee4fe','3487ff429b0a7d3d75a551dfc9b65912',0),(5,1,'测试A','testA','e8119fe576080b0bae311a643a1b7763','92bb58bf67149123df607c505a7e4843',0),(8,2,'测试B','testB','61b52166fc860196e161dd8b09ce089d','bf293e02697a5d98a0acb83e9838b31c',0);
/*!40000 ALTER TABLE `plat_sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_notice`
--

DROP TABLE IF EXISTS `work_notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_notice` (
  `id` varchar(36) NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `addtime` datetime DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='社区通知';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_notice`
--

LOCK TABLES `work_notice` WRITE;
/*!40000 ALTER TABLE `work_notice` DISABLE KEYS */;
INSERT INTO `work_notice` VALUES ('101','2015年10月25日通知测试','测试信息测试信息测试信息测试信息测试信息测试信息','2015-11-01 00:00:00',NULL);
/*!40000 ALTER TABLE `work_notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `work_plan`
--

DROP TABLE IF EXISTS `work_plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `work_plan` (
  `id` varchar(36) NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(245) DEFAULT NULL,
  `assigner` varchar(45) DEFAULT NULL,
  `addtime` timestamp NULL DEFAULT NULL,
  `pstarttime` timestamp NULL DEFAULT NULL,
  `pendtime` timestamp NULL DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `remark` varchar(245) DEFAULT NULL,
  `endtime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工作计划';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `work_plan`
--

LOCK TABLES `work_plan` WRITE;
/*!40000 ALTER TABLE `work_plan` DISABLE KEYS */;
INSERT INTO `work_plan` VALUES ('101','测试信息','测试信息测试信息测试信息测试信息测试信息测试信息测试信息',NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `work_plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_contact`
--

DROP TABLE IF EXISTS `xxbs_contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_contact` (
  `ispcode` varchar(36) NOT NULL COMMENT '集团单位编码',
  `title` varchar(128) DEFAULT NULL COMMENT '集团单位名称',
  `areacode` int(11) DEFAULT NULL,
  `duty` varchar(50) DEFAULT NULL COMMENT '职务',
  `phone` varchar(45) DEFAULT NULL COMMENT '电话号码',
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `isptype` varchar(45) DEFAULT NULL COMMENT '运营商',
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ispcode`),
  KEY `parentId` (`areacode`),
  KEY `code` (`title`,`areacode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通讯录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_contact`
--

LOCK TABLES `xxbs_contact` WRITE;
/*!40000 ALTER TABLE `xxbs_contact` DISABLE KEYS */;
INSERT INTO `xxbs_contact` VALUES ('931',NULL,93,'兰州市',NULL,'3',NULL,NULL),('9310',NULL,931,'安宁区',NULL,'4',NULL,NULL),('9311',NULL,931,'城关区',NULL,'4',NULL,NULL),('9312',NULL,931,'七里河区',NULL,'4',NULL,NULL),('9313',NULL,931,'西固区',NULL,'4',NULL,NULL),('9314',NULL,931,'红古区',NULL,'4',NULL,NULL),('9315',NULL,931,'永登县',NULL,'4',NULL,NULL),('9316',NULL,931,'皋兰县',NULL,'4',NULL,NULL),('9317',NULL,931,'榆中县',NULL,'4',NULL,NULL),('9318',NULL,931,'兰州新区',NULL,'4',NULL,NULL);
/*!40000 ALTER TABLE `xxbs_contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_corp`
--

DROP TABLE IF EXISTS `xxbs_corp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_corp` (
  `ispcode` varchar(36) NOT NULL COMMENT '集团编码',
  `title` varchar(255) DEFAULT NULL COMMENT '企业名称',
  `orgcode` varchar(45) DEFAULT NULL COMMENT '组织机构代码',
  `regcode` varchar(45) DEFAULT NULL,
  `regtype` varchar(45) DEFAULT NULL COMMENT '注册类型',
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `domain` varchar(45) DEFAULT NULL,
  `nature` varchar(45) DEFAULT NULL COMMENT '企业性质',
  `legaler` varchar(45) DEFAULT NULL COMMENT '法 人',
  `linker` varchar(45) DEFAULT NULL,
  `pcode` varchar(45) DEFAULT NULL,
  `ccode` varchar(45) DEFAULT NULL,
  `acode` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `zipcode` varchar(45) DEFAULT NULL,
  `qqcode` varchar(45) DEFAULT NULL,
  `hycode` varchar(45) DEFAULT NULL COMMENT '行业分类',
  `subhycode` varchar(45) DEFAULT NULL COMMENT '行业二级分类',
  `stake` varchar(45) DEFAULT NULL COMMENT '控股情况',
  `created` varchar(45) DEFAULT NULL,
  `logo` varchar(200) DEFAULT NULL,
  `content` text,
  `status` varchar(45) DEFAULT NULL,
  `addtime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ispcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_corp`
--

LOCK TABLES `xxbs_corp` WRITE;
/*!40000 ALTER TABLE `xxbs_corp` DISABLE KEYS */;
INSERT INTO `xxbs_corp` VALUES ('10001','测试企业',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `xxbs_corp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_ictproject`
--

DROP TABLE IF EXISTS `xxbs_ictproject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_ictproject` (
  `id` varchar(36) NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `startdate` timestamp NULL DEFAULT NULL COMMENT '计划开工时间',
  `enddate` timestamp NULL DEFAULT NULL COMMENT '实际完工时间',
  `plandate` timestamp NULL DEFAULT NULL COMMENT '计划完工时间',
  `ussm` float DEFAULT NULL COMMENT '投资金额',
  `status` varchar(45) DEFAULT NULL,
  `cooper` varchar(255) DEFAULT NULL COMMENT '合作厂商',
  `ordernum` int(11) DEFAULT NULL,
  `remark` varchar(500) DEFAULT NULL,
  `ispcode` varchar(45) DEFAULT NULL,
  `amuserid` varchar(45) DEFAULT NULL COMMENT '客户经理',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ICT项目表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_ictproject`
--

LOCK TABLES `xxbs_ictproject` WRITE;
/*!40000 ALTER TABLE `xxbs_ictproject` DISABLE KEYS */;
INSERT INTO `xxbs_ictproject` VALUES ('101','项目测试','2015-11-17 16:00:00',NULL,'2015-11-18 16:00:00',NULL,'1',NULL,NULL,'项目ceshi',NULL,NULL),('104','测试项目4','2015-11-19 16:00:00',NULL,'2016-01-29 16:00:00',NULL,'1',NULL,NULL,'',NULL,NULL);
/*!40000 ALTER TABLE `xxbs_ictproject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_product`
--

DROP TABLE IF EXISTS `xxbs_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_product` (
  `id` varchar(36) NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `status` varchar(5) DEFAULT NULL,
  `ismodi` varchar(45) DEFAULT '1' COMMENT '是否参与摸底产品',
  `issem` varchar(45) DEFAULT '1' COMMENT '是否成员营销产品',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='信息化产品表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_product`
--

LOCK TABLES `xxbs_product` WRITE;
/*!40000 ALTER TABLE `xxbs_product` DISABLE KEYS */;
INSERT INTO `xxbs_product` VALUES ('10001','IDC  主机托管、云主机',NULL,'1','1','1'),('10002','IMS（必推产品）',NULL,'1','1','1'),('10003','短彩类',NULL,'1','1','1'),('10004','移动管家',NULL,'1','1','1'),('10005','舆情监控',NULL,'1','1','1'),('10006','云主机',NULL,'1','1','1'),('10007','企业建站\\微信建站',NULL,'1','1','1'),('10008','协同办公',NULL,'1','1','1'),('10009','集团通讯录',NULL,'1','1','1'),('10010','小步外勤/外勤通',NULL,'1','1','1'),('10011','MDM 移动终端管理',NULL,'1','1','1'),('30001','终端',NULL,'1','1','1'),('30002','4G流量',NULL,'1','1','1'),('30003','4G换卡',NULL,'1','1','1'),('30004','掌上APP',NULL,'1','1','1');
/*!40000 ALTER TABLE `xxbs_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_prop`
--

DROP TABLE IF EXISTS `xxbs_prop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_prop` (
  `id` varchar(36) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `propcode` varchar(45) DEFAULT NULL COMMENT '属性编码',
  `showtype` varchar(45) DEFAULT NULL COMMENT '显示方式 input ,select',
  `datatype` varchar(45) DEFAULT NULL COMMENT '数据类型text、date、num',
  `dictcode` varchar(45) DEFAULT NULL COMMENT '可选值字典编码',
  `productid` varchar(45) DEFAULT NULL COMMENT '产品编码',
  `indexnum` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `indexnum_UNIQUE` (`indexnum`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='产品属性表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_prop`
--

LOCK TABLES `xxbs_prop` WRITE;
/*!40000 ALTER TABLE `xxbs_prop` DISABLE KEYS */;
INSERT INTO `xxbs_prop` VALUES ('701','是否有自己的机房？','f_701','input','text',NULL,'10001',1,'1'),('702','机房设备已使用了多少年？','f_702','input','text',NULL,'10001',2,'1'),('703','机房环境是否专业化？','f_703','input','text',NULL,'10001',3,'1'),('801','每年的电费、人工费是多少？','f_801','input',NULL,NULL,'10001',4,NULL),('802','是否使用座机','f_802','input',NULL,NULL,'10002',5,NULL),('803','在用固话哪一家的？','f_803','select',NULL,NULL,'10002',6,NULL),('804','座机数量','f_804','input',NULL,NULL,'10002',7,NULL),('805','月资费/部','f_805','input',NULL,NULL,'10002',8,NULL),('806','到期时间','f_806','input',NULL,NULL,'10002',9,NULL),('901','使用何种产品发送通知','f_901','select',NULL,NULL,'10003',10,NULL),('902','有无使用类似的产品','f_902','select',NULL,NULL,'10004',11,NULL),('903','有无使用监控类产品','f_903','select',NULL,NULL,'10005',12,NULL),('904','有无使用同类产品','f_904',NULL,NULL,NULL,'10006',19,NULL),('905','有无使用同类产品？','f_905',NULL,NULL,NULL,'10007',20,NULL),('906','有无使用同类产品？','f_906',NULL,NULL,NULL,'10008',21,NULL),('907','有无使用同类产品？','f_907',NULL,NULL,NULL,'10009',22,NULL),('908','有无使用同类产品？','f_908',NULL,NULL,NULL,'10010',23,NULL),('909','有无使用同类产品？','f_909',NULL,NULL,NULL,'10011',24,NULL);
/*!40000 ALTER TABLE `xxbs_prop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_prop_val`
--

DROP TABLE IF EXISTS `xxbs_prop_val`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_prop_val` (
  `id` varchar(36) NOT NULL,
  `propid` varchar(50) DEFAULT NULL COMMENT '类型ID',
  `corpid` varchar(50) DEFAULT NULL COMMENT '企业ID',
  `productid` varchar(45) DEFAULT NULL,
  `propval` decimal(10,2) DEFAULT NULL COMMENT '监测值',
  `addtime` timestamp NULL DEFAULT NULL COMMENT '监测时间',
  `remark` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品属性值';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_prop_val`
--

LOCK TABLES `xxbs_prop_val` WRITE;
/*!40000 ALTER TABLE `xxbs_prop_val` DISABLE KEYS */;
INSERT INTO `xxbs_prop_val` VALUES ('2003','701','10001','10001',97.02,'2015-10-21 16:00:00','多对多'),('2004','702','10001','10001',60.00,'2015-10-06 06:23:08','测试添加监测数据'),('2005','703','10001','10001',110.02,'2015-10-21 16:00:00','多对多'),('2006','801','10001','10001',NULL,NULL,NULL),('2007','802','10001','10001',NULL,NULL,NULL),('2008','803','10001','10001',NULL,NULL,NULL),('2009','804','10001','10001',NULL,NULL,NULL);
/*!40000 ALTER TABLE `xxbs_prop_val` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_sem_recomd`
--

DROP TABLE IF EXISTS `xxbs_sem_recomd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_sem_recomd` (
  `id` int(11) NOT NULL,
  `reportid` varchar(45) DEFAULT NULL,
  `productid` varchar(45) DEFAULT NULL,
  `remresult` varchar(45) DEFAULT NULL,
  `amuserid` varchar(45) DEFAULT NULL COMMENT '冗余字段',
  `corpid` varchar(45) DEFAULT NULL COMMENT '冗余字段',
  `addtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日常上报推荐表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_sem_recomd`
--

LOCK TABLES `xxbs_sem_recomd` WRITE;
/*!40000 ALTER TABLE `xxbs_sem_recomd` DISABLE KEYS */;
/*!40000 ALTER TABLE `xxbs_sem_recomd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_sem_report`
--

DROP TABLE IF EXISTS `xxbs_sem_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_sem_report` (
  `id` varchar(36) NOT NULL,
  `corpid` varchar(45) DEFAULT NULL,
  `adddate` datetime DEFAULT NULL COMMENT '走访日期',
  `amuserid` varchar(45) DEFAULT NULL COMMENT '客户经理',
  `addtime` datetime DEFAULT NULL COMMENT '录入时间',
  `status` varchar(45) DEFAULT NULL COMMENT '推荐产品id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日常信息报送表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_sem_report`
--

LOCK TABLES `xxbs_sem_report` WRITE;
/*!40000 ALTER TABLE `xxbs_sem_report` DISABLE KEYS */;
INSERT INTO `xxbs_sem_report` VALUES ('1007','10001',NULL,'5',NULL,NULL);
/*!40000 ALTER TABLE `xxbs_sem_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_sem_result`
--

DROP TABLE IF EXISTS `xxbs_sem_result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_sem_result` (
  `id` int(11) NOT NULL,
  `productid` varchar(45) DEFAULT NULL COMMENT '营销产品',
  `smereult` varchar(45) DEFAULT NULL COMMENT '营销结果',
  `reportid` varchar(45) DEFAULT NULL,
  `corpid` varchar(45) DEFAULT NULL,
  `amuserid` varchar(45) DEFAULT NULL,
  `addtime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日常上报结果表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_sem_result`
--

LOCK TABLES `xxbs_sem_result` WRITE;
/*!40000 ALTER TABLE `xxbs_sem_result` DISABLE KEYS */;
/*!40000 ALTER TABLE `xxbs_sem_result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xxbs_specline`
--

DROP TABLE IF EXISTS `xxbs_specline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xxbs_specline` (
  `ispcode` varchar(45) NOT NULL COMMENT '集团单位编码',
  `hasline` varchar(45) DEFAULT NULL COMMENT '是否使用专线',
  `isptype` varchar(45) DEFAULT NULL COMMENT '运营商',
  `linetype` varchar(45) DEFAULT NULL,
  `bitsize` int(11) DEFAULT NULL COMMENT '带宽',
  `feemonth` varchar(45) DEFAULT NULL COMMENT '月资费',
  `paytype` varchar(45) DEFAULT NULL,
  `signdate` datetime DEFAULT NULL COMMENT '协议签订时期',
  `enddate` datetime DEFAULT NULL COMMENT '到期时间',
  `paydate` datetime DEFAULT NULL COMMENT '本年度应缴费时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `agreeimg` varchar(45) DEFAULT NULL COMMENT '协议扫描',
  PRIMARY KEY (`ispcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专线表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xxbs_specline`
--

LOCK TABLES `xxbs_specline` WRITE;
/*!40000 ALTER TABLE `xxbs_specline` DISABLE KEYS */;
/*!40000 ALTER TABLE `xxbs_specline` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-03 21:47:36
