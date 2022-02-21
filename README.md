# melitaDemo
prerequisite for this project
1. need java 11
2. Rabbit MQ

# build Rabbit MQ Env in Docker
There is a docker-compose.yml file in the root folder of the project.
By this command "docker-compose up" docker build rabbit mq for you.
application.properties has configuration related to the rabbit mq credentials

# Project Details
this project has two endpoints
1. POST: http://localhost:8080/login?user=abc123&password=123456
    a. user=abc123 and password=123456 is static for now.
2. Post: http://localhost:8080/order 
 -  request {
"personDetails": {
"firstName":"abc",
"lastName":"cde"
},
"installationAddress":"abc",
"preferredDateTime":"2022-02-21T16:59:31.944390",
"product":"tv",
"productPackage":"TV with 90 Channels"
}
- response {
"status": "success",
"statusCode": "000",
"responseData": "Order Placed Successfully"
}
