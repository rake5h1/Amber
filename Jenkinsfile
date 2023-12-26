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
            sh mvn clean
            }
        }
        stage("Test"){
            steps{
                sh mvn test
            }
        }
    }
   
}