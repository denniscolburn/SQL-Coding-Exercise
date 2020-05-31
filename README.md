### Coding Assignment

#### Project Requirements
* Gradle Version 6+

#### Assignment Technology Requirements
* Java
* Gradle
* TestNG or JUnit 5
* Any libraries or frameworks you consider necessary

#### Expectations
* We are interested in the naming conventions, readability, structure and modularity of your implementation. 
* Variety and quality of the test cases.
* Imagine that this small example is going to turn into a larger framework.

#### Assumptions
* The database (hsqldb) has been included and is located in the `db` folder
* Database connection configuration can be found [here](settings.gradle)
* The database has four tables: `CUSTOMER`, `INVOICE`, `ITEM` and `PRODUCT` with ~ 50 rows each
* Two Gradle tasks, `startDB` and `stopDB` have been provided for starting and stopping the database. Example: `gradle clean startDB test stopDB`
* Command for the Database Manager `java -cp db/hsqldb/lib/hsqldb.jar org.hsqldb.util.DatabaseManagerSwing`

#### Exercises
##### <u>Exercise #1</u> <br>
`Write a query that finds the customer's id, first name, last name with the item's invoice id, item number and quantity along with the product name for the invoice id of 10.` <br>
`Then write validation that the id is 36, customer's name is Janet King with 5 rows of products:` <br>
`Clock Clock QTY of 24 `<br>
`Shoe Iron QTY of 8 `<br>
`Telephone Chair QTY of 4` <br>
`Iron Telephone QTY of 22` <br>
`Shoe Ice Tea QTY of 4` <br>

##### <u>Exercise #2</u> <br>
`Write an insert statement into the INVOICE table for customer Susan Smith using the following products:`<br>
`Iron Clock ($6.60)` <br>
`Iron Telephone ($23.60)` <br> 
`Shoe Shoe ($5.20) ` <br>
`Then write a query to validate the inserted data`

##### <u>Exercise #3</u>

##### Part 1: 

`At the end of the README file, document the test cases you think are necessary to validate the totalAmountOfInvoicesById method in the [com/rr19/example/application/InvoicePriceCalculator] class. (Note: This class should NOT be modify or changed in any fashion.`   <br>
`In addition, don't hesitate to add any notes, observations, concerns or suggestions`

##### Part 2: 

`Code the majority of the documented test cases` 


<hr>

#### Test Cases:

1. Customer with no invoices should return 0
2. Customer with 1 invoice with no items should return zero
3. Customer with 1 invoice with 1 or more items should return total of items multiplied by product price
4. Customer with more than 1 invoice with 1 or more items should return the total of items multiplied by product price
5. Customer with more than 1 invoice with no items should return 0
