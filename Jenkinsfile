pipeline{
    agent any
    stages{
        stage("Checkout"){
            steps{
                git branch: 'main', credentialsId: 'e76398ce-2d0c-49fc-ac50-1df75fa3a003', url: 'https://github.com/rake5h1/Amber.git'
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