-- 1번
SELECT COUNT(*) FROM visitor_tb WHERE VST_TIME between '2017-05-01' AND '2020-01-31';

-- 2번
SELECT IP_ADDRESS, COUNT(*) FROM visitor_tb GROUP BY IP_ADDRESS HAVING COUNT(*) >=2 ORDER BY COUNT(*) DESC; 

-- 3번
SELECT datE_format(VST_TIME,'%Y') , COUNT(*) FROM visitor_tb GROUP BY date_format(VST_TIME,'%Y');
-- date_format(E_DATE, '%Y년 %m월 %d일')

-- 4번
SELECT datE_format(VST_TIME,'%m'), COUNT(*) FROM visitor_tb GROUP BY date_format(VST_TIME,'%m') order by COUNT(*) DESC;
-- SELECT * FROM VISITOR_TB;

-- 5번
SELECT datE_format(VST_TIME,'%Y-%m') AS '방문월' ,CASE VST_PATH
						WHEN 1 THEN '검색'
						WHEN 2 THEN '부산관광공사' END AS '방문경로'
                        ,COUNT(*) FROM visitor_tb
 GROUP BY date_format(VST_TIME,'%Y-%m'),VST_PATH;