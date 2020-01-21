select * from emp;
select * from emp where sal = 1250; -- 2 row 나옴
select * from emp where sal in (select sal from emp where sal = 1250); -- 1row 이상 이기때문에 in 구절사용

-- select sal from emp where ename = 'allen';
select * from emp where sal >= (select sal from emp where ename = 'allen');
-- select avg(sal) from emp where DEPTNO = 10; 
select * from emp where sal >=(select avg(sal) from emp where DEPTNO = 10);
-- select deptno from emp where mgr is null;
select * from emp where deptno = (select deptno from emp where mgr is null);
-- select avg(sal) from emp where comm = 0 group by deptno;
select * from emp where sal < (select avg(sal) from emp where comm = 0 group by deptno);
-- select deptno from emp where comm =0;
-- select avg(sal) from emp where deptno = (select deptno from emp where comm =0);
select * from emp where sal <(select avg(sal) from emp where deptno = (select deptno from emp where comm =0));