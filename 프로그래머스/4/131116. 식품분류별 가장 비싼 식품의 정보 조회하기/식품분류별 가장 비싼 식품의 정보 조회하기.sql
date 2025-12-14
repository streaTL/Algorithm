-- 코드를 입력하세요
select a.CATEGORY, a.PRICE as MAX_PRICE, a.PRODUCT_NAME
from FOOD_PRODUCT as a
join(SELECT CATEGORY, max(PRICE) as MAX_PRICE, PRODUCT_NAME
    from FOOD_PRODUCT
    where CATEGORY in('과자','국','김치','식용유')
    group by CATEGORY) as b
on a.CATEGORY = b.CATEGORY and a.PRICE = b.MAX_PRICE
order by MAX_PRICE desc