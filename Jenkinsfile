pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Prepare') {
            steps {
                script {
                    // Install Maven (if not already installed)
                    tool name: 'Maven', type: 'maven'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    bat "mvn clean test"
                }
            }
        }
    }
}
