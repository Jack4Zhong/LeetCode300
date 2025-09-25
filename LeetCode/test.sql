
select max(salary)
from employee
where salary< (select max(salary) from employee)



select * from orders where customer_id = 100;

select order_id, ... from orders
where customer_id =100
limit 20, offset=20

create index inx_customer on orders customer_id