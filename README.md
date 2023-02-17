# bank-of-tanzania-customer-management-spring
<hr/>
<b>Write a class by name Employee with following fields id,name,dept,salary,dateOfJoin</b>
<br/><br/>

Create an <b>EmployeeRepository</b> with two methods
<br/><br/>void addEmployee(Employee e);<br>
>List<Employee> findAllEmployees();

Write an implementation of this interface as <b>EmployeeRepositoryListImpl</b> and make a list of
5 employees in it, override the addEmployee and add the employee to the list ,also override
the findAllEmployee() which returns all the employees in the list.

<br>-----------------------------------------------------<br>

Write a <b>EmployeeService</b> with two methods
<br>void addEmployee(Employee e);<br>
List<Employee> findAllEmployees();

Write an implementation of this interface as <b>EmployeeServiceListImpl</b> and override the
methods apply the business logic as per the implementation done for Customer

<br>-----------------------------------------------------<br>
From Main.java load all the Employees using the ApplicationContext
