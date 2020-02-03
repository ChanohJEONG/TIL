CREATE TABLE 학과(
	학과번호 INT,
    학과명 VARCHAR(10),
    PRIMARY KEY(학과번호)
);

CREATE TABLE 교수(
	교수번호 INT,
    이름 VARCHAR(10),
    학과번호 INT,
    직급 VARCHAR(20),
    급여 INT,
    PRIMARY KEY(교수번호),
    FOREIGN KEY(학과번호) REFERENCES 학과(학과번호)
);

INSERT INTO 학과 VALUES (1,'컴퓨터공학과');
INSERT INTO 학과 VALUES (2,'경영학과');
INSERT INTO 학과 VALUES (3,'신문방송학과');

INSERT INTO 교수 VALUES(1,'정찬오',1,'정교수',1000);
INSERT INTO 교수 VALUES(2,'부찬오',2,'부교수',1000);
INSERT INTO 교수 VALUES(3,'조찬오',5,'조교수',1000);

SELECT 학과.학과명 FROM 학과 LEFT JOIN 교수 ON 학과.학과번호 = 교수.학과번호 WHERE 교수.학과번호 IS NULL;