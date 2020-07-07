/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : donate

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 20/05/2020 23:20:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for apply
-- ----------------------------
DROP TABLE IF EXISTS `apply`;
CREATE TABLE `apply`  (
  `aid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '众筹申请id',
  `addl` datetime NULL DEFAULT NULL COMMENT '众筹期限',
  `amoney` float(9, 0) NULL DEFAULT NULL COMMENT '所需金额',
  `astate` int(2) NULL DEFAULT NULL COMMENT '审核状态',
  `pid` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '患者id',
  `hid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '申请机构id',
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of apply
-- ----------------------------
INSERT INTO `apply` VALUES ('A01', '2020-05-31 00:00:00', 50000, 1, '110101199003073319', 'H01');
INSERT INTO `apply` VALUES ('A02', '2020-06-26 00:00:00', 6000, 0, '110101199003073319', 'H01');
INSERT INTO `apply` VALUES ('A03', '2020-05-05 00:00:00', 400000, 1, '110101199003075170', 'H02');
INSERT INTO `apply` VALUES ('A04', '2020-06-04 00:00:00', 62000, 2, '110101199003073319', 'H02');
INSERT INTO `apply` VALUES ('A05', '2020-07-02 00:00:00', 960000, 1, '140424198205209175', 'H02');
INSERT INTO `apply` VALUES ('A06', '2020-05-31 00:00:00', 540000, 0, '110101199003073319', 'H01');
INSERT INTO `apply` VALUES ('A07', '2020-07-11 00:00:00', 60000, 1, '110101199003075170', 'H01');

-- ----------------------------
-- Table structure for donor
-- ----------------------------
DROP TABLE IF EXISTS `donor`;
CREATE TABLE `donor`  (
  `did` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '捐助人id',
  `dname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '捐助人名字',
  `dtel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '捐助人电话',
  `dsummoney` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '捐助人总共捐赠金额',
  PRIMARY KEY (`did`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of donor
-- ----------------------------
INSERT INTO `donor` VALUES ('D01', '小王', '15830668774', '6600');
INSERT INTO `donor` VALUES ('D02', '大米', '15698552001', '3000');
INSERT INTO `donor` VALUES ('D03', '小绿', '10236554221', '5000');

-- ----------------------------
-- Table structure for fee
-- ----------------------------
DROP TABLE IF EXISTS `fee`;
CREATE TABLE `fee`  (
  `fid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `iid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `rfe` float NULL DEFAULT NULL COMMENT '门诊',
  `mfe` float NULL DEFAULT NULL COMMENT '药品',
  `hfe` float NULL DEFAULT NULL COMMENT '住院',
  `ofe` float NULL DEFAULT NULL COMMENT '手术',
  `smoney` float NULL DEFAULT NULL COMMENT '累计申请金额',
  `fstate` int(2) NULL DEFAULT NULL COMMENT '审核状态',
  `sfe` float NULL DEFAULT NULL COMMENT '此次申请总费用',
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of fee
-- ----------------------------
INSERT INTO `fee` VALUES ('F01', 'I01', 60, 60, 70, 400, 2770, 1, 590);
INSERT INTO `fee` VALUES ('F02', 'I02', 60, 70, 5000, 6000, 11130, 1, 11130);
INSERT INTO `fee` VALUES ('F03', 'I01', 50, 60, 70, 2000, 2770, 1, 2180);
INSERT INTO `fee` VALUES ('F04', 'I01', 500, 600, 700, 5000, 2770, 2, 6800);

-- ----------------------------
-- Table structure for hospital
-- ----------------------------
DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital`  (
  `hid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '医疗机构id',
  `hname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医疗机构名字',
  `htel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医疗机构电话',
  `hqualification` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医疗机构资质',
  `haddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '医疗机构地点',
  PRIMARY KEY (`hid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hospital
-- ----------------------------
INSERT INTO `hospital` VALUES ('H01', '浙江大学医学院附属邵逸夫医院', '0571-86090073', '三级甲等', '浙江省杭州市江干区庆春东路3号');
INSERT INTO `hospital` VALUES ('H02', '复旦大学附属华山医院', '021-52889999', '三级甲等', '上海市乌鲁木齐中路12号');

-- ----------------------------
-- Table structure for idonate
-- ----------------------------
DROP TABLE IF EXISTS `idonate`;
CREATE TABLE `idonate`  (
  `idoid` int(10) NOT NULL AUTO_INCREMENT COMMENT '捐款编号',
  `did` varchar(225) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '捐款人',
  `iid` varchar(225) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '众筹项目',
  `dimoney` float NULL DEFAULT NULL,
  `distate` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`idoid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of idonate
-- ----------------------------
INSERT INTO `idonate` VALUES (1, 'D01', 'I02', 600, 1);
INSERT INTO `idonate` VALUES (2, 'D02', 'I01', 200, 2);
INSERT INTO `idonate` VALUES (3, 'D03', 'I03', 500, 2);
INSERT INTO `idonate` VALUES (4, 'D02', 'I02', 200, 0);
INSERT INTO `idonate` VALUES (5, 'D02', 'I03', 3000, 1);
INSERT INTO `idonate` VALUES (6, 'D03', 'I02', 5000, 1);
INSERT INTO `idonate` VALUES (7, 'D01', 'I01', 6000, 1);

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `iid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '众筹项目id',
  `aid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '众筹申请表id',
  `iname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '众筹项目名字',
  `iddl` datetime NULL DEFAULT NULL COMMENT '截至日期',
  `iprogress` int(1) NULL DEFAULT NULL COMMENT '筹款进度：1，0',
  `imoney` float(9, 0) NULL DEFAULT NULL COMMENT '已获捐赠金额',
  PRIMARY KEY (`iid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('I01', 'A03', '救救孩子', '2020-05-02 00:00:00', 1, 6000);
INSERT INTO `item` VALUES ('I02', 'A01', '爱心接力', '2020-05-30 00:00:00', 0, 5600);
INSERT INTO `item` VALUES ('I03', 'A01', '加班', '2020-06-30 00:00:00', 0, 3000);

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient`  (
  `pid` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '患者id,身份证',
  `pname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '患者名字',
  `ptel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '患者电话',
  `phome` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '患者地址',
  `pstory` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '患者故事',
  `psick` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '病情信息',
  `ptreat` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '治疗情况',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('110101199003073319', '李霞', '12697554223', '浙江杭州', '李霞是山东临沂岸堤镇梁家北村私立幼儿园的园长，今年已经50岁了。\r\n\r\n2011年，她查出了乳腺癌并转移到淋巴组织，\r\n\r\n她并没有因此放弃她的工作。\r\n\r\n现在她每年平均要输液300天，\r\n\r\n顽强的与病魔抗争的同时，一边在讲台上输液陪伴孩子们，', '乳腺癌并转移到淋巴组织，', '乳腺癌并转移到淋巴组织，');
INSERT INTO `patient` VALUES ('110101199003075170', '小明', '13502669774', '浙江杭州', '一对年轻夫妻先后查出甲状腺疾病，\r\n\r\n患恶性晚期甲状腺癌的丈夫不顾医生尽快手术的劝告，\r\n\r\n执意让患有良性甲状腺结节的妻子先做手术。\r\n\r\n为了让她安心，丈夫隐瞒实情，向妻子编造“爱的谎言”。\r\n\r\n幸运的是，夫妻俩的手术都很成功，前日两人到医院复查一切正常。\r\n\r\n有时候，善意的谎言会换来更美好的结局。', '遗传性甲状腺疾病', 'df');
INSERT INTO `patient` VALUES ('140424198205209175', '王瑞鹏', '13505668556', '浙江杭州', '他没有妻子，没有子女，孑然一身。\r\n在这8年里，他随时都有生命的危险，\r\n在医院里，没有亲人的照顾，\r\n陪伴他的只有他的主治医生和护士。\r\n在他的眼镜盒里，通讯录上除了至亲，就是田医生。\r\n这8年来，他反复入院出院，一个人交费，一个人办理手续，一个人离开。\r\n有时候，医院的电梯要等10几分钟，老人只能靠着墙支撑病痛的身体。\r\n在这几年，他见的最多的人就是田玲医生，\r\n老人平时很孤独，没人听他说话，\r\n只有田医生愿意倾听。\r\n田医生每次与老人交谈的时候，田医生都会一边搓着老人的手一边听，\r\n眼泪总是漫过眼眶流下来，老人往往装作看不到，看看别处。\r\n田医生10多年来一直没有换过手机，她比谁都清楚老人的病，', '心脏病\r\n患者瞳孔散大，颈动脉颈动脉无搏动，呼之不应，心电图呈一条直线', '病情恶化\r\n患者神志清，精神软，呼吸平顺，3升/分吸氧，诉无有头晕无头疼，无恶心呕吐，无胸闷胸痛，无腹痛，腹软，二便无殊。');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `upsw` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('110101199003073319', '1');
INSERT INTO `user` VALUES ('110101199003075170', '1');
INSERT INTO `user` VALUES ('140424198205209175', '1');
INSERT INTO `user` VALUES ('admin', '1');
INSERT INTO `user` VALUES ('D01', '1');
INSERT INTO `user` VALUES ('D02', '1');
INSERT INTO `user` VALUES ('D03', '1');
INSERT INTO `user` VALUES ('H01', '1');
INSERT INTO `user` VALUES ('H02', '1');

SET FOREIGN_KEY_CHECKS = 1;
