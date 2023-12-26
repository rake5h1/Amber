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
            mvn clean
            }
        }
        stage("Test"){
            steps{
                mvn test
            }
        }
    }
   
}