pipeline {
    agent {
        docker {
            image 'maven-proxy'
            args '-v /root/.m2:/root/.m2 -e PROXY_HOST=proxy-muc.sky.de -e PROXY_PORT=8080 -e PROXY_PROTOCOL=http'        }
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