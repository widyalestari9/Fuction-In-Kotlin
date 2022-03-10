fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}

fun main(){
    fullName("Widya", "Ayu","Lestari")
    fullName(
        lastName = "Lestari",
        firstName = "Widya",
        middleName = "Ayu"

    )
}