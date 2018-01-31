/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50613
Source Host           : localhost:3306
Source Database       : xxbs_db

Target Server Type    : MYSQL
Target Server Version : 50613
File Encoding         : 65001

Date: 2016-10-14 20:59:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `data_contact`
-- ----------------------------
DROP TABLE IF EXISTS `data_contact`;
CREATE TABLE `data_contact` (
  `areaname` varchar(100) DEFAULT '县区',
  `ispname` varchar(128) DEFAULT '' COMMENT '集团单位名称',
  `ispcode` varchar(36) DEFAULT NULL COMMENT '集团单位编码',
  `name` varchar(50) DEFAULT NULL,
  `duty` varchar(50) DEFAULT NULL COMMENT '职务',
  `phone` varchar(45) DEFAULT NULL COMMENT '电话号码',
  `isptype` varchar(45) DEFAULT NULL COMMENT '运营商',
  `status` varchar(45) DEFAULT NULL,
  KEY `parentId` (`name`),
  KEY `code` (`ispcode`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通讯录——data';

-- ----------------------------
-- Records of data_contact
-- ----------------------------
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES (null, null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES (null, null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '电信', 'admin');
INSERT INTO `data_contact` VALUES ('3700', null, null, null, null, null, '移动', 'admin');
INSERT INTO `data_contact` VALUES ('3702', null, null, null, null, null, '联通', 'admin');
INSERT INTO `data_contact` VALUES ('3704', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3706', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3708', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3709', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3710', null, null, null, null, null, null, 'admin');
INSERT INTO `data_contact` VALUES ('3711', null, null, null, null, null, null, 'admin');

-- ----------------------------
-- Table structure for `data_info`
-- ----------------------------
DROP TABLE IF EXISTS `data_info`;
CREATE TABLE `data_info` (
  `areaname` varchar(45) DEFAULT NULL,
  `knowdate` datetime DEFAULT NULL,
  `ispcode` varchar(36) DEFAULT NULL,
  `ispname` varchar(100) DEFAULT NULL,
  `usrename` varchar(45) DEFAULT NULL,
  `pname` varchar(100) DEFAULT NULL,
  `pcontent` varchar(500) DEFAULT NULL,
  `money` float(12,0) DEFAULT NULL,
  `startdate` datetime DEFAULT NULL,
  `negotiatedate` datetime DEFAULT NULL,
  `moneysource` varchar(100) DEFAULT NULL,
  `partner` varchar(200) DEFAULT NULL COMMENT '合作厂家',
  `isplane` varchar(10) DEFAULT NULL,
  `planetype` varchar(10) DEFAULT NULL COMMENT '固话厂家',
  `planenum` int(10) DEFAULT NULL,
  `fee` float(12,0) DEFAULT NULL,
  `enddate` datetime DEFAULT NULL,
  `iscx` varchar(40) DEFAULT NULL,
  `isydgj` varchar(10) DEFAULT NULL,
  `isyqjk` varchar(10) DEFAULT NULL,
  `isyzj` varchar(10) DEFAULT NULL,
  `isqyjz` varchar(10) DEFAULT NULL,
  `isxtbg` varchar(10) DEFAULT NULL,
  `isjttxl` varchar(10) DEFAULT NULL,
  `iswqt` varchar(10) DEFAULT NULL,
  `ismdm` varchar(10) DEFAULT NULL,
  `other` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of data_info
-- ----------------------------
INSERT INTO `data_info` VALUES ('业务室', '2016-03-23 00:00:00', 'code3', '测试集团1', '张三', '测试项目', '测试建设内容', '23', '2016-03-23 00:00:00', '2016-03-23 00:00:00', '财务支出', '中国软通', '是', '电信', '23', '60', '2016-04-22 00:00:00', 'QQ', '是', '是', '是', '是', '是', '是', '是', '是', null);
INSERT INTO `data_info` VALUES ('肃州区', '2016-03-23 00:00:00', 'code4', '测试集团2', '李四', '测试项目2', '建设内容3', '55', '2016-03-23 00:00:00', '2016-03-25 00:00:00', '资金自筹', '国际合作', '否', '联通', '99', '80', '2016-04-22 00:00:00', '微信', '否', '否', '否', '否', '否', '否', '否', '否', null);

-- ----------------------------
-- Table structure for `data_report`
-- ----------------------------
DROP TABLE IF EXISTS `data_report`;
CREATE TABLE `data_report` (
  `areaname` varchar(45) DEFAULT NULL,
  `interviewdate` datetime DEFAULT NULL,
  `ispname` varchar(100) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `terminal` int(11) DEFAULT NULL,
  `fg_flow` int(11) DEFAULT NULL,
  `fg_card` int(11) DEFAULT NULL,
  `app` int(11) DEFAULT NULL,
  `product1` varchar(100) DEFAULT NULL,
  `result1` varchar(30) DEFAULT NULL,
  `product2` varchar(100) DEFAULT NULL,
  `result2` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of data_report
-- ----------------------------

-- ----------------------------
-- Table structure for `data_specline`
-- ----------------------------
DROP TABLE IF EXISTS `data_specline`;
CREATE TABLE `data_specline` (
  `areaname` varchar(100) DEFAULT NULL COMMENT '县市',
  `ispname` varchar(100) DEFAULT NULL COMMENT '集团单位名称',
  `ispcode` varchar(45) DEFAULT NULL COMMENT '集团单位编码',
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
  `agreeimg` varchar(500) DEFAULT NULL COMMENT '协议扫描',
  `customer` varchar(50) DEFAULT NULL,
  `yeartariff` varchar(20) DEFAULT NULL COMMENT ' 年资费',
  `pactnumber` varchar(50) DEFAULT NULL COMMENT '合同编号',
  `pactname` varchar(100) DEFAULT NULL COMMENT '合同名称',
  `pactvalidity` varchar(50) DEFAULT NULL COMMENT '合同有效期',
  `worknumber` varchar(50) DEFAULT NULL COMMENT '工单编号',
  `speclinename` varchar(50) DEFAULT NULL COMMENT '计划建设平台专线名称',
  `esopnumber` varchar(50) DEFAULT NULL COMMENT 'esop专线编号',
  `esoptheme` varchar(50) DEFAULT NULL COMMENT 'esop专线主题',
  `opentime` datetime DEFAULT NULL COMMENT '实际开通时间',
  `bossnumber` varchar(50) DEFAULT NULL COMMENT 'BOSS计费号',
  `ftolltime` datetime DEFAULT NULL COMMENT '首次收费时间',
  `ftollsum` float DEFAULT NULL COMMENT '首次收费金额'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专线表';

-- ----------------------------
-- Records of data_specline
-- ----------------------------
INSERT INTO `data_specline` VALUES ('肃州区', '测试单位1', 'code1', '否', '联通', '数据专线', '120', '28', '季度', '2016-04-22 00:00:00', '2016-04-25 00:00:00', '2016-04-28 00:00:00', '备注1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('敦煌', '测试单位2', 'code2', '是', '移动', '视频专线', '30', '40', '年缴', '2016-04-23 00:00:00', '2016-04-26 00:00:00', '2016-04-29 00:00:00', '备注2', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('玉门', '测试单位3', 'code3', '是', '其他', '语音专线', '59', '20', '月缴', '2016-04-24 00:00:00', '2016-04-27 00:00:00', '2016-04-30 00:00:00', '备注3', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('肃州区', '测试单位1', 'code1', '否', '联通', '数据专线', '120', '28', '季度', '2016-04-22 00:00:00', '2016-04-25 00:00:00', '2016-04-28 00:00:00', '备注1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('敦煌', '测试单位2', 'code2', '是', '移动', '视频专线', '30', '40', '年缴', '2016-04-23 00:00:00', '2016-04-26 00:00:00', '2016-04-29 00:00:00', '备注2', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('玉门', '测试单位3', 'code3', '是', '其他', '语音专线', '59', '20', '月缴', '2016-04-24 00:00:00', '2016-04-27 00:00:00', '2016-04-30 00:00:00', '备注3', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('3700', '测试单位1', 'code1', '否', '联通', '数据专线', '120', '28', '季度', '2016-04-22 00:00:00', '2016-04-25 00:00:00', '2016-04-28 00:00:00', '备注1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('3702', '测试单位2', 'code2', '是', '移动', '视频专线', '30', '40', '年缴', '2016-04-23 00:00:00', '2016-04-26 00:00:00', '2016-04-29 00:00:00', '备注2', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('3704', '测试单位3', 'code3', '是', '其他', '语音专线', '59', '20', '月缴', '2016-04-24 00:00:00', '2016-04-27 00:00:00', '2016-04-30 00:00:00', '备注3', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('肃州区', '测试单位1', 'code1', '否', '联通', '数据专线', '120', '28', '季度', '2016-04-22 00:00:00', '2016-04-25 00:00:00', '2016-04-28 00:00:00', '备注1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('敦煌', '测试单位2', 'code2', '是', '移动', '视频专线', '30', '40', '年缴', '2016-04-23 00:00:00', '2016-04-26 00:00:00', '2016-04-29 00:00:00', '备注2', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('玉门', '测试单位3', 'code3', '是', '其他', '语音专线', '59', '20', '月缴', '2016-04-24 00:00:00', '2016-04-27 00:00:00', '2016-04-30 00:00:00', '备注3', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('肃州区', '测试单位1', 'code1', '否', '联通', '数据专线', '120', '28', '季度', '2016-04-22 00:00:00', '2016-04-25 00:00:00', '2016-04-28 00:00:00', '备注1', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('敦煌', '测试单位2', 'code2', '是', '移动', '视频专线', '30', '40', '年缴', '2016-04-23 00:00:00', '2016-04-26 00:00:00', '2016-04-29 00:00:00', '备注2', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('玉门', '测试单位3', 'code3', '是', '其他', '语音专线', '59', '20', '月缴', '2016-04-24 00:00:00', '2016-04-27 00:00:00', '2016-04-30 00:00:00', '备注3', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('3700', '测试单位1', 'code1', '否', '联通', '数据专线', '120', '28', '季度', '2016-04-22 00:00:00', '2016-04-25 00:00:00', '2016-04-28 00:00:00', '备注1', '1', null, '2', '3', '4', '5', '6', '7', '8', '9', null, '11', null, '12');
INSERT INTO `data_specline` VALUES ('3702', '测试单位2', 'code2', '是', '移动', '视频专线', '30', '40', '年缴', '2016-04-23 00:00:00', '2016-04-26 00:00:00', '2016-04-29 00:00:00', '备注2', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('3704', '测试单位3', 'code3', '是', '其他', '语音专线', '59', '20', '月缴', '2016-04-24 00:00:00', '2016-04-27 00:00:00', '2016-04-30 00:00:00', '备注3', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `data_specline` VALUES ('1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `plat_dict_group`
-- ----------------------------
DROP TABLE IF EXISTS `plat_dict_group`;
CREATE TABLE `plat_dict_group` (
  `id` varchar(36) NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `val` varchar(45) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典分类表';

-- ----------------------------
-- Records of plat_dict_group
-- ----------------------------
INSERT INTO `plat_dict_group` VALUES ('1b4411bb-dfb7-4430-9315-015f05e3f448', 'PTYPE', '收费模式', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('1b967051-3d3b-48e7-a269-82aa30989c22', 'ISP_TYPE', '运营商', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('3001', 'HAS_NO', '是否有', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('bfaba2e3-3457-4db8-b918-d1ed65ae4692', 'SOBJ', '服务对象', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('c45fd5a4-8261-425e-b020-64981033224a', 'STYPE', '服务方式', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('c45fd5a4-8261-425e-b020-64981033224b', 'NATURE', '单位性质', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('c45fd5a4-8261-425e-b020-64981033224c', 'SPECLINE_TYPE', '专线类型', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('c45fd5a4-8261-425e-b020-64981033224d', 'ICT_STASTUS', 'ICT状态', null, null, null);
INSERT INTO `plat_dict_group` VALUES ('c45fd5a4-8261-425e-b020-64981033224e', 'FILE_PATH', '文件存放路径', 'C:\\soft\\filepath', null, null);
INSERT INTO `plat_dict_group` VALUES ('c45fd5a4-8261-425e-b020-64981033224f', 'SEM_RESULT', '推荐结果', null, null, null);

-- ----------------------------
-- Table structure for `plat_dict_item`
-- ----------------------------
DROP TABLE IF EXISTS `plat_dict_item`;
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
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COMMENT='字典表';

-- ----------------------------
-- Records of plat_dict_item
-- ----------------------------
INSERT INTO `plat_dict_item` VALUES ('082d002e-ac5f-4647-a23d-fe1da3c5eacd', '', '电话服务', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '电话服务', '8');
INSERT INTO `plat_dict_item` VALUES ('0cc38478-71e2-4d86-8435-d93bdc70c0cf', '', '其他', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '其他', '33');
INSERT INTO `plat_dict_item` VALUES ('1001', null, '移动', '1b967051-3d3b-48e7-a269-82aa30989c22', '1', '移动', '34');
INSERT INTO `plat_dict_item` VALUES ('1002', null, '电信', '1b967051-3d3b-48e7-a269-82aa30989c22', '1', '电信', '35');
INSERT INTO `plat_dict_item` VALUES ('1003', null, '联通', '1b967051-3d3b-48e7-a269-82aa30989c22', '1', '联通', '36');
INSERT INTO `plat_dict_item` VALUES ('1c155788-1408-4ea5-88ff-012265da5f6b', '', '沙龙', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '沙龙', '15');
INSERT INTO `plat_dict_item` VALUES ('1c8fc543-ef61-4579-884c-45b7d5111065', '', '个人咨询', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '个人咨询', '13');
INSERT INTO `plat_dict_item` VALUES ('2713d846-55d1-4eef-a798-dc0daf3bfd3e', '', '上门服务', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '上门服务', '9');
INSERT INTO `plat_dict_item` VALUES ('30011', '', '有', '3001', '1', null, '43');
INSERT INTO `plat_dict_item` VALUES ('30012', null, '无', '3001', '1', null, '44');
INSERT INTO `plat_dict_item` VALUES ('54c8ad35-5794-49e9-935c-0be24a75bb43', '', '元/人', '1b4411bb-dfb7-4430-9315-015f05e3f448', '1', '元/人', '21');
INSERT INTO `plat_dict_item` VALUES ('5de69d17-4107-4226-bbb5-7c8783626615', '', '大型企业', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '大型企业', '27');
INSERT INTO `plat_dict_item` VALUES ('71bf405a-ecd5-41b0-a178-95edcd329033', '', '创业个人或团队', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '创业个人或团队', '28');
INSERT INTO `plat_dict_item` VALUES ('820c0ff2-9aaf-4d26-b6db-25cebfd462d4', '', '中型企业', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '中型企业', '26');
INSERT INTO `plat_dict_item` VALUES ('9c78da52-33f8-4464-b81b-275a4c16d673', '', '网络服务', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '网络服务', '12');
INSERT INTO `plat_dict_item` VALUES ('9dd99754-877f-4b60-8b7a-b9bb00cbac96', '', '刊物服务', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '刊物服务', '10');
INSERT INTO `plat_dict_item` VALUES ('9fce64d8-f64a-48ac-abab-50d0a94b5750', '', '个体工商户', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '个体工商户', '29');
INSERT INTO `plat_dict_item` VALUES ('a0c45a77-ee11-4588-ab39-140fe78f9e64', '', '元/月', '1b4411bb-dfb7-4430-9315-015f05e3f448', '1', '元/月', '18');
INSERT INTO `plat_dict_item` VALUES ('aec4ce9c-7cbc-4536-839e-ea8791c84e4e', '', '元/次', '1b4411bb-dfb7-4430-9315-015f05e3f448', '1', '元/次', '20');
INSERT INTO `plat_dict_item` VALUES ('b1a30941-6ae0-4ba0-9d00-1ef389404480', '', '其他服务', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '其他服务', '16');
INSERT INTO `plat_dict_item` VALUES ('bebce1fd-4791-4cbe-a12d-509b4598406f', '', '事业单位', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '事业单位', '30');
INSERT INTO `plat_dict_item` VALUES ('c3c5b834-2658-4d22-8bc9-abd7680c4550', '', '元/期', '1b4411bb-dfb7-4430-9315-015f05e3f448', '1', '元/期', '22');
INSERT INTO `plat_dict_item` VALUES ('c82439e4-424a-43de-ad7e-e43ed61aa78a', '', '元/年', '1b4411bb-dfb7-4430-9315-015f05e3f448', '1', '元/年', '19');
INSERT INTO `plat_dict_item` VALUES ('cc3d01e2-c2f5-498e-aafc-8fed328de0cc', '', '小型企业', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '小型企业', '25');
INSERT INTO `plat_dict_item` VALUES ('cdb5636b-1f81-4de4-a361-9bff4276daa0', '', '民办非企业', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '民办非企业', '32');
INSERT INTO `plat_dict_item` VALUES ('d16910d9-6ab2-43d2-8657-5c1bb6ef6135', '', '大讲坛', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '大讲坛', '14');
INSERT INTO `plat_dict_item` VALUES ('d4d8a5bd-34ef-498b-84c1-3b0c7fabdb67', '', '微型企业', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '微型企业', '24');
INSERT INTO `plat_dict_item` VALUES ('ddc73978-3b93-442e-ae1e-8ff917458745', '', '柜台式服务', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '柜台式服务', '7');
INSERT INTO `plat_dict_item` VALUES ('e7296221-275a-4805-852d-56934f69a588', '', '社会团体', 'bfaba2e3-3457-4db8-b918-d1ed65ae4692', '1', '社会团体', '31');
INSERT INTO `plat_dict_item` VALUES ('eb92a0f2-0371-46b1-96da-bebb42c208bc', '', '元/个', '1b4411bb-dfb7-4430-9315-015f05e3f448', '1', '元/个', '23');
INSERT INTO `plat_dict_item` VALUES ('f22f2371-5921-4795-8533-b919af611aeb', '', '信函服务', 'c45fd5a4-8261-425e-b020-64981033224a', '1', '信函服务', '11');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99261', '', '元/日', '1b4411bb-dfb7-4430-9315-015f05e3f448', '1', '元/日', '17');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99262', null, '语音专线', 'c45fd5a4-8261-425e-b020-64981033224c', '1', '语音专线', '38');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99263', null, '数据专线', 'c45fd5a4-8261-425e-b020-64981033224c', '1', '数据专线', '39');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99264', null, '进行中', 'c45fd5a4-8261-425e-b020-64981033224d', '1', '进行中', '40');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99265', null, '结束', 'c45fd5a4-8261-425e-b020-64981033224d', '1', '结束', '41');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99266', null, '关闭', 'c45fd5a4-8261-425e-b020-64981033224d', '1', '关闭', '42');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99267', null, '成功推荐', 'c45fd5a4-8261-425e-b020-64981033224f', '1', '成功推荐', '45');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99268', null, '后续跟进', 'c45fd5a4-8261-425e-b020-64981033224f', '1', '后续跟进', '47');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99269', null, '推荐失败', 'c45fd5a4-8261-425e-b020-64981033224f', '1', '推荐失败', '49');
INSERT INTO `plat_dict_item` VALUES ('f7aefbe1-36b5-4a5a-bdb9-13a2b3f99270', null, '互联网专线', 'c45fd5a4-8261-425e-b020-64981033224c', '1', '互联网专线', '50');

-- ----------------------------
-- Table structure for `plat_sys_app`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_app`;
CREATE TABLE `plat_sys_app` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `app_key` varchar(100) DEFAULT NULL,
  `app_secret` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_app_app_key` (`app_key`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plat_sys_app
-- ----------------------------
INSERT INTO `plat_sys_app` VALUES ('1', '中心服务器', '645ba616-370a-43a8-a8e0-993e7a590cf0', 'bb74abb6-bae0-47dd-a7b1-9571ea3a0f33', '1');
INSERT INTO `plat_sys_app` VALUES ('2', 'APP-1', '645ba612-370a-43a8-a8e0-993e7a590cf0', 'bb74abb2-bae0-47dd-a7b1-9571ea3a0f33', '1');
INSERT INTO `plat_sys_app` VALUES ('3', 'APP-2', '645ba613-370a-43a8-a8e0-993e7a590cf0', 'bb74abb3-bae0-47dd-a7b1-9571ea3a0f33', '1');

-- ----------------------------
-- Table structure for `plat_sys_area`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_area`;
CREATE TABLE `plat_sys_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` int(11) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `level` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `parentId` (`parentId`),
  KEY `code` (`code`,`parentId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='全国省市区街道(www.52388.com)';

-- ----------------------------
-- Records of plat_sys_area
-- ----------------------------
INSERT INTO `plat_sys_area` VALUES ('1', '937', '0', '酒泉市', '11');
INSERT INTO `plat_sys_area` VALUES ('2', '3700', '1', '肃州区', '12');
INSERT INTO `plat_sys_area` VALUES ('3', '3708', '1', '金塔县', '12');
INSERT INTO `plat_sys_area` VALUES ('4', '3706', '1', '瓜州县', '12');
INSERT INTO `plat_sys_area` VALUES ('5', '3709', '1', '肃北县', '12');
INSERT INTO `plat_sys_area` VALUES ('6', '3710', '1', '阿克塞', '12');
INSERT INTO `plat_sys_area` VALUES ('7', '3704', '1', '玉门市', '12');
INSERT INTO `plat_sys_area` VALUES ('8', '3702', '1', '敦煌市', '12');
INSERT INTO `plat_sys_area` VALUES ('9', '3700', '1', '业务室', '12');
INSERT INTO `plat_sys_area` VALUES ('10', '3711', '1', '东风基地', '12');

-- ----------------------------
-- Table structure for `plat_sys_auth`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_auth`;
CREATE TABLE `plat_sys_auth` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `app_id` bigint(20) DEFAULT NULL,
  `role_ids` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sys_user_app_roles_user_id_app_id` (`user_id`,`app_id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plat_sys_auth
-- ----------------------------
INSERT INTO `plat_sys_auth` VALUES ('1', '1', '1', '1,');
INSERT INTO `plat_sys_auth` VALUES ('2', '1', '2', '1,2');
INSERT INTO `plat_sys_auth` VALUES ('3', '1', '3', '1,3');
INSERT INTO `plat_sys_auth` VALUES ('4', '5', '1', '2,3,4,');
INSERT INTO `plat_sys_auth` VALUES ('6', '13909373665', '1', '1,5,');
INSERT INTO `plat_sys_auth` VALUES ('7', '13993736363', '1', '1,5,');
INSERT INTO `plat_sys_auth` VALUES ('8', '13909373669', '1', '1,5,');
INSERT INTO `plat_sys_auth` VALUES ('9', '18809371120', '1', '1,5,');
INSERT INTO `plat_sys_auth` VALUES ('10', '18893611188', '1', '1,5,');
INSERT INTO `plat_sys_auth` VALUES ('11', '13639376066', '1', '1,');
INSERT INTO `plat_sys_auth` VALUES ('12', '13679378890', '1', '1,5,');
INSERT INTO `plat_sys_auth` VALUES ('13', '13993758500', '1', '1,5,');
INSERT INTO `plat_sys_auth` VALUES ('14', '18809378884', '1', '3,5,');
INSERT INTO `plat_sys_auth` VALUES ('15', '18809373860', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('16', '13893736121', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('17', '13893725061', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('18', '13830786340', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('19', '15809379897', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('20', '13893759995', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('21', '13909376563', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('22', '13830161967', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('23', '13893757555', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('24', '13830759797', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('25', '13993718020', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('26', '13993718822', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('27', '15109373141', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('28', '13909375765', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('29', '13993757699', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('30', '13993719688', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('31', '18893617779', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('32', '13830750905', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('33', '13909377285', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('34', '13993739220', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('35', '13830759895', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('36', '13830728682', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('37', '13909375051', '1', '3,5,');
INSERT INTO `plat_sys_auth` VALUES ('38', '13830721613', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('39', '13893771862', '1', '3,5,');
INSERT INTO `plat_sys_auth` VALUES ('40', '13893771867', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('41', '13830755033', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('42', '13679390681', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('43', '13893725031', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('44', '13893725087', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('45', '13809373766', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('46', '13809372188', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('47', '15095660006', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('48', '13893716898', '1', '3,5,');
INSERT INTO `plat_sys_auth` VALUES ('49', '15095660828', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('50', '13830770998', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('51', '13893706685', '1', '4,1,');
INSERT INTO `plat_sys_auth` VALUES ('52', '13679375786', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('53', '13893770906', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('54', '13830759192', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('55', '13909375188', '1', '3,5,');
INSERT INTO `plat_sys_auth` VALUES ('56', '13993755005', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('57', '15095650855', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('58', '13893722212', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('59', '13830779155', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('60', '13893720999', '1', '3,5,');
INSERT INTO `plat_sys_auth` VALUES ('61', '13909377055', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('62', '13993730503', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('63', '13993720026', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('64', '18793791119', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('65', '13830788928', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('66', '13893710955', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('67', '13993710088', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('68', '13830755032', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('69', '13679378386', '1', '3,5,');
INSERT INTO `plat_sys_auth` VALUES ('70', '13830189050', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('71', '13830739898', '1', '4,');
INSERT INTO `plat_sys_auth` VALUES ('72', '18809379798', '1', '4,');

-- ----------------------------
-- Table structure for `plat_sys_config`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_config`;
CREATE TABLE `plat_sys_config` (
  `code` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `configValue` varchar(500) DEFAULT NULL,
  `orderNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置';

-- ----------------------------
-- Records of plat_sys_config
-- ----------------------------
INSERT INTO `plat_sys_config` VALUES ('TEMPLETE_PATH', null, 'F:\\\\plat\\\\templet\\\\', null);
INSERT INTO `plat_sys_config` VALUES ('TEST', '测试项', '测试内容', '1');

-- ----------------------------
-- Table structure for `plat_sys_org`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_org`;
CREATE TABLE `plat_sys_org` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_organization_parent_id` (`parent_id`),
  KEY `idx_sys_organization_parent_ids` (`parent_ids`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plat_sys_org
-- ----------------------------
INSERT INTO `plat_sys_org` VALUES ('1', '酒泉市移动公司', '0', '0/', '1');
INSERT INTO `plat_sys_org` VALUES ('2', '市公司', '1', '0/1/', '1');
INSERT INTO `plat_sys_org` VALUES ('3', '业务室', '1', '0/1/', '1');
INSERT INTO `plat_sys_org` VALUES ('4', '肃州区', '1', '0/1/', '1');
INSERT INTO `plat_sys_org` VALUES ('5', '敦煌市', '1', '0/1/', '0');
INSERT INTO `plat_sys_org` VALUES ('6', '玉门市', '1', '0/1/', '0');
INSERT INTO `plat_sys_org` VALUES ('7', '瓜州县', '1', '0/1/', '0');
INSERT INTO `plat_sys_org` VALUES ('8', '金塔县', '1', '0/1/', '0');
INSERT INTO `plat_sys_org` VALUES ('9', '肃北县', '1', '0/1/', '0');
INSERT INTO `plat_sys_org` VALUES ('10', '阿克塞县', '1', '0/1/', '0');
INSERT INTO `plat_sys_org` VALUES ('11', '东风基地', '1', '0/1/', '0');

-- ----------------------------
-- Table structure for `plat_sys_resource`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_resource`;
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
) ENGINE=InnoDB AUTO_INCREMENT=9055 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plat_sys_resource
-- ----------------------------
INSERT INTO `plat_sys_resource` VALUES ('301', '客户管理', 'menu', '', '1', '0/1/', '', '1', 'icon02');
INSERT INTO `plat_sys_resource` VALUES ('302', '产品管理', 'menu', '', '1', null, '', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('303', '日常上报', 'menu', ' ', '1', null, '', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('304', '集团专线管理', 'menu', null, '1', null, null, '0', null);
INSERT INTO `plat_sys_resource` VALUES ('305', '集团通讯录管理', 'menu', '', '1', null, '', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('306', 'ICT项目管理', 'menu', null, '1', null, null, '0', null);
INSERT INTO `plat_sys_resource` VALUES ('307', '信息化摸底', 'menu', '', '1', null, '', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('308', '数据上传', 'menu', null, '1', null, null, '0', null);
INSERT INTO `plat_sys_resource` VALUES ('901', '系统管理', 'menu', '', '1', '0/1/', '', '1', 'icon06');
INSERT INTO `plat_sys_resource` VALUES ('902', '用户管理', 'menu', '/user', '901', '0/1/', 'user:*', '1', 'icon03');
INSERT INTO `plat_sys_resource` VALUES ('903', '角色管理', 'menu', '/role', '901', '0/1/', 'role:*', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('904', '组织机构', 'menu', '/org', '901', '0/1/', 'config:*', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('905', '资源管理', 'menu', '/resource', '901', '0/1/', 'resource:*', '1', 'icon04');
INSERT INTO `plat_sys_resource` VALUES ('3071', '客户新增', 'button', '', '301', '0/1/5/501', 'corp:create', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('3072', '客户修改', 'button', '', '301', '0/1/5/501', 'corp:update', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('3073', '客户查看', 'button', '', '301', '0/1/5/501', 'corp:view', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('3074', '客户删除', 'button', '', '301', '0/1/5/501', 'corp:delete', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('3075', '摸底报表', 'menu', '/survey', '307', null, 'survey:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('3076', '数据导入', 'menu', '/survey/dataform', '307', null, 'survey:import', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('7305', '客户列表', 'menu', '/corp', '301', null, 'corp:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('7306', '产品列表', 'menu', '/product', '302', null, 'product:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('7307', '通讯录列表', 'menu', '/contact', '305', null, 'contact:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('7309', '上报统计', 'menu', '/report/item', '303', null, 'report:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('7310', '专线数据库', 'menu', '/specline', '304', null, 'specline:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('7311', '项目列表', 'menu', '/ictproj', '306', null, 'ictproj:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('7312', '产品属性', 'menu', '/prop', '302', null, 'prop:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('8301', '数据上传', 'menu', '/data/dataform', '308', null, 'data:*', '0', null);
INSERT INTO `plat_sys_resource` VALUES ('9021', '用户列表', 'menu', '/user', '902', '0/1/21/', 'user:view', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9022', '用户修改', 'button', '', '902', '0/1/21/', 'user:update', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9023', '用户删除', 'button', '', '902', '0/1/21/', 'user:delete', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9024', '用户新增', 'button', '', '902', '0/1/21/', 'user:create', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9031', '角色新增', 'button', '', '902', '0/1/41/', 'role:create', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9032', '角色修改', 'button', '', '902', '0/1/41/', 'role:update', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9033', '角色删除', 'button', '', '902', '0/1/41/', 'role:delete', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9034', '角色列表', 'menu', '/role', '902', '0/1/41/', 'role:view', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9041', '机构列表', 'menu', '/org', '902', '0/1/61', 'config:view', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9051', '资源新增', 'button', '', '905', '0/1/31/', 'resource:create', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9052', '资源修改', 'button', '', '905', '0/1/31/', 'resource:update', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9053', '资源删除', 'button', '', '905', '0/1/31/', 'resource:delete', '1', null);
INSERT INTO `plat_sys_resource` VALUES ('9054', '资源列表', 'menu', '/resource', '905', '0/1/31/', 'resource:view', '1', null);

-- ----------------------------
-- Table structure for `plat_sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_role`;
CREATE TABLE `plat_sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `resource_ids` varchar(1000) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_sys_role_resource_ids` (`resource_ids`(255))
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plat_sys_role
-- ----------------------------
INSERT INTO `plat_sys_role` VALUES ('1', 'admin', '超级管理员', '301,302,303,304,305,306,307,308,3071,3072,3073,3074,7305,7306,7312,7308,7309,7310,7307,7311,3075,3076,901,902,9021,9022,9023,9024,9031,9032,9033,9034,9041,903,904,905,9051,9052,9053,9054,8301,', '1');
INSERT INTO `plat_sys_role` VALUES ('2', 'YY_QA_C', '市级业务主管', '301,3071,3072,3073,3074,7305,302,7306,7312,303,7308,7309,304,7310,305,7307,306,7311,307,3075,3076,308,8301,', '0');
INSERT INTO `plat_sys_role` VALUES ('3', 'YY_QA_A', '县级业务主管', '301,3071,3072,3073,3074,7305,302,7306,7312,303,7308,7309,304,7310,305,7307,306,7311,307,3075,3076,308,8301,', '0');
INSERT INTO `plat_sys_role` VALUES ('4', 'YY_AM', '客户经理', '301,3071,3072,3073,3074,7305,302,7306,7312,303,7308,7309,304,7310,305,7307,306,7311,307,3075,3076,308,8301,', '0');
INSERT INTO `plat_sys_role` VALUES ('5', 'YY_QA', '业务主管', null, '0');

-- ----------------------------
-- Table structure for `plat_sys_sessions`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_sessions`;
CREATE TABLE `plat_sys_sessions` (
  `id` varchar(200) NOT NULL DEFAULT '',
  `session` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plat_sys_sessions
-- ----------------------------
INSERT INTO `plat_sys_sessions` VALUES ('717d63f5-8abf-40d0-97a5-ecca80c62ea0', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJDcxN2Q2M2Y1LThhYmYtNDBkMC05N2E1LWVjY2E4MGM2MmVhMHNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUyWpz5geHNxAH4AA3cIAAABTJao4ex4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAR0AFBvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfQVVUSEVOVElDQVRFRF9TRVNTSU9OX0tFWXNyABFqYXZhLmxhbmcuQm9vbGVhbs0gcoDVnPruAgABWgAFdmFsdWV4cAF0AAZzaXRlSWRzcgAOamF2YS5sYW5nLkxvbmc7i+SQzI8j3wIAAUoABXZhbHVleHIAEGphdmEubGFuZy5OdW1iZXKGrJUdC5TgiwIAAHhwAAAAAAAAA+l0AAZ1c2VySWRzcQB+AAwAAAAAAAAD6HQATW9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5zdXBwb3J0LkRlZmF1bHRTdWJqZWN0Q29udGV4dF9QUklOQ0lQQUxTX1NFU1NJT05fS0VZc3IAMm9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5TaW1wbGVQcmluY2lwYWxDb2xsZWN0aW9uqH9YJcajCEoDAAFMAA9yZWFsbVByaW5jaXBhbHN0AA9MamF2YS91dGlsL01hcDt4cHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaE1hcDTATlwQbMD7AgABWgALYWNjZXNzT3JkZXJ4cQB+AAY/QAAAAAAADHcIAAAAEAAAAAF0AChjb20uZ3NjY3MuYjJjLnNoaXJvLmNsaWVudC5DbGllbnRSZWFsbV8wc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoU2V02GzXWpXdKh4CAAB4cgARamF2YS51dGlsLkhhc2hTZXS6RIWVlri3NAMAAHhwdwwAAAAQP0AAAAAAAAF0AAVhZG1pbnh4AHcBAXEAfgAWeHh4');
INSERT INTO `plat_sys_sessions` VALUES ('7e6d17b1-b00e-4393-920d-e12f53e92652', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJDdlNmQxN2IxLWIwMGUtNDM5My05MjBkLWUxMmY1M2U5MjY1MnNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx95o6seHNxAH4AA3cIAAABTH3pZBh4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAN0ABFhdXRoYy5mYWxsYmFja1VybHQAJGh0dHA6Ly8xMjcuMC4wLjE6NzA4MC9lYi1zdG9yZS9zdG9yZXQAEXNoaXJvU2F2ZWRSZXF1ZXN0c3IAKWNvbS5nc2Njcy5iMmMuYXBwLmNvcmUuQ2xpZW50U2F2ZWRSZXF1ZXN0ZWbjXB3DOKsCAAVJAARwb3J0TAAHYmFja1VybHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAC2NvbnRleHRQYXRocQB+AAxMAAZkb21haW5xAH4ADEwABnNjaGVtZXEAfgAMeHIAJm9yZy5hcGFjaGUuc2hpcm8ud2ViLnV0aWwuU2F2ZWRSZXF1ZXN0r848rXmCyroCAANMAAZtZXRob2RxAH4ADEwAC3F1ZXJ5U3RyaW5ncQB+AAxMAApyZXF1ZXN0VVJJcQB+AAx4cHQAA0dFVHB0AAovZWItc3RvcmUvAAAbqHB0AAkvZWItc3RvcmV0AAkxMjcuMC4wLjF0AARodHRwdABNb3JnLmFwYWNoZS5zaGlyby5zdWJqZWN0LnN1cHBvcnQuRGVmYXVsdFN1YmplY3RDb250ZXh0X1BSSU5DSVBBTFNfU0VTU0lPTl9LRVlzcgAyb3JnLmFwYWNoZS5zaGlyby5zdWJqZWN0LlNpbXBsZVByaW5jaXBhbENvbGxlY3Rpb26of1glxqMISgMAAUwAD3JlYWxtUHJpbmNpcGFsc3QAD0xqYXZhL3V0aWwvTWFwO3hwc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoTWFwNMBOXBBswPsCAAFaAAthY2Nlc3NPcmRlcnhxAH4ABj9AAAAAAAAMdwgAAAAQAAAAAXQAJGNvbS5nc2Njcy5iMmMucGxhdC5yZWFsbS5Vc2VyUmVhbG1fMHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaFNldNhs11qV3SoeAgAAeHIAEWphdmEudXRpbC5IYXNoU2V0ukSFlZa4tzQDAAB4cHcMAAAAED9AAAAAAAABdAAFYWRtaW54eAB3AQFxAH4AGXh4eA==');
INSERT INTO `plat_sys_sessions` VALUES ('a0535220-82c1-43c1-b12f-7be8a1b12769', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGEwNTM1MjIwLTgyYzEtNDNjMS1iMTJmLTdiZThhMWIxMjc2OXNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUzlEwvKeHNxAH4AA3cIAAABTOU9Blp4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAR0AFBvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfQVVUSEVOVElDQVRFRF9TRVNTSU9OX0tFWXNyABFqYXZhLmxhbmcuQm9vbGVhbs0gcoDVnPruAgABWgAFdmFsdWV4cAF0AAZzaXRlSWRzcgAOamF2YS5sYW5nLkxvbmc7i+SQzI8j3wIAAUoABXZhbHVleHIAEGphdmEubGFuZy5OdW1iZXKGrJUdC5TgiwIAAHhwAAAAAAAAA+l0AAZ1c2VySWRzcQB+AAwAAAAAAAAD6HQATW9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5zdXBwb3J0LkRlZmF1bHRTdWJqZWN0Q29udGV4dF9QUklOQ0lQQUxTX1NFU1NJT05fS0VZc3IAMm9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5TaW1wbGVQcmluY2lwYWxDb2xsZWN0aW9uqH9YJcajCEoDAAFMAA9yZWFsbVByaW5jaXBhbHN0AA9MamF2YS91dGlsL01hcDt4cHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaE1hcDTATlwQbMD7AgABWgALYWNjZXNzT3JkZXJ4cQB+AAY/QAAAAAAADHcIAAAAEAAAAAF0AChjb20uZ3NjY3MuYjJjLnNoaXJvLmNsaWVudC5DbGllbnRSZWFsbV8wc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoU2V02GzXWpXdKh4CAAB4cgARamF2YS51dGlsLkhhc2hTZXS6RIWVlri3NAMAAHhwdwwAAAAQP0AAAAAAAAF0AAVhZG1pbnh4AHcBAXEAfgAWeHh4');
INSERT INTO `plat_sys_sessions` VALUES ('a9218085-116a-47b4-935c-a35f659aec44', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGE5MjE4MDg1LTExNmEtNDdiNC05MzVjLWEzNWY2NTlhZWM0NHNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUzlRvQ7eHNxAH4AA3cIAAABTOVObex4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAR0AFBvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfQVVUSEVOVElDQVRFRF9TRVNTSU9OX0tFWXNyABFqYXZhLmxhbmcuQm9vbGVhbs0gcoDVnPruAgABWgAFdmFsdWV4cAF0AAZzaXRlSWRzcgAOamF2YS5sYW5nLkxvbmc7i+SQzI8j3wIAAUoABXZhbHVleHIAEGphdmEubGFuZy5OdW1iZXKGrJUdC5TgiwIAAHhwAAAAAAAAA+l0AAZ1c2VySWRzcQB+AAwAAAAAAAAD6HQATW9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5zdXBwb3J0LkRlZmF1bHRTdWJqZWN0Q29udGV4dF9QUklOQ0lQQUxTX1NFU1NJT05fS0VZc3IAMm9yZy5hcGFjaGUuc2hpcm8uc3ViamVjdC5TaW1wbGVQcmluY2lwYWxDb2xsZWN0aW9uqH9YJcajCEoDAAFMAA9yZWFsbVByaW5jaXBhbHN0AA9MamF2YS91dGlsL01hcDt4cHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaE1hcDTATlwQbMD7AgABWgALYWNjZXNzT3JkZXJ4cQB+AAY/QAAAAAAADHcIAAAAEAAAAAF0AChjb20uZ3NjY3MuYjJjLnNoaXJvLmNsaWVudC5DbGllbnRSZWFsbV8wc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoU2V02GzXWpXdKh4CAAB4cgARamF2YS51dGlsLkhhc2hTZXS6RIWVlri3NAMAAHhwdwwAAAAQP0AAAAAAAAF0AAVhZG1pbnh4AHcBAXEAfgAWeHh4');
INSERT INTO `plat_sys_sessions` VALUES ('acbab26a-148d-4113-9ce6-ff469436ca83', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGFjYmFiMjZhLTE0OGQtNDExMy05Y2U2LWZmNDY5NDM2Y2E4M3NyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUyRW5JoeHNxAH4AA3cIAAABTJFeX9x4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAJ0ABFhdXRoYy5mYWxsYmFja1VybHQAJGh0dHA6Ly8xMjcuMC4wLjE6NzA4MC9lYi1zdG9yZS9zdG9yZXQAEXNoaXJvU2F2ZWRSZXF1ZXN0c3IAKWNvbS5nc2Njcy5iMmMuYXBwLmNvcmUuQ2xpZW50U2F2ZWRSZXF1ZXN0ZWbjXB3DOKsCAAVJAARwb3J0TAAHYmFja1VybHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAC2NvbnRleHRQYXRocQB+AAxMAAZkb21haW5xAH4ADEwABnNjaGVtZXEAfgAMeHIAJm9yZy5hcGFjaGUuc2hpcm8ud2ViLnV0aWwuU2F2ZWRSZXF1ZXN0r848rXmCyroCAANMAAZtZXRob2RxAH4ADEwAC3F1ZXJ5U3RyaW5ncQB+AAxMAApyZXF1ZXN0VVJJcQB+AAx4cHQAA0dFVHB0AAovZWItc3RvcmUvAAAbqHB0AAkvZWItc3RvcmV0AAkxMjcuMC4wLjF0AARodHRweHg=');
INSERT INTO `plat_sys_sessions` VALUES ('bf4a234c-067b-4da7-bc0a-d9d69d5be112', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGJmNGEyMzRjLTA2N2ItNGRhNy1iYzBhLWQ5ZDY5ZDViZTExMnNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx9+Dg0eHNxAH4AA3cIAAABTH4VILh4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAAAXcIAAAAAgAAAAJ0ABFhdXRoYy5mYWxsYmFja1VybHQAJGh0dHA6Ly8xMjcuMC4wLjE6NzA4MC9lYi1zdG9yZS9zdG9yZXQAEXNoaXJvU2F2ZWRSZXF1ZXN0c3IAKWNvbS5nc2Njcy5iMmMuYXBwLmNvcmUuQ2xpZW50U2F2ZWRSZXF1ZXN0ZWbjXB3DOKsCAAVJAARwb3J0TAAHYmFja1VybHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAC2NvbnRleHRQYXRocQB+AAxMAAZkb21haW5xAH4ADEwABnNjaGVtZXEAfgAMeHIAJm9yZy5hcGFjaGUuc2hpcm8ud2ViLnV0aWwuU2F2ZWRSZXF1ZXN0r848rXmCyroCAANMAAZtZXRob2RxAH4ADEwAC3F1ZXJ5U3RyaW5ncQB+AAxMAApyZXF1ZXN0VVJJcQB+AAx4cHQAA0dFVHB0AAovZWItc3RvcmUvAAAbqHB0AAkvZWItc3RvcmV0AAkxMjcuMC4wLjF0AARodHRweHg=');
INSERT INTO `plat_sys_sessions` VALUES ('c9c177f1-3f5e-4dc6-a75e-39b9f1056d66', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIAW3QAJGM5YzE3N2YxLTNmNWUtNGRjNi1hNzVlLTM5YjlmMTA1NmQ2NnNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx9mEQdeHNxAH4AA3cIAAABTH2fP2R4dxMAAAAAABt3QAAJMTI3LjAuMC4xeA==');
INSERT INTO `plat_sys_sessions` VALUES ('d4f138fb-0a7e-45e7-a0b3-b7eb1ad2bbda', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGQ0ZjEzOGZiLTBhN2UtNDVlNy1hMGIzLWI3ZWIxYWQyYmJkYXNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUyTQDX0eHNxAH4AA3cIAAABTJNA8Gp4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAF0AE1vcmcuYXBhY2hlLnNoaXJvLnN1YmplY3Quc3VwcG9ydC5EZWZhdWx0U3ViamVjdENvbnRleHRfUFJJTkNJUEFMU19TRVNTSU9OX0tFWXNyADJvcmcuYXBhY2hlLnNoaXJvLnN1YmplY3QuU2ltcGxlUHJpbmNpcGFsQ29sbGVjdGlvbqh/WCXGowhKAwABTAAPcmVhbG1QcmluY2lwYWxzdAAPTGphdmEvdXRpbC9NYXA7eHBzcgAXamF2YS51dGlsLkxpbmtlZEhhc2hNYXA0wE5cEGzA+wIAAVoAC2FjY2Vzc09yZGVyeHEAfgAGP0AAAAAAAAx3CAAAABAAAAABdAAoY29tLmdzY2NzLmIyYy5zaGlyby5jbGllbnQuQ2xpZW50UmVhbG1fMHNyABdqYXZhLnV0aWwuTGlua2VkSGFzaFNldNhs11qV3SoeAgAAeHIAEWphdmEudXRpbC5IYXNoU2V0ukSFlZa4tzQDAAB4cHcMAAAAED9AAAAAAAABdAAFYWRtaW54eAB3AQFxAH4ADXh4eA==');
INSERT INTO `plat_sys_sessions` VALUES ('f89dfd82-953e-4c32-bdc8-6615c07fb32d', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIA23QAJGY4OWRmZDgyLTk1M2UtNGMzMi1iZGM4LTY2MTVjMDdmYjMyZHNyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx0rB/IeHNxAH4AA3cIAAABTHSz7St4dxMAAAAAABt3QAAJMTI3LjAuMC4xc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAJ0ABFhdXRoYy5mYWxsYmFja1VybHQAI2h0dHA6Ly8xMjcuMC4wLjE6OTA4MC9lYi1zaXRlL2luZGV4dAARc2hpcm9TYXZlZFJlcXVlc3RzcgApY29tLmdzY2NzLmIyYy5hcHAuY29yZS5DbGllbnRTYXZlZFJlcXVlc3RlZuNcHcM4qwIABUkABHBvcnRMAAdiYWNrVXJsdAASTGphdmEvbGFuZy9TdHJpbmc7TAALY29udGV4dFBhdGhxAH4ADEwABmRvbWFpbnEAfgAMTAAGc2NoZW1lcQB+AAx4cgAmb3JnLmFwYWNoZS5zaGlyby53ZWIudXRpbC5TYXZlZFJlcXVlc3SvzjyteYLKugIAA0wABm1ldGhvZHEAfgAMTAALcXVlcnlTdHJpbmdxAH4ADEwACnJlcXVlc3RVUklxAH4ADHhwdAADR0VUcHQADi9lYi1zaXRlL2xvZ2luAAAjeHB0AAgvZWItc2l0ZXQACTEyNy4wLjAuMXQABGh0dHB4eA==');
INSERT INTO `plat_sys_sessions` VALUES ('fd929280-80f6-4d60-ae1c-415803dafdac', 'rO0ABXNyACpvcmcuYXBhY2hlLnNoaXJvLnNlc3Npb24ubWd0LlNpbXBsZVNlc3Npb26dHKG41YxibgMAAHhwdwIAW3QAJGZkOTI5MjgwLTgwZjYtNGQ2MC1hZTFjLTQxNTgwM2RhZmRhY3NyAA5qYXZhLnV0aWwuRGF0ZWhqgQFLWXQZAwAAeHB3CAAAAUx9v0pgeHNxAH4AA3cIAAABTH3F57t4dxMAAAAAABt3QAAJMTI3LjAuMC4xeA==');

-- ----------------------------
-- Table structure for `plat_sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `plat_sys_user`;
CREATE TABLE `plat_sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `orgid` bigint(20) DEFAULT NULL COMMENT '所在部门',
  `areaid` int(11) DEFAULT NULL COMMENT '所在地域',
  `title` varchar(45) DEFAULT NULL,
  `account` varchar(100) DEFAULT NULL COMMENT '登录帐号',
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_user_username` (`account`),
  KEY `idx_sys_user_organization_id` (`orgid`)
) ENGINE=InnoDB AUTO_INCREMENT=18893617780 DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
-- Records of plat_sys_user
-- ----------------------------
INSERT INTO `plat_sys_user` VALUES ('1', '4', null, '系统管理员', 'admin', 'a4b8817ceb1b135ffe66b3b4fb405ab4', 'ec22510e68d99b04b343e47c3fe530bd', '0');
INSERT INTO `plat_sys_user` VALUES ('5', '1', null, '测试A', 'testA', 'e38937d89f98ad9950464e6f9a7ec329', '02f9f985d547051191343e3d2e468881', '0');
INSERT INTO `plat_sys_user` VALUES ('8', '2', null, '测试B', 'testB', '98049908797e3f4536406c510c5e4fc0', '6e24491a4ec8f69b9683dff1b9cd70a3', '0');
INSERT INTO `plat_sys_user` VALUES ('13639376066', '2', '1', '苏波', '13639376066', '24b6967f3aaf6ac621742e0379969e80', 'd66f4684283f14f5ae41a4155890c4ee', '0');
INSERT INTO `plat_sys_user` VALUES ('13679375786', '6', '7', '武尹婕', '13679375786', 'b04c5d80b97ff66d2b047451aea4cc7a', 'a1d53242430ceb1f5e60b38866af49f0', '0');
INSERT INTO `plat_sys_user` VALUES ('13679378386', '11', '10', '任金利', '13679378386', '40f43e989b7a14df7e986f9aa67a4360', '0181e8dd19596b3506eefb045b9bc655', '0');
INSERT INTO `plat_sys_user` VALUES ('13679378890', '2', '1', '李毛毛', '13679378890', 'd07f0e24d96a2d41d956e47c9f29ed4e', '007fa82fe4f125877631eb8580031159', '0');
INSERT INTO `plat_sys_user` VALUES ('13679390681', '5', '8', '张晶', '13679390681', '0a1f65334fefe112909b40fad4cb7cbf', 'a935a269d75389464a16375c8eebad70', '0');
INSERT INTO `plat_sys_user` VALUES ('13809372188', '5', '8', '赵海燕', '13809372188', '3355c87cbd66d49cf14ead78406b6255', '91d41c2557d95c3e50489dd42379df2b', '0');
INSERT INTO `plat_sys_user` VALUES ('13809373766', '5', '8', '铁凤', '13809373766', '7a12ce282fb7cf71d84a4fb216dcfb6d', '20e912e7212926217cf5afc2cd81f321', '0');
INSERT INTO `plat_sys_user` VALUES ('13830161967', '4', '2', '殷艳琴', '13830161967', '8cc2d369f26bf3f0d179ec3429c4ba1c', '5eef1e49197bc690d472a907dd65fd60', '0');
INSERT INTO `plat_sys_user` VALUES ('13830189050', '11', '10', '杨田爱', '13830189050', '4d1294be9909b1283122316a25c0863f', '15e090db970def836ef5ed5cd3c848bc', '0');
INSERT INTO `plat_sys_user` VALUES ('13830721613', '3', '9', '赵莉', '13830721613', 'de7ff921386685c4b5faf20b40bd6b26', '9ceb155080a381c18857f92f5a65c72d', '0');
INSERT INTO `plat_sys_user` VALUES ('13830728682', '3', '9', '李亮', '13830728682', '6ce0b97c6f62b48c5b9ea8d70b7f961f', '245472114fb7f06e48a6ef0c49b9bc39', '0');
INSERT INTO `plat_sys_user` VALUES ('13830739898', '11', '10', '杜芳', '13830739898', '630db504f7ef03ba1dda3c9d74837764', 'cc30b153686df859e60d2d69cef6da56', '0');
INSERT INTO `plat_sys_user` VALUES ('13830750905', '3', '9', '刘燕（小）', '13830750905', '43b70e0b693b0a9aab6fe2570172085b', '4920f1765040190bd61f61bba6461ee2', '0');
INSERT INTO `plat_sys_user` VALUES ('13830755032', '10', '6', '马宏菊', '13830755032', '30e8b7b86ae5bd52eeacc6eefde45f68', '3574093caabef3a0e9340fadd4627051', '0');
INSERT INTO `plat_sys_user` VALUES ('13830755033', '5', '8', '陈晓丽', '13830755033', '90da86e0dbd1455ceac518d371b3061e', '0402b6a6ee3b80af6b943e7c9fb1a0e6', '0');
INSERT INTO `plat_sys_user` VALUES ('13830759192', '6', '7', '贺效', '13830759192', '91cb7056d3e3033da256d0489c2c3a46', 'd300ff24ad7328159017ce4ae6465c48', '0');
INSERT INTO `plat_sys_user` VALUES ('13830759797', '4', '2', '杨升', '13830759797', 'eb6cead2dbc48017fec4e9bfff54d95a', 'ff72ce23df48fa1f6ce17038e14e2c0d', '0');
INSERT INTO `plat_sys_user` VALUES ('13830759895', '3', '9', '车海伟', '13830759895', 'd14972cbebed5b41b07f2a8571eee147', '015428a35a905219f4302259f3ea527c', '0');
INSERT INTO `plat_sys_user` VALUES ('13830770998', '6', '7', '侯春蕾', '13830770998', '060d90e43ee46e52a9a9a0eabd623d14', '9f7b2dcebfb083a4c0b080070fcc022d', '0');
INSERT INTO `plat_sys_user` VALUES ('13830779155', '7', '4', '李晓惠', '13830779155', '9ace5ac7450dd54c05f2c3005e8ee4fe', '3487ff429b0a7d3d75a551dfc9b65912', '0');
INSERT INTO `plat_sys_user` VALUES ('13830786340', '4', '2', '范炜', '13830786340', '6ea93536aa5badae8ac4eb8bc3d57551', '32d28c1cdcadb3fb68ef4f8fa813c48f', '0');
INSERT INTO `plat_sys_user` VALUES ('13830788928', '8', '3', '曹丽', '13830788928', '677637adaaa52fc18075823cd1f2fe94', '4d5fe5657f4d3e2bbabb72d258581ee6', '0');
INSERT INTO `plat_sys_user` VALUES ('13893706685', '6', '7', '巴美玲', '13893706685', 'fe98382d873281a6af267524346bd337', '9583f56c4b84778561a2a3339074dac3', '0');
INSERT INTO `plat_sys_user` VALUES ('13893710955', '9', '5', '路晶', '13893710955', '6a3ba40da2ee52eeb38596e8acb56cb3', 'e527da4c4bbf6559989b10298fb32e24', '0');
INSERT INTO `plat_sys_user` VALUES ('13893716898', '6', '7', '陈建荣', '13893716898', '6a8d70720243ab32de5fe001a2f1cb64', '60feb6d4783a60de8993c8122c8777e0', '0');
INSERT INTO `plat_sys_user` VALUES ('13893720999', '8', '3', '李丽娟', '13893720999', '5122a47bd5e151d65a22b023ba649750', '7560572c2bb5f017cff81d84dd7646e7', '0');
INSERT INTO `plat_sys_user` VALUES ('13893722212', '7', '4', '曹翠霞', '13893722212', 'a0f8e4799463cd395304dd0bf7913ac4', '826017c70dfbf6f83b63c8f6a98a0345', '0');
INSERT INTO `plat_sys_user` VALUES ('13893725031', '5', '8', '朱彩虹', '13893725031', 'e4b49f603139bb6fc152936069c576dd', '935d75d2b951eb06557c5968e7633894', '0');
INSERT INTO `plat_sys_user` VALUES ('13893725061', '4', '2', '向春燕', '13893725061', '830ea7601c8ab767fd91db50d101c07f', '4e8c6941f63017a1ce952cd64789edce', '0');
INSERT INTO `plat_sys_user` VALUES ('13893725087', '5', '8', '王丽', '13893725087', '9f244bdf892493043bb4a54345e87c44', 'a4665490c7b330bfb556a7d9e21dc18e', '0');
INSERT INTO `plat_sys_user` VALUES ('13893736121', '4', '2', '张慧', '13893736121', '9ace5ac7450dd54c05f2c3005e8ee4fe', '3487ff429b0a7d3d75a551dfc9b65912', '0');
INSERT INTO `plat_sys_user` VALUES ('13893757555', '4', '2', '罗燕', '13893757555', '74215f3845c8566f222d492474774448', '8d2b0d03dfbb3669e24abe38d7b440fa', '0');
INSERT INTO `plat_sys_user` VALUES ('13893759995', '4', '2', '芮红艳', '13893759995', 'af6833391a060e857821c78080a97aa1', 'ba1f0ac8898163a00f03c101e03243c4', '0');
INSERT INTO `plat_sys_user` VALUES ('13893770906', '6', '7', '张宇', '13893770906', 'c959698fd9af417bb1a53f196c227bca', 'b231f226377570d8aece6092d4dca067', '0');
INSERT INTO `plat_sys_user` VALUES ('13893771862', '5', '8', '李燕蓉', '13893771862', '1b6618b3e82d145a980851975fa14ca8', 'ee656a18008309e8c17533cc795e0da0', '0');
INSERT INTO `plat_sys_user` VALUES ('13893771867', '5', '8', '刘晓琴', '13893771867', 'd7111a2e3b30c4f70a8858383393c217', 'a293696186581e26269ef14214c5b879', '0');
INSERT INTO `plat_sys_user` VALUES ('13909373665', '2', '1', '郭轶英', '13909373665', 'd898a4f0f1094cbd7652e585d9712798', '25953efad05b9e9d0cbce1b75668d4cf', '0');
INSERT INTO `plat_sys_user` VALUES ('13909373669', '2', '1', '宁福荣', '13909373669', '47f8ae59e449ea7278c10cb1905c56f2', '1a7040fc4c67fc3def3956b53ea05bef', '0');
INSERT INTO `plat_sys_user` VALUES ('13909375051', '3', '9', '何彦君', '13909375051', 'dd555a8faf552ade4bfeec124185442b', '3caecc6881955209e155ef4246fbeb1c', '0');
INSERT INTO `plat_sys_user` VALUES ('13909375188', '7', '4', '刘兴军', '13909375188', '9057282b3033990d8b5735b8347be8e8', '5c05f689bde208eb7179868396476914', '0');
INSERT INTO `plat_sys_user` VALUES ('13909375765', '4', '2', '赵春', '13909375765', '3b0b6843d398dc5f8b06a7de3fdf844f', '36410bc54ef4befbdf51e3c08c5b1fad', '0');
INSERT INTO `plat_sys_user` VALUES ('13909376563', '4', '2', '王辉英', '13909376563', '906d3f5f9165e0c68ad92c9b3684ff0d', '98e5a2bdc67911fb4720e0133a238b6c', '0');
INSERT INTO `plat_sys_user` VALUES ('13909377055', '8', '3', '李婷', '13909377055', 'fbe34a754e67ebc1de2f142b6144ad32', '33770b58522f2c09e2c81636afdacacf', '0');
INSERT INTO `plat_sys_user` VALUES ('13909377285', '3', '9', '万丽云', '13909377285', 'aa928e6eebddfd0611a7569564447403', 'c8f9630cf29ccbff99d8fdff8f64137f', '0');
INSERT INTO `plat_sys_user` VALUES ('13993710088', '9', '5', '艳花', '13993710088', 'bda7959845790de2137e4af984a907e9', 'b0aff63101c52f96233513530d9a4f22', '0');
INSERT INTO `plat_sys_user` VALUES ('13993718020', '4', '2', '于荣', '13993718020', 'e0063bf0f4742baa0a53f90f8633ee2e', '23effdfd69dc0c08da931a0084d9195f', '0');
INSERT INTO `plat_sys_user` VALUES ('13993718822', '4', '2', '李甜', '13993718822', '7bd4ce0c9965e4f9e9a1715e5b55d20a', 'b8fe21b56ca8a1852fd35b76a9b0e03c', '0');
INSERT INTO `plat_sys_user` VALUES ('13993719688', '3', '9', '张忠萍', '13993719688', 'a9018078243c752e3bb6d29e4a72102b', '48689bd0238df64d6d873f5149ed49e6', '0');
INSERT INTO `plat_sys_user` VALUES ('13993720026', '8', '3', '高秀萍', '13993720026', '3aaa35c6c567cede40fd31572e92d8c2', '99ae6dae58894a5e11513d3128962f56', '0');
INSERT INTO `plat_sys_user` VALUES ('13993730503', '8', '3', '闫彩霞', '13993730503', '18922d6c339fd987e6b1f5fc579e2cde', '56adae18ef758121e0d67129da9bb1c5', '0');
INSERT INTO `plat_sys_user` VALUES ('13993736363', '2', '1', '王海泉', '13993736363', '614b6a77d6b9e721473e6f9a1c0deaeb', '5b03c2553591f552eac2e05f84085dbf', '0');
INSERT INTO `plat_sys_user` VALUES ('13993739220', '3', '9', '薛静', '13993739220', 'b131ecd841e7d29ca625a0844c0b51a0', '8c15359c48cf919a8a46c93175b6ae15', '0');
INSERT INTO `plat_sys_user` VALUES ('13993755005', '7', '4', '高雯', '13993755005', '9e2902a634fbd7875b91d457c09ec1f5', 'd9b56efde793a6d7657a9561d0be786e', '0');
INSERT INTO `plat_sys_user` VALUES ('13993757699', '3', '9', '刘燕（大）', '13993757699', '0900934a95d221acf4a4754abb6c4705', 'fdf92b91653f6ec82079023fa31354c8', '0');
INSERT INTO `plat_sys_user` VALUES ('13993758500', '2', '1', '沈艳芬', '13993758500', 'b68412ad4678369515b004228a846a25', 'a66f4ecb9364fe0e82ba3814b5169f61', '0');
INSERT INTO `plat_sys_user` VALUES ('15095650855', '7', '4', '杨文杰', '15095650855', 'd100cc2a9f59ef4138f1165ec95d2a8c', 'bc60654b1fdbef51dc88ff01b113c36f', '0');
INSERT INTO `plat_sys_user` VALUES ('15095660006', '5', '8', '刘力恒', '15095660006', 'a34fbc6f489cee5d8a3ce8bf56921cbd', '2808ee7455271023ec3c5869860c533e', '0');
INSERT INTO `plat_sys_user` VALUES ('15095660828', '6', '7', '韩亚江', '15095660828', '343a0c4f00da2e151cb90a91989e58d5', 'c881b3e1832a6a4437a42597166a3af4', '0');
INSERT INTO `plat_sys_user` VALUES ('15109373141', '4', '2', '赵峰', '15109373141', 'afec571a028314b6fd1c0b910cac29e8', 'd651652ae4ea9c60f1cc6ecccfa47b9b', '0');
INSERT INTO `plat_sys_user` VALUES ('15809379897', '4', '2', '刘玉莹', '15809379897', 'fd135b91d82aa7265e5541698a032f84', '4f67f39e87255d5c053bcd100bf7a6c9', '0');
INSERT INTO `plat_sys_user` VALUES ('18793791119', '8', '3', '马莉', '18793791119', '26333743492d94d0034214ea16ac2cdd', '933492defb2996ce5baba35abc539ba1', '0');
INSERT INTO `plat_sys_user` VALUES ('18809371120', '2', '1', '何敏', '18809371120', 'a0979f7a5698042ff88f5cf3c08d5709', '658532dd91195e505216ea5288be0639', '0');
INSERT INTO `plat_sys_user` VALUES ('18809373860', '4', '2', '把建良', '18809373860', 'f7bd2d58f1c8603a7700dc564ef7e54b', '06940e2a2ebdf9bf51d6201c234e73be', '0');
INSERT INTO `plat_sys_user` VALUES ('18809378884', '4', '2', '段磊', '18809378884', 'b2c54bf7817109de38e7e57d4dda8bda', '051b5f2111d901e64f898728ea5d5127', '0');
INSERT INTO `plat_sys_user` VALUES ('18809379798', '11', '10', '王皓瑾', '18809379798', '4169e7b111d9e8cba1ee1a8c7f891020', 'a47e4eb4850ec23d61e331b2edd0dc74', '0');
INSERT INTO `plat_sys_user` VALUES ('18893611188', '2', '1', '王伟', '18893611188', '31e3f383aa35d66b774fa15b122379a7', '93bd156a3eb80216578f1875025d19e2', '0');
INSERT INTO `plat_sys_user` VALUES ('18893617779', '3', '9', '张金莲', '18893617779', '9638cef78ed30947d3b4a3392a2fba25', '3e7883538f1c66ed13ca81c0c92f93ff', '0');

-- ----------------------------
-- Table structure for `sme_corp`
-- ----------------------------
DROP TABLE IF EXISTS `sme_corp`;
CREATE TABLE `sme_corp` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业表';

-- ----------------------------
-- Records of sme_corp
-- ----------------------------

-- ----------------------------
-- Table structure for `work_notice`
-- ----------------------------
DROP TABLE IF EXISTS `work_notice`;
CREATE TABLE `work_notice` (
  `id` varchar(36) NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `addtime` datetime DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='社区通知';

-- ----------------------------
-- Records of work_notice
-- ----------------------------
INSERT INTO `work_notice` VALUES ('101', '2015年10月25日通知测试', '测试信息测试信息测试信息测试信息测试信息测试信息', '2015-11-01 00:00:00', null);

-- ----------------------------
-- Table structure for `work_plan`
-- ----------------------------
DROP TABLE IF EXISTS `work_plan`;
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

-- ----------------------------
-- Records of work_plan
-- ----------------------------
INSERT INTO `work_plan` VALUES ('101', '测试信息', '测试信息测试信息测试信息测试信息测试信息测试信息测试信息', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `xxbs_contact`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_contact`;
CREATE TABLE `xxbs_contact` (
  `id` varchar(36) NOT NULL,
  `ispcode` varchar(36) DEFAULT '' COMMENT '集团单位编码',
  `title` varchar(128) DEFAULT NULL COMMENT '集团单位名称',
  `areacode` int(11) DEFAULT NULL,
  `duty` varchar(50) DEFAULT NULL COMMENT '职务',
  `phone` varchar(45) DEFAULT NULL COMMENT '电话号码',
  `name` varchar(10) DEFAULT NULL COMMENT '姓名',
  `isptype` varchar(45) DEFAULT NULL COMMENT '运营商',
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `parentId` (`areacode`),
  KEY `code` (`title`,`areacode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通讯录表';

-- ----------------------------
-- Records of xxbs_contact
-- ----------------------------
INSERT INTO `xxbs_contact` VALUES ('0f911b29-83e5-4b85-96db-9aafac7969d4', '10001', null, '2', '局长', null, '张三', null, null);
INSERT INTO `xxbs_contact` VALUES ('af8df282-6383-4b8e-a8b7-1fdb6eadeb69', '10001', null, '2', '科长', null, '李四', null, null);

-- ----------------------------
-- Table structure for `xxbs_contact_way`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_contact_way`;
CREATE TABLE `xxbs_contact_way` (
  `id` varchar(36) NOT NULL,
  `ispcode` varchar(50) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `cid` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxbs_contact_way
-- ----------------------------
INSERT INTO `xxbs_contact_way` VALUES ('1050dca1-20a3-486f-95a2-b5eaeb17c7f5', '1001', '13833447788', '0f911b29-83e5-4b85-96db-9aafac7969d4');
INSERT INTO `xxbs_contact_way` VALUES ('af8df282-6383-4b8e-a8b7-1fdb6eadeb62', '1001', '13809236677', 'af8df282-6383-4b8e-a8b7-1fdb6eadeb69');

-- ----------------------------
-- Table structure for `xxbs_corp`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_corp`;
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
  `acode` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `zipcode` varchar(45) DEFAULT NULL,
  `qqcode` varchar(45) DEFAULT NULL,
  `logo` varchar(200) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `amuserid` bigint(20) DEFAULT NULL COMMENT '客户经理',
  `addtime` datetime DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ispcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业表';

-- ----------------------------
-- Records of xxbs_corp
-- ----------------------------
INSERT INTO `xxbs_corp` VALUES ('10001', '测试企业酒泉市企业', null, null, null, '', null, null, null, null, '测试人', '9', '酒泉市××××', null, null, null, null, '5', null, null);
INSERT INTO `xxbs_corp` VALUES ('10002', '测试玉门市企业', null, null, null, '15193176118', null, null, null, null, '测试人', '2', '甘肃省平凉路366号', null, null, null, null, '5', null, null);
INSERT INTO `xxbs_corp` VALUES ('10003', '测试敦煌市企业', null, null, null, '15193176118', null, null, null, null, '测试2', '8', '甘肃省平凉路366号', null, null, null, null, '5', null, null);
INSERT INTO `xxbs_corp` VALUES ('10004', '测试瓜州县企业2', null, null, null, '15193176118', null, null, null, null, '测试人', '4', '', null, null, null, null, '5', null, null);
INSERT INTO `xxbs_corp` VALUES ('10005', '测试苏北县企业3', null, null, null, '15193176118', null, null, null, null, '测试人', '5', '', null, null, null, null, '5', null, null);
INSERT INTO `xxbs_corp` VALUES ('ym0001', '测试玉门企业', null, null, null, '15193176118', null, null, null, null, '测试人', '7', '', null, null, null, null, '1', null, null);

-- ----------------------------
-- Table structure for `xxbs_ictproject`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_ictproject`;
CREATE TABLE `xxbs_ictproject` (
  `id` varchar(36) NOT NULL,
  `corpname` varchar(50) DEFAULT NULL COMMENT '客户单位名称',
  `ispcode` varchar(45) DEFAULT NULL COMMENT '集团单位编码',
  `name` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `brief` varchar(500) DEFAULT NULL COMMENT '项目简介',
  `buildcontent` varchar(500) DEFAULT NULL COMMENT '建设内容',
  `ussm` float DEFAULT NULL COMMENT '项目金额',
  `winnindate` timestamp NULL DEFAULT NULL COMMENT '中标时间',
  `signdate` timestamp NULL DEFAULT NULL COMMENT '签约时间',
  `planstartdate` timestamp NULL DEFAULT NULL COMMENT '计划开工时间',
  `planenddate` timestamp NULL DEFAULT NULL COMMENT '计划完工时间',
  `realstartdate` timestamp NULL DEFAULT NULL COMMENT '实际开始时间',
  `realenddate` timestamp NULL DEFAULT NULL COMMENT '实际开始时间',
  `builddays` int(11) DEFAULT NULL COMMENT '工期',
  `construction` varchar(500) DEFAULT NULL,
  `planlandussm` float DEFAULT NULL COMMENT '合同要求收回金额',
  `planlanddate` timestamp NULL DEFAULT NULL COMMENT '合同要求收回时间',
  `amuserid` varchar(45) DEFAULT NULL COMMENT '客户经理',
  `telephone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `status` varchar(45) DEFAULT NULL COMMENT '状态',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `cooper` varchar(255) DEFAULT NULL COMMENT '合作厂商',
  `ordernum` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ICT项目表';

-- ----------------------------
-- Records of xxbs_ictproject
-- ----------------------------
INSERT INTO `xxbs_ictproject` VALUES ('092df921-2bb9-4dd7-8b62-fc7466f5400f', null, '10001', '2', '', '', '3', '2016-05-03 00:00:00', '2016-05-03 00:00:00', '2016-05-03 00:00:00', '2016-05-03 00:00:00', null, null, null, null, null, null, '1', '', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99264', '', null, null);
INSERT INTO `xxbs_ictproject` VALUES ('101', null, null, '项目测试', null, null, null, null, null, '2015-11-18 00:00:00', null, '2015-11-19 00:00:00', null, null, null, null, null, null, null, '1', '项目ceshi', null, null);
INSERT INTO `xxbs_ictproject` VALUES ('104', null, null, '测试项目4', null, null, null, null, null, '2015-11-20 00:00:00', null, '2016-01-30 00:00:00', null, null, null, null, null, null, null, '1', '', null, null);
INSERT INTO `xxbs_ictproject` VALUES ('27def259-73f5-41fc-86e8-844af80ce0aa', null, '10001', '哥哥', '', '', null, null, null, null, null, null, null, null, null, null, null, '1', '', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99264', '', null, null);
INSERT INTO `xxbs_ictproject` VALUES ('368cd387-cd10-4787-a4d9-2f677567e2f5', null, '10001', '二', '', '', '33', '2016-04-15 00:00:00', '2016-04-15 00:00:00', '2016-04-15 00:00:00', '2016-04-15 00:00:00', null, null, null, null, null, null, '1', '', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99264', '', null, null);
INSERT INTO `xxbs_ictproject` VALUES ('5f8fbc86-4a77-4d37-9426-e3a704d94dd1', null, '10001', '3245', '', '', '1111', '2016-04-15 00:00:00', '2016-04-15 00:00:00', '2016-04-15 00:00:00', '2016-04-15 00:00:00', null, null, null, null, null, null, '1', '', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99264', '', null, null);
INSERT INTO `xxbs_ictproject` VALUES ('63c4af3e-d92a-40f1-81fa-d76c7c20028a', null, '10001', '发多少', '', '', null, null, null, null, null, null, null, null, null, null, null, '1', '', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99264', '', null, null);

-- ----------------------------
-- Table structure for `xxbs_product`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_product`;
CREATE TABLE `xxbs_product` (
  `id` varchar(36) NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `status` varchar(5) DEFAULT NULL,
  `ismodi` varchar(45) DEFAULT '1' COMMENT '是否参与摸底产品',
  `issem` varchar(45) DEFAULT '1' COMMENT '是否成员营销产品',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='信息化产品表';

-- ----------------------------
-- Records of xxbs_product
-- ----------------------------
INSERT INTO `xxbs_product` VALUES ('10001', 'IDC  主机托管、云主机', '发多少', '0', '1', '0');
INSERT INTO `xxbs_product` VALUES ('10002', 'IMS（必推产品）', null, '1', '1', '0');
INSERT INTO `xxbs_product` VALUES ('10003', '短彩类(企信通、云MAS、政信通)', '', '1', '1', '0');
INSERT INTO `xxbs_product` VALUES ('10004', '移动管家', null, '1', '1', '0');
INSERT INTO `xxbs_product` VALUES ('10005', '舆情监控', null, '1', '1', '0');
INSERT INTO `xxbs_product` VALUES ('10006', '企业建站', '', '1', '2', '0');
INSERT INTO `xxbs_product` VALUES ('10007', '微信建站', '', '1', '2', '0');
INSERT INTO `xxbs_product` VALUES ('10008', '协同办公', null, '1', '2', '0');
INSERT INTO `xxbs_product` VALUES ('10009', '外勤通', '', '1', '2', '0');
INSERT INTO `xxbs_product` VALUES ('10010', '小步外勤', '', '1', '2', '0');
INSERT INTO `xxbs_product` VALUES ('10011', 'MDM 移动终端管理', null, '1', '2', '0');
INSERT INTO `xxbs_product` VALUES ('30001', '终端', null, '1', '2', '1');
INSERT INTO `xxbs_product` VALUES ('30002', '4G流量', null, '1', '2', '1');
INSERT INTO `xxbs_product` VALUES ('30003', '4G换卡', null, '1', '2', '1');
INSERT INTO `xxbs_product` VALUES ('30004', '掌上APP', null, '1', '2', '1');

-- ----------------------------
-- Table structure for `xxbs_project_progress`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_project_progress`;
CREATE TABLE `xxbs_project_progress` (
  `id` varchar(36) NOT NULL,
  `projectid` varchar(36) DEFAULT NULL COMMENT '项目id',
  `addtime` timestamp NULL DEFAULT NULL COMMENT '添加时间',
  `progress` varchar(200) DEFAULT NULL COMMENT '项目进度',
  `remark` varchar(500) DEFAULT NULL COMMENT '情况说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目进展表';

-- ----------------------------
-- Records of xxbs_project_progress
-- ----------------------------
INSERT INTO `xxbs_project_progress` VALUES ('1', '101', '2016-04-14 17:26:14', '22', '33');
INSERT INTO `xxbs_project_progress` VALUES ('2', '101', '2016-04-21 17:38:35', '45', '项目进展为45');

-- ----------------------------
-- Table structure for `xxbs_prop`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_prop`;
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
  `unit` varchar(45) DEFAULT NULL COMMENT '数值单位',
  PRIMARY KEY (`id`),
  UNIQUE KEY `indexnum_UNIQUE` (`indexnum`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='产品属性表';

-- ----------------------------
-- Records of xxbs_prop
-- ----------------------------
INSERT INTO `xxbs_prop` VALUES ('2002', '订购数量', 'f_2002', 'numberbox', 'number', null, '30001', '25', '1', null);
INSERT INTO `xxbs_prop` VALUES ('2003', '订购数量', 'f_2003', 'numberbox', 'number', null, '30003', '26', '1', null);
INSERT INTO `xxbs_prop` VALUES ('2004', '订购数量', 'f_2004', 'numberbox', 'number', null, '30004', '27', '1', null);
INSERT INTO `xxbs_prop` VALUES ('701', '是否有自己的机房？', 'f_701', 'combobox', 'text', 'HAS_NO', '10001', '1', '1', null);
INSERT INTO `xxbs_prop` VALUES ('702', '机房设备已使用了多少年？', 'f_702', 'numberbox', 'text', null, '10001', '2', '1', null);
INSERT INTO `xxbs_prop` VALUES ('703', '机房环境是否专业化？', 'f_703', 'combobox', 'text', 'HAS_NO', '10001', '3', '1', null);
INSERT INTO `xxbs_prop` VALUES ('801', '每年的电费、人工费是多少？', 'f_801', 'numberbox', 'text', null, '10001', '4', '1', null);
INSERT INTO `xxbs_prop` VALUES ('802', '是否使用座机', 'f_802', 'text', 'text', null, '10002', '5', null, null);
INSERT INTO `xxbs_prop` VALUES ('803', '在用固话哪一家的？', 'f_803', 'combobox', 'text', 'ISP_TYPE', '10002', '6', null, null);
INSERT INTO `xxbs_prop` VALUES ('804', '座机数量', 'f_804', 'numberbox', null, null, '10002', '7', null, null);
INSERT INTO `xxbs_prop` VALUES ('805', '月资费/部', 'f_805', 'numberbox', null, null, '10002', '8', null, null);
INSERT INTO `xxbs_prop` VALUES ('806', '到期时间', 'f_806', 'datebox', null, null, '10002', '9', null, null);
INSERT INTO `xxbs_prop` VALUES ('901', '使用何种产品发送通知', 'f_901', 'combobox', null, null, '10003', '10', null, null);
INSERT INTO `xxbs_prop` VALUES ('902', '有无使用类似的产品', 'f_902', 'combobox', null, 'HAS_NO', '10004', '11', null, null);
INSERT INTO `xxbs_prop` VALUES ('903', '有无使用监控类产品', 'f_903', 'combobox', null, 'HAS_NO', '10005', '12', null, null);
INSERT INTO `xxbs_prop` VALUES ('904', '有无使用同类产品', 'f_904', 'combobox', null, 'HAS_NO', '10006', '19', null, null);
INSERT INTO `xxbs_prop` VALUES ('905', '有无使用同类产品？', 'f_905', 'combobox', null, 'HAS_NO', '10007', '20', null, null);
INSERT INTO `xxbs_prop` VALUES ('906', '有无使用同类产品？', 'f_906', 'combobox', null, 'HAS_NO', '10008', '21', null, null);
INSERT INTO `xxbs_prop` VALUES ('907', '有无使用同类产品？', 'f_907', 'combobox', null, 'HAS_NO', '10009', '22', null, null);
INSERT INTO `xxbs_prop` VALUES ('908', '有无使用同类产品？', 'f_908', 'combobox', null, 'HAS_NO', '10010', '23', null, null);
INSERT INTO `xxbs_prop` VALUES ('909', '有无使用同类产品？', 'f_909', 'combobox', null, 'HAS_NO', '10011', '24', null, null);

-- ----------------------------
-- Table structure for `xxbs_prop_val`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_prop_val`;
CREATE TABLE `xxbs_prop_val` (
  `id` varchar(36) NOT NULL,
  `propid` varchar(50) DEFAULT NULL COMMENT '类型ID',
  `corpid` varchar(50) DEFAULT NULL COMMENT '企业ID',
  `productid` varchar(45) DEFAULT NULL,
  `propval` varchar(255) DEFAULT NULL COMMENT '监测值',
  `addtime` timestamp NULL DEFAULT NULL COMMENT '监测时间',
  `remark` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品属性值';

-- ----------------------------
-- Records of xxbs_prop_val
-- ----------------------------
INSERT INTO `xxbs_prop_val` VALUES ('16eac2da-6516-4b01-ba00-7a9b612c0f02', '801', 'ym0001', '10001', '500', '2016-04-28 00:38:03', null);
INSERT INTO `xxbs_prop_val` VALUES ('29289ef0-ef0d-45d8-8fd2-b27f4e92df18', '801', '10001', '10001', '90', '2016-04-27 16:03:28', null);
INSERT INTO `xxbs_prop_val` VALUES ('536294d1-f860-4225-948d-32be42ecf760', '701', 'ym0001', '10001', '30012', '2016-04-28 00:38:03', null);
INSERT INTO `xxbs_prop_val` VALUES ('5d114027-13bb-46c0-885c-521ed6b60b8f', '701', '10001', '10001', '30011', '2016-04-27 16:03:28', null);
INSERT INTO `xxbs_prop_val` VALUES ('8f29db8e-ddf8-486b-9d92-20ffa5df9929', '703', '10001', '10001', '30011', '2016-04-27 16:03:28', null);
INSERT INTO `xxbs_prop_val` VALUES ('a4e77b95-8845-4559-8bbb-6baec3178ff2', '702', 'ym0001', '10001', '4', '2016-04-28 00:38:03', null);
INSERT INTO `xxbs_prop_val` VALUES ('bb728908-3f1e-4175-bdc0-9295fcd7f25e', '702', '10001', '10001', '10', '2016-04-27 16:03:27', null);
INSERT INTO `xxbs_prop_val` VALUES ('f9cbf3a2-b6d3-4257-9b07-ad3704ed832c', '703', 'ym0001', '10001', '30011', '2016-04-28 00:38:03', null);

-- ----------------------------
-- Table structure for `xxbs_sem_recomd`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_sem_recomd`;
CREATE TABLE `xxbs_sem_recomd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reportid` varchar(45) DEFAULT NULL,
  `productid` varchar(45) DEFAULT NULL,
  `remresult` varchar(45) DEFAULT NULL,
  `amuserid` varchar(45) DEFAULT NULL COMMENT '冗余字段',
  `corpid` varchar(45) DEFAULT NULL COMMENT '冗余字段',
  `addtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='日常上报推荐表';

-- ----------------------------
-- Records of xxbs_sem_recomd
-- ----------------------------
INSERT INTO `xxbs_sem_recomd` VALUES ('1', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10001', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99267', '13893716898', '10001', '2016-04-28 00:28:19');
INSERT INTO `xxbs_sem_recomd` VALUES ('2', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10002', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99267', '13893716898', '10001', '2016-04-28 00:28:19');
INSERT INTO `xxbs_sem_recomd` VALUES ('3', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10003', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99268', '13893716898', '10001', '2016-04-28 00:28:19');
INSERT INTO `xxbs_sem_recomd` VALUES ('4', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10004', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99267', '13893716898', '10001', '2016-04-28 00:28:19');
INSERT INTO `xxbs_sem_recomd` VALUES ('5', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10005', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99267', '13893716898', '10001', '2016-04-28 00:28:19');

-- ----------------------------
-- Table structure for `xxbs_sem_report`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_sem_report`;
CREATE TABLE `xxbs_sem_report` (
  `id` varchar(36) NOT NULL,
  `corpid` varchar(45) DEFAULT NULL,
  `adddate` datetime DEFAULT NULL COMMENT '走访日期',
  `amuserid` varchar(45) DEFAULT NULL COMMENT '客户经理',
  `addtime` datetime DEFAULT NULL COMMENT '录入时间',
  `status` varchar(45) DEFAULT NULL COMMENT '推荐产品id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日常信息报送表';

-- ----------------------------
-- Records of xxbs_sem_report
-- ----------------------------
INSERT INTO `xxbs_sem_report` VALUES ('1007', '10001', '2016-04-27 00:00:00', '5', null, null);
INSERT INTO `xxbs_sem_report` VALUES ('1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10001', '2016-04-22 00:00:00', '13893716898', '2016-04-28 00:14:46', null);

-- ----------------------------
-- Table structure for `xxbs_sem_result`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_sem_result`;
CREATE TABLE `xxbs_sem_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` varchar(45) DEFAULT NULL COMMENT '营销产品',
  `smereult` varchar(45) DEFAULT NULL COMMENT '营销结果',
  `reportid` varchar(45) DEFAULT NULL,
  `corpid` varchar(45) DEFAULT NULL,
  `amuserid` varchar(45) DEFAULT NULL,
  `addtime` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='日常上报结果表';

-- ----------------------------
-- Records of xxbs_sem_result
-- ----------------------------
INSERT INTO `xxbs_sem_result` VALUES ('1', '30001', '6', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10001', '13893716898', null);
INSERT INTO `xxbs_sem_result` VALUES ('2', '30002', '6', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10001', '13893716898', null);
INSERT INTO `xxbs_sem_result` VALUES ('3', '30003', '6', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10001', '13893716898', null);
INSERT INTO `xxbs_sem_result` VALUES ('4', '30004', '6', '1ca58bd9-2a9a-4f34-8c0c-f1e68b987196', '10001', '13893716898', null);

-- ----------------------------
-- Table structure for `xxbs_specline`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_specline`;
CREATE TABLE `xxbs_specline` (
  `id` varchar(36) NOT NULL,
  `ispcode` varchar(45) DEFAULT NULL COMMENT '集团单位编码',
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
  `agreeimg` varchar(500) DEFAULT NULL COMMENT '客户经理',
  `customer` varchar(50) DEFAULT NULL COMMENT '协议扫描',
  `yeartariff` varchar(20) DEFAULT NULL,
  `pactnumber` varchar(50) DEFAULT NULL,
  `pactname` varchar(100) DEFAULT NULL,
  `pactvalidity` varchar(50) DEFAULT NULL,
  `worknumber` varchar(50) DEFAULT NULL,
  `speclinename` varchar(50) DEFAULT NULL,
  `esopnumber` varchar(50) DEFAULT NULL,
  `esoptheme` varchar(50) DEFAULT NULL,
  `opentime` datetime DEFAULT NULL,
  `bossnumber` varchar(50) DEFAULT NULL,
  `ftolltime` datetime DEFAULT NULL,
  `ftollsum` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专线表';

-- ----------------------------
-- Records of xxbs_specline
-- ----------------------------
INSERT INTO `xxbs_specline` VALUES ('aaa94a0a-eecd-44dc-a31f-aeaa531ad9a7', '10001', '1', '1001', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99262', '12', '12', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99261', '2016-10-14 00:00:00', '2016-10-14 00:00:00', '2016-10-14 00:00:00', '', 'd7799eaa-997f-45d2-92cb-117c7b9d9e80.png', '账单', '32', '43', '66', '54', '', '', '', '', '2016-10-14 00:00:00', '', '2016-10-14 00:00:00', null);
INSERT INTO `xxbs_specline` VALUES ('d2de4357-0965-4c57-8424-83cb66ea9b79', '10003', '0', '1001', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99262', '4455', '55', 'f7aefbe1-36b5-4a5a-bdb9-13a2b3f99261', '2016-05-03 00:00:00', '2016-05-03 00:00:00', '2016-05-03 00:00:00', '', null, '9add1e62-4128-437d-bbe9-d562d892d4c2.png', null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `xxbs_spec_attachs`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_spec_attachs`;
CREATE TABLE `xxbs_spec_attachs` (
  `id` varchar(36) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `state` varchar(1) DEFAULT NULL,
  `ispcode` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxbs_spec_attachs
-- ----------------------------
INSERT INTO `xxbs_spec_attachs` VALUES ('8403cdd2-f494-4adf-ab9d-973fad68993d', 'fuwuqufengbutuxiang.png', 'd7799eaa-997f-45d2-92cb-117c7b9d9e80.png', null, 'aaa94a0a-eecd-44dc-a31f-aeaa531ad9a7');
INSERT INTO `xxbs_spec_attachs` VALUES ('b563ef1b-0de3-4bc9-b9e1-f94034511198', '', '9add1e62-4128-437d-bbe9-d562d892d4c2.png', null, 'd2de4357-0965-4c57-8424-83cb66ea9b79');
INSERT INTO `xxbs_spec_attachs` VALUES ('c1f2d690-5e49-434b-aab3-a9ce300dffbf', 'PDapp.exe', '2dab1287-5f0b-40ef-b6b8-ae81fc53b77c.exe', null, 'e71065ea-f0b6-4f9a-8d19-d1503d8956ae');

-- ----------------------------
-- Table structure for `xxbs_user_corp`
-- ----------------------------
DROP TABLE IF EXISTS `xxbs_user_corp`;
CREATE TABLE `xxbs_user_corp` (
  `id` varchar(36) NOT NULL,
  `userid` bigint(20) DEFAULT NULL,
  `ispcode` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xxbs_user_corp
-- ----------------------------
