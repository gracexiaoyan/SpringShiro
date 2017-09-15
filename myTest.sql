CREATE TABLE myTest.role
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    role_name varchar(45)
);
INSERT INTO myTest.role (role_name) VALUES ('admin');
INSERT INTO myTest.role (role_name) VALUES ('user');
CREATE TABLE myTest.user
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user_name varchar(45),
    user_pin varchar(45)
);
INSERT INTO myTest.user (user_name, user_pin) VALUES ('graceAdmin', '1234');
INSERT INTO myTest.user (user_name, user_pin) VALUES ('graceUser', '1234');
CREATE TABLE myTest.user_role
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user_name varchar(45),
    role_name varchar(45)
);
INSERT INTO myTest.user_role (user_name, role_name) VALUES ('graceUser', 'user');
INSERT INTO myTest.user_role (user_name, role_name) VALUES ('graceAdmin', 'admin');