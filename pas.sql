/*
MySQL Data Transfer
Source Host: localhost
Source Database: pas
Target Host: localhost
Target Database: pas
Date: 6/9/2023 1:36:33 AM
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin` varchar(230) default NULL,
  `password` varchar(230) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for hod
-- ----------------------------
DROP TABLE IF EXISTS `hod`;
CREATE TABLE `hod` (
  `hodid` varchar(22) NOT NULL default '0',
  `name` varchar(220) NOT NULL default '',
  `email` varchar(220) default NULL,
  `phone` varchar(220) default NULL,
  `address` varchar(220) default NULL,
  `branch` varchar(220) default NULL,
  `status` varchar(220) default NULL,
  PRIMARY KEY  (`hodid`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for ig
-- ----------------------------
DROP TABLE IF EXISTS `ig`;
CREATE TABLE `ig` (
  `igid` varchar(22) NOT NULL default '0',
  `name` varchar(220) NOT NULL default '',
  `email` varchar(220) default NULL,
  `phone` varchar(220) default NULL,
  `address` varchar(220) default NULL,
  `branch` varchar(220) default NULL,
  `status` varchar(220) default NULL,
  PRIMARY KEY  (`igid`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for pic
-- ----------------------------
DROP TABLE IF EXISTS `pic`;
CREATE TABLE `pic` (
  `picid` varchar(22) NOT NULL default '0',
  `name` varchar(220) NOT NULL default '',
  `email` varchar(220) default NULL,
  `phone` varchar(220) default NULL,
  `address` varchar(220) default NULL,
  `branch` varchar(220) default NULL,
  `status` varchar(220) default NULL,
  PRIMARY KEY  (`picid`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for projects
-- ----------------------------
DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects` (
  `proid` varchar(220) NOT NULL default '',
  `sid` varchar(220) NOT NULL default '',
  `rollnumber` varchar(220) NOT NULL default '',
  `branch` varchar(220) default NULL,
  `pname` varchar(220) default NULL,
  `abstract` varchar(250) default NULL,
  `synopsis` varchar(250) default NULL,
  `reports` varchar(250) default NULL,
  `code` varchar(250) default NULL,
  `igstatus` varchar(250) default NULL,
  `picstatus` varchar(250) default NULL,
  `hodstatus` varchar(250) default NULL,
  PRIMARY KEY  (`proid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `uid` varchar(11) NOT NULL default '0',
  `rollnumber` varchar(255) NOT NULL default '',
  `username` varchar(255) NOT NULL default '',
  `emailid` varchar(255) NOT NULL default '',
  `phone` varchar(255) NOT NULL,
  `gender` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `sq` varchar(255) default NULL,
  `sa` varchar(255) default NULL,
  `branch` varchar(255) default NULL,
  `status` varchar(255) default NULL,
  PRIMARY KEY  (`uid`,`rollnumber`,`username`,`emailid`,`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `admin` VALUES ('pas', 'pas@123');
INSERT INTO `hod` VALUES ('CA001', 'suresh', 'sudha@gmail.com', '7671974718', 'hyd dgdg', 'it', 'Active');
INSERT INTO `ig` VALUES ('CA001', 'sudharshan kota', 'sudha@gmail.com', '7671974718', 'Image Hospital\r\n1-92', 'it', 'Active');
INSERT INTO `pic` VALUES ('CA001', 'lopo', 'sudha@gmail.com', '7671974718', 'Image Hospital\r\n1-92dd', 'it', 'Active');
INSERT INTO `projects` VALUES ('PI001', '1', '1223', 'it', 'sudharshan', ' Automated iris segmentation is an important component of biometric identification. The role of artificial intelligence, particularly machine learning and deep learning,', ' Automated iris segmentation is an important component of biometric identification. The role of artificial intelligence, particularly machine learning and deep learning,', 'ZnBhdGgvVEFCTEUgT0YgQ09OVEVOVFMuZG9jeA==', 'ZnBhdGgvYXNzaWdubWVudDIucHk=', 'Accepted', 'Accepted', 'Accepted');
INSERT INTO `students` VALUES ('1', '1223', 'sudharshan', 'sudharshan.kota@gmail.com', '7671974718', 'Male', 'sudharshan', 'What is your pet name?', 'sudharshan', 'it', 'Active');
