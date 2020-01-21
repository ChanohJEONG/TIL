SELECT * FROM 사원,부서 WHERE 사원.소속부서 = 부서.부서번호;
SELECT * FROM 부서;

select * from 사원
join 부서 on 사원.소속부서 = 부서.부서번호;

SELECT * FROM EMP;
SELECT * FROM DEPT;

SELECT * FROM EMP,DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO;
SELECT * FROM EMP
JOIN DEPT ON EMP.DEPTNO = dept.DEPTNO;

select * 
 from 주문
 join 제품 
 on 주문.주문제품 = 제품.제품번호
 WHERE 주문.주문고객 = 'banana';
 
 select * 
 from 고객
 join 주문 
 on 고객.고객아이디 = 주문.주문고객
 WHERE 고객.나이 >=30;

SELECT 제품명
 FROM 고객 C
 JOIN 주문 O
  ON C.고객아이디 = O.주문고객
 JOIN 제품 P
  ON O.주문제품 = P.제품번호
  WHERE C.고객이름 = '고명석';
  
SELECT 제품명,수량,주문일자
 FROM 주문 O
 JOIN 고객 C
   ON O.주문고객 = C.고객아이디
 JOIN 제품 P
   ON P.제품번호 = O.주문제품
 WHERE O.배송지 = '서울시 마포구';
 
 -- 1번
 SELECT EMP.ENAME, EMP.DEPTNO, DEPT.DNAME FROM EMP
 JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO;
 
 -- 2번
 SELECT * FROM EMP JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO GROUP BY EMPNO;
 
 -- 3번
 SELECT EMP.ENAME, EMP.COMM, EMP.SAL, DEPT.LOC FROM EMP
 JOIN DEPT ON EMP.DEPTNO=DEPT.DEPTNO WHERE EMP.COMM IS NOT NULL;
 
 -- 4번
 SELECT SUM(EMP.SAL),DEPT.DNAME FROM EMP
 JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO WHERE DEPT.LOC = 'NEW YORK' OR DEPT.LOC = 'DALLAS'
 GROUP BY DEPT.DEPTNO;
 