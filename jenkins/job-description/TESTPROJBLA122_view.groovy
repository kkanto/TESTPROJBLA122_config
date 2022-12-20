 
listView('TESTPROJBLA122 Jobs') {
    description('TESTPROJBLA122 Jobs')
    jobs {
        regex('TESTPROJBLA122_.+')
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
