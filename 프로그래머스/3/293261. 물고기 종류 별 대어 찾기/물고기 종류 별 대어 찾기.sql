-- 코드를 작성해주세요
select
a.id,b.FISH_NAME,a.LENGTH
from FISH_INFO as a
join FISH_NAME_INFO as b 
on a.FISH_TYPE=b.FISH_TYPE
where a.length = (
    select Max(c.LENGTH)
    from FISH_INFO as c
    where a.FISH_TYPE = c.FISH_TYPE
)
order by a.id