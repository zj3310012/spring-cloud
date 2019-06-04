/*
 Navicat Premium Data Transfer

 Source Server         : 115.28.27.231
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 115.28.27.231:3306
 Source Schema         : um

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 04/06/2019 16:43:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bdm_common_thire_part_key
-- ----------------------------
DROP TABLE IF EXISTS `bdm_common_thire_part_key`;
CREATE TABLE `bdm_common_thire_part_key`  (
  `id` int(11) NOT NULL,
  `public_key` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `private_key` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `symmetry_key` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `key_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加密方式',
  `is_use` tinyint(1) NULL DEFAULT NULL,
  `user_code` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bdm_common_thire_part_key
-- ----------------------------
INSERT INTO `bdm_common_thire_part_key` VALUES (1, 'MIIBtzCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoDgYQAAoGAV8iI7xuGBHPZC1tm1tKaXwcsSUVMQ5WjAqAbSkCPY1Yeqtgdkdv4PnnFNVpyPY3r89FEsTFTcaAoUlrRrmOMBY47BNDzQfKGSeLVbO9b+G/UtGbkFUy3IdtZUSU9OGdg3lg2VHarQG+LQ2Oqy16tFcvvOHq6Co68PYtyFxSOjuw=', 'MIIBSwIBADCCASwGByqGSM44BAEwggEfAoGBAP1/U4EddRIpUt9KnC7s5Of2EbdSPO9EAMMeP4C2USZpRV1AIlH7WT2NWPq/xfW6MPbLm1Vs14E7gB00b/JmYLdrmVClpJ+f6AR7ECLCT7up1/63xhv4O1fnxqimFQ8E+4P208UewwI1VBNaFpEy9nXzrith1yrv8iIDGZ3RSAHHAhUAl2BQjxUjC8yykrmCouuEC/BYHPUCgYEA9+GghdabPd7LvKtcNrhXuXmUr7v6OuqC+VdMCz0HgmdRWVeOutRZT+ZxBxCBgLRJFnEj6EwoFhO3zwkyjMim4TwWeotUfI0o4KOuHiuzpnWRbqN/C/ohNWLx+2J6ASQ7zKTxvqhRkImog9/hWuWfBpKLZl6Ae1UlZAFMO/7PSSoEFgIUdczOLDm1MWDKmCUDUedug8m/5Ak=', 'NzY4NmFhMTU1ZjlmNDczZDgzYzkzNzhjNjljOTBlZWI=', 'DSA', 1, '00c7cf012fff11e9a91fc85b766499e5');

SET FOREIGN_KEY_CHECKS = 1;
