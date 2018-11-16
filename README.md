# DigitalDoorSignage

This project is about a digital door sign (e-paper) that can be used to display who is currently in the classroom and for how long. (this is a vague description since we are still not sure how and what to display)

# Table of Contents

* [Documents](#documents)
* [Project setup](#project-setup)
  * [Configure wildfly](#configure-wildfly)
* [Development setup](#development-setup)
  * [Docker-compose](#docker-compose)
* [Issue workflow](#issue-workflow)
* [Team](#team)
* [Useful resources](#useful-resources)

# Documents

* [Entity Relationship Diagram](documents/DigitalDoorSignageERD.png)
* [Use Case Diagram](documents/DigitalDoorSignageUCD.png)

# Project setup
You only have to do the project setup after cloning the project.

## Configure wildfly
1. Download the [mysql jdbc driver](https://dev.mysql.com/downloads/connector/j/) (Choose the platform independent version)
2. Extract the tar/zip file into a folder (e.g. /opt)
3. Start Wildfly and upload the mysql connector jar file as a new deployment with the name "mysql-connector"
4. Add a new datasource with the mysql preset and following data:
  ```
  Name = DigitalDoorSignageDS
  JNDI Name = java:jboss/datasources/DigitalDoorSignageDS
  Driver Name = <your mysql connector>
  Connection URL = jdbc:mysql://localhost:3306/digital_door_signage?createDatabaseIfNotExist=true
  User Name = root
  Password = root
  ```
5. Make sure to test the connection!
6. Restart the project if you started the wildfly server from an ide

# Development setup
You have to make sure that you have done everything before starting to develop else some things might not work.

## Docker-compose
The following command starts all the services needed by the project. 

``` bash
docker-compose up -d
```

Make sure to add the '-d' at the end to tell docker-compose to start the container in the deamon mode.

# Issue Workflow

1. Copy the id of the issue you want to work on
2. Create a new branch with id as name
3. Move the issue to "in progress"
4. Work on issue
5. Push branch
6. Create a pull request on the github website
7. Add a description (I usually just copy every commit message into the description)
8. Move the issue to "to verify"
9. Wait for everyone to review and eventually accept your solution
10. Merge the branch with the "Squash and Merge" option and use the id of the issue as the name
11. Delete the branch online and local

# Team

* [Stefan Waldl](https://github.com/StefanWaldl)
* [Tim Untersberger](https://github.com/TimUntersberger)

# Useful Resources

* [Commit message guide](https://chris.beams.io/posts/git-commit/)
* [ERD tutorial](https://www.youtube.com/watch?v=QpdhBUYk7Kk)
* [ERD relationship cheatsheet](https://www.vivekmchawla.com/erd-crows-foot-relationship-symbols-cheat-sheet/)
* [SQL naming convention](https://www.xaprb.com/blog/2008/10/26/the-power-of-a-good-sql-naming-convention/)
