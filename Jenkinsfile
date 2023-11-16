pipeline {
    agent {
        docker {
            image 'maven:3.6.3-adoptopenjdk-11'
            args '-v /usr/local/bin:/usr/local/bin'
        }
    }
    stages {
        stage('Checkout code') {
            steps {
                checkout scm
            }
        }
        stage('Download and Install ChromeDriver') {
            steps {
                sh '''
                wget https://chromedriver.storage.googleapis.com/114.0.5735.90/chromedriver_linux64.zip
                unzip chromedriver_linux64.zip
                mv chromedriver /usr/local/bin
                chmod +x /usr/local/bin/chromedriver
                rm chromedriver_linux64.zip
                '''
            }
        }
        stage('Set system property for Chrome WebDriver') {
            steps {
                sh 'echo "webdriver.chrome.driver=/usr/local/bin/chromedriver" >> $JENKINS_ENV'
            }
        }
        stage('Install Dependencies') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Test with Maven') {
            steps {
                sh 'mvn test'
            }
        }
    }
}