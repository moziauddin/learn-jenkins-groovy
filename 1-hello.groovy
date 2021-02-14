node {
        stage("Hello world"){
            println 'hello'
        }
        stage('Groovy loop') {
            5.times {
                println "2 * $it = ${2 * it}"
            }
        }
}
