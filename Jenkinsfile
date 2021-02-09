pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-u 0:0 --mount type=bind,source="/var/lib/jenkins/.m2",target="/root/.m2"'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}