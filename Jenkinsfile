pipeline{
    agent any
    stages{
        stage("Checkout"){
            steps{
                scm checkout
            }
        }
        stage("Clean"){
            steps{
            bat mvn clean
            }
        }
        stage("Test"){
            steps{
                 bat mvn test
            }
        }
    }
   
}