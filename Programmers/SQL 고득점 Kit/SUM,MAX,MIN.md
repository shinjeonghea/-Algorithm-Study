## [최댓값 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/59415)
~~~sql
SELECT MAX(DATETIME) 
FROM ANIMAL_INS
~~~

## [최솟값 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/59038)
~~~sql
SELECT MIN(DATETIME)
FROM ANIMAL_INS
~~~

## [동물 수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/59406)
~~~sql
SELECT COUNT(*)
FROM ANIMAL_INS
~~~


## [중복 제거하기](https://school.programmers.co.kr/learn/courses/30/lessons/59408)
~~~sql
SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
~~~
