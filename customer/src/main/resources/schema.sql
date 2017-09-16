CREATE TABLE SPRING_SESSION (
	SESSION_ID CHAR(36),
	CREATION_TIME BIGINT NOT NULL,
	LAST_ACCESS_TIME BIGINT NOT NULL,
	MAX_INACTIVE_INTERVAL INT NOT NULL,
	PRINCIPAL_NAME VARCHAR(100),
	CONSTRAINT SPRING_SESSION_PK PRIMARY KEY (SESSION_ID)
) ENGINE=InnoDB;

CREATE INDEX SPRING_SESSION_IX1 ON SPRING_SESSION (LAST_ACCESS_TIME);

CREATE TABLE SPRING_SESSION_ATTRIBUTES (
	SESSION_ID CHAR(36),
	ATTRIBUTE_NAME VARCHAR(200),
	ATTRIBUTE_BYTES BLOB,
	CONSTRAINT SPRING_SESSION_ATTRIBUTES_PK PRIMARY KEY (SESSION_ID, ATTRIBUTE_NAME),
	CONSTRAINT SPRING_SESSION_ATTRIBUTES_FK FOREIGN KEY (SESSION_ID) REFERENCES SPRING_SESSION(SESSION_ID) ON DELETE CASCADE
) ENGINE=InnoDB;

CREATE INDEX SPRING_SESSION_ATTRIBUTES_IX1 ON SPRING_SESSION_ATTRIBUTES (SESSION_ID);

CREATE TABLE users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  enabled TINYINT(1) NOT NULL,
  PRIMARY KEY (username)
) ENGINE=InnoDB;

CREATE TABLE authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  UNIQUE KEY IX_AUTH_USERNAME (username, authority),
  CONSTRAINT FK_AUTH_USERS FOREIGN KEY (username) REFERENCES users (username)
) ENGINE=InnoDB;