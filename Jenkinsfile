pipeline {
    agent any

    tools {
        maven "maven-3.6.3"
    }

   stages {
        stage("Compile") {
            steps {
                sh "mvn compile"
            }
        }


        stage("Test") {
            steps {
                sh "mvn test"
            }
        }

        stage("Build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }
    }
}