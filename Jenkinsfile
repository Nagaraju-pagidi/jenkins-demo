pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo 'Cloning repository...'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        
        stage('Build Docker image'){
			steps{
				bat 'docker build -t jenkins-demo .'
			}
		}

    }
}