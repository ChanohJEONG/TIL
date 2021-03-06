CREATE TABLE IT_MEMBER (
 NUM INT
 , NAME VARCHAR(10)
 , COURSE_NO INT
);
INSERT INTO IT_MEMBER VALUES (1, 'AA', 1);
INSERT INTO IT_MEMBER VALUES (2, 'BB', 1);
INSERT INTO IT_MEMBER VALUES (3, 'CC', 2);
INSERT INTO IT_MEMBER VALUES (4, 'DD', 2);
INSERT INTO IT_MEMBER VALUES (5, 'EE', 4);
INSERT INTO IT_MEMBER VALUES (6, 'FF', NULL);

CREATE TABLE COURSE02 (
 COURSE_NO INT
 , COURSE_NAME VARCHAR(20)
);
INSERT INTO COURSE02 VALUES (1, 'DIGITAL');
INSERT INTO COURSE02 VALUES (2, 'BIG DATA');
INSERT INTO COURSE02 VALUES (3, 'CLOUD');
INSERT INTO COURSE02 VALUES (4, 'NFC');


-- 1번
select * from it_member m
 join course02 c2
   on c2.COURSE_NO = m.COURSE_NO;
   
-- 2번
select * from it_member m
 left join course02 c2
   on c2.COURSE_NO = m.COURSE_NO;

-- 3번
select * from it_member m
 right join course02 c2
   on c2.COURSE_NO = m.COURSE_NO
