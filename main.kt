fun main(arg: Array<String>) {

    val employee1 = Employees("John Smith", 861707,3)
    val employee2 = Employees("Mary Johnson", 862410,1)
    val employee3 = Employees("Mike Jones", 860145,2)

    employee1.printall()
    println("\n")
    employee2.printall()
    println("\n")
    employee3.printall()
}