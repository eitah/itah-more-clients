To run this locally

1. Download and activate mySql Workbench
1. Create database `itah`
1. gradle flywayMigrate -Dflyway.user=root -Dflyway.password=pass1234
1. ./gradlew build
1. ./gradlew bootRun