 
listView('project3110 Jobs') {
    description('project3110 Jobs')
    jobs {
        regex('project3110_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
