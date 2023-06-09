select lastName, firstName from employees 
union
select contactLastName,contactFirstName from customers;

select concat(lastName, firstName) from employees 
union
select concat(contactFirstName,contactLastName) as fullname from customers; 

select concat(lastName," " ,firstName) as fullname from employees 
union 
select concat(contactFirstName," ",contactLastName) as fullname from customers order by fullname ; 

select concat(lastName," " ,firstName) as fullname, "Employee" as type from employees 
union 
select concat(contactFirstName," ",contactLastName) as fullname,"Customers" as type from customers order by fullname limit 25;