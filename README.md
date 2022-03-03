# Pollinate Assignment

The Scope of this project is to call an API which will push the data to the database. The API is written in Java and built in Spring boot.
Table used to store the data is built in MS SQL.

![image](https://user-images.githubusercontent.com/100843284/156559114-b15dc4c4-2d09-4459-a9c3-fccec15df2b9.png)

## Detailed Design

The API built as part of the project inserts the timestamp into the Product table which is stored in the MS SQL database.

The product table is replicated in the API as a model class where the column names are defined as the variables in the class.

The API gives 2 options to the user :

•	GET the data from the Product table by doing a get call to the database.

•	POST the data to the product table by doing a post call and passing 2 Parameters in the request which are:

    o	ID : ID of the product which needs to be inserted
  
    o	Timestamp: Timestamp which is passed to the API
    
Below is the diagrammatical representation of the same:

![image](https://user-images.githubusercontent.com/100843284/156559517-7ed4cf3d-c508-44f3-ae22-37ba39456769.png)

The table structure of the product table is described below:

![image](https://user-images.githubusercontent.com/100843284/156559582-2261bcf5-4b9f-40a6-aa1e-002180e845c6.png)

## URI

![image](https://user-images.githubusercontent.com/100843284/156559636-2ac03e9c-f4b1-448a-9153-aed3a50cb1e5.png)

## How to Run the API

The API is built to be executable on your device if the following pre-requisites are met.

•	port 8080 should be free as this is the port where the API is being executed.

•	A database built in your local environment whose details are included in the application.properties file of the code

To run the API a user can either use a Postman or a curl command

## Postman

To execute via postman the user needs to make one of the calls mentioned above in the URI section of the design.
To post the data to the database the user need to mention two columns in the param section of the API. An example for the same is attached below:

![image](https://user-images.githubusercontent.com/100843284/156559803-954a2808-16d5-4d18-9443-871d255b8941.png)

## Curl

To use the curl command the user can execute the below command:

*Open cmd.exe

*Execute the command curl -X POST http://localhost:8080/demo/app?id=2&timeStamp=2021-11-30

<img width="477" alt="image" src="https://user-images.githubusercontent.com/100843284/156560475-39359564-d82e-4068-8829-927995a9f4f1.png">

## MSSQL

Below screenshot shows the data in the database

<img width="934" alt="image" src="https://user-images.githubusercontent.com/100843284/156561845-cadfb663-1c72-4255-8416-00ad5a71c0d9.png">


