drop database if exists cabbuddydb;
DROP USER 'cbadmin'@'localhost' if exists;
create database cabbuddydb;
CREATE USER 'cbadmin'@'localhost' IDENTIFIED BY 'admin123';
GRANT ALL PRIVILEGES ON cabbuddydb.* TO 'cbadmin'@'localhost';
use database cabbuddydb;
