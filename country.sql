

select distinct(CountryCode),sum(Population),concat by Name
from city group by CountryCode having MAX(population);