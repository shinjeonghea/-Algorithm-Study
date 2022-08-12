## [고양이와 개는 몇 마리 있을까](https://school.programmers.co.kr/learn/courses/30/lessons/59040)
~~~sql
SELECT 
    ANIMAL_TYPE, 
    COUNT(ANIMAL_TYPE) AS count
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE ASC
~~~

## [동명 동물 수 찾기](https://school.programmers.co.kr/learn/courses/30/lessons/59041)
~~~sql
SELECT
    NAME, 
    COUNT(NAME) AS COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME
HAVING COUNT(NAME) > 1
ORDER BY NAME
~~~

## [입양 시각 구하기(1)](https://school.programmers.co.kr/learn/courses/30/lessons/59412)
~~~sql
SELECT 
    HOUR(DATETIME) AS HOUR, 
    COUNT(HOUR(DATETIME)) AS COUNT
FROM ANIMAL_OUTS
WHERE  HOUR(DATETIME) BETWEEN 9 AND 19
GROUP BY HOUR(DATETIME)
ORDER BY HOUR(DATETIME)
~~~

## [입양 시각 구하기(2)](https://school.programmers.co.kr/learn/courses/30/lessons/59413)
~~~sql
SELECT 
    @NUM := @NUM + 1 AS HOUR 
FROM 
(SELECT @NUM := -1) 
WHERE @NUM < 23
~~~
