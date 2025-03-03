-- Таблица отсортированная по именам роботов в алфавитном порядке
SELECT * 
  FROM schema.jaegers
 ORDER BY model_name;

-- Таблица не уничтоженных роботов
SELECT * 
  FROM schema.jaegers
 WHERE status != 'Destroyed';

-- Таблица роботов серии Mark-1 и Mark-4
SELECT * 
  FROM schema.jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

-- Таблица отсортированная по убыванию по столбцу mark, кроме Mark-1 и Mark-4
SELECT * 
  FROM schema.jaegers
 WHERE mark NOT IN('Mark-1', 'Mark-4')
 ORDER BY mark DESC;

-- Таблица самых старых роботов
SELECT * 
  FROM schema.jaegers
 WHERE launch = (
SELECT MAX(launch) FROM schema.jaegers
);

-- Информация из столбцов model_name, mark, launch, kaiju_kill тех роботов, которые уничтожили больше всех kaiju
SELECT model_name, mark, launch, kaiju_kill FROM schema.jaegers
 WHERE kaiju_kill = (
SELECT MAX(kaiju_kill) FROM schema.jaegers
);
 
-- Средний вес роботов
SELECT AVG (round(weight::numeric, 3)) AS avg_weight FROM schema.jaegers;

-- Инкремент количества уничтоженных kaiju у неразрушенных роботов
UPDATE schema.jaegers 
   SET kaiju_kill = kaiju_kill + 1
 WHERE status NOT IN ('Destroyed');

-- Таблица с увеличенным  на единицу количеством уничтоженных kaiju у неразрушенных роботов
SELECT * 
  FROM schema.jaegers;

-- Удаление уничтоженных роботов
DELETE 
  FROM schema.jaegers
 WHERE status = 'Destroyed';

-- Таблица без уничтоженных роботов
SELECT * 
  FROM schema.jaegers;


