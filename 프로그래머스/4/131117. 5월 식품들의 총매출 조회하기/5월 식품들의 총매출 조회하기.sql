-- 코드를 입력하세요
SELECT a.PRODUCT_ID, a.PRODUCT_NAME, a.price*b.AMOUNT as TOTAL_SALES
from FOOD_PRODUCT as a
join(select PRODUCT_ID, sum(AMOUNT) as AMOUNT
    from FOOD_ORDER
    where year(PRODUCE_DATE)=2022 and month(PRODUCE_DATE)=5
    group by PRODUCT_ID) as b
on a.PRODUCT_ID = b.PRODUCT_ID
group by a.PRODUCT_ID
order by TOTAL_SALES desc, a.PRODUCT_ID