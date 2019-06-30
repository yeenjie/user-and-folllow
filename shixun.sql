/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50515
 Source Host           : localhost:3306
 Source Schema         : shixun

 Target Server Type    : MySQL
 Target Server Version : 50515
 File Encoding         : 65001

 Date: 30/06/2019 16:51:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for follow
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NULL DEFAULT NULL,
  `fid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of follow
-- ----------------------------
INSERT INTO `follow` VALUES (2, 1, 3);
INSERT INTO `follow` VALUES (3, 4, 1);
INSERT INTO `follow` VALUES (4, 1, 16);
INSERT INTO `follow` VALUES (5, 2, 16);
INSERT INTO `follow` VALUES (26, 16, 2);
INSERT INTO `follow` VALUES (27, 16, 2);
INSERT INTO `follow` VALUES (28, 16, 2);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  `delete_` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `uid`(`uid`) USING BTREE,
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user_` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '测试1', 123.33, 1, 0);
INSERT INTO `product` VALUES (2, '修改', 123, 1, 0);
INSERT INTO `product` VALUES (3, '已删除', 123, 1, 0);
INSERT INTO `product` VALUES (4, '测试4', 123.33, 1, 0);
INSERT INTO `product` VALUES (5, '测试产品', 12412.4, 2, 0);

-- ----------------------------
-- Table structure for user_
-- ----------------------------
DROP TABLE IF EXISTS `user_`;
CREATE TABLE `user_`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `del` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_
-- ----------------------------
INSERT INTO `user_` VALUES (1, '修1', '123', 0);
INSERT INTO `user_` VALUES (2, 'yeene', '1243', 1);
INSERT INTO `user_` VALUES (3, '修111', '33123', 1);
INSERT INTO `user_` VALUES (4, '测试用户2', '1324', 1);
INSERT INTO `user_` VALUES (5, '333', '123', 0);
INSERT INTO `user_` VALUES (10, '123', NULL, 1);
INSERT INTO `user_` VALUES (11, '新增', NULL, 1);
INSERT INTO `user_` VALUES (12, '修改5555', '修改', 0);
INSERT INTO `user_` VALUES (13, '修改贵ll22', '123', 1);
INSERT INTO `user_` VALUES (14, 'y123', '123', 0);
INSERT INTO `user_` VALUES (16, 'admin', '123', 0);

SET FOREIGN_KEY_CHECKS = 1;
