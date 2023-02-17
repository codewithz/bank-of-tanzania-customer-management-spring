# bank-of-tanzania-customer-management-spring
#-----------------------------------------------------
Write a class by name Employee with following fields id,name,dept,salary,dateOfJoin

Create an EmployeeRepository with two methods
void addEmployee(Employee e);
List<Employee> findAllEmployees();

Write an implementation of this interface as EmployeeRepositoryListImpl and make a list of
5 employees in it, override the addEmployee and add the employee to the list ,also override
the findAllEmployee() which returns all the employees in the list.
#-----------------------------------------------------

Write a EmployeeService with two methods
void addEmployee(Employee e);
List<Employee> findAllEmployees();

Write an implementation of this interface as EmployeeServiceListImpl and override the
methods apply the business logic as per the implementation done for Customer

#-----------------------------------------------------
From Main.java load all the Employees using the ApplicationContext
