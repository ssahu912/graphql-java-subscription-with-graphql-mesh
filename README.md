# graphql-java-subscription-with-graphql-mesh
Implementation to show how graphql subscriptions work with graphql mesh with detailed configuration.
## Project Setup
1. Make sure you have JAVA 8, yarn, node and Gradle installed.
2. Open the Project in IDE of your choice 
3. Navigate to sampleSubscription folder and run command:
   ```
   gradlew build
   ``` 
4. Upon Successful build please run the command **make sure port 9999 is free**: 
   ```
   gradle bootRun
   ```
5. Navigate to graphqlMeshGateway folder and run command:
   ```
   yarn add package.json
   ```
6. Upon successful build run command:
   ```
      yarn graphql-mesh serve
   ```
7. Open browser and navigate to [Playground Link](http://localhost:4000/graphql)