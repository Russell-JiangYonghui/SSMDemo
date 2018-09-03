/*
 Navicat MySQL Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : ssm

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 09/03/2018 23:18:17 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `ssm`
-- ----------------------------
DROP TABLE IF EXISTS `ssm`;
CREATE TABLE `ssm` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `ssm`
-- ----------------------------
BEGIN;
INSERT INTO `ssm` VALUES ('1', 'Tom', '23');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
