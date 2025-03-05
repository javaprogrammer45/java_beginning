\echo Таблица отсортированная по именам роботов в алфавитном порядке
SELECT * 
  FROM jaegers
 ORDER BY model_name;

\echo Таблица не уничтоженных роботов
SELECT * 
  FROM jaegers
 WHERE status != 'Destroyed';

\echo Таблица роботов серии Mark-1 и Mark-4
SELECT * 
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo Таблица отсортированная по убыванию по столбцу mark, кроме Mark-1 и Mark-4
SELECT * 
  FROM jaegers
 WHERE mark NOT IN('Mark-1', 'Mark-4')
 ORDER BY mark DESC;

\echo Таблица самых старых роботов
SELECT * 
  FROM jaegers
 WHERE launch = (
       SELECT MAX(launch) 
       FROM jaegers);

\echo Информация из столбцов model_name, mark, launch, kaiju_kill тех роботов, которые уничтожили больше всех kaiju
SELECT model_name, mark, launch, kaiju_kill 
  FROM jaegers
 WHERE kaiju_kill = (
       SELECT MAX(kaiju_kill) 
       FROM jaegers);
 
\echo Средний вес роботов
SELECT AVG (round(weight, 3)) AS avg_weight 
  FROM jaegers;  

\echo Инкремент количества уничтоженных kaiju у неразрушенных роботов
UPDATE jaegers 
   SET kaiju_kill = kaiju_kill + 1
 WHERE status NOT IN ('Destroyed');

\echo Таблица с увеличенным  на единицу количеством уничтоженных kaiju у неразрушенных роботов
SELECT * 
  FROM jaegers;

\echo Удаление уничтоженных роботов
DELETE 
  FROM jaegers
 WHERE status = 'Destroyed';

\echo Таблица без уничтоженных роботов
SELECT * 
  FROM jaegers;


