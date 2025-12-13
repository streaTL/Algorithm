-- 코드를 작성해주세요
select a.ITEM_ID, a.ITEM_NAME
from ITEM_INFO as a
join ITEM_TREE as b on a.ITEM_ID = b.ITEM_ID
where isnull(PARENT_ITEM_ID)
order by ITEM_ID