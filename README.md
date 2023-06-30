# OnlineOrdering
An Online Food Ordering project similar to DoorDash.

# Things to Note
Currently, the project cannot be run unless the RDS_ENDPOINT is set to an existing relational database (I originally used a MySQL RDS managed by Amazon RDS, which I have already shutdown).
So to get this project back up and running, you would need to create a new RDS and input the endpoint, username, and password into the project as its datasource (in src/main/java/com/onlineOrder/applicationConfig.java).


# How to Install and Run the Project
1. Create a RDS (If you use AWS RDS, then you may need to create a security group as well) and input the relevant information into the 'src/main/java/com/onlineOrder/applicationConfig.java' file. (I recommend opening the project in IntelliJ)
2. Use Maven to clean and install the project.
3. Create an AWS EC2 Instance and deploy the "onlineOrder-1.0-SNAPSHOT.war" file to it.

# How to Use the Project
This project is essentially a basic imitation of the functionallities of an online food ordering website, but has no commercial value whatsoever. It was primarily created for me to learn the steps to creating a fully functional website that employed MySQL RDS as a local tomcat server and then learning how to deploy the project  through AWS EC2.
