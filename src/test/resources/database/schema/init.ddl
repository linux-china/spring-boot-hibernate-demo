DROP TABLE IF EXISTS accounts;
CREATE TABLE accounts (
  id         INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nick       VARCHAR(128),
  password   VARCHAR(64),
  created_at DATETIME
) DEFAULT CHARSET utf8;